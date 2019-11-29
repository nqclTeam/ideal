package com.nqcl.api.controller;

import com.nqcl.api.entity.User;
import com.nqcl.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public List<User> hello() {
        List<User> hello = null;
        try {
            hello = userService.hello();
        } catch (Exception e) {
            System.out.println(e);
        }
        return hello;
    }

    @RequestMapping(value = "index1", method = RequestMethod.GET)
    public ModelAndView getUserList() {
        ModelAndView mav = new ModelAndView();
        try {
            List<User> users = userService.hello();
            mav.addObject("users", users);
            mav.setViewName("index");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mav;
    }

    @RequestMapping("index2")
    public String toIndex(){
        return "index.html";
    }
}