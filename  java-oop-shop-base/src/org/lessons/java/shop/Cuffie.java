package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String Colore;
    private boolean isWireless;

    public Cuffie(String name, String description, BigDecimal price, String Colore, boolean isWireless) {
        super(name, description, price);
        this.Colore = Colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return this.Colore;
    }

    public void setColore(String Colore) {
        this.Colore = Colore;
    }

    public boolean getIsWireless() {
        return isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public String toString() {
        return super.toString() +
                "\n Di colore " + this.Colore +
                "\n Sono wirelss?" + this.isWireless;
    }

}
