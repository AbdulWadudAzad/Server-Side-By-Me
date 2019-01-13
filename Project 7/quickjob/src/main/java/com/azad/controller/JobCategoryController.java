package com.azad.controller;

import com.azad.entity.JobCategory;
import com.azad.entity.Role;
import com.azad.repo.JobCategoryRepo;
import com.azad.repo.PrivilizeRepo;
import com.azad.repo.RoleRepo;
import com.azad.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
@RequestMapping(value = "/job-category/")
public class JobCategoryController {
    @Autowired
    private JobCategoryRepo repo;

    @GetMapping(value = "create.jsf")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new JobCategory());
        modelAndView.setViewName("job-category/create");
        return modelAndView;
    }

    @PostMapping(value = "create.jsf")
    public ModelAndView save(@Valid JobCategory obj, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (obj != null) {
            repo.save(obj);
            modelAndView.addObject("obj", new JobCategory());
            modelAndView.setViewName("job-category/create");
        }
        modelAndView.setViewName("job-category/create");
        return modelAndView;
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("job-category/list");
        return modelAndView;
    }

}
