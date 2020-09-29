package io.fabric.sdk.android.services.concurrency;

public enum Priority {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    public static <Y> int a(vwh vwh, Y y) {
        Priority priority;
        if (y instanceof vwh) {
            priority = ((vwh) y).a();
        } else {
            priority = NORMAL;
        }
        return priority.ordinal() - vwh.a().ordinal();
    }
}
