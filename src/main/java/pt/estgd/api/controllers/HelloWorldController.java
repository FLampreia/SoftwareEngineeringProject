package pt.estgd.api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "")
public class HelloWorldController {
    @GetMapping(path = "/hello")
    public @ResponseBody String helloWorld() {
        return "Hello World!";
    }
}
