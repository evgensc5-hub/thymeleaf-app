package pixel.academy.thymeleaf_app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pixel.academy.thymeleaf_app.model.Student;

public class StudentController {

    @GetMapping("/showStudentFrom")
    public String showForm(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }
}
