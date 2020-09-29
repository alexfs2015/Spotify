package com.google.android.gms.internal.ads;

public enum zzawy implements dds {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    static {
        new czj();
    }

    private zzawy(int i) {
        this.value = i;
    }

    public static zzawy a(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 1) {
            return NIST_P224;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i != 4) {
            return null;
        }
        return NIST_P521;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
