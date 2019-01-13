package com.azad.controller;

import com.azad.entity.JobPost;
import com.azad.repo.JobCategoryRepo;
import com.azad.repo.JobPostRepo;
import com.azad.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/jobpost/")
public class JobPostController {
    @Autowired
    private JobPostRepo repo;
    @Autowired
    private UserRepo userrepoo;
    @Autowired
    private JobCategoryRepo jobcategoryrepo;

    @GetMapping(value = "create.jsf")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new JobPost());
        modelAndView.addObject("userlist", userrepoo.findAll());
        modelAndView.addObject("jobcategorylist", jobcategoryrepo.findAll());
        modelAndView.setViewName("jobposts/create");
        return modelAndView;
    }

    @PostMapping(value = "create.jsf")
    public ModelAndView save(@Valid JobPost obj, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (obj != null) {
            repo.save(obj);
            modelAndView.addObject("successMsg", "Save Success");
            modelAndView.addObject("obj", new JobPost());
            modelAndView.addObject("userlist", userrepoo.findAll());
            modelAndView.addObject("jobcategorylist", jobcategoryrepo.findAll());
            modelAndView.setViewName("jobposts/create");
        }
        modelAndView.setViewName("jobposts/create");
        return modelAndView;
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("jobposts/list");
        return modelAndView;
    }
}
