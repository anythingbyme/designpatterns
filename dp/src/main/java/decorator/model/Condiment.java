package decorator.model;

import java.math.BigDecimal;

public class Condiment {
    protected String name;
    protected BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }
}
