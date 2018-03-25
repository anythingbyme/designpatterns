actors involved:
customer:
waiter:
cook:

customer has no idea about cook;
waiter has a reference to customer.
waiter has a reference to cook.

Waiter
    cook cook;
    OrderRequest orderRequest;

    Order takeOrderFromCustomer(item1, item2, item3);
    askCookToPrepareOrder(Order);

Cook
    prepareOrder(Order);
    send order status after food is ready;
