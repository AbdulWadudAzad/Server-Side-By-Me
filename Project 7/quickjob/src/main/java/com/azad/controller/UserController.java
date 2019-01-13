package com.azad.controller;


import com.azad.entity.Role;
import com.azad.entity.User;
import com.azad.repo.JobCategoryRepo;
import com.azad.repo.RoleRepo;
import com.azad.repo.UserRepo;
import com.azad.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Controller
@RequestMapping(value = "/user/")
public class UserController {
    @Autowired
    private UserService service;
    @Autowired
    RoleRepo roleRepo;
    @Autowired
    private UserRepo repo;


    @Autowired

    private PasswordEncoder passwordEncoder;


    @RequestMapping(value = "/create.jsf", method = RequestMethod.GET)
    public ModelAndView getuser(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        ModelAndView modelAndView = new ModelAndView();
        User user = new User();
        modelAndView.addObject("user", user);
        modelAndView.addObject("users", service.getAllUsers(page, perPage));
        modelAndView.addObject("allRoles", roleRepo.findAll());
        modelAndView.setViewName("user/create");
        return modelAndView;
    }

    @RequestMapping(value = "/create.jsf", method = RequestMethod.POST)
    public ModelAndView saveuser(@Valid User user, BindingResult bindingResult, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage, @RequestParam("checkRoles") String[] markedRoles) {

        Set<Role> roles = new HashSet<>();
        for (String s : markedRoles) {
            Role role = new Role();
            role.setId(Long.parseLong(s));
            roles.add(role);
        }
        user.setRoles(roles);
       user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setJoiningDate(new Date());
        user.setActivated(true);
        ModelAndView modelAndView = new ModelAndView();
        User userNameExit = service.isUserNameAlreadyExist(user.getUserName());
        User emailExit = service.isEmailAlreadyExist(user.getEmail());
        User mobileExit = service.isMobileAlreadyExist(user.getMobile());
        System.out.println("===== " + user.getRoles().toString());
        if (userNameExit != null  && user.getId() == null) {
            bindingResult.rejectValue("userName", "error.user", "This User Name already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }else if (emailExit != null  && user.getId() == null) {
            bindingResult.rejectValue("email", "error.user", "This Email already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }else if (mobileExit != null  && user.getId() == null) {
            bindingResult.rejectValue("mobile", "error.user", "This Mobile Number already Exist!");
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
        }

        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("user/create-user");
        } else {
            if (user.getId() != null) {
                service.update(user);
                modelAndView.addObject("successMessage", "Update Success");

            } else {
                service.save(user);
                modelAndView.addObject("successMessage", "Insert Success");

            }


            modelAndView.addObject("user", new User());
            modelAndView.addObject("users", service.getAllUsers(page, perPage));
            modelAndView.addObject("allRoles", roleRepo.findAll());
            modelAndView.setViewName("user/create");

        }

        return modelAndView;
    }

    @RequestMapping(value = "/user/edit/{id}", method = RequestMethod.GET)
    public String updateuser(@PathVariable Long id, Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        Optional<User> user1 = service.getUser(id);
        User user = new User();
        user.setRoles(user1.get().getRoles());
        user.setId(id);
        System.out.println("======" + user.getId() + ", " + user.getUserName());
        model.addAttribute("user", user);
        model.addAttribute("users", service.getAllUsers(page, perPage));
        model.addAttribute("allRoles", roleRepo.findAll());
        return "create-user";
    }

    @RequestMapping(value = "/user/del/{id}", method = RequestMethod.GET)
    public String deluser(@PathVariable Long id, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "4") int perPage) {
        service.delete(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("successMessage", "Delete Success");
        modelAndView.addObject("users", service.getAllUsers(page, perPage));
        modelAndView.addObject("allRoles", roleRepo.findAll());
        return "redirect:/user/create";
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("user/list");
        return modelAndView;
    }

}
