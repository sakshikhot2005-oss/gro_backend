package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Double price;
    private String category;
    private String image;

    
    // 🔹 Getter for ID
    public Long getId() {
        return id;
    }

    // 🔹 Setter for ID
    public void setId(Long id) {
        this.id = id;
    }

    // 🔹 Getter for Title
    public String getTitle() {
        return title;
    }

    // 🔹 Setter for Title
    public void setTitle(String title) {
        this.title = title;
    }

    // 🔹 Getter for Price
    public Double getPrice() {
        return price;
    }

    // 🔹 Setter for Price
    public void setPrice(Double price) {
        this.price = price;
    }

    // 🔹 Getter for Category
    public String getCategory() {
        return category;
    }

    // 🔹 Setter for Category
    public void setCategory(String category) {
        this.category = category;
    }

    // 🔹 Getter for Image
    public String getImage() {
        return image;
    }

    // 🔹 Setter for Image
    public void setImage(String image) {
        this.image = image;
    }
}

