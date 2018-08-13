package com.milCheck.controller;

import com.milCheck.model.SeeUser;
import com.milCheck.service.RedisBaiseTakes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("test")
public class TestController {

    @Resource(name="seeUserRedisTakes")
    private RedisBaiseTakes seeUserRedisTakes;

    @RequestMapping("/hello.do")
    public ModelAndView hello(){
        ModelAndView mv = new ModelAndView();
        seeUserRedisTakes.add("hello1","zxm");
        System.out.println("hello see");
        mv.setViewName("hello");
        return mv;
    }
    /*
    @RequestMapping("/hello2.do")
    public ModelAndView hello2(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        SeeUser seeUser = new SeeUser();
        seeUser.setId("1");
        seeUser.setIp(GetUserInfo.getIpAddr(request));
        seeUser.setSeeTime(CommTools.getNoewTime("yyyy-MM-dd HH:mm:ss"));
        seeUser.setSeeCount(1);
        seeUserRedisTakes.addObj("seeUser",seeUser.getId(),seeUser);
        mv.setViewName("hello");
        return mv;
    }
    */
    @RequestMapping("/hello3.do")
    public ModelAndView hello3(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        SeeUser seeUser = (SeeUser) seeUserRedisTakes.getObj("seeUser","1");
        if(seeUser!=null){
            System.out.println(seeUser.getId()+"======="+seeUser.getIp()+"======"+seeUser.getSeeTime()+"======="+seeUser.getSeeCount());
        }

        mv.setViewName("hello");
        return mv;
    }

}
