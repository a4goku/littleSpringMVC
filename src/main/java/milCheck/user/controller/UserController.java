package milCheck.user.controller;

import milCheck.user.service.IUserService;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController {
    private IUserService service;

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mav = null;
        return mav;
    }

    public  IUserService getService(){
        return service;
    }

    public void setService(IUserService service) {
        this.service = service;
    }
}
