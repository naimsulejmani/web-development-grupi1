package dev.naimsulejmani.webdevelopmentgrupi1.controllers;

import dev.naimsulejmani.webdevelopmentgrupi1.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ExampleController {
    private int homeCount;
    private int aboutCount;
    private int contactCount;
    private int timeCount;
    private int statsCount;
    private LocalDateTime startedTime = LocalDateTime.now();

    @GetMapping("/")
    public String index(Model model) {
        homeCount++;
        System.out.println("Home count: " + homeCount);
        model.addAttribute("pageTitle", "Home Page");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        aboutCount++;
        System.out.println("About count: " + aboutCount);
        model.addAttribute("name", "Naim Sulejmani");
        model.addAttribute("age", 20);
        model.addAttribute("date", LocalDate.now());
        model.addAttribute("pageTitle", "About Page");

        var student = new Student(1, "Naim", "Sulejmani");
        model.addAttribute("student", student);
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        contactCount++;
        System.out.println("Contact count: " + contactCount);
        model.addAttribute("pageTitle", "Contact Page");
        return "contact";
    }

    @GetMapping("/stats")
    public String stats(Model model) {
        statsCount++;
        model.addAttribute("homeCount", homeCount);
        model.addAttribute("aboutCount", aboutCount);
        model.addAttribute("contactCount", contactCount);
        model.addAttribute("timeCount", timeCount);
        model.addAttribute("statsCount", statsCount);
        model.addAttribute("pageTitle", "Stats Page");
//        model.addAttribute("total", homeCount + aboutCount + contactCount + timeCount + statsCount);
        return "stats";
    }

    @GetMapping("/time")
    public String time(Model model) {
        timeCount++;
        model.addAttribute("time", LocalDateTime.now());
        model.addAttribute("startedTime", startedTime);
        model.addAttribute("pageTitle", "Time Page");
        return "time";
    }

    // i want new page portfolio
    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("pageTitle", "Portfolio Page");
        return "portfolio";
    }

}


























