package test;

import decorator.model.Beverage;
import decorator.model.Condiment;
import decorator.model.Decaf;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class BeverageTest {

    @Test
    public void beverage() {
        Beverage beverage = new Decaf();
        Assert.assertEquals(new BigDecimal(1.5), beverage.getPrice());
    }

    @Test
    public void condimentAdd() {
        Beverage beverage = new Decaf();
        beverage.setPrice(BigDecimal.ONE);
        Condiment condiment = new Condiment();
        condiment.setPrice(BigDecimal.ONE);
        beverage.addCondiment(condiment);
        Assert.assertEquals(BigDecimal.valueOf(1), beverage.getCondimentsPrice());
        Assert.assertEquals(BigDecimal.valueOf(2), beverage.getPrice());
    }

    @Test
    public void orderDecafWithMochaAndWhip() {
        Beverage decaf = new Decaf();
        decaf.setPrice(BigDecimal.ONE);
        // Mocha
        Condiment mocha = new Condiment();
        mocha.setPrice(BigDecimal.ONE);

        Condiment whip = new Condiment();
        whip.setPrice(BigDecimal.ONE);

        decaf.addCondiments(Arrays.asList(mocha, whip));

        Assert.assertEquals(BigDecimal.valueOf(3), decaf.getPrice());


    }
}