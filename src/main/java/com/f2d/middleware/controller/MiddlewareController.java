package com.f2d.middleware.controller;

import com.f2d.middleware.domain.UriConstants;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class MiddlewareController {
    @GetMapping(UriConstants.RETRIEVE_USERNAME_FROM_TOKEN_URI)
    public ResponseEntity<String> getUserInfo(@RequestHeader("X-User-Name") String username) {
        // Use the username for your logic
        return ResponseEntity.ok("Username: " + username);
    }
}
