package edu.wctc.pmnh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    //@RequestMapping("/forward-me")
    //public String doForward() {
        //return "forward : ";
    //}

    @RequestMapping("/step1")
    public String showStep1() {
        return "pages/step1";
    }
    @RequestMapping("/step2")
    public String showStep2() {
        return "pages/step2";
    }
    @RequestMapping("/step3")
    public String showStep3() {
        return "pages/step3";
    }

    //@RequestMapping("/redirect-me")
    //public String doRedirect() {
        //return "redirect:http://www.wctc.edu";
//        return "redirect:/glaciers/trail";
   // }

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
}
