package com.manchesterdigital;

public class OrderProcessor {

    private OrderStatus orderStatus;

    public OrderProcessor(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void obtainCurrentOrderStatus( ) {
            if (orderStatus == orderStatus.DISPATCHED)
        {
            System.out.println("You should receive your item soon.. ");
            // have to be treated similar to numbers when comparing
        } else {

            System.out.println("We have no idea where your package is, " +
                    "however your order is at stage " + orderStatus.toString());
        }
    }
// above is second way of doing it
    // below is first way of doing it


    public void printOrderMessage() {
        System.out.println(orderStatus.getMessage());

        // git rid of below and refactored to above, hence ENUMS



      /*  switch (orderStatus) {
            case PENDING:
                System.out.println("order is pending");
                break;
            case DECLINED:
                System.out.println("order is declined");
                break;
            case DISPATCHED:
                System.out.println("dispatched");
                break;
            case AWAITING_PAYMENT:
                System.out.println("awaiting payment");
                break;
            default:
                System.out.println("Order has been processed");

        } */



/*
can be made better by enhancing the enums by adding variables
 */
    }
}
