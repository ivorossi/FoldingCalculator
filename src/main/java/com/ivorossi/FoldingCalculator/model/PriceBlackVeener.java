package com.ivorossi.FoldingCalculator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "price_black_veener")
public class PriceBlackVeener {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, updatable = false)
    private String manufacture;
    @Column
    private float price;

    public PriceBlackVeener() {
    }

    public PriceBlackVeener( String manufacture, float price) {
        this.manufacture = manufacture;
        this.price = price;
    }

    public PriceBlackVeener(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
