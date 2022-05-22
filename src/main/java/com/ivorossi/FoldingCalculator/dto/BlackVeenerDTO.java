package com.ivorossi.FoldingCalculator.dto;

public class BlackVeenerDTO {
    private int high;
    private int width;
    private String typeManufacture;
    private int amount;
    private String veenerThickness;

    public BlackVeenerDTO() {
    }

    public BlackVeenerDTO(int high, int width, String typeManufacture, int amount, String veenerThickness) {
        this.high = high;
        this.width = width;
        this.typeManufacture = typeManufacture;
        this.amount = amount;
        this.veenerThickness = veenerThickness;
    }

    public int getHigh() {
        return high;
    }

    public int getWidth() {
        return width;
    }

    public String getTypeManufacture() {
        return typeManufacture;
    }

    public int getAmount() {
        return amount;
    }

    public String getVeenerThickness() {
        return veenerThickness;
    }
}
