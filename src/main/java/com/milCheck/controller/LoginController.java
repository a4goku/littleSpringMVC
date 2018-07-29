package com.milCheck.controller;

import com.milCheck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/loginProcess")
    public ModelAndView loginProcess(HttpServletRequest request,
                                     HttpServletResponse response){
        ModelAndView mav = new ModelAndView();

        System.out.println("-----------输出了--------------");
        userService.getUserInfoByName("aaa");
        mav.setViewName("index");
        return mav;
    }

}
