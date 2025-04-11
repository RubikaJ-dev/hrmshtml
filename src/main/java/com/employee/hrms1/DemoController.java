package com.employee.hrms1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@Controller
public class DemoController {

    public DemoController() {
        System.out.println("Success");
        // ✅ Logs when the controller is created
    }
    @GetMapping("/")
    public String Demo(){
        return "home";
    }


}