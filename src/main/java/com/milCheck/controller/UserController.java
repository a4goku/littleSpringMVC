package com.milCheck.controller;

import com.milCheck.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = null;
        return mav;
    }
}
