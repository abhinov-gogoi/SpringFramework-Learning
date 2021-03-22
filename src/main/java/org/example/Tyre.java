package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Tyre {
    public String brand;


    public Tyre(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "This is a tyre";
    }
}
