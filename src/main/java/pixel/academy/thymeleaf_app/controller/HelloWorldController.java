package pixel.academy.thymeleaf_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //metoda pentru a afisa fprmularul HTML initial

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";

    }
    // metoda se ocupa de procesarea datelor din formularu HTML
    @GetMapping("/processForm")
    public String procesForm() {
        return "helloworld";
    }

}
