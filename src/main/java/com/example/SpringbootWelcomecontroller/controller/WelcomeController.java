package com.example.SpringbootWelcomecontroller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String welcomeController(){
        return  "SAHIL";
    }

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<String> getMapping(){
        return new ResponseEntity<>("GET MAPPING", HttpStatus.OK);
    }

    @GetMapping("get/{id}")
    public @ResponseBody ResponseEntity<String> getMappingbyId(@PathVariable String id){
        return new ResponseEntity<>("Get Mapping by ID " + id, HttpStatus.OK);

    }

    @GetMapping("/getting")
    public String gettingMethod(@RequestParam String Coder){
        return "This is "+ Coder;
    }

    @PostMapping("/name")
    public String postName(){
        return "Welcome to the Introduction of Rest Controller by ";
    }
    @PutMapping("/get")
    public ResponseEntity<String> putMapping(){
        return new ResponseEntity<>("put mapping ",HttpStatus.ACCEPTED);
    }
}
