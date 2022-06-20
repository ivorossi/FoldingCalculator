package com.ivorossi.FoldingCalculator.dto;


public class GalvanizedPriceUpdateDTO {
    private String typeVeener;
    private float price;

    public GalvanizedPriceUpdateDTO() {
    }

    public GalvanizedPriceUpdateDTO(String typeVeener, float price) {
        this.typeVeener = typeVeener;
        this.price = price;
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
