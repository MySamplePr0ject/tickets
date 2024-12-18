package com.tickets.identities.controller;

import com.tickets.identities.utils.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private JwtUtils jwtUtils;

    @PostMapping("/login")
    public String login (@PathVariable String userName){
        return jwtUtils.generateToken(userName);
    }
}
