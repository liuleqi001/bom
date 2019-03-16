package com.zerun.bom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class testcontroller {
    @RequestMapping("/")

   public  String test(){
        return "login.html";
   }
}
