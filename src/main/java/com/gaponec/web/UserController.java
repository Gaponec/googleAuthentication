package com.gaponec.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/users")
    public Principal user(Principal principal){
        return principal;
    }

}
