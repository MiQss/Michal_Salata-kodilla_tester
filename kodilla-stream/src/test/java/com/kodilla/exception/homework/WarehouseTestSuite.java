package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;
import com.kodilla.exception.AirportRepository;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInWarehouse() throws OrderDoesntExistException {
        // when
        Warehouse.addOrder(new Order("2"));
        Warehouse.getOrder("2");
        // then
        Order isOrder2inWarehouse = new Order("2");
        assertEquals(isOrder2inWarehouse.getNumber(),Warehouse.getOrder("2").getNumber());
    }
    @Test
    public void testIsOrderInWarehouse_withException(){
        // given
        Warehouse warehouse = new Warehouse();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> Warehouse.isOrderInWarehouse("5"));
    }
}