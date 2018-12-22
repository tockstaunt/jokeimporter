package com.jokeimporter.controller;

import com.jokeimporter.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", "","/chuck.html"})
    public String chuck(Model model){
        model.addAttribute("joke", jokeService.getJoke());

        return "chuck";
    }
}
