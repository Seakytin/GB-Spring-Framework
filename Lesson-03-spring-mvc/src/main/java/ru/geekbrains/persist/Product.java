package ru.geekbrains.persist;

import java.math.BigDecimal;

public class Product {

    private Long id;

    private String name;

    // TODO
    private String description;

    // TODO

    private int price;
    public Product() {
    }

    public Product(Long id, String name, String description, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
