package command.objectvilleDiner.api;

import command.objectvilleDiner.svc.Customer;

public interface IWaiter {
    void orderUp();
    void setOrder(Customer.Order order);
}
