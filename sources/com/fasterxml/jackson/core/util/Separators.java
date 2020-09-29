package com.fasterxml.jackson.core.util;

import java.io.Serializable;

public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public Separators() {
        this(':', ',', ',');
    }

    public Separators(char c, char c2, char c3) {
        this.objectFieldValueSeparator = c;
        this.objectEntrySeparator = c2;
        this.arrayValueSeparator = c3;
    }

    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }
}
