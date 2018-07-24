package milCheck.qualityHandler.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class QualityHandlerController {
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
