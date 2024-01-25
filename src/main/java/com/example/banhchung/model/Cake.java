package com.example.banhchung.model;

import javax.persistence.*;

@Entity
@Table(name = "cakes")
public class Cake {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String details;
    private String type;
    private double price;
    private Boolean status;

    public Cake() {
    }


    public Cake(String details, String type, double price, Boolean status) {
        this.details = details;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "id=" + id +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
