package pixel.academy.thymeleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
    //metoda pentru a afisa fprmularul HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";

    }

}
