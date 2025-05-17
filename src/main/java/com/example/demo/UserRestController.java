package com.example.demo;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/userinfo")
    public Object getUser(OAuth2AuthenticationToken authentication) {
        OAuth2User user = authentication.getPrincipal();
        return user.getAttributes();  // returns a map of user details
    }
}
