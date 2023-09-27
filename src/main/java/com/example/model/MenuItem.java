package com.example.model;

import java.io.Serializable;

public class MenuItem implements Serializable {
    private Long id;
    private String name;
    private double price;

    public MenuItem() {}

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public MenuItem(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters e Setters

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Object getId() {
    }

    public Object getName() {
    }

    public Object getPrice() {
    }

    public void setName(Object name) {
    }

    public void setPrice(Object price) {
    }

    public void setId(long nextId) {
    }
}
