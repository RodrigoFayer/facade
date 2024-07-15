package org.example;

public class RequestFacade {
    public static boolean verifyRequest(Request request) {
        if (Kitchen.getInstance().verifyPendingRequest(request)) {
            return false;
        }

        if (Delivery.getInstance().verifyPendingRequest(request)) {
            return false;
        }

        if (Payment.getInstance().verifyPendingRequest(request)) {
            return false;
        }

        return true;
    }
}
