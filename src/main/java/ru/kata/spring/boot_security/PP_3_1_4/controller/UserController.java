package ru.kata.spring.boot_security.PP_3_1_4.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.PP_3_1_4.model.User;
import ru.kata.spring.boot_security.PP_3_1_4.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String showUserInfo(Model model) {
        User user = userService.showOne();
        model.addAttribute("user", user);
        return "user";
    }
}