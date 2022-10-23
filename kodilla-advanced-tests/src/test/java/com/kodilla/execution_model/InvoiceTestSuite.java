package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvoiceTestSuite {

    Invoice invoice = new Invoice();
    Item beer = new Item("Beer",3.50 );
    Item chips = new Item("Chips", 4.20);
    Item popcorn = new Item("Popcorn", 5.30);

    @Test
    public void shouldAddItemsToInvoice() {
        int numberOfItems = invoice.getSize();

        assertEquals(3, numberOfItems);
    }
    @Test
    public void shouldGetExistingItem() {
        Item result = invoice.getItem(2);

        assertEquals("Popcorn", result.getName());
        assertEquals(5.30, result.getPrice(), 0.01);
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        Item result = invoice.getItem(-3);

        assertNull(result);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOfRangeIndex() {
        Item result = invoice.getItem(5);

        assertNull(result);
    }
    @Test
    public void shouldClearInvoice() {
        invoice.clear();

        assertEquals(0, invoice.getSize());
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(beer);
        invoice.addItem(chips);
        invoice.addItem(popcorn);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
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
