package com.azad.controller;


import com.azad.entity.JobHistory;
import com.azad.repo.JobHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
@Controller
@RequestMapping(value = "/job-history/")
public class JobHistoryController {
    @Autowired
    private JobHistoryRepo repo;

    @GetMapping(value = "create.jsf")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new JobHistory());
        modelAndView.setViewName("jobhistory/create");
        return modelAndView;
    }

    @PostMapping(value = "create.jsf")
    public ModelAndView save(@Valid JobHistory obj, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (obj != null) {
            repo.save(obj);
            modelAndView.addObject("obj", new JobHistory());
            modelAndView.setViewName("jobhistory/create");
        }
        modelAndView.setViewName("jobhistory/create");
        return modelAndView;
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("jobhistory/list");
        return modelAndView;
    }
}
