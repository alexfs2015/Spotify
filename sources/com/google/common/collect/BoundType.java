package com.google.common.collect;

public enum BoundType {
    OPEN(false),
    CLOSED(true);
    
    final boolean inclusive;

    private BoundType(boolean z) {
        this.inclusive = z;
    }

    public static BoundType a(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
