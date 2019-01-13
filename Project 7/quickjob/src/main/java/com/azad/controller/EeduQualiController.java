package com.azad.controller;

import com.azad.entity.Address;
import com.azad.entity.EduQualification;
import com.azad.repo.AddressRepo;
import com.azad.repo.EduQualiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/education/")
public class EeduQualiController {
    @Autowired
    private EduQualiRepo repo;

    @GetMapping(value = "create.jsf")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new EduQualification());
        modelAndView.setViewName("edu-quali/create");
        return modelAndView;
    }

    @PostMapping(value = "create.jsf")
    public ModelAndView save(@Valid EduQualification obj, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (obj != null) {
            repo.save(obj);
            modelAndView.addObject("obj", new EduQualification());
            modelAndView.setViewName("edu-quali/create");
        }
        modelAndView.setViewName("edu-quali/create");
        return modelAndView;
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("edu-quali/list");
        return modelAndView;
    }
}
