package com.google.android.gms.internal.measurement;

public enum zzzb {
    DOUBLE(zzzg.DOUBLE, 1),
    FLOAT(zzzg.FLOAT, 5),
    INT64(zzzg.LONG, 0),
    UINT64(zzzg.LONG, 0),
    INT32(zzzg.INT, 0),
    FIXED64(zzzg.LONG, 1),
    FIXED32(zzzg.INT, 5),
    BOOL(zzzg.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(zzzg.INT, 0),
    ENUM(zzzg.ENUM, 0),
    SFIXED32(zzzg.INT, 5),
    SFIXED64(zzzg.LONG, 1),
    SINT32(zzzg.INT, 0),
    SINT64(zzzg.LONG, 0);
    
    public final zzzg zzcfd;
    public final int zzcfe;

    private zzzb(zzzg zzzg, int i) {
        this.zzcfd = zzzg;
        this.zzcfe = i;
    }
}
