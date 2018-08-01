package com.milCheck.controller;

import com.milCheck.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/loginProcess")
    public ModelAndView loginProcess(HttpServletRequest request,
                                     HttpServletResponse response){
        ModelAndView mav = new ModelAndView();
        String userName = request.getParameter("username");
        String passWord = request.getParameter("password");

        userService.getUserInfoByName(userName);
        mav.setViewName("index");
        return mav;
    }

}
