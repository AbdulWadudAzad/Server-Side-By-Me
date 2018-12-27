package com.azad.travelagency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlar {
    @GetMapping(value = "/")
    public String displayHome() {
        return "index";
    }

    @GetMapping(value = "/tt.jsf")
    public String displayTest() {
        return "test";
    }
    @GetMapping(value = "/t.jsf")
    public String displayExam() {
        return "foo/exam";
    }
}