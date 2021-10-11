package com.sarpio.authorization.controller;

import com.sarpio.authorization.security.IAuthenticationFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
public class TestController {

    private final IAuthenticationFacade authenticationFacade;

    @GetMapping
    public String all() {
        return "All access page";
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping("/user")
    public String user() {
        Authentication authentication = authenticationFacade.getAuthentication();
        return "User ID: "+ authentication.getName();
//        return "Hello User";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "Admin page";
    }
}
