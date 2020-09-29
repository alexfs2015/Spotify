package com.google.android.gms.internal.ads;

public enum zzbbj {
    DOUBLE(0, zzbbl.SCALAR, zzbbw.DOUBLE),
    FLOAT(1, zzbbl.SCALAR, zzbbw.FLOAT),
    INT64(2, zzbbl.SCALAR, zzbbw.LONG),
    UINT64(3, zzbbl.SCALAR, zzbbw.LONG),
    INT32(4, zzbbl.SCALAR, zzbbw.INT),
    FIXED64(5, zzbbl.SCALAR, zzbbw.LONG),
    FIXED32(6, zzbbl.SCALAR, zzbbw.INT),
    BOOL(7, zzbbl.SCALAR, zzbbw.BOOLEAN),
    STRING(8, zzbbl.SCALAR, zzbbw.STRING),
    MESSAGE(9, zzbbl.SCALAR, zzbbw.MESSAGE),
    BYTES(10, zzbbl.SCALAR, zzbbw.BYTE_STRING),
    UINT32(11, zzbbl.SCALAR, zzbbw.INT),
    ENUM(12, zzbbl.SCALAR, zzbbw.ENUM),
    SFIXED32(13, zzbbl.SCALAR, zzbbw.INT),
    SFIXED64(14, zzbbl.SCALAR, zzbbw.LONG),
    SINT32(15, zzbbl.SCALAR, zzbbw.INT),
    SINT64(16, zzbbl.SCALAR, zzbbw.LONG),
    GROUP(17, zzbbl.SCALAR, zzbbw.MESSAGE),
    DOUBLE_LIST(18, zzbbl.VECTOR, zzbbw.DOUBLE),
    FLOAT_LIST(19, zzbbl.VECTOR, zzbbw.FLOAT),
    INT64_LIST(20, zzbbl.VECTOR, zzbbw.LONG),
    UINT64_LIST(21, zzbbl.VECTOR, zzbbw.LONG),
    INT32_LIST(22, zzbbl.VECTOR, zzbbw.INT),
    FIXED64_LIST(23, zzbbl.VECTOR, zzbbw.LONG),
    FIXED32_LIST(24, zzbbl.VECTOR, zzbbw.INT),
    BOOL_LIST(25, zzbbl.VECTOR, zzbbw.BOOLEAN),
    STRING_LIST(26, zzbbl.VECTOR, zzbbw.STRING),
    MESSAGE_LIST(27, zzbbl.VECTOR, zzbbw.MESSAGE),
    BYTES_LIST(28, zzbbl.VECTOR, zzbbw.BYTE_STRING),
    UINT32_LIST(29, zzbbl.VECTOR, zzbbw.INT),
    ENUM_LIST(30, zzbbl.VECTOR, zzbbw.ENUM),
    SFIXED32_LIST(31, zzbbl.VECTOR, zzbbw.INT),
    SFIXED64_LIST(32, zzbbl.VECTOR, zzbbw.LONG),
    SINT32_LIST(33, zzbbl.VECTOR, zzbbw.INT),
    SINT64_LIST(34, zzbbl.VECTOR, zzbbw.LONG),
    DOUBLE_LIST_PACKED(35, zzbbl.PACKED_VECTOR, zzbbw.DOUBLE),
    FLOAT_LIST_PACKED(36, zzbbl.PACKED_VECTOR, zzbbw.FLOAT),
    INT64_LIST_PACKED(37, zzbbl.PACKED_VECTOR, zzbbw.LONG),
    UINT64_LIST_PACKED(38, zzbbl.PACKED_VECTOR, zzbbw.LONG),
    INT32_LIST_PACKED(39, zzbbl.PACKED_VECTOR, zzbbw.INT),
    FIXED64_LIST_PACKED(40, zzbbl.PACKED_VECTOR, zzbbw.LONG),
    FIXED32_LIST_PACKED(41, zzbbl.PACKED_VECTOR, zzbbw.INT),
    BOOL_LIST_PACKED(42, zzbbl.PACKED_VECTOR, zzbbw.BOOLEAN),
    UINT32_LIST_PACKED(43, zzbbl.PACKED_VECTOR, zzbbw.INT),
    ENUM_LIST_PACKED(44, zzbbl.PACKED_VECTOR, zzbbw.ENUM),
    SFIXED32_LIST_PACKED(45, zzbbl.PACKED_VECTOR, zzbbw.INT),
    SFIXED64_LIST_PACKED(46, zzbbl.PACKED_VECTOR, zzbbw.LONG),
    SINT32_LIST_PACKED(47, zzbbl.PACKED_VECTOR, zzbbw.INT),
    SINT64_LIST_PACKED(48, zzbbl.PACKED_VECTOR, zzbbw.LONG),
    GROUP_LIST(49, zzbbl.VECTOR, zzbbw.MESSAGE),
    MAP(50, zzbbl.MAP, zzbbw.VOID);
    
    private static final zzbbj[] Z = null;
    public final int id;
    private final zzbbw zzdtb;
    private final zzbbl zzdtc;
    private final Class<?> zzdtd;
    private final boolean zzdte;

    static {
        int i;
        zzbbj[] values = values();
        Z = new zzbbj[values.length];
        for (zzbbj zzbbj : values) {
            Z[zzbbj.id] = zzbbj;
        }
    }

    private zzbbj(int i, zzbbl zzbbl, zzbbw zzbbw) {
        Class<?> cls;
        this.id = i;
        this.zzdtc = zzbbl;
        this.zzdtb = zzbbw;
        int i2 = dcv.a[zzbbl.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                cls = null;
            } else {
                cls = zzbbw.zzdvf;
            }
            this.zzdtd = cls;
        } else {
            this.zzdtd = zzbbw.zzdvf;
        }
        boolean z = false;
        if (zzbbl == zzbbl.SCALAR) {
            int i3 = dcv.b[zzbbw.ordinal()];
            if (!(i3 == 1 || i3 == 2 || i3 == 3)) {
                z = true;
            }
        }
        this.zzdte = z;
    }
}
