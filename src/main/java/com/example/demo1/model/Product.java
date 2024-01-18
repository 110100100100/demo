package com.example.demo1.model;

public class Product {
    public int id;
    public String name;
    public String detail;
    public double price;

    public Product() {
    }

    public Product(String name, String detail, double price) {
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public Product(int id, String name, String detail, double price) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }
}
