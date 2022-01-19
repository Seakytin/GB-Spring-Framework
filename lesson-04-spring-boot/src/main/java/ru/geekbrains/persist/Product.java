package ru.geekbrains.persist;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Product {

    private Long id;

    @NotBlank
    private String name;


    @NotBlank
    private String description;

    @NotNull
    private Integer price;
    public Product() {
    }

    public Product(Long id, String name, String description, Integer price) {
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
