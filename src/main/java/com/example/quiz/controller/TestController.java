package com.example.quiz.controller;

import com.example.quiz.model.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
@Scope(value = "session")
@Controller
public class TestController {
    private User user;


    @ResponseBody //gdy nie chce się robić html
    @GetMapping("/tests/{id}/play")
    public String play () {
        user.addPoint();
        return "" + user.getNumberOfPoints();

    }

}
