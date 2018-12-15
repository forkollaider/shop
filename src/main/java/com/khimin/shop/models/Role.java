package com.khimin.shop.models;

/**
 * Created by tikhon on 11/111/18.
 */
public enum Role {
    USER("USER"),
    ADMIN("ADMIN");

    private String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
