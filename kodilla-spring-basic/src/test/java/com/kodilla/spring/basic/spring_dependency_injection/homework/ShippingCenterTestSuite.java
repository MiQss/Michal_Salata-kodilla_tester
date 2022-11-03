package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ShippingCenterTestSuite {
    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
    DeliveryService deliveryBean = context.getBean(SimpleDeliveryService.class);
    NotificationService notificationBean = context.getBean(SimpleNotificationService.class);
    ShippingCenter shippingBean = context.getBean(ShippingCenter.class);
    String success = notificationBean.success("Test");
    String fail = notificationBean.fail("Test");

    @Test
    public void shouldDeliverPackagePermittedWeight() {
        boolean delivered = deliveryBean.deliverPackage("Test", 15.0);
        assertTrue(delivered);
    }

    @Test
    public void shouldNotDeliverPackageWrongWeight() {
        boolean delivered = deliveryBean.deliverPackage("Test", 35.0);
        assertFalse(delivered);
    }

    @Test
    public void shouldReturnSuccessMessageIfSentPackage() {
        String sent = shippingBean.sendPackage("Test", 15.0);
        assertEquals(success, sent);
    }

    @Test
    public void shouldReturnFailMessageIfNotSentPackage() {
        String sent = shippingBean.sendPackage("Test", 35.0);
        assertEquals(fail, sent);
    }


}
