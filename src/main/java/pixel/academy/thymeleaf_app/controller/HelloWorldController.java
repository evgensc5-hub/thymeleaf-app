package pixel.academy.thymeleaf_app.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    //metoda pentru a afisa fprmularul HTML initial

    @GetMapping("/showForm")
    public String showForm() {
        return "helloworld-form";

    }
    // metoda se ocupa de procesarea datelor din formularu HTML
    @GetMapping("/processForm")
    public String procesForm() {
        return "helloworld";
    }
    @GetMapping("/greetingNewForm")
    public String generateGreeting(@RequestParam("studentName")String theName, Model model) {


        theName = theName.toUpperCase();

        String result = "Submission successful. User: " +theName;

        model.addAttribute("message", result);
        return "helloworld";
    }

}
