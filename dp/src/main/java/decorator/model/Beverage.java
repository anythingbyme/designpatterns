package decorator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    protected String name;
    protected BigDecimal price;
    protected int qty;

    protected List<Condiment> condiments = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        if(qty==0) qty=1;
        return BigDecimal.valueOf(qty).multiply(price.add(getCondimentsPrice()));
    }

    public BigDecimal getCondimentsPrice() {
        return condiments.stream().map(Condiment::getPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void setPrice(final BigDecimal price) {
        this.price = price;
    }

    public void addCondiment(Condiment condiment) {
        condiments.add(condiment);
    }

    public List<Condiment> getCondiments() {
        return condiments;
    }

    public void addCondiments(List<Condiment> condiments) {
        this.condiments = condiments;
    }


}
