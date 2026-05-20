package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "checkout")
public class Checkout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String city;
    private String pincode;
    private String addressLine;

    
}