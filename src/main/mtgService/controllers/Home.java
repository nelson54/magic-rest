package main.mtgService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {

    @ResponseBody
    @RequestMapping("/index.html")
    String home() {
        return "Hello World!";
    }

}
