package com.homelearning.abstract_factory;

public class NotSupportedOSError extends Error {
    public NotSupportedOSError(String message) {
        super(message);
    }
}
