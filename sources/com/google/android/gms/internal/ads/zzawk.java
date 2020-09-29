package com.google.android.gms.internal.ads;

public enum zzawk implements dds {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);
    
    private final int value;

    static {
        new cyw();
    }

    private zzawk(int i) {
        this.value = i;
    }

    public static zzawk a(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i != 2) {
            return null;
        }
        return COMPRESSED;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
