package ra.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.mvc.model.Student;

import javax.validation.Valid;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("student",new Student());
        return "home";
    }
    @RequestMapping("/helo/home")
    public String home1(Model model){
        model.addAttribute("student",new Student());
        return "home";
    }
    @PostMapping("/submit")
    public String validateForm(@ModelAttribute @Valid Student student, BindingResult bindingResult,Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("student",student);
            return "home";
        }
        return "success";
    }

}
