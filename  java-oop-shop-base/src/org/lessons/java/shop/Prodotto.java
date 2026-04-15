package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Prodotto {

    public int code = (int) (Math.random() * 100000);
    public String name;
    public String description;
    public BigDecimal price;
    public BigDecimal IVA;

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

    public BigDecimal getPriceIVA() {
        if (price != null) {
            this.IVA = new BigDecimal(1.22);

            return this.price.multiply(this.IVA).setScale(2, RoundingMode.HALF_UP);
        } else {
            return null;
        }
    }
};