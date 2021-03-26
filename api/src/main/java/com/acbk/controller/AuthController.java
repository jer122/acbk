package com.acbk.controller;

import com.acbk.dto.LoginDto;
import com.acbk.dto.TokenDto;
import com.acbk.dto.UserDto;
import com.acbk.service.jwt.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController

@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthService authService;

    @PostMapping("/authenticate")
    public ResponseEntity<TokenDto> authorize(@Valid @RequestBody LoginDto loginDto) {
        return authService.authorizeUser(loginDto);
    }

    @PostMapping("/signup")
    public Long signup(@Valid @RequestBody UserDto userDto) {
        return authService.signup(userDto);
    }
}
