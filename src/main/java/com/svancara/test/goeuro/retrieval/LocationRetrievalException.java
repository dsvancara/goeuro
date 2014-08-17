package com.svancara.test.goeuro.retrieval;

public class LocationRetrievalException extends RuntimeException {
    public LocationRetrievalException() {
    }

    public LocationRetrievalException(String message) {
        super(message);
    }

    public LocationRetrievalException(String message, Throwable cause) {
        super(message, cause);
    }

    public LocationRetrievalException(Throwable cause) {
        super(cause);
    }
}
