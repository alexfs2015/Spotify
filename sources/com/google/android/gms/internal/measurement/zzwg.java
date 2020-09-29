package com.google.android.gms.internal.measurement;

public enum zzwg {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, Integer.valueOf(0)),
    LONG(Long.TYPE, Long.class, Long.valueOf(0)),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzun.class, zzun.class, zzun.a),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> zzcas;
    final Class<?> zzcat;
    private final Object zzcau;

    private zzwg(Class<?> cls, Class<?> cls2, Object obj) {
        this.zzcas = cls;
        this.zzcat = cls2;
        this.zzcau = obj;
    }
}
