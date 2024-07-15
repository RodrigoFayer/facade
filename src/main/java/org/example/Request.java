package org.example;

public class Request {
    public boolean confirm() {
        return RequestFacade.verifyRequest(this);
    }
}
