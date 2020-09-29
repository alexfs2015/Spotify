package com.google.android.gms.internal.ads;

public enum zzbes {
    DOUBLE(zzbex.DOUBLE, 1),
    FLOAT(zzbex.FLOAT, 5),
    INT64(zzbex.LONG, 0),
    UINT64(zzbex.LONG, 0),
    INT32(zzbex.INT, 0),
    FIXED64(zzbex.LONG, 1),
    FIXED32(zzbex.INT, 5),
    BOOL(zzbex.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(zzbex.INT, 0),
    ENUM(zzbex.ENUM, 0),
    SFIXED32(zzbex.INT, 5),
    SFIXED64(zzbex.LONG, 1),
    SINT32(zzbex.INT, 0),
    SINT64(zzbex.LONG, 0);
    
    public final zzbex zzeas;
    public final int zzeat;

    private zzbes(zzbex zzbex, int i) {
        this.zzeas = zzbex;
        this.zzeat = i;
    }
}
