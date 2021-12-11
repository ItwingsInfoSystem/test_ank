package com.outh2.integration.github_integration.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {



    @GetMapping("/test")
    public ResponseEntity testApi() {
        Map<String,String> testMap = new HashMap<>();
        testMap.put("App","ThreadoApp");
        testMap.put("User","Ankit Sharma");
        return ResponseEntity.ok(testMap);
    }



}
