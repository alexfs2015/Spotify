package com.spotify.instrumentation;

@Deprecated
public enum ItemType {
    BUTTON("button"),
    CARD("card"),
    FIELD("field"),
    HEADER("header"),
    IMAGE("image"),
    ROW("row"),
    TITLE("title");
    
    private final String mType;

    private ItemType(String str) {
        this.mType = str;
    }

    public final String toString() {
        return this.mType;
    }
}
