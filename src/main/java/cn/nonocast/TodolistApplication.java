package cn.nonocast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class TodolistApplication {
    @Value("${project.version}")
    private String version;

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("version", this.version);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(TodolistApplication.class, args);
    }
}