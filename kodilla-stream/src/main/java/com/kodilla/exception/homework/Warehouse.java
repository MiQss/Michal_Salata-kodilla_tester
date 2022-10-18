package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Warehouse {
    static List<Order> orderList = new ArrayList<>();

    public static Order addOrder(Order order){
        orderList.add(order);
        System.out.println("Order " + order + " added.");
        return order;
    }
    public static void getOrder(String number) {
        orderList
                .stream()
                .filter(n -> n.getNumber().equals(number))
                .collect(Collectors.toList());
    }
    public boolean isOrderInWarehouse (String order) throws OrderDoesntExistException {
        if (orderList.contains(order)) {
            return true;
        }
        throw new OrderDoesntExistException();
    }


}
