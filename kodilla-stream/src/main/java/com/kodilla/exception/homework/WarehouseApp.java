package com.kodilla.exception.homework;
public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse.addOrder(new Order("1"));
        Warehouse.addOrder(new Order("2"));
        Warehouse.addOrder(new Order("3"));

        Warehouse.getOrder("5");

        Warehouse warehouse = new Warehouse();
        try {
            boolean goodOrder = warehouse.isOrderInWarehouse("5");
        } catch (OrderDoesntExistException e) {
            System.out.println("Order 5 not found.");
        }
    }
}
