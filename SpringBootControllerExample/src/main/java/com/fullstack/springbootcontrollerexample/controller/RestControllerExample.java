package com.fullstack.springbootcontrollerexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class RestControllerExample {

    @GetMapping
	public String hello() {
		return "hello";
    }
}