package com.example.controller;

import com.example.model.Checkout;
import com.example.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    @Autowired
    private CheckoutService service;

    @PostMapping
    public Checkout saveCheckout(@RequestBody Checkout checkout) {
        return service.saveAddress(checkout);
    }
}