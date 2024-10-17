package dev.naimsulejmani.webdevelopmentgrupi1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class ExampleController {
    private int homeCount;
    private int aboutCount;
    private int contactCount;

    @GetMapping("/")
    public String index() {
        homeCount++;
        System.out.println("Home count: " + homeCount);
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        aboutCount++;
        System.out.println("About count: " + aboutCount);
        model.addAttribute("name", "Naim Sulejmani");
        model.addAttribute("age", 20);
        model.addAttribute("date", LocalDate.now());
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        contactCount++;
        System.out.println("Contact count: " + contactCount);
        return "contact";
    }

    @GetMapping("/stats")
    public String stats(Model model) {
        model.addAttribute("homeCount", homeCount);
        model.addAttribute("aboutCount", aboutCount);
        model.addAttribute("contactCount", contactCount);
        return "stats";
    }
}











