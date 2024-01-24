package com.example.demo.model;

public class Product {
    private Long id;
    private String name;
    private String details;
    private Double price;
    private String production_date;

    public Product(Long id, String name, String details, Double price, String production_date) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.price = price;
        this.production_date = production_date;
    }

    public Product() {
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

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                ", price=" + price +
                ", production_date='" + production_date + '\'' +
                '}';
    }
}
