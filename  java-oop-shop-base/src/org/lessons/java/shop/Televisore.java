package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    private int Pollici;
    private boolean isSmart;

    public Televisore(String name, String description, BigDecimal price, int Pollici, boolean isSmart) {
        super(name, description, price);
        this.Pollici = Pollici;
        this.isSmart = isSmart;
    }

    public double getPollici() {
        return this.Pollici;
    }

    public void setPollici(int Pollici) {
        this.Pollici = Pollici;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Pollici: " + this.Pollici +
                "\n E' una smart TV? " + this.isSmart;
    }
};
