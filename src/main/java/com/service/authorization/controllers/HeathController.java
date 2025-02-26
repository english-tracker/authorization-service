package com.service.authorization.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/authorization")
public class HeathController {

    @GetMapping("/heath")
    public ResponseEntity<String> heath() {
        return ResponseEntity.ok("OK!");
    }
}
