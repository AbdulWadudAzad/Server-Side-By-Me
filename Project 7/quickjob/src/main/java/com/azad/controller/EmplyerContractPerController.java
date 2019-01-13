package com.azad.controller;

import com.azad.entity.EmplyerContactPerson;
import com.azad.entity.Referances;
import com.azad.repo.EmplyerContractRepo;
import com.azad.repo.ReferanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/emplyer-contract-person/")
public class EmplyerContractPerController {
    @Autowired
    private EmplyerContractRepo repo;

    @GetMapping(value = "create.jsf")
    public ModelAndView display() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("obj", new EmplyerContactPerson());
        modelAndView.setViewName("emplyercontactperson/create");
        return modelAndView;
    }

    @PostMapping(value = "create.jsf")
    public ModelAndView save(@Valid EmplyerContactPerson obj, BindingResult result) {
        ModelAndView modelAndView = new ModelAndView();
        if (obj != null) {
            repo.save(obj);
            modelAndView.addObject("obj", new EmplyerContactPerson());
            modelAndView.setViewName("emplyercontactperson/create");
        }
        modelAndView.setViewName("emplyercontactperson/create");
        return modelAndView;
    }

    @GetMapping(value = "list.jsf")
    public ModelAndView getList() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", repo.findAll());
        modelAndView.setViewName("emplyercontactperson/list");
        return modelAndView;
    }

}
