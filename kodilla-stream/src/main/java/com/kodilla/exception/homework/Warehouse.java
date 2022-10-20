package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static List<Order> orderList = new ArrayList<>();

    public static Order addOrder(Order order){
        orderList.add(order);
        System.out.println("Order " + order + " added.");
        return order;
    }
    public static Order getOrder(String number) throws OrderDoesntExistException {
        return orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
    public static boolean isOrderInWarehouse(String order) throws OrderDoesntExistException {
        if (orderList.contains(order)) {
            return true;
        }
        throw new OrderDoesntExistException();
    }


}
