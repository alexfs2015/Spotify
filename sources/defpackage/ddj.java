package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbav;
import com.google.android.gms.internal.ads.zzbes;
import com.google.android.gms.internal.ads.zzbex;
import defpackage.ddl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: ddj reason: default package */
final class ddj<FieldDescriptorType extends ddl<FieldDescriptorType>> {
    private static final ddj d = new ddj(0);
    final dfm<FieldDescriptorType, Object> a = dfm.a(16);
    boolean b;
    boolean c = false;

    private ddj() {
    }

    private ddj(byte b2) {
        b();
    }

    static int a(zzbes zzbes, int i, Object obj) {
        int l = zzbav.l(i);
        if (zzbes == zzbes.GROUP) {
            ddr.a();
            l <<= 1;
        }
        return l + b(zzbes, obj);
    }

    static int a(ddl<?> ddl, Object obj) {
        zzbes b2 = ddl.b();
        int a2 = ddl.a();
        if (!ddl.d()) {
            return a(b2, a2, obj);
        }
        int i = 0;
        List<Object> list = (List) obj;
        if (ddl.e()) {
            for (Object b3 : list) {
                i += b(b2, b3);
            }
            return zzbav.l(a2) + i + zzbav.q(i);
        }
        for (Object a3 : list) {
            i += a(b2, a2, a3);
        }
        return i;
    }

    public static <T extends ddl<T>> ddj<T> a() {
        return d;
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof ddv ? ddv.a() : obj;
    }

    private static Object a(Object obj) {
        if (obj instanceof dey) {
            return ((dey) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void a(zzbav zzbav, zzbes zzbes, int i, Object obj) {
        if (zzbes == zzbes.GROUP) {
            ddr.a();
            deq deq = (deq) obj;
            zzbav.a(i, 3);
            deq.a(zzbav);
            zzbav.a(i, 4);
            return;
        }
        zzbav.a(i, zzbes.zzeat);
        switch (ddk.b[zzbes.ordinal()]) {
            case 1:
                zzbav.a(((Double) obj).doubleValue());
                break;
            case 2:
                zzbav.a(((Float) obj).floatValue());
                return;
            case 3:
                zzbav.a(((Long) obj).longValue());
                return;
            case 4:
                zzbav.a(((Long) obj).longValue());
                return;
            case 5:
                zzbav.a(((Integer) obj).intValue());
                return;
            case 6:
                zzbav.c(((Long) obj).longValue());
                return;
            case 7:
                zzbav.d(((Integer) obj).intValue());
                return;
            case 8:
                zzbav.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((deq) obj).a(zzbav);
                return;
            case 10:
                zzbav.a((deq) obj);
                return;
            case 11:
                if (obj instanceof zzbah) {
                    zzbav.a((zzbah) obj);
                    return;
                } else {
                    zzbav.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzbah) {
                    zzbav.a((zzbah) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzbav.a(bArr, bArr.length);
                return;
            case 13:
                zzbav.b(((Integer) obj).intValue());
                return;
            case 14:
                zzbav.d(((Integer) obj).intValue());
                return;
            case 15:
                zzbav.c(((Long) obj).longValue());
                return;
            case 16:
                zzbav.c(((Integer) obj).intValue());
                return;
            case 17:
                zzbav.b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof dds)) {
                    zzbav.a(((Integer) obj).intValue());
                    break;
                } else {
                    zzbav.a(((dds) obj).a());
                    return;
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if ((r3 instanceof defpackage.ddv) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r3 instanceof defpackage.dds) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.ads.zzbes r2, java.lang.Object r3) {
        /*
            defpackage.ddr.a(r3)
            int[] r0 = defpackage.ddk.a
            com.google.android.gms.internal.ads.zzbex r2 = r2.zzeas
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x003e;
                case 2: goto L_0x003b;
                case 3: goto L_0x0038;
                case 4: goto L_0x0035;
                case 5: goto L_0x0032;
                case 6: goto L_0x002f;
                case 7: goto L_0x0026;
                case 8: goto L_0x001c;
                case 9: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0041
        L_0x0013:
            boolean r2 = r3 instanceof defpackage.deq
            if (r2 != 0) goto L_0x0024
            boolean r2 = r3 instanceof defpackage.ddv
            if (r2 == 0) goto L_0x0041
            goto L_0x0024
        L_0x001c:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0024
            boolean r2 = r3 instanceof defpackage.dds
            if (r2 == 0) goto L_0x0041
        L_0x0024:
            r1 = 1
            goto L_0x0041
        L_0x0026:
            boolean r2 = r3 instanceof com.google.android.gms.internal.ads.zzbah
            if (r2 != 0) goto L_0x0024
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0041
            goto L_0x0024
        L_0x002f:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0040
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0040
        L_0x0035:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0040
        L_0x0038:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0040
        L_0x003b:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0040
        L_0x003e:
            boolean r0 = r3 instanceof java.lang.Integer
        L_0x0040:
            r1 = r0
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            return
        L_0x0044:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            goto L_0x004d
        L_0x004c:
            throw r2
        L_0x004d:
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddj.a(com.google.android.gms.internal.ads.zzbes, java.lang.Object):void");
    }

    private static int b(zzbes zzbes, Object obj) {
        switch (ddk.b[zzbes.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return zzbav.f();
            case 2:
                ((Float) obj).floatValue();
                return zzbav.e();
            case 3:
                return zzbav.d(((Long) obj).longValue());
            case 4:
                return zzbav.e(((Long) obj).longValue());
            case 5:
                return zzbav.m(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return zzbav.c();
            case 7:
                ((Integer) obj).intValue();
                return zzbav.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return zzbav.g();
            case 9:
                return zzbav.c((deq) obj);
            case 10:
                return obj instanceof ddv ? zzbav.a((ddz) (ddv) obj) : zzbav.b((deq) obj);
            case 11:
                return obj instanceof zzbah ? zzbav.b((zzbah) obj) : zzbav.b((String) obj);
            case 12:
                return obj instanceof zzbah ? zzbav.b((zzbah) obj) : zzbav.b((byte[]) obj);
            case 13:
                return zzbav.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return zzbav.b();
            case 15:
                ((Long) obj).longValue();
                return zzbav.d();
            case 16:
                return zzbav.o(((Integer) obj).intValue());
            case 17:
                return zzbav.f(((Long) obj).longValue());
            case 18:
                return obj instanceof dds ? zzbav.p(((dds) obj).a()) : zzbav.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static int b(Entry<FieldDescriptorType, Object> entry) {
        ddl ddl = (ddl) entry.getKey();
        Object value = entry.getValue();
        if (ddl.c() != zzbex.MESSAGE || ddl.d() || ddl.e()) {
            return a(ddl, value);
        }
        boolean z = value instanceof ddv;
        int a2 = ((ddl) entry.getKey()).a();
        return z ? zzbav.b(a2, (ddz) (ddv) value) : zzbav.b(a2, (deq) value);
    }

    private final void b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.d()) {
            a(fielddescriptortype.b(), obj);
            r7 = obj;
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                a(fielddescriptortype.b(), obj2);
            }
            r7 = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (r7 instanceof ddv) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, r7);
    }

    private static boolean c(Entry<FieldDescriptorType, Object> entry) {
        ddl ddl = (ddl) entry.getKey();
        if (ddl.c() == zzbex.MESSAGE) {
            boolean d2 = ddl.d();
            Object value = entry.getValue();
            if (d2) {
                for (deq i : (List) value) {
                    if (!i.i()) {
                        return false;
                    }
                }
            } else if (value instanceof deq) {
                if (!((deq) value).i()) {
                    return false;
                }
            } else if (value instanceof ddv) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        ddl ddl = (ddl) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ddv) {
            value = ddv.a();
        }
        if (ddl.d()) {
            Object a2 = a((FieldDescriptorType) ddl);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.a.put(ddl, a2);
        } else if (ddl.c() == zzbex.MESSAGE) {
            Object a4 = a((FieldDescriptorType) ddl);
            if (a4 == null) {
                this.a.put(ddl, a(value));
                return;
            }
            if (a4 instanceof dey) {
                obj = ddl.g();
            } else {
                ((deq) a4).k();
                obj = ddl.f().g();
            }
            this.a.put(ddl, obj);
        } else {
            this.a.put(ddl, a(value));
        }
    }

    public final void b() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> c() {
        return this.c ? new ddy(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        ddj ddj = new ddj();
        for (int i = 0; i < this.a.b(); i++) {
            Entry b2 = this.a.b(i);
            ddj.b((FieldDescriptorType) (ddl) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.a.c()) {
            ddj.b((FieldDescriptorType) (ddl) entry.getKey(), entry.getValue());
        }
        ddj.c = this.c;
        return ddj;
    }

    public final boolean d() {
        for (int i = 0; i < this.a.b(); i++) {
            if (!c(this.a.b(i))) {
                return false;
            }
        }
        for (Entry c2 : this.a.c()) {
            if (!c(c2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddj)) {
            return false;
        }
        return this.a.equals(((ddj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
