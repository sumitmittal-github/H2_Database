package com.sumit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping
    public List<String> getAllCustomers(){
        return List.of("Sumit", "Lokesh");
    }


}