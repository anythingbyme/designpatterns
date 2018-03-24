package test;

import Factory.client.ChicagoPizzaStore;
import Factory.client.NYPizzaStore;
import Factory.client.PizzaStore;
import Factory.factory.ChicagoPizzafactory;
import Factory.factory.NYPizzaFactory;
import Factory.factory.SimplePizzafactory;
import junit.framework.Assert;
import org.junit.Test;

public class PizzaStoreTest {

    @Test
    public void testOrderPizza() {
//        Assert.assertEquals("", new PizzaStore(new SimplePizzafactory()).orderPizza("cheese"));

//        new PizzaStore(new NYPizzaFactory()).orderPizza("cheese");
//        new PizzaStore(new ChicagoPizzafactory()).orderPizza("cheese");

        PizzaStore nyPizzaStore = new NYPizzaStore(new NYPizzaFactory());
        nyPizzaStore.orderPizza("cheese");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore(new ChicagoPizzafactory());
        chicagoPizzaStore.orderPizza("cheese");
    }
}