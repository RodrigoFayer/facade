package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {
    private List<Request> pendingRequests = new ArrayList<Request>();

    public void addRequest(Request request) {
        this.pendingRequests.add(request);
    }

    public boolean verifyPendingRequest(Request request) {
        return this.pendingRequests.contains(request);
    }
}
