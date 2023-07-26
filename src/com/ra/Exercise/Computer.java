package com.ra.Exercise;


import java.security.Provider;

public class Computer {
    private String computerId;
    private String model;
    private double price;
    private providerId provider;
    private boolean status;

    public Computer() {
    }

    public Computer(String computerId, String model, double price, providerId provider, boolean status) {
        this.computerId = computerId;
        this.model = model;
        this.price = price;
        this.provider= provider;
        this.status = status;
    }

    public String getComputerId() {
        return computerId;
    }

    public void setComputerId(String computerId) {
        this.computerId = computerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public providerId getProvider() {
        return provider;
    }

    public void setProvider(providerId provider) {
        this.provider = provider;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
