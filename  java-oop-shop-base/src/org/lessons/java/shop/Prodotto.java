package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.random.*;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    public static final BigDecimal IVA = new BigDecimal("1.22");

    public Prodotto(String name, String description, BigDecimal price) {
        Random rand = new Random();
        this.code = rand.nextInt(100000);
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (!name.isBlank()) {
            this.name = name;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        if (!description.isBlank()) {
            this.description = description;
        }
    }

    public String nameAndCode() {
        if (name != null) {
            return code + " " + name;
        } else {
            return null;
        }
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        if (price != null) {
            this.price = price;
        }
    }

    public BigDecimal getPriceIVA() {

        return this.price.multiply(IVA).setScale(2, RoundingMode.HALF_UP);

    }

    public String toString() {
        return "Codice: " + this.code +
                "\nNome: " + this.name +
                "\nDescrizione: " + this.description +
                "\nPrezzo: " + this.price + "EUR" +
                "\nPrezzo con IVA: " + getPriceIVA() + "EUR";
    }
};