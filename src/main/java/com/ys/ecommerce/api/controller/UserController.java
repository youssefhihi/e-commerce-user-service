package com.ys.ecommerce.api.controller;

import com.ys.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Validated
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @GetMapping("/test")
    public String test() {
        return "hiiiiiiiii it wooooorks";
    }

}
