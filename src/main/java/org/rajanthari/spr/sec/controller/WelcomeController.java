package org.rajanthari.spr.sec.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("/welcome")
    public String welcome() {
        return "Welcome";
    }


    @RequestMapping("/dashboard")
    public String dashboard() {
        return "Dashboard";
    }



    @RequestMapping("/report")
    public String report() {
        return "Report";
    }


}
