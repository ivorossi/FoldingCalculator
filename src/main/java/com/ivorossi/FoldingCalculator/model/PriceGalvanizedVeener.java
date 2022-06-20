package com.ivorossi.FoldingCalculator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "price_galvanize_veener")
@Table(name = "price_galvanize_veener")
public class PriceGalvanizedVeener {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true, updatable = false)
    private String typeVeener;
    @Column
    private float price;

    public PriceGalvanizedVeener() {
    }

    public PriceGalvanizedVeener(int id, float price) {
        this.id = id;
        this.price = price;
    }

    public PriceGalvanizedVeener(String typeVeener, float price) {
        this.typeVeener = typeVeener;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeVeener() {
        return typeVeener;
    }

    public void setTypeVeener(String typeVeener) {
        this.typeVeener = typeVeener;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
