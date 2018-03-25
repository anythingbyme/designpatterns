package test;

import command.objectvilleDiner.api.ICook;
import command.objectvilleDiner.api.ICustomer;
import command.objectvilleDiner.api.IWaiter;
import command.objectvilleDiner.svc.Cook;
import command.objectvilleDiner.svc.Customer;
import command.objectvilleDiner.svc.Waiter;
import org.junit.Test;

public class ICustomerTest {

//    public void testPlaceOrder() {
//        Customer customer = new Customer(); // client
//        // client creates command
//        Customer.Order order = new Customer.Order();
//        // client sets command
//        customer.setOrder(order);
//        // client calls invoker
//
//        // invoker executes
//        IWaiter waiter = new Waiter();
//        waiter.orderUp();
//
//
//
//
//        waiter.orderUp();
//
//        customer.placeOrder();
//    }
//
//    @Test
//    public void waiter() {
//        IWaiter waiter = new Waiter();
//        waiter.orderUp();
//    }

    @Test
    public void cook() {
        ICook cook = new Cook();
        cook.prepareFood();
    }
}