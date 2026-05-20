package com.example.service;

import com.example.model.Checkout;
import com.example.repository.CheckoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckoutService {

    @Autowired
    private CheckoutRepository repository;

    public Checkout saveAddress(Checkout checkout) {
        return repository.save(checkout);
    }
}