package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private int IMEI;
    private int GbMemoria;

    public Smartphone(String name, String description, BigDecimal price, int IMEI, int GbMemoria) {
        super(name, description, price);
        this.IMEI = IMEI;
        this.GbMemoria = GbMemoria;
    }

    public int getIMEI() {
        return this.IMEI;
    }

    public void setIMEI(int IMEI) {
        this.IMEI = IMEI;
    }

    public int getGbMemoria() {
        return this.GbMemoria;
    }

    public void getGbMemoria(int GbMemoria) {
        this.GbMemoria = GbMemoria;
    }

    public String toString() {
        return super.toString() +
                "\n Imei: " + this.IMEI +
                "\nGb di Memoria: " + this.GbMemoria;
    }

}
