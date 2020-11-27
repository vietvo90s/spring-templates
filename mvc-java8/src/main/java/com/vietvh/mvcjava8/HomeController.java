package com.vietvh.mvcjava8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Spring MVC");
        return "home/index";
    }

    @GetMapping("/info")
    public @ResponseBody String info() {
        return "status ok";
    }

}
