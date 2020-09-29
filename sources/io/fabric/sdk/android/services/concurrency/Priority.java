package io.fabric.sdk.android.services.concurrency;

public enum Priority {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    public static <Y> int a(wkn wkn, Y y) {
        return (y instanceof wkn ? ((wkn) y).a() : NORMAL).ordinal() - wkn.a().ordinal();
    }
}
