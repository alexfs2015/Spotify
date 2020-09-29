package org.slf4j.event;

public enum Level {
    a(40, r1),
    b(30, r3),
    c(20, r4),
    d(10, r5),
    e(0, r6);
    
    private int levelInt;
    private String levelStr;

    private Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public final String toString() {
        return this.levelStr;
    }
}
