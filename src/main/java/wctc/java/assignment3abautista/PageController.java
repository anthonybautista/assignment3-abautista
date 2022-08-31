package wctc.java.assignment3abautista;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/tutorial/step1")
    public String showStepOne() {
        return "/pages/step1";
    }

    @RequestMapping("/tutorial/step2")
    public String showStepTwo() {
        return "/pages/step2";
    }

    @RequestMapping("/tutorial/step3")
    public String showStepThree() {
        return "/pages/step3";
    }
}
