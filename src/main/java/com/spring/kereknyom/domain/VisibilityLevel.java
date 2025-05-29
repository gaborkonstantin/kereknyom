package com.spring.kereknyom.domain;

public enum VisibilityLevel {

    PUBLIC("public"),
    REGISTERED_ONLY("registered only"),
    ADMIN_ONLY("admin only");

    private final String displayName;


    VisibilityLevel(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
