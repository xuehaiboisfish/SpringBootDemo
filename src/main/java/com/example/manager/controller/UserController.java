package com.example.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/login")
    public String HelloWorld() {
        return "login";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }


    @RequestMapping(value="/", method= RequestMethod.GET)
    public String create() {
        return "create";
    }

    @RequestMapping(value="/", method= RequestMethod.PUT)
    public String update() {
        return "update";
    }

    @RequestMapping(value="/", method= RequestMethod.DELETE)
    public String delete() {
        return "delete";
    }

}