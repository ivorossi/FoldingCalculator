package com.ivorossi.FoldingCalculator.dto;

public class GalvanizeVeenerDTO {

    private int high;
    private int developing;
    private String typeVeener;
    private int amount;

    public GalvanizeVeenerDTO() {
    }

    public GalvanizeVeenerDTO(int high, int developing, String typeManufacture, int amount) {
        this.high = high;
        this.developing = developing;
        this.typeVeener = typeManufacture;
        this.amount = amount;

    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getDeveloping() {
        return developing;
    }

    public void setDeveloping(int developing) {
        this.developing = developing;
    }

    public String getTypeVeener() {
        return typeVeener;
    }

    public void setTypeVeener(String typeVeener) {
        this.typeVeener = typeVeener;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
