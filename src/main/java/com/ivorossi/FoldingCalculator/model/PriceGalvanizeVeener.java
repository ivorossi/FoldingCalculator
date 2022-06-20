package com.ivorossi.FoldingCalculator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity(name = "price_galvanize_veener")
@Table(name = "price_galvanize_veener")
public class PriceGalvanizeVeener {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private int id;
    @Column
    private String typeVeener;
    @Column
    private float price;

    public PriceGalvanizeVeener() {
    }

    public PriceGalvanizeVeener(int id, String manufacture, float price) {
        this.id = id;
        this.typeVeener = manufacture;
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
