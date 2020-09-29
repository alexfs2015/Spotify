package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzve;
import com.google.android.gms.internal.measurement.zzzb;
import com.google.android.gms.internal.measurement.zzzg;
import defpackage.eni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: eng reason: default package */
final class eng<FieldDescriptorType extends eni<FieldDescriptorType>> {
    private static final eng d = new eng(0);
    final eph<FieldDescriptorType, Object> a = eph.a(16);
    boolean b;
    boolean c = false;

    private eng() {
    }

    private eng(byte b2) {
        b();
    }

    static int a(zzzb zzzb, int i, Object obj) {
        int l = zzve.l(i);
        if (zzzb == zzzb.GROUP) {
            enp.a();
            l <<= 1;
        }
        return l + b(zzzb, obj);
    }

    static int a(eni<?> eni, Object obj) {
        zzzb b2 = eni.b();
        int a2 = eni.a();
        if (!eni.d()) {
            return a(b2, a2, obj);
        }
        int i = 0;
        if (eni.e()) {
            for (Object b3 : (List) obj) {
                i += b(b2, b3);
            }
            return zzve.l(a2) + i + zzve.q(i);
        }
        for (Object a3 : (List) obj) {
            i += a(b2, a2, a3);
        }
        return i;
    }

    public static <T extends eni<T>> eng<T> a() {
        return d;
    }

    private final Object a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.a.get(fielddescriptortype);
        return obj instanceof enu ? enu.a() : obj;
    }

    private static Object a(Object obj) {
        if (obj instanceof eou) {
            return ((eou) obj).a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    static void a(zzve zzve, zzzb zzzb, int i, Object obj) {
        if (zzzb == zzzb.GROUP) {
            enp.a();
            eoo eoo = (eoo) obj;
            zzve.a(i, 3);
            eoo.a(zzve);
            zzve.a(i, 4);
            return;
        }
        zzve.a(i, zzzb.zzcfe);
        switch (enh.b[zzzb.ordinal()]) {
            case 1:
                zzve.a(((Double) obj).doubleValue());
                break;
            case 2:
                zzve.a(((Float) obj).floatValue());
                return;
            case 3:
                zzve.a(((Long) obj).longValue());
                return;
            case 4:
                zzve.a(((Long) obj).longValue());
                return;
            case 5:
                zzve.a(((Integer) obj).intValue());
                return;
            case 6:
                zzve.c(((Long) obj).longValue());
                return;
            case 7:
                zzve.d(((Integer) obj).intValue());
                return;
            case 8:
                zzve.a(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((eoo) obj).a(zzve);
                return;
            case 10:
                zzve.a((eoo) obj);
                return;
            case 11:
                if (obj instanceof zzun) {
                    zzve.a((zzun) obj);
                    return;
                } else {
                    zzve.a((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzun) {
                    zzve.a((zzun) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzve.a(bArr, bArr.length);
                return;
            case 13:
                zzve.b(((Integer) obj).intValue());
                return;
            case 14:
                zzve.d(((Integer) obj).intValue());
                return;
            case 15:
                zzve.c(((Long) obj).longValue());
                return;
            case 16:
                zzve.c(((Integer) obj).intValue());
                return;
            case 17:
                zzve.b(((Long) obj).longValue());
                return;
            case 18:
                if (!(obj instanceof enr)) {
                    zzve.a(((Integer) obj).intValue());
                    break;
                } else {
                    zzve.a(((enr) obj).a());
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
        if ((r3 instanceof defpackage.enu) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if ((r3 instanceof defpackage.enr) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.google.android.gms.internal.measurement.zzzb r2, java.lang.Object r3) {
        /*
            defpackage.enp.a(r3)
            int[] r0 = defpackage.enh.a
            com.google.android.gms.internal.measurement.zzzg r2 = r2.zzcfd
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
            boolean r2 = r3 instanceof defpackage.eoo
            if (r2 != 0) goto L_0x0024
            boolean r2 = r3 instanceof defpackage.enu
            if (r2 == 0) goto L_0x0041
            goto L_0x0024
        L_0x001c:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0024
            boolean r2 = r3 instanceof defpackage.enr
            if (r2 == 0) goto L_0x0041
        L_0x0024:
            r1 = 1
            goto L_0x0041
        L_0x0026:
            boolean r2 = r3 instanceof com.google.android.gms.internal.measurement.zzun
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eng.a(com.google.android.gms.internal.measurement.zzzb, java.lang.Object):void");
    }

    private static int b(zzzb zzzb, Object obj) {
        switch (enh.b[zzzb.ordinal()]) {
            case 1:
                ((Double) obj).doubleValue();
                return zzve.f();
            case 2:
                ((Float) obj).floatValue();
                return zzve.e();
            case 3:
                return zzve.d(((Long) obj).longValue());
            case 4:
                return zzve.e(((Long) obj).longValue());
            case 5:
                return zzve.m(((Integer) obj).intValue());
            case 6:
                ((Long) obj).longValue();
                return zzve.c();
            case 7:
                ((Integer) obj).intValue();
                return zzve.a();
            case 8:
                ((Boolean) obj).booleanValue();
                return zzve.g();
            case 9:
                return zzve.c((eoo) obj);
            case 10:
                return obj instanceof enu ? zzve.a((enx) (enu) obj) : zzve.b((eoo) obj);
            case 11:
                return obj instanceof zzun ? zzve.b((zzun) obj) : zzve.b((String) obj);
            case 12:
                return obj instanceof zzun ? zzve.b((zzun) obj) : zzve.b((byte[]) obj);
            case 13:
                return zzve.n(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                return zzve.b();
            case 15:
                ((Long) obj).longValue();
                return zzve.d();
            case 16:
                return zzve.o(((Integer) obj).intValue());
            case 17:
                return zzve.f(((Long) obj).longValue());
            case 18:
                return obj instanceof enr ? zzve.p(((enr) obj).a()) : zzve.p(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    static int b(Entry<FieldDescriptorType, Object> entry) {
        eni eni = (eni) entry.getKey();
        Object value = entry.getValue();
        return (eni.c() != zzzg.MESSAGE || eni.d() || eni.e()) ? a(eni, value) : value instanceof enu ? zzve.b(((eni) entry.getKey()).a(), (enx) (enu) value) : zzve.d(((eni) entry.getKey()).a(), (eoo) value);
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
        if (r7 instanceof enu) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, r7);
    }

    private static boolean c(Entry<FieldDescriptorType, Object> entry) {
        eni eni = (eni) entry.getKey();
        if (eni.c() == zzzg.MESSAGE) {
            if (eni.d()) {
                for (eoo f : (List) entry.getValue()) {
                    if (!f.f()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof eoo) {
                    if (!((eoo) value).f()) {
                        return false;
                    }
                } else if (value instanceof enu) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Entry<FieldDescriptorType, Object> entry) {
        Object obj;
        eni eni = (eni) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof enu) {
            value = enu.a();
        }
        if (eni.d()) {
            Object a2 = a((FieldDescriptorType) eni);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object a3 : (List) value) {
                ((List) a2).add(a(a3));
            }
            this.a.put(eni, a2);
        } else if (eni.c() == zzzg.MESSAGE) {
            Object a4 = a((FieldDescriptorType) eni);
            if (a4 == null) {
                this.a.put(eni, a(value));
                return;
            }
            if (a4 instanceof eou) {
                obj = eni.g();
            } else {
                ((eoo) a4).i();
                obj = eni.f().d();
            }
            this.a.put(eni, obj);
        } else {
            this.a.put(eni, a(value));
        }
    }

    public final void b() {
        if (!this.b) {
            this.a.a();
            this.b = true;
        }
    }

    public final Iterator<Entry<FieldDescriptorType, Object>> c() {
        return this.c ? new enw(this.a.entrySet().iterator()) : this.a.entrySet().iterator();
    }

    public final /* synthetic */ Object clone() {
        eng eng = new eng();
        for (int i = 0; i < this.a.b(); i++) {
            Entry b2 = this.a.b(i);
            eng.b((FieldDescriptorType) (eni) b2.getKey(), b2.getValue());
        }
        for (Entry entry : this.a.c()) {
            eng.b((FieldDescriptorType) (eni) entry.getKey(), entry.getValue());
        }
        eng.c = this.c;
        return eng;
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
        if (!(obj instanceof eng)) {
            return false;
        }
        return this.a.equals(((eng) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
