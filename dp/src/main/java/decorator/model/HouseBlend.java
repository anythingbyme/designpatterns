package decorator.model;

import decorator.model.Beverage;

import java.math.BigDecimal;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        name = "HouseBlend";
        price = new BigDecimal(2.00);

    }
}
