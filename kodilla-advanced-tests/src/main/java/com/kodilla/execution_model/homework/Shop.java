package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder (Order order) {
        this.orders.add(order);
    }

    public double sumOrders() {
        double sum = 0;
        for (Order order : this.orders) {
            sum += order.getValue();
        }
        System.out.println("Order value total:  " + sum);
        return sum;
    }
    public int getSize() {
        return this.orders.size();
    }
    public List<Order> getOrdersByMinMaxValue(double minValue, double maxValue) {
        List<Order> ordersByValue = orders
                .stream()
                .filter(u -> u.getValue() >= minValue)
                .filter(un -> un.getValue() <= maxValue)
                .collect(Collectors.toList());
        return ordersByValue;
    }
    public List<Order> getOrdersByDateRange(LocalDate dateFrom, LocalDate dateTo) {
        List<Order> ordersByDate = orders
                .stream()
                .filter(u -> u.getDate().isAfter(dateFrom.minusDays(1)))
                .filter(un -> un.getDate().isBefore(dateTo.plusDays(1)))
                .collect(Collectors.toList());
        return ordersByDate;
    }
}
