package com.khimin.shop.exception;

/**
 * Created by tikhon on 11/18/18.
 */
public class EmailExistsException extends Exception {
    public EmailExistsException() {
        super();
    }

    public EmailExistsException(String message) {
        super(message);
    }
}
