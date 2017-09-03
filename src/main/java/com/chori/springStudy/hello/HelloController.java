package com.chori.springStudy.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springStudy/hello")
public class HelloController {
    @RequestMapping("/helloMain")
    public void helloMain(Model model) {
        System.out.println("helloMain에 들어왔다!");
        model.addAttribute("name", "chori");
    }
}
