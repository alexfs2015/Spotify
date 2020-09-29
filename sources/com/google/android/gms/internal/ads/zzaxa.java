package com.google.android.gms.internal.ads;

public enum zzaxa implements dds {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    private final int value;

    static {
        new czl();
    }

    private zzaxa(int i) {
        this.value = i;
    }

    public static zzaxa a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA224;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
