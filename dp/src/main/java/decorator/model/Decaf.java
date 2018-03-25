package decorator.model;

import decorator.model.Beverage;

import java.math.BigDecimal;

public class Decaf extends Beverage {
    public Decaf() {
        name = "Decaf";
        price = new BigDecimal(1.50);
    }
}
