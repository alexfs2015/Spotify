package com.bmwgroup.connected.car.app;

public enum ApplicationType {
    MULTIMEDIA("Multimedia"),
    RADIO("Radio"),
    ONLINESERVICES("OnlineServices");
    
    private String mCategory;

    private ApplicationType(String str) {
        this.mCategory = str;
    }

    public final String toString() {
        return this.mCategory;
    }
}
