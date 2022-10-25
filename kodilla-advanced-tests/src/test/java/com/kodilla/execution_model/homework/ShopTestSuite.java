package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order oder1 = new Order(50.20, LocalDate.of(2019,10,24),"Janusz66");
    Order oder2 = new Order(150.20, LocalDate.of(2021,10,20),"Feliks54");
    Order oder3 = new Order(130.50, LocalDate.of(2022,9,1),"Andrzej74");
    Order oder4 = new Order(75.50, LocalDate.of(2021,9,15),"Gamer11");
    Order oder5 = new Order(35.00, LocalDate.of(2022,10,3),"Marek31");

    @Test
    public void shouldAddOrdersToShop() {
        int numberOfOrders = shop.getSize();
        assertEquals(5, numberOfOrders);
    }
    @Test
    public void shouldSumValuesOfAllOrders() {
        double sumOfOrders = shop.sumOrders();
        assertEquals(441.4, sumOfOrders);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        Order result = shop.getOrder(-2);

        assertNull(result);
    }
    @Test
    public void shouldReturnRightNumbersOfOrdersAccordingToMinMaxRange() {
        assertEquals(4,shop.getOrdersByMinMaxValue(30,140).size());
    }
    @Test
    public void shouldReturnFilteredObjectLisTFrom2Years() {
        assertEquals(4,shop.getOrdersByDateRange(LocalDate.of(2020,10,25), LocalDate.of(2022,10,25)).size());
    }
    @BeforeEach
    public void initializeInvoice() {
        shop.addOrder(oder1);
        shop.addOrder(oder2);
        shop.addOrder(oder3);
        shop.addOrder(oder4);
        shop.addOrder(oder5);
    }
    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }
    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }
}
