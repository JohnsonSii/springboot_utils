package com.johnsonsii.controller;


import com.johnsonsii.entity.User;
import com.johnsonsii.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class IndexController {
    
    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        for (User user : userService.list()) {
            System.out.println(user.getUserName());
        }


        return "OK";
    }
}
