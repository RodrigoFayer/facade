package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RequestTest {
    @Test
    void shouldReturnTrueWhenRequestIsConfirmed() {
        Request request = new Request();
        assertTrue(request.confirm());
    }

    @Test
    void shouldReturnFalseWhenRequestIsNotConfirmedByKitchen() {
        Request request = new Request();
        Kitchen.getInstance().addRequest(request);
        assertFalse(request.confirm());
    }

    @Test
    void shouldReturnFalseWhenRequestIsNotConfirmedByDelivery() {
        Request request = new Request();
        Delivery.getInstance().addRequest(request);
        assertFalse(request.confirm());
    }

    @Test
    void shouldReturnFalseWhenRequestIsNotConfirmedByPayment() {
        Request request = new Request();
        Payment.getInstance().addRequest(request);
        assertFalse(request.confirm());
    }
}