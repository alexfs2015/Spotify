package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbj;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: deu reason: default package */
final class deu<T> implements dfj<T> {
    private static final Unsafe a = dgh.c();
    private final int[] b;
    private final Object[] c;
    private final int d;
    private final int e;
    private final int f;
    private final deq g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private final dez o;
    private final dec p;
    private final dgb<?, ?> q;
    private final ddg<?> r;
    private final del s;

    private deu(int[] iArr, Object[] objArr, int i2, int i3, int i4, deq deq, boolean z, int[] iArr2, int[] iArr3, int[] iArr4, dez dez, dec dec, dgb<?, ?> dgb, ddg<?> ddg, del del) {
        this.b = iArr;
        this.c = objArr;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.i = deq instanceof ddp;
        this.j = z;
        this.h = ddg != null && ddg.a(deq);
        this.k = false;
        this.l = iArr2;
        this.m = iArr3;
        this.n = iArr4;
        this.o = dez;
        this.p = dec;
        this.q = dgb;
        this.r = ddg;
        this.g = deq;
        this.s = del;
    }

    private static int a(int i2, byte[] bArr, int i3, int i4, Object obj, dcn dcn) {
        return dcm.a(i2, bArr, i3, i4, e(obj), dcn);
    }

    private static int a(dfj<?> dfj, int i2, byte[] bArr, int i3, int i4, ddu<?> ddu, dcn dcn) {
        int a2 = a((dfj) dfj, bArr, i3, i4, dcn);
        while (true) {
            ddu.add(dcn.c);
            if (a2 >= i4) {
                break;
            }
            int a3 = dcm.a(bArr, a2, dcn);
            if (i2 != dcn.a) {
                break;
            }
            a2 = a((dfj) dfj, bArr, a3, i4, dcn);
        }
        return a2;
    }

    private static int a(dfj dfj, byte[] bArr, int i2, int i3, int i4, dcn dcn) {
        deu deu = (deu) dfj;
        Object a2 = deu.a();
        int a3 = deu.a((T) a2, bArr, i2, i3, i4, dcn);
        deu.c((T) a2);
        dcn.c = a2;
        return a3;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(defpackage.dfj r6, byte[] r7, int r8, int r9, defpackage.dcn r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = defpackage.dcm.a(r8, r7, r0, r10)
            int r8 = r10.a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.a()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.a(r1, r2, r3, r4, r5)
            r6.c(r9)
            r10.c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.ads.zzbbu r6 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(dfj, byte[], int, int, dcn):int");
    }

    private static <UT, UB> int a(dgb<UT, UB> dgb, T t) {
        return dgb.f(dgb.b(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013f, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x014c, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0150, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015e, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x016f, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, defpackage.dcn r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = a
            int[] r7 = r0.b
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0164;
                case 52: goto L_0x0154;
                case 53: goto L_0x0144;
                case 54: goto L_0x0144;
                case 55: goto L_0x0137;
                case 56: goto L_0x012b;
                case 57: goto L_0x0120;
                case 58: goto L_0x010a;
                case 59: goto L_0x00de;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a2;
                case 62: goto L_0x0137;
                case 63: goto L_0x0074;
                case 64: goto L_0x0120;
                case 65: goto L_0x012b;
                case 66: goto L_0x0066;
                case 67: goto L_0x0058;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0178
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0178
            r2 = r2 & -8
            r7 = r2 | 4
            dfj r2 = r0.a(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = a(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x0052
            goto L_0x0150
        L_0x0052:
            java.lang.Object r3 = defpackage.ddr.a(r15, r3)
            goto L_0x0150
        L_0x0058:
            if (r5 != 0) goto L_0x0178
            int r2 = defpackage.dcm.b(r3, r4, r11)
            long r3 = r11.b
            long r3 = defpackage.dcv.a(r3)
            goto L_0x014c
        L_0x0066:
            if (r5 != 0) goto L_0x0178
            int r2 = defpackage.dcm.a(r3, r4, r11)
            int r3 = r11.a
            int r3 = defpackage.dcv.f(r3)
            goto L_0x013f
        L_0x0074:
            if (r5 != 0) goto L_0x0178
            int r3 = defpackage.dcm.a(r3, r4, r11)
            int r4 = r11.a
            ddt r5 = r0.b(r6)
            if (r5 == 0) goto L_0x0098
            dds r5 = r5.a(r4)
            if (r5 == 0) goto L_0x0089
            goto L_0x0098
        L_0x0089:
            dgc r1 = e(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.a(r2, r4)
            r2 = r3
            goto L_0x0179
        L_0x0098:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x0174
        L_0x00a2:
            if (r5 != r15) goto L_0x0178
            int r2 = defpackage.dcm.a(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00b0
            com.google.android.gms.internal.ads.zzbah r3 = com.google.android.gms.internal.ads.zzbah.a
            goto L_0x0150
        L_0x00b0:
            com.google.android.gms.internal.ads.zzbah r3 = com.google.android.gms.internal.ads.zzbah.a(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00b7:
            int r2 = r2 + r4
            goto L_0x0174
        L_0x00ba:
            if (r5 != r15) goto L_0x0178
            dfj r2 = r0.a(r6)
            r5 = r20
            int r2 = a(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d1
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00d2
        L_0x00d1:
            r15 = 0
        L_0x00d2:
            java.lang.Object r3 = r11.c
            if (r15 != 0) goto L_0x00d8
            goto L_0x0150
        L_0x00d8:
            java.lang.Object r3 = defpackage.ddr.a(r15, r3)
            goto L_0x0150
        L_0x00de:
            if (r5 != r15) goto L_0x0178
            int r2 = defpackage.dcm.a(r3, r4, r11)
            int r4 = r11.a
            if (r4 != 0) goto L_0x00eb
            java.lang.String r3 = ""
            goto L_0x0150
        L_0x00eb:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x00ff
            int r5 = r2 + r4
            boolean r5 = defpackage.dgj.a(r3, r2, r5)
            if (r5 == 0) goto L_0x00fa
            goto L_0x00ff
        L_0x00fa:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.h()
            throw r1
        L_0x00ff:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = defpackage.ddr.a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00b7
        L_0x010a:
            if (r5 != 0) goto L_0x0178
            int r2 = defpackage.dcm.b(r3, r4, r11)
            long r3 = r11.b
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x011a
            r15 = 1
            goto L_0x011b
        L_0x011a:
            r15 = 0
        L_0x011b:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x0150
        L_0x0120:
            if (r5 != r7) goto L_0x0178
            int r2 = defpackage.dcm.a(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x015e
        L_0x012b:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            long r2 = defpackage.dcm.b(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x016f
        L_0x0137:
            if (r5 != 0) goto L_0x0178
            int r2 = defpackage.dcm.a(r3, r4, r11)
            int r3 = r11.a
        L_0x013f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0150
        L_0x0144:
            if (r5 != 0) goto L_0x0178
            int r2 = defpackage.dcm.b(r3, r4, r11)
            long r3 = r11.b
        L_0x014c:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
        L_0x0150:
            r12.putObject(r1, r9, r3)
            goto L_0x0174
        L_0x0154:
            if (r5 != r7) goto L_0x0178
            float r2 = defpackage.dcm.d(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
        L_0x015e:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x0174
        L_0x0164:
            r2 = 1
            if (r5 != r2) goto L_0x0178
            double r2 = defpackage.dcm.c(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
        L_0x016f:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
        L_0x0174:
            r12.putInt(r1, r13, r8)
            goto L_0x0179
        L_0x0178:
            r2 = r4
        L_0x0179:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, dcn):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0232, code lost:
        if (r7.b != 0) goto L_0x0234;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0234, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0236, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0237, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023a, code lost:
        if (r4 >= r5) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023c, code lost:
        r6 = defpackage.dcm.a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0242, code lost:
        if (r2 != r7.a) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0244, code lost:
        r4 = defpackage.dcm.b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x024c, code lost:
        if (r7.b == 0) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r11.add(com.google.android.gms.internal.ads.zzbah.a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4 = defpackage.dcm.a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r2 != r7.a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r1 = defpackage.dcm.a(r3, r4, r7);
        r4 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.dcn r30) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = a
            java.lang.Object r11 = r11.getObject(r1, r9)
            ddu r11 = (defpackage.ddu) r11
            boolean r12 = r11.a()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            ddu r11 = r11.a(r12)
            sun.misc.Unsafe r12 = a
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x035d;
                case 19: goto L_0x031f;
                case 20: goto L_0x02e7;
                case 21: goto L_0x02e7;
                case 22: goto L_0x02cd;
                case 23: goto L_0x028e;
                case 24: goto L_0x024f;
                case 25: goto L_0x01fe;
                case 26: goto L_0x0177;
                case 27: goto L_0x015d;
                case 28: goto L_0x0132;
                case 29: goto L_0x02cd;
                case 30: goto L_0x00fa;
                case 31: goto L_0x024f;
                case 32: goto L_0x028e;
                case 33: goto L_0x00ba;
                case 34: goto L_0x007a;
                case 35: goto L_0x035d;
                case 36: goto L_0x031f;
                case 37: goto L_0x02e7;
                case 38: goto L_0x02e7;
                case 39: goto L_0x02cd;
                case 40: goto L_0x028e;
                case 41: goto L_0x024f;
                case 42: goto L_0x01fe;
                case 43: goto L_0x02cd;
                case 44: goto L_0x00fa;
                case 45: goto L_0x024f;
                case 46: goto L_0x028e;
                case 47: goto L_0x00ba;
                case 48: goto L_0x007a;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x039b
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x039b
            dfj r1 = r0.a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = a(r22, r23, r24, r25, r26, r27)
        L_0x005a:
            java.lang.Object r8 = r7.c
            r11.add(r8)
            if (r4 >= r5) goto L_0x039b
            int r8 = defpackage.dcm.a(r3, r4, r7)
            int r9 = r7.a
            if (r2 != r9) goto L_0x039b
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = a(r22, r23, r24, r25, r26, r27)
            goto L_0x005a
        L_0x007a:
            if (r6 != r10) goto L_0x009e
            def r11 = (defpackage.def) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0085:
            if (r1 >= r2) goto L_0x0095
            int r1 = defpackage.dcm.b(r3, r1, r7)
            long r4 = r7.b
            long r4 = defpackage.dcv.a(r4)
            r11.a(r4)
            goto L_0x0085
        L_0x0095:
            if (r1 != r2) goto L_0x0099
            goto L_0x039c
        L_0x0099:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x009e:
            if (r6 != 0) goto L_0x039b
            def r11 = (defpackage.def) r11
        L_0x00a2:
            int r1 = defpackage.dcm.b(r3, r4, r7)
            long r8 = r7.b
            long r8 = defpackage.dcv.a(r8)
            r11.a(r8)
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            goto L_0x00a2
        L_0x00ba:
            if (r6 != r10) goto L_0x00de
            ddq r11 = (defpackage.ddq) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00c5:
            if (r1 >= r2) goto L_0x00d5
            int r1 = defpackage.dcm.a(r3, r1, r7)
            int r4 = r7.a
            int r4 = defpackage.dcv.f(r4)
            r11.c(r4)
            goto L_0x00c5
        L_0x00d5:
            if (r1 != r2) goto L_0x00d9
            goto L_0x039c
        L_0x00d9:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x00de:
            if (r6 != 0) goto L_0x039b
            ddq r11 = (defpackage.ddq) r11
        L_0x00e2:
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = defpackage.dcv.f(r4)
            r11.c(r4)
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            goto L_0x00e2
        L_0x00fa:
            if (r6 != r10) goto L_0x0101
            int r2 = defpackage.dcm.a(r3, r4, r11, r7)
            goto L_0x0112
        L_0x0101:
            if (r6 != 0) goto L_0x039b
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = defpackage.dcm.a(r2, r3, r4, r5, r6, r7)
        L_0x0112:
            ddp r1 = (defpackage.ddp) r1
            dgc r3 = r1.zzdtt
            dgc r4 = defpackage.dgc.a()
            if (r3 != r4) goto L_0x011d
            r3 = 0
        L_0x011d:
            ddt r4 = r0.b(r8)
            dgb<?, ?> r5 = r0.q
            r6 = r22
            java.lang.Object r3 = defpackage.dfl.a(r6, r11, r4, r3, r5)
            dgc r3 = (defpackage.dgc) r3
            if (r3 == 0) goto L_0x012f
            r1.zzdtt = r3
        L_0x012f:
            r1 = r2
            goto L_0x039c
        L_0x0132:
            if (r6 != r10) goto L_0x039b
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 != 0) goto L_0x0142
        L_0x013c:
            com.google.android.gms.internal.ads.zzbah r4 = com.google.android.gms.internal.ads.zzbah.a
            r11.add(r4)
            goto L_0x014a
        L_0x0142:
            com.google.android.gms.internal.ads.zzbah r6 = com.google.android.gms.internal.ads.zzbah.a(r3, r1, r4)
            r11.add(r6)
            int r1 = r1 + r4
        L_0x014a:
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 != 0) goto L_0x0142
            goto L_0x013c
        L_0x015d:
            if (r6 != r10) goto L_0x039b
            dfj r1 = r0.a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x039c
        L_0x0177:
            if (r6 != r10) goto L_0x039b
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            int r4 = defpackage.dcm.a(r3, r4, r7)
            if (r6 != 0) goto L_0x01b6
            int r6 = r7.a
            if (r6 != 0) goto L_0x0190
        L_0x018c:
            r11.add(r1)
            goto L_0x019b
        L_0x0190:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = defpackage.ddr.a
            r8.<init>(r3, r4, r6, r9)
        L_0x0197:
            r11.add(r8)
            int r4 = r4 + r6
        L_0x019b:
            if (r4 >= r5) goto L_0x039b
            int r6 = defpackage.dcm.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x039b
            int r4 = defpackage.dcm.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 != 0) goto L_0x01ae
            goto L_0x018c
        L_0x01ae:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = defpackage.ddr.a
            r8.<init>(r3, r4, r6, r9)
            goto L_0x0197
        L_0x01b6:
            int r6 = r7.a
            if (r6 != 0) goto L_0x01be
        L_0x01ba:
            r11.add(r1)
            goto L_0x01d1
        L_0x01be:
            int r8 = r4 + r6
            boolean r9 = defpackage.dgj.a(r3, r4, r8)
            if (r9 == 0) goto L_0x01f9
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = defpackage.ddr.a
            r9.<init>(r3, r4, r6, r10)
        L_0x01cd:
            r11.add(r9)
            r4 = r8
        L_0x01d1:
            if (r4 >= r5) goto L_0x039b
            int r6 = defpackage.dcm.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x039b
            int r4 = defpackage.dcm.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 != 0) goto L_0x01e4
            goto L_0x01ba
        L_0x01e4:
            int r8 = r4 + r6
            boolean r9 = defpackage.dgj.a(r3, r4, r8)
            if (r9 == 0) goto L_0x01f4
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = defpackage.ddr.a
            r9.<init>(r3, r4, r6, r10)
            goto L_0x01cd
        L_0x01f4:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.h()
            throw r1
        L_0x01f9:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.h()
            throw r1
        L_0x01fe:
            r1 = 0
            if (r6 != r10) goto L_0x0226
            dco r11 = (defpackage.dco) r11
            int r2 = defpackage.dcm.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x020a:
            if (r2 >= r4) goto L_0x021d
            int r2 = defpackage.dcm.b(r3, r2, r7)
            long r5 = r7.b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0218
            r5 = 1
            goto L_0x0219
        L_0x0218:
            r5 = 0
        L_0x0219:
            r11.a(r5)
            goto L_0x020a
        L_0x021d:
            if (r2 != r4) goto L_0x0221
            goto L_0x012f
        L_0x0221:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x0226:
            if (r6 != 0) goto L_0x039b
            dco r11 = (defpackage.dco) r11
            int r4 = defpackage.dcm.b(r3, r4, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0236
        L_0x0234:
            r6 = 1
            goto L_0x0237
        L_0x0236:
            r6 = 0
        L_0x0237:
            r11.a(r6)
            if (r4 >= r5) goto L_0x039b
            int r6 = defpackage.dcm.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x039b
            int r4 = defpackage.dcm.b(r3, r6, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0236
            goto L_0x0234
        L_0x024f:
            if (r6 != r10) goto L_0x026f
            ddq r11 = (defpackage.ddq) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x025a:
            if (r1 >= r2) goto L_0x0266
            int r4 = defpackage.dcm.a(r3, r1)
            r11.c(r4)
            int r1 = r1 + 4
            goto L_0x025a
        L_0x0266:
            if (r1 != r2) goto L_0x026a
            goto L_0x039c
        L_0x026a:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x026f:
            if (r6 != r9) goto L_0x039b
            ddq r11 = (defpackage.ddq) r11
            int r1 = defpackage.dcm.a(r18, r19)
            r11.c(r1)
        L_0x027a:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            int r1 = defpackage.dcm.a(r3, r4)
            r11.c(r1)
            goto L_0x027a
        L_0x028e:
            if (r6 != r10) goto L_0x02ae
            def r11 = (defpackage.def) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0299:
            if (r1 >= r2) goto L_0x02a5
            long r4 = defpackage.dcm.b(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x0299
        L_0x02a5:
            if (r1 != r2) goto L_0x02a9
            goto L_0x039c
        L_0x02a9:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x02ae:
            if (r6 != r13) goto L_0x039b
            def r11 = (defpackage.def) r11
            long r8 = defpackage.dcm.b(r18, r19)
            r11.a(r8)
        L_0x02b9:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            long r8 = defpackage.dcm.b(r3, r4)
            r11.a(r8)
            goto L_0x02b9
        L_0x02cd:
            if (r6 != r10) goto L_0x02d5
            int r1 = defpackage.dcm.a(r3, r4, r11, r7)
            goto L_0x039c
        L_0x02d5:
            if (r6 != 0) goto L_0x039b
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = defpackage.dcm.a(r21, r22, r23, r24, r25, r26)
            goto L_0x039c
        L_0x02e7:
            if (r6 != r10) goto L_0x0307
            def r11 = (defpackage.def) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02f2:
            if (r1 >= r2) goto L_0x02fe
            int r1 = defpackage.dcm.b(r3, r1, r7)
            long r4 = r7.b
            r11.a(r4)
            goto L_0x02f2
        L_0x02fe:
            if (r1 != r2) goto L_0x0302
            goto L_0x039c
        L_0x0302:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x0307:
            if (r6 != 0) goto L_0x039b
            def r11 = (defpackage.def) r11
        L_0x030b:
            int r1 = defpackage.dcm.b(r3, r4, r7)
            long r8 = r7.b
            r11.a(r8)
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            goto L_0x030b
        L_0x031f:
            if (r6 != r10) goto L_0x033e
            ddn r11 = (defpackage.ddn) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x032a:
            if (r1 >= r2) goto L_0x0336
            float r4 = defpackage.dcm.d(r3, r1)
            r11.a(r4)
            int r1 = r1 + 4
            goto L_0x032a
        L_0x0336:
            if (r1 != r2) goto L_0x0339
            goto L_0x039c
        L_0x0339:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x033e:
            if (r6 != r9) goto L_0x039b
            ddn r11 = (defpackage.ddn) r11
            float r1 = defpackage.dcm.d(r18, r19)
            r11.a(r1)
        L_0x0349:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            float r1 = defpackage.dcm.d(r3, r4)
            r11.a(r1)
            goto L_0x0349
        L_0x035d:
            if (r6 != r10) goto L_0x037c
            dda r11 = (defpackage.dda) r11
            int r1 = defpackage.dcm.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0368:
            if (r1 >= r2) goto L_0x0374
            double r4 = defpackage.dcm.c(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x0368
        L_0x0374:
            if (r1 != r2) goto L_0x0377
            goto L_0x039c
        L_0x0377:
            com.google.android.gms.internal.ads.zzbbu r1 = com.google.android.gms.internal.ads.zzbbu.a()
            throw r1
        L_0x037c:
            if (r6 != r13) goto L_0x039b
            dda r11 = (defpackage.dda) r11
            double r8 = defpackage.dcm.c(r18, r19)
            r11.a(r8)
        L_0x0387:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039c
            int r4 = defpackage.dcm.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x039c
            double r8 = defpackage.dcm.c(r3, r4)
            r11.a(r8)
            goto L_0x0387
        L_0x039b:
            r1 = r4
        L_0x039c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, dcn):int");
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [int] */
    /* JADX WARNING: type inference failed for: r10v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <K, V> int a(T r8, byte[] r9, int r10, int r11, int r12, long r13, defpackage.dcn r15) {
        /*
            r7 = this;
            sun.misc.Unsafe r12 = a
            java.lang.Object r0 = r12.getObject(r8, r13)
            del r1 = r7.s
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L_0x001d
            del r1 = r7.s
            java.lang.Object r1 = r1.a()
            del r2 = r7.s
            r2.a(r1, r0)
            r12.putObject(r8, r13, r1)
            r0 = r1
        L_0x001d:
            del r8 = r7.s
            dek r8 = r8.b()
            del r12 = r7.s
            java.util.Map r12 = r12.a(r0)
            int r10 = defpackage.dcm.a(r9, r10, r15)
            int r13 = r15.a
            if (r13 < 0) goto L_0x008f
            int r14 = r11 - r10
            if (r13 > r14) goto L_0x008f
            int r13 = r13 + r10
            K r14 = r8.b
            V r0 = r8.d
        L_0x003a:
            if (r10 >= r13) goto L_0x0084
            int r1 = r10 + 1
            byte r10 = r9[r10]
            if (r10 >= 0) goto L_0x0048
            int r1 = defpackage.dcm.a(r10, r9, r1, r15)
            int r10 = r15.a
        L_0x0048:
            r2 = r1
            int r1 = r10 >>> 3
            r3 = r10 & 7
            r4 = 1
            if (r1 == r4) goto L_0x006c
            r4 = 2
            if (r1 == r4) goto L_0x0054
            goto L_0x007f
        L_0x0054:
            com.google.android.gms.internal.ads.zzbes r1 = r8.c
            int r1 = r1.zzeat
            if (r3 != r1) goto L_0x007f
            com.google.android.gms.internal.ads.zzbes r4 = r8.c
            V r10 = r8.d
            java.lang.Class r5 = r10.getClass()
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r0 = r15.c
            goto L_0x003a
        L_0x006c:
            com.google.android.gms.internal.ads.zzbes r1 = r8.a
            int r1 = r1.zzeat
            if (r3 != r1) goto L_0x007f
            com.google.android.gms.internal.ads.zzbes r4 = r8.a
            r5 = 0
            r1 = r9
            r3 = r11
            r6 = r15
            int r10 = a(r1, r2, r3, r4, r5, r6)
            java.lang.Object r14 = r15.c
            goto L_0x003a
        L_0x007f:
            int r10 = defpackage.dcm.a(r10, r9, r2, r11, r15)
            goto L_0x003a
        L_0x0084:
            if (r10 != r13) goto L_0x008a
            r12.put(r14, r0)
            return r13
        L_0x008a:
            com.google.android.gms.internal.ads.zzbbu r8 = com.google.android.gms.internal.ads.zzbbu.g()
            throw r8
        L_0x008f:
            com.google.android.gms.internal.ads.zzbbu r8 = com.google.android.gms.internal.ads.zzbbu.a()
            goto L_0x0095
        L_0x0094:
            throw r8
        L_0x0095:
            goto L_0x0094
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, byte[], int, int, int, long, dcn):int");
    }

    /* JADX WARNING: type inference failed for: r28v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v9, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v2, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v12, types: [int] */
    /* JADX WARNING: type inference failed for: r1v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r18v0 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r18v1 */
    /* JADX WARNING: type inference failed for: r18v2 */
    /* JADX WARNING: type inference failed for: r18v3 */
    /* JADX WARNING: type inference failed for: r29v1 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r18v4 */
    /* JADX WARNING: type inference failed for: r18v5 */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v7, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r18v7 */
    /* JADX WARNING: type inference failed for: r18v8 */
    /* JADX WARNING: type inference failed for: r1v14, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r9v14 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r9v16 */
    /* JADX WARNING: type inference failed for: r12v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r12v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r12v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r12v23, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r1v32 */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r9v32 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34, types: [int] */
    /* JADX WARNING: type inference failed for: r12v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v36 */
    /* JADX WARNING: type inference failed for: r12v31 */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r12v32, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v37 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r1v38, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v40 */
    /* JADX WARNING: type inference failed for: r12v33 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r1v44, types: [int] */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r1v45 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r1v46 */
    /* JADX WARNING: type inference failed for: r7v33 */
    /* JADX WARNING: type inference failed for: r18v9 */
    /* JADX WARNING: type inference failed for: r18v10 */
    /* JADX WARNING: type inference failed for: r18v11 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r9v45 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r9v47 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r9v49 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02ff, code lost:
        if (r0 == r15) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0340, code lost:
        if (r0 == r15) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x035c, code lost:
        if (r0 == r15) goto L_0x035e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x035e, code lost:
        r6 = r31;
        r2 = r0;
        r18 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0016, code lost:
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r5 = r4;
        r29 = r7;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d6, code lost:
        r12 = r28;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0124, code lost:
        r13 = r30;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x013b, code lost:
        r6 = r6 | r21;
        r13 = r30;
        r0 = r2;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0140, code lost:
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0144, code lost:
        r13 = r30;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0193, code lost:
        r10.putObject(r14, r7, r1);
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f1, code lost:
        r5 = r4;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0261, code lost:
        r6 = r6 | r21;
        r7 = r29;
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0267, code lost:
        r8 = -1;
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0268, code lost:
        r11 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x026c, code lost:
        r17 = r29;
        r2 = r5;
        r21 = r6;
        r7 = r9;
        r25 = r10;
        r6 = r31;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v9, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r28v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 492
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 55 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(T r27, byte[] r28, int r29, int r30, int r31, defpackage.dcn r32) {
        /*
            r26 = this;
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            sun.misc.Unsafe r10 = a
            r16 = 0
            r8 = -1
            r0 = r29
            r1 = 0
            r6 = 0
            r7 = -1
        L_0x0016:
            if (r0 >= r13) goto L_0x0396
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0027
            int r0 = defpackage.dcm.a(r0, r12, r1, r9)
            int r1 = r9.a
            r4 = r0
            r5 = r1
            goto L_0x0029
        L_0x0027:
            r5 = r0
            r4 = r1
        L_0x0029:
            int r3 = r5 >>> 3
            r2 = r5 & 7
            int r1 = r15.f(r3)
            if (r1 == r8) goto L_0x0362
            int[] r0 = r15.b
            int r17 = r1 + 1
            r8 = r0[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r8 & r17
            int r11 = r17 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r5
            r5 = r8 & r17
            long r12 = (long) r5
            r5 = 17
            r19 = r8
            if (r11 > r5) goto L_0x0278
            int r5 = r1 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r8 = 1
            int r21 = r8 << r5
            r0 = r0 & r17
            r5 = -1
            if (r0 == r7) goto L_0x0067
            if (r7 == r5) goto L_0x0061
            long r8 = (long) r7
            r10.putInt(r14, r8, r6)
        L_0x0061:
            long r6 = (long) r0
            int r6 = r10.getInt(r14, r6)
            r7 = r0
        L_0x0067:
            r0 = 5
            switch(r11) {
                case 0: goto L_0x0249;
                case 1: goto L_0x0231;
                case 2: goto L_0x020d;
                case 3: goto L_0x020d;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01d1;
                case 6: goto L_0x01b9;
                case 7: goto L_0x0198;
                case 8: goto L_0x0174;
                case 9: goto L_0x0148;
                case 10: goto L_0x0127;
                case 11: goto L_0x01f4;
                case 12: goto L_0x00f2;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01d1;
                case 15: goto L_0x00da;
                case 16: goto L_0x00b3;
                case 17: goto L_0x0078;
                default: goto L_0x006b;
            }
        L_0x006b:
            r12 = r28
            r9 = r29
            r13 = r30
            r11 = r32
        L_0x0073:
            r5 = r4
            r29 = r7
            goto L_0x026c
        L_0x0078:
            r0 = 3
            if (r2 != r0) goto L_0x00ae
            int r0 = r3 << 3
            r8 = r0 | 4
            dfj r0 = r15.a(r1)
            r1 = r28
            r2 = r4
            r3 = r30
            r4 = r8
            r9 = r29
            r8 = -1
            r5 = r32
            int r0 = a(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r21
            r11 = r32
            if (r1 != 0) goto L_0x009b
            java.lang.Object r1 = r11.c
            goto L_0x00a5
        L_0x009b:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r11.c
            java.lang.Object r1 = defpackage.ddr.a(r1, r2)
        L_0x00a5:
            r10.putObject(r14, r12, r1)
            r6 = r6 | r21
            r12 = r28
            goto L_0x0124
        L_0x00ae:
            r9 = r29
            r11 = r32
            goto L_0x00d6
        L_0x00b3:
            r9 = r29
            r11 = r32
            r8 = -1
            if (r2 != 0) goto L_0x00d6
            r2 = r12
            r12 = r28
            int r13 = defpackage.dcm.b(r12, r4, r11)
            long r0 = r11.b
            long r4 = defpackage.dcv.a(r0)
            r0 = r10
            r1 = r27
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r1 = r9
            r9 = r11
            r0 = r13
            r13 = r30
            goto L_0x0268
        L_0x00d6:
            r12 = r28
            goto L_0x0144
        L_0x00da:
            r9 = r29
            r11 = r32
            r0 = r12
            r8 = -1
            r12 = r28
            if (r2 != 0) goto L_0x0144
            int r2 = defpackage.dcm.a(r12, r4, r11)
            int r3 = r11.a
            int r3 = defpackage.dcv.f(r3)
            r10.putInt(r14, r0, r3)
            goto L_0x013b
        L_0x00f2:
            r9 = r29
            r11 = r32
            r22 = r12
            r8 = -1
            r12 = r28
            if (r2 != 0) goto L_0x0144
            int r0 = defpackage.dcm.a(r12, r4, r11)
            int r2 = r11.a
            ddt r1 = r15.b(r1)
            if (r1 == 0) goto L_0x011d
            dds r1 = r1.a(r2)
            if (r1 == 0) goto L_0x0110
            goto L_0x011d
        L_0x0110:
            dgc r1 = e(r27)
            long r2 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.a(r9, r2)
            goto L_0x0124
        L_0x011d:
            r3 = r22
            r10.putInt(r14, r3, r2)
            r6 = r6 | r21
        L_0x0124:
            r13 = r30
            goto L_0x0140
        L_0x0127:
            r9 = r29
            r11 = r32
            r0 = r12
            r3 = 2
            r8 = -1
            r12 = r28
            if (r2 != r3) goto L_0x0144
            int r2 = defpackage.dcm.e(r12, r4, r11)
            java.lang.Object r3 = r11.c
            r10.putObject(r14, r0, r3)
        L_0x013b:
            r6 = r6 | r21
            r13 = r30
            r0 = r2
        L_0x0140:
            r1 = r9
            r9 = r11
            goto L_0x0268
        L_0x0144:
            r13 = r30
            goto L_0x0073
        L_0x0148:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r3 = 2
            r12 = r28
            if (r2 != r3) goto L_0x0170
            dfj r0 = r15.a(r1)
            r13 = r30
            int r0 = a(r0, r12, r4, r13, r11)
            r1 = r6 & r21
            if (r1 != 0) goto L_0x0165
            java.lang.Object r1 = r11.c
            goto L_0x0193
        L_0x0165:
            java.lang.Object r1 = r10.getObject(r14, r7)
            java.lang.Object r2 = r11.c
            java.lang.Object r1 = defpackage.ddr.a(r1, r2)
            goto L_0x0193
        L_0x0170:
            r13 = r30
            goto L_0x01f1
        L_0x0174:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 2
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f1
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x018d
            int r0 = defpackage.dcm.c(r12, r4, r11)
            goto L_0x0191
        L_0x018d:
            int r0 = defpackage.dcm.d(r12, r4, r11)
        L_0x0191:
            java.lang.Object r1 = r11.c
        L_0x0193:
            r10.putObject(r14, r7, r1)
            goto L_0x0261
        L_0x0198:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x01f1
            int r0 = defpackage.dcm.b(r12, r4, r11)
            long r1 = r11.b
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x01b3
            r1 = 1
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            defpackage.dgh.a(r14, r7, r1)
            goto L_0x0261
        L_0x01b9:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f1
            int r0 = defpackage.dcm.a(r12, r4)
            r10.putInt(r14, r7, r0)
            int r0 = r4 + 4
            goto L_0x0261
        L_0x01d1:
            r9 = r29
            r11 = r32
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x01f1
            long r19 = defpackage.dcm.b(r12, r4)
            r0 = r10
            r1 = r27
            r2 = r7
            r7 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r7 + 8
            goto L_0x0261
        L_0x01f1:
            r5 = r4
            goto L_0x026c
        L_0x01f4:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x026c
            int r0 = defpackage.dcm.a(r12, r5, r11)
            int r1 = r11.a
            r10.putInt(r14, r7, r1)
            goto L_0x0261
        L_0x020d:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != 0) goto L_0x026c
            int r17 = defpackage.dcm.b(r12, r5, r11)
            long r4 = r11.b
            r0 = r10
            r1 = r27
            r2 = r7
            r0.putLong(r1, r2, r4)
            r6 = r6 | r21
            r7 = r29
            r1 = r9
            r9 = r11
            r0 = r17
            goto L_0x0267
        L_0x0231:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x026c
            float r0 = defpackage.dcm.d(r12, r5)
            defpackage.dgh.a(r14, r7, r0)
            int r0 = r5 + 4
            goto L_0x0261
        L_0x0249:
            r9 = r29
            r11 = r32
            r5 = r4
            r29 = r7
            r7 = r12
            r0 = 1
            r12 = r28
            r13 = r30
            if (r2 != r0) goto L_0x026c
            double r0 = defpackage.dcm.c(r12, r5)
            defpackage.dgh.a(r14, r7, r0)
            int r0 = r5 + 8
        L_0x0261:
            r6 = r6 | r21
            r7 = r29
            r1 = r9
            r9 = r11
        L_0x0267:
            r8 = -1
        L_0x0268:
            r11 = r31
            goto L_0x0016
        L_0x026c:
            r17 = r29
            r2 = r5
            r21 = r6
            r7 = r9
            r25 = r10
            r6 = r31
            goto L_0x0370
        L_0x0278:
            r9 = r29
            r5 = r4
            r17 = r7
            r7 = r12
            r12 = r28
            r13 = r30
            r0 = 27
            if (r11 != r0) goto L_0x02cd
            r0 = 2
            if (r2 != r0) goto L_0x02c6
            java.lang.Object r0 = r10.getObject(r14, r7)
            ddu r0 = (defpackage.ddu) r0
            boolean r2 = r0.a()
            if (r2 != 0) goto L_0x02a7
            int r2 = r0.size()
            if (r2 != 0) goto L_0x029e
            r2 = 10
            goto L_0x02a0
        L_0x029e:
            int r2 = r2 << 1
        L_0x02a0:
            ddu r0 = r0.a(r2)
            r10.putObject(r14, r7, r0)
        L_0x02a7:
            r7 = r0
            dfj r0 = r15.a(r1)
            r1 = r9
            r2 = r28
            r3 = r5
            r4 = r30
            r5 = r7
            r21 = r6
            r6 = r32
            int r0 = a(r0, r1, r2, r3, r4, r5, r6)
            r11 = r31
            r7 = r17
            r6 = r21
            r8 = -1
            r9 = r32
            goto L_0x0016
        L_0x02c6:
            r21 = r6
            r15 = r5
            r18 = r9
            goto L_0x0369
        L_0x02cd:
            r21 = r6
            r0 = 49
            if (r11 > r0) goto L_0x0315
            r6 = r19
            long r12 = (long) r6
            r0 = r26
            r19 = r1
            r1 = r27
            r6 = r2
            r2 = r28
            r22 = r3
            r3 = r5
            r4 = r30
            r15 = r5
            r5 = r9
            r29 = r6
            r6 = r22
            r23 = r7
            r7 = r29
            r8 = r19
            r18 = r9
            r25 = r10
            r9 = r12
            r12 = r31
            r12 = r23
            r14 = r32
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0303
            goto L_0x035e
        L_0x0303:
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r11 = r31
            r9 = r32
            r7 = r17
            r1 = r18
            goto L_0x038f
        L_0x0315:
            r29 = r2
            r22 = r3
            r15 = r5
            r23 = r7
            r18 = r9
            r25 = r10
            r6 = r19
            r19 = r1
            r0 = 50
            r7 = r29
            if (r11 != r0) goto L_0x0343
            r0 = 2
            if (r7 != r0) goto L_0x036b
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r19
            r6 = r23
            r8 = r32
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x0303
            goto L_0x035e
        L_0x0343:
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r15
            r4 = r30
            r5 = r18
            r8 = r6
            r6 = r22
            r9 = r11
            r10 = r23
            r12 = r19
            r13 = r32
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0303
        L_0x035e:
            r6 = r31
            r2 = r0
            goto L_0x036e
        L_0x0362:
            r15 = r4
            r18 = r5
            r21 = r6
            r17 = r7
        L_0x0369:
            r25 = r10
        L_0x036b:
            r6 = r31
            r2 = r15
        L_0x036e:
            r7 = r18
        L_0x0370:
            if (r7 != r6) goto L_0x0374
            if (r6 != 0) goto L_0x039f
        L_0x0374:
            r0 = r7
            r1 = r28
            r3 = r30
            r4 = r27
            r5 = r32
            int r0 = a(r0, r1, r2, r3, r4, r5)
            r15 = r26
            r14 = r27
            r12 = r28
            r13 = r30
            r9 = r32
            r11 = r6
            r1 = r7
            r7 = r17
        L_0x038f:
            r6 = r21
            r10 = r25
            r8 = -1
            goto L_0x0016
        L_0x0396:
            r21 = r6
            r17 = r7
            r25 = r10
            r6 = r11
            r2 = r0
            r7 = r1
        L_0x039f:
            r0 = r17
            r1 = r21
            r3 = -1
            if (r0 == r3) goto L_0x03af
            long r3 = (long) r0
            r0 = r27
            r5 = r25
            r5.putInt(r0, r3, r1)
            goto L_0x03b1
        L_0x03af:
            r0 = r27
        L_0x03b1:
            r1 = r26
            int[] r3 = r1.m
            if (r3 == 0) goto L_0x03d1
            r4 = 0
            int r5 = r3.length
            r8 = r4
            r4 = 0
        L_0x03bb:
            if (r4 >= r5) goto L_0x03ca
            r9 = r3[r4]
            dgb<?, ?> r10 = r1.q
            java.lang.Object r8 = r1.a(r0, r9, (UB) r8, r10)
            dgc r8 = (defpackage.dgc) r8
            int r4 = r4 + 1
            goto L_0x03bb
        L_0x03ca:
            if (r8 == 0) goto L_0x03d1
            dgb<?, ?> r3 = r1.q
            r3.b(r0, r8)
        L_0x03d1:
            r0 = r30
            if (r6 != 0) goto L_0x03dd
            if (r2 != r0) goto L_0x03d8
            goto L_0x03e1
        L_0x03d8:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.g()
            throw r0
        L_0x03dd:
            if (r2 > r0) goto L_0x03e2
            if (r7 != r6) goto L_0x03e2
        L_0x03e1:
            return r2
        L_0x03e2:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.g()
            goto L_0x03e8
        L_0x03e7:
            throw r0
        L_0x03e8:
            goto L_0x03e7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, byte[], int, int, int, dcn):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r2 = java.lang.Integer.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        r6.c = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r6.c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007b, code lost:
        r6.c = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0042, code lost:
        r2 = java.lang.Long.valueOf(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(byte[] r1, int r2, int r3, com.google.android.gms.internal.ads.zzbes r4, java.lang.Class<?> r5, defpackage.dcn r6) {
        /*
            int[] r0 = defpackage.dev.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            switch(r4) {
                case 1: goto L_0x0085;
                case 2: goto L_0x0080;
                case 3: goto L_0x0073;
                case 4: goto L_0x0066;
                case 5: goto L_0x0066;
                case 6: goto L_0x005d;
                case 7: goto L_0x005d;
                case 8: goto L_0x0054;
                case 9: goto L_0x0047;
                case 10: goto L_0x0047;
                case 11: goto L_0x0047;
                case 12: goto L_0x003c;
                case 13: goto L_0x003c;
                case 14: goto L_0x002f;
                case 15: goto L_0x0024;
                case 16: goto L_0x0019;
                case 17: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported field type."
            r1.<init>(r2)
            throw r1
        L_0x0013:
            int r1 = defpackage.dcm.d(r1, r2, r6)
            goto L_0x0099
        L_0x0019:
            int r1 = defpackage.dcm.b(r1, r2, r6)
            long r2 = r6.b
            long r2 = defpackage.dcv.a(r2)
            goto L_0x0042
        L_0x0024:
            int r1 = defpackage.dcm.a(r1, r2, r6)
            int r2 = r6.a
            int r2 = defpackage.dcv.f(r2)
            goto L_0x004d
        L_0x002f:
            dfd r4 = defpackage.dfd.a()
            dfj r4 = r4.a(r5)
            int r1 = a(r4, r1, r2, r3, r6)
            goto L_0x0099
        L_0x003c:
            int r1 = defpackage.dcm.b(r1, r2, r6)
            long r2 = r6.b
        L_0x0042:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0051
        L_0x0047:
            int r1 = defpackage.dcm.a(r1, r2, r6)
            int r2 = r6.a
        L_0x004d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0051:
            r6.c = r2
            goto L_0x0099
        L_0x0054:
            float r1 = defpackage.dcm.d(r1, r2)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x006e
        L_0x005d:
            long r3 = defpackage.dcm.b(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x007b
        L_0x0066:
            int r1 = defpackage.dcm.a(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x006e:
            r6.c = r1
            int r1 = r2 + 4
            goto L_0x0099
        L_0x0073:
            double r3 = defpackage.dcm.c(r1, r2)
            java.lang.Double r1 = java.lang.Double.valueOf(r3)
        L_0x007b:
            r6.c = r1
            int r1 = r2 + 8
            goto L_0x0099
        L_0x0080:
            int r1 = defpackage.dcm.e(r1, r2, r6)
            goto L_0x0099
        L_0x0085:
            int r1 = defpackage.dcm.b(r1, r2, r6)
            long r2 = r6.b
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r2 = 1
            goto L_0x0094
        L_0x0093:
            r2 = 0
        L_0x0094:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0051
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(byte[], int, int, com.google.android.gms.internal.ads.zzbes, java.lang.Class, dcn):int");
    }

    static <T> deu<T> a(deo deo, dez dez, dec dec, dgb<?, ?> dgb, ddg<?> ddg, del del) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        Field field;
        Field field2;
        Field field3;
        deo deo2 = deo;
        if (deo2 instanceof dff) {
            dff dff = (dff) deo2;
            int i10 = 1;
            boolean z2 = dff.a() == e.i;
            if (dff.b.d == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int i11 = dff.b.f;
                int i12 = dff.b.g;
                i4 = dff.b.j;
                i3 = i11;
                i2 = i12;
            }
            int[] iArr = new int[(i4 << 2)];
            Object[] objArr = new Object[(i4 << 1)];
            int[] iArr2 = dff.b.h > 0 ? new int[dff.b.h] : null;
            int[] iArr3 = dff.b.k > 0 ? new int[dff.b.k] : null;
            dfg dfg = dff.b;
            if (dfg.a()) {
                int i13 = dfg.m;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (i13 >= dff.b.i || i14 >= ((i13 - i3) << 2)) {
                        if (dfg.b()) {
                            int i17 = dfg.p << i10;
                            Object obj = dfg.a[i17];
                            if (obj instanceof Field) {
                                field2 = (Field) obj;
                            } else {
                                field2 = dfg.a(dfg.b, (String) obj);
                                dfg.a[i17] = field2;
                            }
                            int a2 = (int) dgh.a(field2);
                            int i18 = (dfg.p << i10) + i10;
                            Object obj2 = dfg.a[i18];
                            if (obj2 instanceof Field) {
                                field3 = (Field) obj2;
                            } else {
                                field3 = dfg.a(dfg.b, (String) obj2);
                                dfg.a[i18] = field3;
                            }
                            int i19 = a2;
                            i7 = (int) dgh.a(field3);
                            i6 = i19;
                            i8 = 0;
                        } else {
                            int a3 = (int) dgh.a(dfg.r);
                            if (dfg.c()) {
                                int i20 = (dfg.e << 1) + (dfg.q / 32);
                                Object obj3 = dfg.a[i20];
                                if (obj3 instanceof Field) {
                                    field = (Field) obj3;
                                } else {
                                    field = dfg.a(dfg.b, (String) obj3);
                                    dfg.a[i20] = field;
                                }
                                i6 = a3;
                                i7 = (int) dgh.a(field);
                                i8 = dfg.q % 32;
                            } else {
                                i6 = a3;
                                i8 = 0;
                                i7 = 0;
                            }
                        }
                        iArr[i14] = dfg.m;
                        int i21 = i14 + 1;
                        z = z2;
                        if ((dfg.n & 512) != 0) {
                            i9 = 536870912;
                            i5 = i2;
                        } else {
                            i5 = i2;
                            i9 = 0;
                        }
                        iArr[i21] = ((dfg.n & 256) != 0 ? 268435456 : 0) | i9 | (dfg.o << 20) | i6;
                        iArr[i14 + 2] = (i8 << 20) | i7;
                        if (dfg.u != null) {
                            int i22 = (i14 / 4) << 1;
                            objArr[i22] = dfg.u;
                            if (dfg.s != null) {
                                objArr[i22 + 1] = dfg.s;
                            } else if (dfg.t != null) {
                                objArr[i22 + 1] = dfg.t;
                            }
                        } else if (dfg.s != null) {
                            objArr[((i14 / 4) << 1) + 1] = dfg.s;
                        } else if (dfg.t != null) {
                            objArr[((i14 / 4) << 1) + 1] = dfg.t;
                        }
                        int i23 = dfg.o;
                        if (i23 == zzbbj.MAP.ordinal()) {
                            int i24 = i15 + 1;
                            iArr2[i15] = i14;
                            i15 = i24;
                        } else if (i23 >= 18 && i23 <= 49) {
                            int i25 = i16 + 1;
                            iArr3[i16] = iArr[i21] & 1048575;
                            i16 = i25;
                        }
                        if (!dfg.a()) {
                            break;
                        }
                        i13 = dfg.m;
                    } else {
                        for (int i26 = 0; i26 < 4; i26++) {
                            iArr[i14 + i26] = -1;
                        }
                        i5 = i2;
                        z = z2;
                    }
                    i14 += 4;
                    z2 = z;
                    i2 = i5;
                    i10 = 1;
                }
            } else {
                i5 = i2;
                z = z2;
            }
            deu deu = new deu(iArr, objArr, i3, i5, dff.b.i, dff.a, z, dff.b.l, iArr2, iArr3, dez, dec, dgb, ddg, del);
            return deu;
        }
        dfw dfw = (dfw) deo2;
        throw new NoSuchMethodError();
    }

    private final dfj a(int i2) {
        int i3 = (i2 / 4) << 1;
        dfj dfj = (dfj) this.c[i3];
        if (dfj != null) {
            return dfj;
        }
        dfj a2 = dfd.a().a((Class) this.c[i3 + 1]);
        this.c[i3] = a2;
        return a2;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, ddt<?> ddt, UB ub, dgb<UT, UB> dgb) {
        dek b2 = this.s.b();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (ddt.a(((Integer) entry.getValue()).intValue()) == null) {
                if (ub == null) {
                    ub = dgb.a();
                }
                dct c2 = zzbah.c(dej.a(b2, entry.getKey(), entry.getValue()));
                try {
                    dej.a(c2.a, b2, entry.getKey(), entry.getValue());
                    dgb.a(ub, i3, c2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, dgb<UT, UB> dgb) {
        int i3 = this.b[i2];
        Object f2 = dgh.f(obj, (long) (c(i2) & 1048575));
        if (f2 == null) {
            return ub;
        }
        ddt b2 = b(i2);
        if (b2 == null) {
            return ub;
        }
        return a(i2, i3, this.s.a(f2), b2, ub, dgb);
    }

    private static <E> List<E> a(Object obj, long j2) {
        return (List) dgh.f(obj, j2);
    }

    private static void a(int i2, Object obj, dgn dgn) {
        if (obj instanceof String) {
            dgn.a(i2, (String) obj);
        } else {
            dgn.a(i2, (zzbah) obj);
        }
    }

    private static <UT, UB> void a(dgb<UT, UB> dgb, T t, dgn dgn) {
        dgb.a(dgb.b(t), dgn);
    }

    private final <K, V> void a(dgn dgn, int i2, Object obj, int i3) {
        if (obj != null) {
            dgn.a(i2, this.s.b(), this.s.b(obj));
        }
    }

    private final void a(Object obj, int i2, dfi dfi) {
        long j2;
        Object n2;
        if (e(i2)) {
            j2 = (long) (i2 & 1048575);
            n2 = dfi.m();
        } else {
            int i3 = i2 & 1048575;
            if (this.i) {
                j2 = (long) i3;
                n2 = dfi.l();
            } else {
                j2 = (long) i3;
                n2 = dfi.n();
            }
        }
        dgh.a(obj, j2, n2);
    }

    private final void a(T t, T t2, int i2) {
        long c2 = (long) (c(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = dgh.f(t, c2);
            Object f3 = dgh.f(t2, c2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    dgh.a((Object) t, c2, f3);
                    b(t, i2);
                }
                return;
            }
            dgh.a((Object) t, c2, ddr.a(f2, f3));
            b(t, i2);
        }
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int c2 = c(i2);
            long j2 = (long) (c2 & 1048575);
            switch ((c2 & 267386880) >>> 20) {
                case 0:
                    return dgh.e(t, j2) != 0.0d;
                case 1:
                    return dgh.d(t, j2) != 0.0f;
                case 2:
                    return dgh.b(t, j2) != 0;
                case 3:
                    return dgh.b(t, j2) != 0;
                case 4:
                    return dgh.a((Object) t, j2) != 0;
                case 5:
                    return dgh.b(t, j2) != 0;
                case 6:
                    return dgh.a((Object) t, j2) != 0;
                case 7:
                    return dgh.c(t, j2);
                case 8:
                    Object f2 = dgh.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof zzbah) {
                        return !zzbah.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return dgh.f(t, j2) != null;
                case 10:
                    return !zzbah.a.equals(dgh.f(t, j2));
                case 11:
                    return dgh.a((Object) t, j2) != 0;
                case 12:
                    return dgh.a((Object) t, j2) != 0;
                case 13:
                    return dgh.a((Object) t, j2) != 0;
                case 14:
                    return dgh.b(t, j2) != 0;
                case 15:
                    return dgh.a((Object) t, j2) != 0;
                case 16:
                    return dgh.b(t, j2) != 0;
                case 17:
                    return dgh.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int d2 = d(i2);
            return (dgh.a((Object) t, (long) (d2 & 1048575)) & (1 << (d2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return dgh.a((Object) t, (long) (d(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.j ? a(t, i2) : (i3 & i4) != 0;
    }

    private static boolean a(Object obj, int i2, dfj dfj) {
        return dfj.d(dgh.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) dgh.f(t, j2)).doubleValue();
    }

    private final ddt<?> b(int i2) {
        return (ddt) this.c[((i2 / 4) << 1) + 1];
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            dgh.a((Object) t, j2, dgh.a((Object) t, j2) | (1 << (d2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        dgh.a((Object) t, (long) (d(i3) & 1048575), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0280, code lost:
        defpackage.dfl.j(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0290, code lost:
        defpackage.dfl.g(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a0, code lost:
        defpackage.dfl.l(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b0, code lost:
        defpackage.dfl.m(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c0, code lost:
        defpackage.dfl.i(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0479, code lost:
        r5 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0276, code lost:
        defpackage.dfl.e(r4, r9, r2, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(T r19, defpackage.dgn r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.h
            if (r3 == 0) goto L_0x0023
            ddg<?> r3 = r0.r
            ddj r3 = r3.a(r1)
            dfm<FieldDescriptorType, java.lang.Object> r5 = r3.a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.c()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            r6 = -1
            int[] r7 = r0.b
            int r7 = r7.length
            sun.misc.Unsafe r8 = a
            r10 = r5
            r5 = 0
            r11 = 0
        L_0x002e:
            if (r5 >= r7) goto L_0x047d
            int r12 = r0.c(r5)
            int[] r13 = r0.b
            r14 = r13[r5]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.j
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0062
            r4 = 17
            if (r15 > r4) goto L_0x0062
            int r4 = r5 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            r17 = r10
            if (r13 == r6) goto L_0x0058
            long r9 = (long) r13
            int r11 = r8.getInt(r1, r9)
            goto L_0x0059
        L_0x0058:
            r13 = r6
        L_0x0059:
            int r4 = r4 >>> 20
            r6 = 1
            int r9 = r6 << r4
            r6 = r13
            r10 = r17
            goto L_0x0067
        L_0x0062:
            r17 = r10
            r10 = r17
            r9 = 0
        L_0x0067:
            if (r10 == 0) goto L_0x0086
            ddg<?> r4 = r0.r
            int r4 = r4.a(r10)
            if (r4 > r14) goto L_0x0086
            ddg<?> r4 = r0.r
            r4.b(r10)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0084
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r10 = r4
            goto L_0x0067
        L_0x0084:
            r10 = 0
            goto L_0x0067
        L_0x0086:
            r4 = r12 & r16
            long r12 = (long) r4
            switch(r15) {
                case 0: goto L_0x046d;
                case 1: goto L_0x0460;
                case 2: goto L_0x0453;
                case 3: goto L_0x0446;
                case 4: goto L_0x0439;
                case 5: goto L_0x042c;
                case 6: goto L_0x041f;
                case 7: goto L_0x0412;
                case 8: goto L_0x0404;
                case 9: goto L_0x03f2;
                case 10: goto L_0x03e2;
                case 11: goto L_0x03d4;
                case 12: goto L_0x03c6;
                case 13: goto L_0x03b8;
                case 14: goto L_0x03aa;
                case 15: goto L_0x039c;
                case 16: goto L_0x038e;
                case 17: goto L_0x037c;
                case 18: goto L_0x036c;
                case 19: goto L_0x035c;
                case 20: goto L_0x034c;
                case 21: goto L_0x033c;
                case 22: goto L_0x032c;
                case 23: goto L_0x031c;
                case 24: goto L_0x030c;
                case 25: goto L_0x02fc;
                case 26: goto L_0x02ed;
                case 27: goto L_0x02da;
                case 28: goto L_0x02cb;
                case 29: goto L_0x02bb;
                case 30: goto L_0x02ab;
                case 31: goto L_0x029b;
                case 32: goto L_0x028b;
                case 33: goto L_0x027b;
                case 34: goto L_0x026b;
                case 35: goto L_0x025b;
                case 36: goto L_0x024b;
                case 37: goto L_0x023b;
                case 38: goto L_0x022b;
                case 39: goto L_0x021b;
                case 40: goto L_0x020b;
                case 41: goto L_0x01fb;
                case 42: goto L_0x01eb;
                case 43: goto L_0x01e4;
                case 44: goto L_0x01dd;
                case 45: goto L_0x01d6;
                case 46: goto L_0x01cf;
                case 47: goto L_0x01c8;
                case 48: goto L_0x01bb;
                case 49: goto L_0x01a8;
                case 50: goto L_0x019f;
                case 51: goto L_0x0190;
                case 52: goto L_0x0181;
                case 53: goto L_0x0172;
                case 54: goto L_0x0163;
                case 55: goto L_0x0154;
                case 56: goto L_0x0145;
                case 57: goto L_0x0136;
                case 58: goto L_0x0127;
                case 59: goto L_0x0118;
                case 60: goto L_0x0105;
                case 61: goto L_0x00f5;
                case 62: goto L_0x00e7;
                case 63: goto L_0x00d9;
                case 64: goto L_0x00cb;
                case 65: goto L_0x00bd;
                case 66: goto L_0x00af;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x008c;
            }
        L_0x008c:
            r15 = 0
            goto L_0x0479
        L_0x008f:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            dfj r9 = r0.a(r5)
            r2.b(r14, r4, r9)
            goto L_0x008c
        L_0x00a1:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.e(r14, r12)
            goto L_0x008c
        L_0x00af:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.f(r14, r4)
            goto L_0x008c
        L_0x00bd:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.b(r14, r12)
            goto L_0x008c
        L_0x00cb:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x00d9:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.b(r14, r4)
            goto L_0x008c
        L_0x00e7:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.e(r14, r4)
            goto L_0x008c
        L_0x00f5:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.ads.zzbah r4 = (com.google.android.gms.internal.ads.zzbah) r4
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0105:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            dfj r9 = r0.a(r5)
            r2.a(r14, r4, r9)
            goto L_0x008c
        L_0x0118:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            java.lang.Object r4 = r8.getObject(r1, r12)
            a(r14, r4, r2)
            goto L_0x008c
        L_0x0127:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            boolean r4 = f(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0136:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.d(r14, r4)
            goto L_0x008c
        L_0x0145:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.d(r14, r12)
            goto L_0x008c
        L_0x0154:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            int r4 = d(r1, r12)
            r2.c(r14, r4)
            goto L_0x008c
        L_0x0163:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.c(r14, r12)
            goto L_0x008c
        L_0x0172:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            long r12 = e(r1, r12)
            r2.a(r14, r12)
            goto L_0x008c
        L_0x0181:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            float r4 = c(r1, r12)
            r2.a(r14, r4)
            goto L_0x008c
        L_0x0190:
            boolean r4 = r0.a((T) r1, r14, r5)
            if (r4 == 0) goto L_0x008c
            double r12 = b((T) r1, r12)
            r2.a(r14, r12)
            goto L_0x008c
        L_0x019f:
            java.lang.Object r4 = r8.getObject(r1, r12)
            r0.a(r2, r14, r4, r5)
            goto L_0x008c
        L_0x01a8:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            dfj r12 = r0.a(r5)
            defpackage.dfl.b(r4, r9, r2, r12)
            goto L_0x008c
        L_0x01bb:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 1
            goto L_0x0276
        L_0x01c8:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            goto L_0x0280
        L_0x01cf:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            goto L_0x0290
        L_0x01d6:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            goto L_0x02a0
        L_0x01dd:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            goto L_0x02b0
        L_0x01e4:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            goto L_0x02c0
        L_0x01eb:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.n(r4, r9, r2, r14)
            goto L_0x008c
        L_0x01fb:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.k(r4, r9, r2, r14)
            goto L_0x008c
        L_0x020b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.f(r4, r9, r2, r14)
            goto L_0x008c
        L_0x021b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.h(r4, r9, r2, r14)
            goto L_0x008c
        L_0x022b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.d(r4, r9, r2, r14)
            goto L_0x008c
        L_0x023b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.c(r4, r9, r2, r14)
            goto L_0x008c
        L_0x024b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r4, r9, r2, r14)
            goto L_0x008c
        L_0x025b:
            r14 = 1
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r4, r9, r2, r14)
            goto L_0x008c
        L_0x026b:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r14 = 0
        L_0x0276:
            defpackage.dfl.e(r4, r9, r2, r14)
            goto L_0x008c
        L_0x027b:
            r14 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
        L_0x0280:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.j(r4, r9, r2, r14)
            goto L_0x008c
        L_0x028b:
            r14 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
        L_0x0290:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.g(r4, r9, r2, r14)
            goto L_0x008c
        L_0x029b:
            r14 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
        L_0x02a0:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.l(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02ab:
            r14 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
        L_0x02b0:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.m(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02bb:
            r14 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
        L_0x02c0:
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.i(r4, r9, r2, r14)
            goto L_0x008c
        L_0x02cb:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r4, r9, r2)
            goto L_0x008c
        L_0x02da:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            dfj r12 = r0.a(r5)
            defpackage.dfl.a(r4, r9, r2, r12)
            goto L_0x008c
        L_0x02ed:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r4, r9, r2)
            goto L_0x008c
        L_0x02fc:
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            r15 = 0
            defpackage.dfl.n(r4, r9, r2, r15)
            goto L_0x0479
        L_0x030c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.k(r4, r9, r2, r15)
            goto L_0x0479
        L_0x031c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.f(r4, r9, r2, r15)
            goto L_0x0479
        L_0x032c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.h(r4, r9, r2, r15)
            goto L_0x0479
        L_0x033c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.d(r4, r9, r2, r15)
            goto L_0x0479
        L_0x034c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.c(r4, r9, r2, r15)
            goto L_0x0479
        L_0x035c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r4, r9, r2, r15)
            goto L_0x0479
        L_0x036c:
            r15 = 0
            int[] r4 = r0.b
            r4 = r4[r5]
            java.lang.Object r9 = r8.getObject(r1, r12)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r4, r9, r2, r15)
            goto L_0x0479
        L_0x037c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            java.lang.Object r4 = r8.getObject(r1, r12)
            dfj r9 = r0.a(r5)
            r2.b(r14, r4, r9)
            goto L_0x0479
        L_0x038e:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            long r12 = r8.getLong(r1, r12)
            r2.e(r14, r12)
            goto L_0x0479
        L_0x039c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.f(r14, r4)
            goto L_0x0479
        L_0x03aa:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            long r12 = r8.getLong(r1, r12)
            r2.b(r14, r12)
            goto L_0x0479
        L_0x03b8:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.a(r14, r4)
            goto L_0x0479
        L_0x03c6:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.b(r14, r4)
            goto L_0x0479
        L_0x03d4:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.e(r14, r4)
            goto L_0x0479
        L_0x03e2:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            java.lang.Object r4 = r8.getObject(r1, r12)
            com.google.android.gms.internal.ads.zzbah r4 = (com.google.android.gms.internal.ads.zzbah) r4
            r2.a(r14, r4)
            goto L_0x0479
        L_0x03f2:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            java.lang.Object r4 = r8.getObject(r1, r12)
            dfj r9 = r0.a(r5)
            r2.a(r14, r4, r9)
            goto L_0x0479
        L_0x0404:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            java.lang.Object r4 = r8.getObject(r1, r12)
            a(r14, r4, r2)
            goto L_0x0479
        L_0x0412:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            boolean r4 = defpackage.dgh.c(r1, r12)
            r2.a(r14, r4)
            goto L_0x0479
        L_0x041f:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.d(r14, r4)
            goto L_0x0479
        L_0x042c:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            long r12 = r8.getLong(r1, r12)
            r2.d(r14, r12)
            goto L_0x0479
        L_0x0439:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            int r4 = r8.getInt(r1, r12)
            r2.c(r14, r4)
            goto L_0x0479
        L_0x0446:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            long r12 = r8.getLong(r1, r12)
            r2.c(r14, r12)
            goto L_0x0479
        L_0x0453:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            long r12 = r8.getLong(r1, r12)
            r2.a(r14, r12)
            goto L_0x0479
        L_0x0460:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            float r4 = defpackage.dgh.d(r1, r12)
            r2.a(r14, r4)
            goto L_0x0479
        L_0x046d:
            r15 = 0
            r4 = r11 & r9
            if (r4 == 0) goto L_0x0479
            double r12 = defpackage.dgh.e(r1, r12)
            r2.a(r14, r12)
        L_0x0479:
            int r5 = r5 + 4
            goto L_0x002e
        L_0x047d:
            r17 = r10
            r4 = r17
        L_0x0481:
            if (r4 == 0) goto L_0x0497
            ddg<?> r5 = r0.r
            r5.b(r4)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0495
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            goto L_0x0481
        L_0x0495:
            r4 = 0
            goto L_0x0481
        L_0x0497:
            dgb<?, ?> r3 = r0.q
            a(r3, (T) r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.b(java.lang.Object, dgn):void");
    }

    private final void b(T t, T t2, int i2) {
        int c2 = c(i2);
        int i3 = this.b[i2];
        long j2 = (long) (c2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = dgh.f(t, j2);
            Object f3 = dgh.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    dgh.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            dgh.a((Object) t, j2, ddr.a(f2, f3));
            b(t, i3, i2);
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) dgh.f(t, j2)).floatValue();
    }

    private final int c(int i2) {
        return this.b[i2 + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.b[i2 + 2];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) dgh.f(t, j2)).intValue();
    }

    private static <T> long e(T t, long j2) {
        return ((Long) dgh.f(t, j2)).longValue();
    }

    private static dgc e(Object obj) {
        ddp ddp = (ddp) obj;
        dgc dgc = ddp.zzdtt;
        if (dgc != dgc.a()) {
            return dgc;
        }
        dgc b2 = dgc.b();
        ddp.zzdtt = b2;
        return b2;
    }

    private static boolean e(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final int f(int i2) {
        int i3 = this.d;
        if (i2 >= i3) {
            int i4 = this.f;
            if (i2 < i4) {
                int i5 = (i2 - i3) << 2;
                if (this.b[i5] == i2) {
                    return i5;
                }
                return -1;
            } else if (i2 <= this.e) {
                int i6 = i4 - i3;
                int length = (this.b.length / 4) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    int i8 = i7 << 2;
                    int i9 = this.b[i8];
                    if (i2 == i9) {
                        return i8;
                    }
                    if (i2 < i9) {
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) dgh.f(t, j2)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = defpackage.dgh.f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = defpackage.dgh.f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) defpackage.dgh.f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = defpackage.ddr.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = defpackage.ddr.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.b
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x012e
            int r3 = r8.c(r1)
            int[] r4 = r8.b
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0110;
                case 2: goto L_0x0109;
                case 3: goto L_0x0109;
                case 4: goto L_0x0102;
                case 5: goto L_0x0109;
                case 6: goto L_0x0102;
                case 7: goto L_0x00f7;
                case 8: goto L_0x00ea;
                case 9: goto L_0x00dc;
                case 10: goto L_0x00d1;
                case 11: goto L_0x0102;
                case 12: goto L_0x0102;
                case 13: goto L_0x0102;
                case 14: goto L_0x0109;
                case 15: goto L_0x0102;
                case 16: goto L_0x0109;
                case 17: goto L_0x00ca;
                case 18: goto L_0x00d1;
                case 19: goto L_0x00d1;
                case 20: goto L_0x00d1;
                case 21: goto L_0x00d1;
                case 22: goto L_0x00d1;
                case 23: goto L_0x00d1;
                case 24: goto L_0x00d1;
                case 25: goto L_0x00d1;
                case 26: goto L_0x00d1;
                case 27: goto L_0x00d1;
                case 28: goto L_0x00d1;
                case 29: goto L_0x00d1;
                case 30: goto L_0x00d1;
                case 31: goto L_0x00d1;
                case 32: goto L_0x00d1;
                case 33: goto L_0x00d1;
                case 34: goto L_0x00d1;
                case 35: goto L_0x00d1;
                case 36: goto L_0x00d1;
                case 37: goto L_0x00d1;
                case 38: goto L_0x00d1;
                case 39: goto L_0x00d1;
                case 40: goto L_0x00d1;
                case 41: goto L_0x00d1;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00d1;
                case 44: goto L_0x00d1;
                case 45: goto L_0x00d1;
                case 46: goto L_0x00d1;
                case 47: goto L_0x00d1;
                case 48: goto L_0x00d1;
                case 49: goto L_0x00d1;
                case 50: goto L_0x00d1;
                case 51: goto L_0x00bd;
                case 52: goto L_0x00b0;
                case 53: goto L_0x00a2;
                case 54: goto L_0x009b;
                case 55: goto L_0x008d;
                case 56: goto L_0x0086;
                case 57: goto L_0x007f;
                case 58: goto L_0x0071;
                case 59: goto L_0x0069;
                case 60: goto L_0x005b;
                case 61: goto L_0x0053;
                case 62: goto L_0x004c;
                case 63: goto L_0x0045;
                case 64: goto L_0x003e;
                case 65: goto L_0x0036;
                case 66: goto L_0x002f;
                case 67: goto L_0x0027;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x012a
        L_0x0020:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0061
        L_0x0027:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x002f:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0036:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x003e:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x004b
        L_0x0045:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x004b:
            goto L_0x0093
        L_0x004c:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0053:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00d1
        L_0x005b:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0061:
            java.lang.Object r3 = defpackage.dgh.f(r9, r5)
            int r2 = r2 * 53
            goto L_0x00d7
        L_0x0069:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00ea
        L_0x0071:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            boolean r3 = f(r9, r5)
            goto L_0x00fd
        L_0x007f:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x0093
        L_0x0086:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x008d:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x0093:
            int r2 = r2 * 53
            int r3 = d(r9, r5)
            goto L_0x0129
        L_0x009b:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            goto L_0x00a8
        L_0x00a2:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
        L_0x00a8:
            int r2 = r2 * 53
            long r3 = e(r9, r5)
            goto L_0x0125
        L_0x00b0:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            float r3 = c(r9, r5)
            goto L_0x0116
        L_0x00bd:
            boolean r3 = r8.a((T) r9, r4, r1)
            if (r3 == 0) goto L_0x012a
            int r2 = r2 * 53
            double r3 = b((T) r9, r5)
            goto L_0x0121
        L_0x00ca:
            java.lang.Object r3 = defpackage.dgh.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
            goto L_0x00e2
        L_0x00d1:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.dgh.f(r9, r5)
        L_0x00d7:
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00dc:
            java.lang.Object r3 = defpackage.dgh.f(r9, r5)
            if (r3 == 0) goto L_0x00e6
        L_0x00e2:
            int r7 = r3.hashCode()
        L_0x00e6:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x012a
        L_0x00ea:
            int r2 = r2 * 53
            java.lang.Object r3 = defpackage.dgh.f(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0129
        L_0x00f7:
            int r2 = r2 * 53
            boolean r3 = defpackage.dgh.c(r9, r5)
        L_0x00fd:
            int r3 = defpackage.ddr.a(r3)
            goto L_0x0129
        L_0x0102:
            int r2 = r2 * 53
            int r3 = defpackage.dgh.a(r9, r5)
            goto L_0x0129
        L_0x0109:
            int r2 = r2 * 53
            long r3 = defpackage.dgh.b(r9, r5)
            goto L_0x0125
        L_0x0110:
            int r2 = r2 * 53
            float r3 = defpackage.dgh.d(r9, r5)
        L_0x0116:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0129
        L_0x011b:
            int r2 = r2 * 53
            double r3 = defpackage.dgh.e(r9, r5)
        L_0x0121:
            long r3 = java.lang.Double.doubleToLongBits(r3)
        L_0x0125:
            int r3 = defpackage.ddr.a(r3)
        L_0x0129:
            int r2 = r2 + r3
        L_0x012a:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012e:
            int r2 = r2 * 53
            dgb<?, ?> r0 = r8.q
            java.lang.Object r0 = r0.b(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.h
            if (r0 == 0) goto L_0x014c
            int r2 = r2 * 53
            ddg<?> r0 = r8.r
            ddj r9 = r0.a(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object):int");
    }

    public final T a() {
        return this.o.a(this.g);
    }

    /* JADX INFO: used method not loaded: dfl.a(int, int, java.lang.Object, dgb):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x029b, code lost:
        r14.c(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02a9, code lost:
        r14.d(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02b7, code lost:
        r14.b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02c5, code lost:
        r14.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c5, code lost:
        defpackage.dgh.a((java.lang.Object) r13, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03d8, code lost:
        b(r13, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008e, code lost:
        b(r13, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00dc, code lost:
        r3 = defpackage.dfl.a(r6, r9, r3, (defpackage.dgb) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0208, code lost:
        r14.q(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0216, code lost:
        r14.p(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0224, code lost:
        r14.o(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0232, code lost:
        r14.n(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0246, code lost:
        r3 = defpackage.dfl.a(r6, r8, r7, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0255, code lost:
        r14.l(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0263, code lost:
        r14.h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0271, code lost:
        r14.g(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x027f, code lost:
        r14.f(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x028d, code lost:
        r14.e(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r13, defpackage.dfi r14, defpackage.dde r15) {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x051b
            dgb<?, ?> r0 = r12.q
            ddg<?> r1 = r12.r
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x0009:
            r5 = 0
            int r6 = r14.a()     // Catch:{ all -> 0x0504 }
            int r7 = r12.f(r6)     // Catch:{ all -> 0x0504 }
            if (r7 >= 0) goto L_0x006a
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r7) goto L_0x002f
            int[] r14 = r12.m
            if (r14 == 0) goto L_0x0029
            int r15 = r14.length
        L_0x001e:
            if (r5 >= r15) goto L_0x0029
            r1 = r14[r5]
            java.lang.Object r3 = r12.a(r13, r1, (UB) r3, r0)
            int r5 = r5 + 1
            goto L_0x001e
        L_0x0029:
            if (r3 == 0) goto L_0x002e
            r0.b(r13, r3)
        L_0x002e:
            return
        L_0x002f:
            boolean r7 = r12.h     // Catch:{ all -> 0x0504 }
            if (r7 != 0) goto L_0x0035
            r6 = r2
            goto L_0x003b
        L_0x0035:
            deq r7 = r12.g     // Catch:{ all -> 0x0504 }
            java.lang.Object r6 = r1.a(r15, r7, r6)     // Catch:{ all -> 0x0504 }
        L_0x003b:
            if (r6 == 0) goto L_0x0048
            if (r4 != 0) goto L_0x0043
            ddj r4 = r1.b(r13)     // Catch:{ all -> 0x0504 }
        L_0x0043:
            java.lang.Object r3 = r1.a()     // Catch:{ all -> 0x0504 }
            goto L_0x0009
        L_0x0048:
            if (r3 != 0) goto L_0x004e
            java.lang.Object r3 = r0.c(r13)     // Catch:{ all -> 0x0504 }
        L_0x004e:
            boolean r6 = r0.a(r3, r14)     // Catch:{ all -> 0x0504 }
            if (r6 != 0) goto L_0x0009
            int[] r14 = r12.m
            if (r14 == 0) goto L_0x0064
            int r15 = r14.length
        L_0x0059:
            if (r5 >= r15) goto L_0x0064
            r1 = r14[r5]
            java.lang.Object r3 = r12.a(r13, r1, (UB) r3, r0)
            int r5 = r5 + 1
            goto L_0x0059
        L_0x0064:
            if (r3 == 0) goto L_0x0069
            r0.b(r13, r3)
        L_0x0069:
            return
        L_0x006a:
            int r8 = r12.c(r7)     // Catch:{ all -> 0x0504 }
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = r9 & r8
            int r9 = r9 >>> 20
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r9) {
                case 0: goto L_0x04ba;
                case 1: goto L_0x04ae;
                case 2: goto L_0x04a2;
                case 3: goto L_0x0496;
                case 4: goto L_0x048a;
                case 5: goto L_0x047e;
                case 6: goto L_0x0472;
                case 7: goto L_0x0466;
                case 8: goto L_0x0461;
                case 9: goto L_0x0436;
                case 10: goto L_0x042b;
                case 11: goto L_0x0420;
                case 12: goto L_0x0409;
                case 13: goto L_0x03fe;
                case 14: goto L_0x03f3;
                case 15: goto L_0x03e8;
                case 16: goto L_0x03dd;
                case 17: goto L_0x03ac;
                case 18: goto L_0x03a1;
                case 19: goto L_0x0396;
                case 20: goto L_0x038b;
                case 21: goto L_0x0380;
                case 22: goto L_0x0375;
                case 23: goto L_0x036a;
                case 24: goto L_0x035f;
                case 25: goto L_0x0354;
                case 26: goto L_0x0332;
                case 27: goto L_0x0320;
                case 28: goto L_0x0312;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02eb;
                case 32: goto L_0x02e0;
                case 33: goto L_0x02d5;
                case 34: goto L_0x02ca;
                case 35: goto L_0x02bc;
                case 36: goto L_0x02ae;
                case 37: goto L_0x02a0;
                case 38: goto L_0x0292;
                case 39: goto L_0x0284;
                case 40: goto L_0x0276;
                case 41: goto L_0x0268;
                case 42: goto L_0x025a;
                case 43: goto L_0x024c;
                case 44: goto L_0x0237;
                case 45: goto L_0x0229;
                case 46: goto L_0x021b;
                case 47: goto L_0x020d;
                case 48: goto L_0x01ff;
                case 49: goto L_0x01ed;
                case 50: goto L_0x01af;
                case 51: goto L_0x01a0;
                case 52: goto L_0x0191;
                case 53: goto L_0x0182;
                case 54: goto L_0x0173;
                case 55: goto L_0x0164;
                case 56: goto L_0x0155;
                case 57: goto L_0x0146;
                case 58: goto L_0x0137;
                case 59: goto L_0x0132;
                case 60: goto L_0x0104;
                case 61: goto L_0x00fa;
                case 62: goto L_0x00ec;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x0079;
            }
        L_0x0079:
            if (r3 != 0) goto L_0x04c6
            java.lang.Object r3 = r0.a()     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x04c6
        L_0x0081:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            dfj r10 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r10 = r14.b(r10, r15)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x008e:
            r12.b((T) r13, r6, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0093:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.t()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00a1:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            int r10 = r14.s()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00af:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.r()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00bd:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            int r10 = r14.q()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00cb:
            int r9 = r14.p()     // Catch:{ zzbbv -> 0x04e2 }
            ddt r11 = r12.b(r7)     // Catch:{ zzbbv -> 0x04e2 }
            if (r11 == 0) goto L_0x00e2
            dds r11 = r11.a(r9)     // Catch:{ zzbbv -> 0x04e2 }
            if (r11 == 0) goto L_0x00dc
            goto L_0x00e2
        L_0x00dc:
            java.lang.Object r3 = defpackage.dfl.a(r6, r9, r3, r0)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x00e2:
            r8 = r8 & r10
            long r10 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r10, r8)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00ec:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            int r10 = r14.o()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x00fa:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            com.google.android.gms.internal.ads.zzbah r10 = r14.n()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0104:
            boolean r9 = r12.a((T) r13, r6, r7)     // Catch:{ zzbbv -> 0x04e2 }
            r8 = r8 & r10
            if (r9 == 0) goto L_0x0121
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r10 = defpackage.dgh.f(r13, r8)     // Catch:{ zzbbv -> 0x04e2 }
            dfj r11 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r11 = r14.a(r11, r15)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r10 = defpackage.ddr.a(r10, r11)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0121:
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            dfj r10 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r10 = r14.a(r10, r15)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            r12.b((T) r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0132:
            r12.a(r13, r8, r14)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0137:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            boolean r10 = r14.k()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0146:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            int r10 = r14.j()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0155:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.i()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0164:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            int r10 = r14.h()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0173:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.f()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0182:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.g()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x0191:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            float r10 = r14.e()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Float r10 = java.lang.Float.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x01a0:
            r8 = r8 & r10
            long r8 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            double r10 = r14.d()     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x008e
        L_0x01af:
            int r6 = r12.c(r7)     // Catch:{ zzbbv -> 0x04e2 }
            r6 = r6 & r10
            long r6 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r8 = defpackage.dgh.f(r13, r6)     // Catch:{ zzbbv -> 0x04e2 }
            if (r8 != 0) goto L_0x01c5
            del r8 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r8 = r8.a()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r6, r8)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x01dc
        L_0x01c5:
            del r9 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            boolean r9 = r9.c(r8)     // Catch:{ zzbbv -> 0x04e2 }
            if (r9 == 0) goto L_0x01dc
            del r9 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r9 = r9.a()     // Catch:{ zzbbv -> 0x04e2 }
            del r10 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            r10.a(r9, r8)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r6, r9)     // Catch:{ zzbbv -> 0x04e2 }
            r8 = r9
        L_0x01dc:
            del r6 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            java.util.Map r6 = r6.a(r8)     // Catch:{ zzbbv -> 0x04e2 }
            del r7 = r12.s     // Catch:{ zzbbv -> 0x04e2 }
            dek r7 = r7.b()     // Catch:{ zzbbv -> 0x04e2 }
            r14.a(r6, r7, r15)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x01ed:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            dfj r6 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            dec r7 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r7 = r7.a(r13, r8)     // Catch:{ zzbbv -> 0x04e2 }
            r14.b(r7, r6, r15)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x01ff:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0208:
            r14.q(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x020d:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0216:
            r14.p(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x021b:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0224:
            r14.o(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0229:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0232:
            r14.n(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0237:
            dec r9 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r8 = r8 & r10
            long r10 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r8 = r9.a(r13, r10)     // Catch:{ zzbbv -> 0x04e2 }
            r14.m(r8)     // Catch:{ zzbbv -> 0x04e2 }
            ddt r7 = r12.b(r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0246:
            java.lang.Object r3 = defpackage.dfl.a(r6, r8, r7, r3, r0)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x024c:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0255:
            r14.l(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x025a:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0263:
            r14.h(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0268:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x0271:
            r14.g(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0276:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x027f:
            r14.f(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0284:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x028d:
            r14.e(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0292:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x029b:
            r14.c(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x02a0:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x02a9:
            r14.d(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x02ae:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x02b7:
            r14.b(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x02bc:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x02c5:
            r14.a(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x02ca:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0208
        L_0x02d5:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0216
        L_0x02e0:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0224
        L_0x02eb:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0232
        L_0x02f6:
            dec r9 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r8 = r8 & r10
            long r10 = (long) r8     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r8 = r9.a(r13, r10)     // Catch:{ zzbbv -> 0x04e2 }
            r14.m(r8)     // Catch:{ zzbbv -> 0x04e2 }
            ddt r7 = r12.b(r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0246
        L_0x0307:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0255
        L_0x0312:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            r14.k(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0320:
            dfj r6 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            dec r9 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r7 = r9.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            r14.a(r7, r6, r15)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0332:
            boolean r6 = e(r8)     // Catch:{ zzbbv -> 0x04e2 }
            if (r6 == 0) goto L_0x0346
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            r14.j(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0346:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            r14.i(r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x0354:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0263
        L_0x035f:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0271
        L_0x036a:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x027f
        L_0x0375:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x028d
        L_0x0380:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x029b
        L_0x038b:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x02a9
        L_0x0396:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x02b7
        L_0x03a1:
            dec r6 = r12.p     // Catch:{ zzbbv -> 0x04e2 }
            r7 = r8 & r10
            long r7 = (long) r7     // Catch:{ zzbbv -> 0x04e2 }
            java.util.List r6 = r6.a(r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x02c5
        L_0x03ac:
            boolean r6 = r12.a((T) r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            if (r6 == 0) goto L_0x03ca
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = defpackage.dgh.f(r13, r8)     // Catch:{ zzbbv -> 0x04e2 }
            dfj r7 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r7 = r14.b(r7, r15)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = defpackage.ddr.a(r6, r7)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x03c5:
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x03ca:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            dfj r6 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = r14.b(r6, r15)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
        L_0x03d8:
            r12.b((T) r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x0009
        L_0x03dd:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.t()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x03e8:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            int r6 = r14.s()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x03f3:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.r()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x03fe:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            int r6 = r14.q()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0409:
            int r9 = r14.p()     // Catch:{ zzbbv -> 0x04e2 }
            ddt r11 = r12.b(r7)     // Catch:{ zzbbv -> 0x04e2 }
            if (r11 == 0) goto L_0x0419
            dds r11 = r11.a(r9)     // Catch:{ zzbbv -> 0x04e2 }
            if (r11 == 0) goto L_0x00dc
        L_0x0419:
            r6 = r8 & r10
            long r10 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r10, r9)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0420:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            int r6 = r14.o()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x042b:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            com.google.android.gms.internal.ads.zzbah r6 = r14.n()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0436:
            boolean r6 = r12.a((T) r13, r7)     // Catch:{ zzbbv -> 0x04e2 }
            if (r6 == 0) goto L_0x0451
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = defpackage.dgh.f(r13, r8)     // Catch:{ zzbbv -> 0x04e2 }
            dfj r7 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r7 = r14.a(r7, r15)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = defpackage.ddr.a(r6, r7)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03c5
        L_0x0451:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            dfj r6 = r12.a(r7)     // Catch:{ zzbbv -> 0x04e2 }
            java.lang.Object r6 = r14.a(r6, r15)     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0461:
            r12.a(r13, r8, r14)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0466:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            boolean r6 = r14.k()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0472:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            int r6 = r14.j()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x047e:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.i()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x048a:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            int r6 = r14.h()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x0496:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.f()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x04a2:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            long r10 = r14.g()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x04ae:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            float r6 = r14.e()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r6)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x04ba:
            r6 = r8 & r10
            long r8 = (long) r6     // Catch:{ zzbbv -> 0x04e2 }
            double r10 = r14.d()     // Catch:{ zzbbv -> 0x04e2 }
            defpackage.dgh.a(r13, r8, r10)     // Catch:{ zzbbv -> 0x04e2 }
            goto L_0x03d8
        L_0x04c6:
            boolean r6 = r0.a(r3, r14)     // Catch:{ zzbbv -> 0x04e2 }
            if (r6 != 0) goto L_0x0009
            int[] r14 = r12.m
            if (r14 == 0) goto L_0x04dc
            int r15 = r14.length
        L_0x04d1:
            if (r5 >= r15) goto L_0x04dc
            r1 = r14[r5]
            java.lang.Object r3 = r12.a(r13, r1, (UB) r3, r0)
            int r5 = r5 + 1
            goto L_0x04d1
        L_0x04dc:
            if (r3 == 0) goto L_0x04e1
            r0.b(r13, r3)
        L_0x04e1:
            return
        L_0x04e2:
            if (r3 != 0) goto L_0x04e8
            java.lang.Object r3 = r0.c(r13)     // Catch:{ all -> 0x0504 }
        L_0x04e8:
            boolean r6 = r0.a(r3, r14)     // Catch:{ all -> 0x0504 }
            if (r6 != 0) goto L_0x0009
            int[] r14 = r12.m
            if (r14 == 0) goto L_0x04fe
            int r15 = r14.length
        L_0x04f3:
            if (r5 >= r15) goto L_0x04fe
            r1 = r14[r5]
            java.lang.Object r3 = r12.a(r13, r1, (UB) r3, r0)
            int r5 = r5 + 1
            goto L_0x04f3
        L_0x04fe:
            if (r3 == 0) goto L_0x0503
            r0.b(r13, r3)
        L_0x0503:
            return
        L_0x0504:
            r14 = move-exception
            int[] r15 = r12.m
            if (r15 == 0) goto L_0x0515
            int r1 = r15.length
        L_0x050a:
            if (r5 >= r1) goto L_0x0515
            r2 = r15[r5]
            java.lang.Object r3 = r12.a(r13, r2, (UB) r3, r0)
            int r5 = r5 + 1
            goto L_0x050a
        L_0x0515:
            if (r3 == 0) goto L_0x051a
            r0.b(r13, r3)
        L_0x051a:
            throw r14
        L_0x051b:
            java.lang.NullPointerException r13 = new java.lang.NullPointerException
            r13.<init>()
            goto L_0x0522
        L_0x0521:
            throw r13
        L_0x0522:
            goto L_0x0521
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, dfi, dde):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a2, code lost:
        r15.b(r9, defpackage.dgh.f(r14, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03bd, code lost:
        r15.e(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03ce, code lost:
        r15.f(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03df, code lost:
        r15.b(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03f0, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0401, code lost:
        r15.b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0412, code lost:
        r15.e(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x041d, code lost:
        r15.a(r9, (com.google.android.gms.internal.ads.zzbah) defpackage.dgh.f(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0430, code lost:
        r15.a(r9, defpackage.dgh.f(r14, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0445, code lost:
        a(r9, defpackage.dgh.f(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x045c, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x046d, code lost:
        r15.d(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x047d, code lost:
        r15.d(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x048d, code lost:
        r15.c(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x049d, code lost:
        r15.c(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04ad, code lost:
        r15.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04bd, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04cd, code lost:
        r15.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0862, code lost:
        r15.b(r10, defpackage.dgh.f(r14, (long) (r9 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x087d, code lost:
        r15.e(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x088e, code lost:
        r15.f(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x089f, code lost:
        r15.b(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08b0, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08c1, code lost:
        r15.b(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x08d2, code lost:
        r15.e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x08dd, code lost:
        r15.a(r10, (com.google.android.gms.internal.ads.zzbah) defpackage.dgh.f(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x08f0, code lost:
        r15.a(r10, defpackage.dgh.f(r14, (long) (r9 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0905, code lost:
        a(r10, defpackage.dgh.f(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x091c, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x092d, code lost:
        r15.d(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x093d, code lost:
        r15.d(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x094d, code lost:
        r15.c(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x095d, code lost:
        r15.c(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x096d, code lost:
        r15.a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x097d, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x098d, code lost:
        r15.a(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0516  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0996  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r14, defpackage.dgn r15) {
        /*
            r13 = this;
            int r0 = r15.a()
            int r1 = defpackage.ddp.e.k
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04ec
            dgb<?, ?> r0 = r13.q
            a(r0, (T) r14, r15)
            boolean r0 = r13.h
            if (r0 == 0) goto L_0x004d
            ddg<?> r0 = r13.r
            ddj r0 = r0.a(r14)
            dfm<FieldDescriptorType, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x004d
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x003c
            ddy r1 = new ddy
            dfm<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            r0 = r1
            goto L_0x0046
        L_0x003c:
            dfm<FieldDescriptorType, java.lang.Object> r0 = r0.a
            java.util.Set r0 = r0.d()
            java.util.Iterator r0 = r0.iterator()
        L_0x0046:
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x004f
        L_0x004d:
            r0 = r3
            r1 = r0
        L_0x004f:
            int[] r7 = r13.b
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0054:
            if (r7 < 0) goto L_0x04d4
            int r8 = r13.c(r7)
            int[] r9 = r13.b
            r9 = r9[r7]
        L_0x005e:
            if (r1 == 0) goto L_0x007c
            ddg<?> r10 = r13.r
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x007c
            ddg<?> r10 = r13.r
            r10.b(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x007a
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x005e
        L_0x007a:
            r1 = r3
            goto L_0x005e
        L_0x007c:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04c1;
                case 1: goto L_0x04b1;
                case 2: goto L_0x04a1;
                case 3: goto L_0x0491;
                case 4: goto L_0x0481;
                case 5: goto L_0x0471;
                case 6: goto L_0x0461;
                case 7: goto L_0x0450;
                case 8: goto L_0x043f;
                case 9: goto L_0x042a;
                case 10: goto L_0x0417;
                case 11: goto L_0x0406;
                case 12: goto L_0x03f5;
                case 13: goto L_0x03e4;
                case 14: goto L_0x03d3;
                case 15: goto L_0x03c2;
                case 16: goto L_0x03b1;
                case 17: goto L_0x039c;
                case 18: goto L_0x038b;
                case 19: goto L_0x037a;
                case 20: goto L_0x0369;
                case 21: goto L_0x0358;
                case 22: goto L_0x0347;
                case 23: goto L_0x0336;
                case 24: goto L_0x0325;
                case 25: goto L_0x0314;
                case 26: goto L_0x0303;
                case 27: goto L_0x02ee;
                case 28: goto L_0x02dd;
                case 29: goto L_0x02cc;
                case 30: goto L_0x02bb;
                case 31: goto L_0x02aa;
                case 32: goto L_0x0299;
                case 33: goto L_0x0288;
                case 34: goto L_0x0277;
                case 35: goto L_0x0266;
                case 36: goto L_0x0255;
                case 37: goto L_0x0244;
                case 38: goto L_0x0233;
                case 39: goto L_0x0222;
                case 40: goto L_0x0211;
                case 41: goto L_0x0200;
                case 42: goto L_0x01ef;
                case 43: goto L_0x01de;
                case 44: goto L_0x01cd;
                case 45: goto L_0x01bc;
                case 46: goto L_0x01ab;
                case 47: goto L_0x019a;
                case 48: goto L_0x0189;
                case 49: goto L_0x0174;
                case 50: goto L_0x0169;
                case 51: goto L_0x015b;
                case 52: goto L_0x014d;
                case 53: goto L_0x013f;
                case 54: goto L_0x0131;
                case 55: goto L_0x0123;
                case 56: goto L_0x0115;
                case 57: goto L_0x0107;
                case 58: goto L_0x00f9;
                case 59: goto L_0x00f1;
                case 60: goto L_0x00e9;
                case 61: goto L_0x00e1;
                case 62: goto L_0x00d3;
                case 63: goto L_0x00c5;
                case 64: goto L_0x00b7;
                case 65: goto L_0x00a9;
                case 66: goto L_0x009b;
                case 67: goto L_0x008d;
                case 68: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x04d0
        L_0x0085:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            goto L_0x03a2
        L_0x008d:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            goto L_0x03bd
        L_0x009b:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x03ce
        L_0x00a9:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            goto L_0x03df
        L_0x00b7:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x03f0
        L_0x00c5:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x0401
        L_0x00d3:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x0412
        L_0x00e1:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            goto L_0x041d
        L_0x00e9:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            goto L_0x0430
        L_0x00f1:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            goto L_0x0445
        L_0x00f9:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = f(r14, r10)
            goto L_0x045c
        L_0x0107:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x046d
        L_0x0115:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            goto L_0x047d
        L_0x0123:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = d(r14, r10)
            goto L_0x048d
        L_0x0131:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            goto L_0x049d
        L_0x013f:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = e(r14, r10)
            goto L_0x04ad
        L_0x014d:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = c(r14, r10)
            goto L_0x04bd
        L_0x015b:
            boolean r10 = r13.a((T) r14, r9, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = b((T) r14, r10)
            goto L_0x04cd
        L_0x0169:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            r13.a(r15, r9, r8, r7)
            goto L_0x04d0
        L_0x0174:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            dfj r10 = r13.a(r7)
            defpackage.dfl.b(r9, r8, r15, r10)
            goto L_0x04d0
        L_0x0189:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.e(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x019a:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.j(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x01ab:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.g(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x01bc:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.l(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x01cd:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.m(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x01de:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.i(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x01ef:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.n(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0200:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.k(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0211:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.f(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0222:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.h(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0233:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.d(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0244:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.c(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0255:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.b(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0266:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.a(r9, r8, r15, r4)
            goto L_0x04d0
        L_0x0277:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.e(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0288:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.j(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0299:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.g(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x02aa:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.l(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x02bb:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.m(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x02cc:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.i(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x02dd:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.b(r9, r8, r15)
            goto L_0x04d0
        L_0x02ee:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            dfj r10 = r13.a(r7)
            defpackage.dfl.a(r9, r8, r15, r10)
            goto L_0x04d0
        L_0x0303:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.a(r9, r8, r15)
            goto L_0x04d0
        L_0x0314:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.n(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0325:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.k(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0336:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.f(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0347:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.h(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0358:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.d(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x0369:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.c(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x037a:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.b(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x038b:
            int[] r9 = r13.b
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            java.util.List r8 = (java.util.List) r8
            defpackage.dfl.a(r9, r8, r15, r5)
            goto L_0x04d0
        L_0x039c:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
        L_0x03a2:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            dfj r10 = r13.a(r7)
            r15.b(r9, r8, r10)
            goto L_0x04d0
        L_0x03b1:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.dgh.b(r14, r10)
        L_0x03bd:
            r15.e(r9, r10)
            goto L_0x04d0
        L_0x03c2:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x03ce:
            r15.f(r9, r8)
            goto L_0x04d0
        L_0x03d3:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.dgh.b(r14, r10)
        L_0x03df:
            r15.b(r9, r10)
            goto L_0x04d0
        L_0x03e4:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x03f0:
            r15.a(r9, r8)
            goto L_0x04d0
        L_0x03f5:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x0401:
            r15.b(r9, r8)
            goto L_0x04d0
        L_0x0406:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x0412:
            r15.e(r9, r8)
            goto L_0x04d0
        L_0x0417:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
        L_0x041d:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            com.google.android.gms.internal.ads.zzbah r8 = (com.google.android.gms.internal.ads.zzbah) r8
            r15.a(r9, r8)
            goto L_0x04d0
        L_0x042a:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
        L_0x0430:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            dfj r10 = r13.a(r7)
            r15.a(r9, r8, r10)
            goto L_0x04d0
        L_0x043f:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
        L_0x0445:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = defpackage.dgh.f(r14, r10)
            a(r9, r8, r15)
            goto L_0x04d0
        L_0x0450:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = defpackage.dgh.c(r14, r10)
        L_0x045c:
            r15.a(r9, r8)
            goto L_0x04d0
        L_0x0461:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x046d:
            r15.d(r9, r8)
            goto L_0x04d0
        L_0x0471:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.dgh.b(r14, r10)
        L_0x047d:
            r15.d(r9, r10)
            goto L_0x04d0
        L_0x0481:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = defpackage.dgh.a(r14, r10)
        L_0x048d:
            r15.c(r9, r8)
            goto L_0x04d0
        L_0x0491:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.dgh.b(r14, r10)
        L_0x049d:
            r15.c(r9, r10)
            goto L_0x04d0
        L_0x04a1:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = defpackage.dgh.b(r14, r10)
        L_0x04ad:
            r15.a(r9, r10)
            goto L_0x04d0
        L_0x04b1:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = defpackage.dgh.d(r14, r10)
        L_0x04bd:
            r15.a(r9, r8)
            goto L_0x04d0
        L_0x04c1:
            boolean r10 = r13.a((T) r14, r7)
            if (r10 == 0) goto L_0x04d0
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = defpackage.dgh.e(r14, r10)
        L_0x04cd:
            r15.a(r9, r10)
        L_0x04d0:
            int r7 = r7 + -4
            goto L_0x0054
        L_0x04d4:
            if (r1 == 0) goto L_0x04eb
            ddg<?> r14 = r13.r
            r14.b(r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04e9
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04d4
        L_0x04e9:
            r1 = r3
            goto L_0x04d4
        L_0x04eb:
            return
        L_0x04ec:
            boolean r0 = r13.j
            if (r0 == 0) goto L_0x09b1
            boolean r0 = r13.h
            if (r0 == 0) goto L_0x050d
            ddg<?> r0 = r13.r
            ddj r0 = r0.a(r14)
            dfm<FieldDescriptorType, java.lang.Object> r1 = r0.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x050d
            java.util.Iterator r0 = r0.c()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x050f
        L_0x050d:
            r0 = r3
            r1 = r0
        L_0x050f:
            int[] r7 = r13.b
            int r7 = r7.length
            r8 = r1
            r1 = 0
        L_0x0514:
            if (r1 >= r7) goto L_0x0994
            int r9 = r13.c(r1)
            int[] r10 = r13.b
            r10 = r10[r1]
        L_0x051e:
            if (r8 == 0) goto L_0x053c
            ddg<?> r11 = r13.r
            int r11 = r11.a(r8)
            if (r11 > r10) goto L_0x053c
            ddg<?> r11 = r13.r
            r11.b(r8)
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x053a
            java.lang.Object r8 = r0.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            goto L_0x051e
        L_0x053a:
            r8 = r3
            goto L_0x051e
        L_0x053c:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0981;
                case 1: goto L_0x0971;
                case 2: goto L_0x0961;
                case 3: goto L_0x0951;
                case 4: goto L_0x0941;
                case 5: goto L_0x0931;
                case 6: goto L_0x0921;
                case 7: goto L_0x0910;
                case 8: goto L_0x08ff;
                case 9: goto L_0x08ea;
                case 10: goto L_0x08d7;
                case 11: goto L_0x08c6;
                case 12: goto L_0x08b5;
                case 13: goto L_0x08a4;
                case 14: goto L_0x0893;
                case 15: goto L_0x0882;
                case 16: goto L_0x0871;
                case 17: goto L_0x085c;
                case 18: goto L_0x084b;
                case 19: goto L_0x083a;
                case 20: goto L_0x0829;
                case 21: goto L_0x0818;
                case 22: goto L_0x0807;
                case 23: goto L_0x07f6;
                case 24: goto L_0x07e5;
                case 25: goto L_0x07d4;
                case 26: goto L_0x07c3;
                case 27: goto L_0x07ae;
                case 28: goto L_0x079d;
                case 29: goto L_0x078c;
                case 30: goto L_0x077b;
                case 31: goto L_0x076a;
                case 32: goto L_0x0759;
                case 33: goto L_0x0748;
                case 34: goto L_0x0737;
                case 35: goto L_0x0726;
                case 36: goto L_0x0715;
                case 37: goto L_0x0704;
                case 38: goto L_0x06f3;
                case 39: goto L_0x06e2;
                case 40: goto L_0x06d1;
                case 41: goto L_0x06c0;
                case 42: goto L_0x06af;
                case 43: goto L_0x069e;
                case 44: goto L_0x068d;
                case 45: goto L_0x067c;
                case 46: goto L_0x066b;
                case 47: goto L_0x065a;
                case 48: goto L_0x0649;
                case 49: goto L_0x0634;
                case 50: goto L_0x0629;
                case 51: goto L_0x061b;
                case 52: goto L_0x060d;
                case 53: goto L_0x05ff;
                case 54: goto L_0x05f1;
                case 55: goto L_0x05e3;
                case 56: goto L_0x05d5;
                case 57: goto L_0x05c7;
                case 58: goto L_0x05b9;
                case 59: goto L_0x05b1;
                case 60: goto L_0x05a9;
                case 61: goto L_0x05a1;
                case 62: goto L_0x0593;
                case 63: goto L_0x0585;
                case 64: goto L_0x0577;
                case 65: goto L_0x0569;
                case 66: goto L_0x055b;
                case 67: goto L_0x054d;
                case 68: goto L_0x0545;
                default: goto L_0x0543;
            }
        L_0x0543:
            goto L_0x0990
        L_0x0545:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            goto L_0x0862
        L_0x054d:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            goto L_0x087d
        L_0x055b:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x088e
        L_0x0569:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            goto L_0x089f
        L_0x0577:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x08b0
        L_0x0585:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x08c1
        L_0x0593:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x08d2
        L_0x05a1:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            goto L_0x08dd
        L_0x05a9:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            goto L_0x08f0
        L_0x05b1:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            goto L_0x0905
        L_0x05b9:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = f(r14, r11)
            goto L_0x091c
        L_0x05c7:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x092d
        L_0x05d5:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            goto L_0x093d
        L_0x05e3:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = d(r14, r11)
            goto L_0x094d
        L_0x05f1:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            goto L_0x095d
        L_0x05ff:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = e(r14, r11)
            goto L_0x096d
        L_0x060d:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = c(r14, r11)
            goto L_0x097d
        L_0x061b:
            boolean r11 = r13.a((T) r14, r10, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = b((T) r14, r11)
            goto L_0x098d
        L_0x0629:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            r13.a(r15, r10, r9, r1)
            goto L_0x0990
        L_0x0634:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            dfj r11 = r13.a(r1)
            defpackage.dfl.b(r10, r9, r15, r11)
            goto L_0x0990
        L_0x0649:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.e(r10, r9, r15, r4)
            goto L_0x0990
        L_0x065a:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.j(r10, r9, r15, r4)
            goto L_0x0990
        L_0x066b:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.g(r10, r9, r15, r4)
            goto L_0x0990
        L_0x067c:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.l(r10, r9, r15, r4)
            goto L_0x0990
        L_0x068d:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.m(r10, r9, r15, r4)
            goto L_0x0990
        L_0x069e:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.i(r10, r9, r15, r4)
            goto L_0x0990
        L_0x06af:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.n(r10, r9, r15, r4)
            goto L_0x0990
        L_0x06c0:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.k(r10, r9, r15, r4)
            goto L_0x0990
        L_0x06d1:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.f(r10, r9, r15, r4)
            goto L_0x0990
        L_0x06e2:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.h(r10, r9, r15, r4)
            goto L_0x0990
        L_0x06f3:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.d(r10, r9, r15, r4)
            goto L_0x0990
        L_0x0704:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.c(r10, r9, r15, r4)
            goto L_0x0990
        L_0x0715:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r10, r9, r15, r4)
            goto L_0x0990
        L_0x0726:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r10, r9, r15, r4)
            goto L_0x0990
        L_0x0737:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.e(r10, r9, r15, r5)
            goto L_0x0990
        L_0x0748:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.j(r10, r9, r15, r5)
            goto L_0x0990
        L_0x0759:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.g(r10, r9, r15, r5)
            goto L_0x0990
        L_0x076a:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.l(r10, r9, r15, r5)
            goto L_0x0990
        L_0x077b:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.m(r10, r9, r15, r5)
            goto L_0x0990
        L_0x078c:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.i(r10, r9, r15, r5)
            goto L_0x0990
        L_0x079d:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r10, r9, r15)
            goto L_0x0990
        L_0x07ae:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            dfj r11 = r13.a(r1)
            defpackage.dfl.a(r10, r9, r15, r11)
            goto L_0x0990
        L_0x07c3:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r10, r9, r15)
            goto L_0x0990
        L_0x07d4:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.n(r10, r9, r15, r5)
            goto L_0x0990
        L_0x07e5:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.k(r10, r9, r15, r5)
            goto L_0x0990
        L_0x07f6:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.f(r10, r9, r15, r5)
            goto L_0x0990
        L_0x0807:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.h(r10, r9, r15, r5)
            goto L_0x0990
        L_0x0818:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.d(r10, r9, r15, r5)
            goto L_0x0990
        L_0x0829:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.c(r10, r9, r15, r5)
            goto L_0x0990
        L_0x083a:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.b(r10, r9, r15, r5)
            goto L_0x0990
        L_0x084b:
            int[] r10 = r13.b
            r10 = r10[r1]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            java.util.List r9 = (java.util.List) r9
            defpackage.dfl.a(r10, r9, r15, r5)
            goto L_0x0990
        L_0x085c:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
        L_0x0862:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            dfj r11 = r13.a(r1)
            r15.b(r10, r9, r11)
            goto L_0x0990
        L_0x0871:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.dgh.b(r14, r11)
        L_0x087d:
            r15.e(r10, r11)
            goto L_0x0990
        L_0x0882:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x088e:
            r15.f(r10, r9)
            goto L_0x0990
        L_0x0893:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.dgh.b(r14, r11)
        L_0x089f:
            r15.b(r10, r11)
            goto L_0x0990
        L_0x08a4:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x08b0:
            r15.a(r10, r9)
            goto L_0x0990
        L_0x08b5:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x08c1:
            r15.b(r10, r9)
            goto L_0x0990
        L_0x08c6:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x08d2:
            r15.e(r10, r9)
            goto L_0x0990
        L_0x08d7:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
        L_0x08dd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            com.google.android.gms.internal.ads.zzbah r9 = (com.google.android.gms.internal.ads.zzbah) r9
            r15.a(r10, r9)
            goto L_0x0990
        L_0x08ea:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
        L_0x08f0:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            dfj r11 = r13.a(r1)
            r15.a(r10, r9, r11)
            goto L_0x0990
        L_0x08ff:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
        L_0x0905:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = defpackage.dgh.f(r14, r11)
            a(r10, r9, r15)
            goto L_0x0990
        L_0x0910:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = defpackage.dgh.c(r14, r11)
        L_0x091c:
            r15.a(r10, r9)
            goto L_0x0990
        L_0x0921:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x092d:
            r15.d(r10, r9)
            goto L_0x0990
        L_0x0931:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.dgh.b(r14, r11)
        L_0x093d:
            r15.d(r10, r11)
            goto L_0x0990
        L_0x0941:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = defpackage.dgh.a(r14, r11)
        L_0x094d:
            r15.c(r10, r9)
            goto L_0x0990
        L_0x0951:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.dgh.b(r14, r11)
        L_0x095d:
            r15.c(r10, r11)
            goto L_0x0990
        L_0x0961:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = defpackage.dgh.b(r14, r11)
        L_0x096d:
            r15.a(r10, r11)
            goto L_0x0990
        L_0x0971:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = defpackage.dgh.d(r14, r11)
        L_0x097d:
            r15.a(r10, r9)
            goto L_0x0990
        L_0x0981:
            boolean r11 = r13.a((T) r14, r1)
            if (r11 == 0) goto L_0x0990
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = defpackage.dgh.e(r14, r11)
        L_0x098d:
            r15.a(r10, r11)
        L_0x0990:
            int r1 = r1 + 4
            goto L_0x0514
        L_0x0994:
            if (r8 == 0) goto L_0x09ab
            ddg<?> r1 = r13.r
            r1.b(r8)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x09a9
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r8 = r1
            goto L_0x0994
        L_0x09a9:
            r8 = r3
            goto L_0x0994
        L_0x09ab:
            dgb<?, ?> r0 = r13.q
            a(r0, (T) r14, r15)
            return
        L_0x09b1:
            r13.b((T) r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, dgn):void");
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r16v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v8, types: [int] */
    /* JADX WARNING: type inference failed for: r1v2, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r1v25, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = defpackage.dcm.a(r12, r10, r11);
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0188, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        if (r0 == r15) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r24v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
      assigns: []
      uses: []
      mth insns count: 200
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r23, byte[] r24, int r25, int r26, defpackage.dcn r27) {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.j
            if (r0 == 0) goto L_0x01ce
            sun.misc.Unsafe r9 = a
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c5
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = defpackage.dcm.a(r0, r12, r1, r11)
            int r1 = r11.a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.f(r6)
            if (r8 < 0) goto L_0x01a5
            int[] r0 = r15.b
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0106
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00f9;
                case 1: goto L_0x00ec;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00ce;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00b7;
                case 7: goto L_0x00a2;
                case 8: goto L_0x0091;
                case 9: goto L_0x0079;
                case 10: goto L_0x006d;
                case 11: goto L_0x00ce;
                case 12: goto L_0x0069;
                case 13: goto L_0x00b7;
                case 14: goto L_0x00c1;
                case 15: goto L_0x005b;
                case 16: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x01a5
        L_0x004d:
            if (r7 != 0) goto L_0x01a5
            int r6 = defpackage.dcm.b(r12, r10, r11)
            long r0 = r11.b
            long r4 = defpackage.dcv.a(r0)
            goto L_0x00e3
        L_0x005b:
            if (r7 != 0) goto L_0x01a5
            int r0 = defpackage.dcm.a(r12, r10, r11)
            int r1 = r11.a
            int r1 = defpackage.dcv.f(r1)
            goto L_0x00d6
        L_0x0069:
            if (r7 != 0) goto L_0x01a5
            goto L_0x00d0
        L_0x006d:
            if (r7 != r1) goto L_0x01a5
            int r0 = defpackage.dcm.e(r12, r10, r11)
        L_0x0073:
            java.lang.Object r1 = r11.c
        L_0x0075:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0079:
            if (r7 != r1) goto L_0x01a5
            dfj r0 = r15.a(r8)
            int r0 = a(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x008a
            goto L_0x0073
        L_0x008a:
            java.lang.Object r4 = r11.c
            java.lang.Object r1 = defpackage.ddr.a(r1, r4)
            goto L_0x0075
        L_0x0091:
            if (r7 != r1) goto L_0x01a5
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x009d
            int r0 = defpackage.dcm.c(r12, r10, r11)
            goto L_0x0073
        L_0x009d:
            int r0 = defpackage.dcm.d(r12, r10, r11)
            goto L_0x0073
        L_0x00a2:
            if (r7 != 0) goto L_0x01a5
            int r0 = defpackage.dcm.b(r12, r10, r11)
            long r4 = r11.b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r6 = 0
        L_0x00b2:
            defpackage.dgh.a(r14, r2, r6)
            goto L_0x0012
        L_0x00b7:
            if (r7 != r0) goto L_0x01a5
            int r0 = defpackage.dcm.a(r12, r10)
            r9.putInt(r14, r2, r0)
            goto L_0x00f5
        L_0x00c1:
            if (r7 != r6) goto L_0x01a5
            long r4 = defpackage.dcm.b(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            goto L_0x0102
        L_0x00ce:
            if (r7 != 0) goto L_0x01a5
        L_0x00d0:
            int r0 = defpackage.dcm.a(r12, r10, r11)
            int r1 = r11.a
        L_0x00d6:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x00db:
            if (r7 != 0) goto L_0x01a5
            int r6 = defpackage.dcm.b(r12, r10, r11)
            long r4 = r11.b
        L_0x00e3:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x00ec:
            if (r7 != r0) goto L_0x01a5
            float r0 = defpackage.dcm.d(r12, r10)
            defpackage.dgh.a(r14, r2, r0)
        L_0x00f5:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00f9:
            if (r7 != r6) goto L_0x01a5
            double r0 = defpackage.dcm.c(r12, r10)
            defpackage.dgh.a(r14, r2, r0)
        L_0x0102:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x0106:
            r0 = 27
            if (r4 != r0) goto L_0x013e
            if (r7 != r1) goto L_0x01a5
            java.lang.Object r0 = r9.getObject(r14, r2)
            ddu r0 = (defpackage.ddu) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x012a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0121
            r1 = 10
            goto L_0x0123
        L_0x0121:
            int r1 = r1 << 1
        L_0x0123:
            ddu r0 = r0.a(r1)
            r9.putObject(r14, r2, r0)
        L_0x012a:
            r5 = r0
            dfj r0 = r15.a(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013e:
            r0 = 49
            if (r4 > r0) goto L_0x0167
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x0167:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x018b
            if (r7 != r1) goto L_0x01a8
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r6 = r19
            r8 = r27
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x01b7
            goto L_0x01a3
        L_0x018b:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.a((T) r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x01b7
        L_0x01a3:
            r2 = r0
            goto L_0x01a9
        L_0x01a5:
            r21 = r9
            r15 = r10
        L_0x01a8:
            r2 = r15
        L_0x01a9:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = a(r0, r1, r2, r3, r4, r5)
        L_0x01b7:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x01c5:
            r4 = r13
            if (r0 != r4) goto L_0x01c9
            return
        L_0x01c9:
            com.google.android.gms.internal.ads.zzbbu r0 = com.google.android.gms.internal.ads.zzbbu.g()
            throw r0
        L_0x01ce:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.a((T) r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, byte[], int, int, dcn):void");
    }

    /* JADX INFO: used method not loaded: dfl.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (defpackage.dfl.a(defpackage.dgh.f(r10, r6), defpackage.dgh.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (defpackage.dfl.a(defpackage.dgh.f(r10, r6), defpackage.dgh.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (defpackage.dfl.a(defpackage.dgh.f(r10, r6), defpackage.dgh.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (defpackage.dfl.a(defpackage.dgh.f(r10, r6), defpackage.dgh.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (defpackage.dgh.c(r10, r6) == defpackage.dgh.c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (defpackage.dgh.a((java.lang.Object) r10, r6) == defpackage.dgh.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (defpackage.dgh.b(r10, r6) == defpackage.dgh.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.dfl.a(defpackage.dgh.f(r10, r6), defpackage.dgh.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.b
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01aa
            int r4 = r9.c(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0190;
                case 1: goto L_0x017f;
                case 2: goto L_0x016c;
                case 3: goto L_0x0159;
                case 4: goto L_0x0148;
                case 5: goto L_0x0135;
                case 6: goto L_0x0124;
                case 7: goto L_0x0112;
                case 8: goto L_0x00fc;
                case 9: goto L_0x00e6;
                case 10: goto L_0x00d0;
                case 11: goto L_0x00be;
                case 12: goto L_0x00ac;
                case 13: goto L_0x009a;
                case 14: goto L_0x0086;
                case 15: goto L_0x0074;
                case 16: goto L_0x0060;
                case 17: goto L_0x004a;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x003c;
                case 21: goto L_0x003c;
                case 22: goto L_0x003c;
                case 23: goto L_0x003c;
                case 24: goto L_0x003c;
                case 25: goto L_0x003c;
                case 26: goto L_0x003c;
                case 27: goto L_0x003c;
                case 28: goto L_0x003c;
                case 29: goto L_0x003c;
                case 30: goto L_0x003c;
                case 31: goto L_0x003c;
                case 32: goto L_0x003c;
                case 33: goto L_0x003c;
                case 34: goto L_0x003c;
                case 35: goto L_0x003c;
                case 36: goto L_0x003c;
                case 37: goto L_0x003c;
                case 38: goto L_0x003c;
                case 39: goto L_0x003c;
                case 40: goto L_0x003c;
                case 41: goto L_0x003c;
                case 42: goto L_0x003c;
                case 43: goto L_0x003c;
                case 44: goto L_0x003c;
                case 45: goto L_0x003c;
                case 46: goto L_0x003c;
                case 47: goto L_0x003c;
                case 48: goto L_0x003c;
                case 49: goto L_0x003c;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01a3
        L_0x001c:
            int r4 = r9.d(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = defpackage.dgh.a(r10, r4)
            int r4 = defpackage.dgh.a(r11, r4)
            if (r8 != r4) goto L_0x01a2
            java.lang.Object r4 = defpackage.dgh.f(r10, r6)
            java.lang.Object r5 = defpackage.dgh.f(r11, r6)
            boolean r4 = defpackage.dfl.a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x003c:
            java.lang.Object r3 = defpackage.dgh.f(r10, r6)
            java.lang.Object r4 = defpackage.dgh.f(r11, r6)
            boolean r3 = defpackage.dfl.a(r3, r4)
            goto L_0x01a3
        L_0x004a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = defpackage.dgh.f(r10, r6)
            java.lang.Object r5 = defpackage.dgh.f(r11, r6)
            boolean r4 = defpackage.dfl.a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0060:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x0074:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0086:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x009a:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00ac:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x00be:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x00d0:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = defpackage.dgh.f(r10, r6)
            java.lang.Object r5 = defpackage.dgh.f(r11, r6)
            boolean r4 = defpackage.dfl.a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x00e6:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = defpackage.dgh.f(r10, r6)
            java.lang.Object r5 = defpackage.dgh.f(r11, r6)
            boolean r4 = defpackage.dfl.a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x01a2
        L_0x00fc:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            java.lang.Object r4 = defpackage.dgh.f(r10, r6)
            java.lang.Object r5 = defpackage.dgh.f(r11, r6)
            boolean r4 = defpackage.dfl.a(r4, r5)
            if (r4 != 0) goto L_0x01a3
            goto L_0x018f
        L_0x0112:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            boolean r4 = defpackage.dgh.c(r10, r6)
            boolean r5 = defpackage.dgh.c(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x01a2
        L_0x0124:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0135:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x0148:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
            goto L_0x018f
        L_0x0159:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x01a2
        L_0x016c:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
            goto L_0x018f
        L_0x017f:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            int r4 = defpackage.dgh.a(r10, r6)
            int r5 = defpackage.dgh.a(r11, r6)
            if (r4 == r5) goto L_0x01a3
        L_0x018f:
            goto L_0x01a2
        L_0x0190:
            boolean r4 = r9.c(r10, r11, r2)
            if (r4 == 0) goto L_0x01a2
            long r4 = defpackage.dgh.b(r10, r6)
            long r6 = defpackage.dgh.b(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01a3
        L_0x01a2:
            r3 = 0
        L_0x01a3:
            if (r3 != 0) goto L_0x01a6
            return r1
        L_0x01a6:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01aa:
            dgb<?, ?> r0 = r9.q
            java.lang.Object r0 = r0.b(r10)
            dgb<?, ?> r2 = r9.q
            java.lang.Object r2 = r2.b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bd
            return r1
        L_0x01bd:
            boolean r0 = r9.h
            if (r0 == 0) goto L_0x01d2
            ddg<?> r0 = r9.r
            ddj r10 = r0.a(r10)
            ddg<?> r0 = r9.r
            ddj r11 = r0.a(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.a(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX INFO: used method not loaded: dfl.a(int, java.lang.Object, dfj):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0245, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.c(r7, (defpackage.deq) defpackage.dgh.f(r15, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x025e, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.f(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x026d, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.h(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0278, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0283, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.f(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0292, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.i(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a1, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.g(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02ac, code lost:
        r5 = defpackage.dgh.f(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b0, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.c(r7, (com.google.android.gms.internal.ads.zzbah) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02bd, code lost:
        r5 = defpackage.dfl.a(r7, defpackage.dgh.f(r15, r8), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02d7, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02da, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.b(r7, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e8, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.k(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f4, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.e(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0300, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.g(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0310, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.f(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0320, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.e(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0330, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.d(r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x033c, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.i(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0348, code lost:
        r5 = com.google.android.gms.internal.ads.zzbav.j(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x034e, code lost:
        r3 = r3 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03f7, code lost:
        if ((r8 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x051e, code lost:
        r5 = r5 + ((com.google.android.gms.internal.ads.zzbav.l(r10) + com.google.android.gms.internal.ads.zzbav.n(r8)) + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05c0, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05c7, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.c(r10, (defpackage.deq) r0.getObject(r15, r12), a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05de, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05eb, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.h(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05f4, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.h(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05fd, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.f(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x060a, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.i(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0617, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.g(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0620, code lost:
        r8 = r0.getObject(r15, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0624, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.c(r10, (com.google.android.gms.internal.ads.zzbah) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x062f, code lost:
        r8 = defpackage.dfl.a(r10, r0.getObject(r15, r12), a(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0646, code lost:
        if ((r8 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0649, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.b(r10, (java.lang.String) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0655, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.k(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x065f, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0669, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.g(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0677, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.f(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0685, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.e(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0693, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.d(r10, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x069d, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.i(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06a7, code lost:
        r8 = com.google.android.gms.internal.ads.zzbav.j(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06ad, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0091, code lost:
        if ((r5 instanceof com.google.android.gms.internal.ads.zzbah) != false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b6, code lost:
        r4 = r4 + ((com.google.android.gms.internal.ads.zzbav.l(r7) + com.google.android.gms.internal.ads.zzbav.n(r5)) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x023c, code lost:
        r4 = r4 + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r15) {
        /*
            r14 = this;
            boolean r0 = r14.j
            r1 = 267386880(0xff00000, float:2.3665827E-29)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r3 = 0
            if (r0 == 0) goto L_0x035a
            sun.misc.Unsafe r0 = a
            r4 = 0
        L_0x000d:
            int[] r5 = r14.b
            int r5 = r5.length
            if (r3 >= r5) goto L_0x0352
            int r5 = r14.c(r3)
            r6 = r5 & r1
            int r6 = r6 >>> 20
            int[] r7 = r14.b
            r7 = r7[r3]
            r5 = r5 & r2
            long r8 = (long) r5
            com.google.android.gms.internal.ads.zzbbj r5 = com.google.android.gms.internal.ads.zzbbj.DOUBLE_LIST_PACKED
            int r5 = r5.id
            if (r6 < r5) goto L_0x0028
            com.google.android.gms.internal.ads.zzbbj r5 = com.google.android.gms.internal.ads.zzbbj.SINT64_LIST_PACKED
        L_0x0028:
            switch(r6) {
                case 0: goto L_0x0342;
                case 1: goto L_0x0336;
                case 2: goto L_0x0326;
                case 3: goto L_0x0316;
                case 4: goto L_0x0306;
                case 5: goto L_0x02fa;
                case 6: goto L_0x02ee;
                case 7: goto L_0x02e2;
                case 8: goto L_0x02cb;
                case 9: goto L_0x02b7;
                case 10: goto L_0x02a6;
                case 11: goto L_0x0297;
                case 12: goto L_0x0288;
                case 13: goto L_0x027d;
                case 14: goto L_0x0272;
                case 15: goto L_0x0263;
                case 16: goto L_0x0254;
                case 17: goto L_0x023f;
                case 18: goto L_0x0234;
                case 19: goto L_0x022b;
                case 20: goto L_0x0222;
                case 21: goto L_0x0219;
                case 22: goto L_0x0210;
                case 23: goto L_0x0234;
                case 24: goto L_0x022b;
                case 25: goto L_0x0207;
                case 26: goto L_0x01fe;
                case 27: goto L_0x01f1;
                case 28: goto L_0x01e8;
                case 29: goto L_0x01df;
                case 30: goto L_0x01d6;
                case 31: goto L_0x022b;
                case 32: goto L_0x0234;
                case 33: goto L_0x01cd;
                case 34: goto L_0x01c3;
                case 35: goto L_0x01aa;
                case 36: goto L_0x019d;
                case 37: goto L_0x0190;
                case 38: goto L_0x0183;
                case 39: goto L_0x0176;
                case 40: goto L_0x0169;
                case 41: goto L_0x015c;
                case 42: goto L_0x014f;
                case 43: goto L_0x0141;
                case 44: goto L_0x0133;
                case 45: goto L_0x0125;
                case 46: goto L_0x0117;
                case 47: goto L_0x0109;
                case 48: goto L_0x00fb;
                case 49: goto L_0x00ed;
                case 50: goto L_0x00e1;
                case 51: goto L_0x00d9;
                case 52: goto L_0x00d1;
                case 53: goto L_0x00c5;
                case 54: goto L_0x00b9;
                case 55: goto L_0x00ad;
                case 56: goto L_0x00a5;
                case 57: goto L_0x009d;
                case 58: goto L_0x0095;
                case 59: goto L_0x0085;
                case 60: goto L_0x007d;
                case 61: goto L_0x0075;
                case 62: goto L_0x0069;
                case 63: goto L_0x005d;
                case 64: goto L_0x0055;
                case 65: goto L_0x004d;
                case 66: goto L_0x0041;
                case 67: goto L_0x0035;
                case 68: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x034e
        L_0x002d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x0245
        L_0x0035:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = e(r15, r8)
            goto L_0x025e
        L_0x0041:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = d(r15, r8)
            goto L_0x026d
        L_0x004d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x0278
        L_0x0055:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x0283
        L_0x005d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = d(r15, r8)
            goto L_0x0292
        L_0x0069:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = d(r15, r8)
            goto L_0x02a1
        L_0x0075:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x02ac
        L_0x007d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x02bd
        L_0x0085:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            java.lang.Object r5 = defpackage.dgh.f(r15, r8)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbah
            if (r6 == 0) goto L_0x02da
            goto L_0x02d9
        L_0x0095:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x02e8
        L_0x009d:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x02f4
        L_0x00a5:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x0300
        L_0x00ad:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = d(r15, r8)
            goto L_0x0310
        L_0x00b9:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = e(r15, r8)
            goto L_0x0320
        L_0x00c5:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = e(r15, r8)
            goto L_0x0330
        L_0x00d1:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x033c
        L_0x00d9:
            boolean r5 = r14.a((T) r15, r7, r3)
            if (r5 == 0) goto L_0x034e
            goto L_0x0348
        L_0x00e1:
            del r5 = r14.s
            java.lang.Object r6 = defpackage.dgh.f(r15, r8)
            int r5 = r5.e(r6)
            goto L_0x023c
        L_0x00ed:
            java.util.List r5 = a(r15, r8)
            dfj r6 = r14.a(r3)
            int r5 = defpackage.dfl.b(r7, r5, r6)
            goto L_0x023c
        L_0x00fb:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.c(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0109:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.g(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0117:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.i(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0125:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.h(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0133:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.d(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0141:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.f(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x014f:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.j(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x015c:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.h(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0169:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.i(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.e(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0183:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.b(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x0190:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.a(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x019d:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.h(r5)
            if (r5 <= 0) goto L_0x034e
            goto L_0x01b6
        L_0x01aa:
            java.lang.Object r5 = r0.getObject(r15, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = defpackage.dfl.i(r5)
            if (r5 <= 0) goto L_0x034e
        L_0x01b6:
            int r6 = com.google.android.gms.internal.ads.zzbav.l(r7)
            int r7 = com.google.android.gms.internal.ads.zzbav.n(r5)
            int r6 = r6 + r7
            int r6 = r6 + r5
            int r4 = r4 + r6
            goto L_0x034e
        L_0x01c3:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.c(r7, r5)
            goto L_0x023c
        L_0x01cd:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.g(r7, r5)
            goto L_0x023c
        L_0x01d6:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.d(r7, r5)
            goto L_0x023c
        L_0x01df:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.f(r7, r5)
            goto L_0x023c
        L_0x01e8:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.l(r7, r5)
            goto L_0x023c
        L_0x01f1:
            java.util.List r5 = a(r15, r8)
            dfj r6 = r14.a(r3)
            int r5 = defpackage.dfl.a(r7, r5, r6)
            goto L_0x023c
        L_0x01fe:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.k(r7, r5)
            goto L_0x023c
        L_0x0207:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.j(r7, r5)
            goto L_0x023c
        L_0x0210:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.e(r7, r5)
            goto L_0x023c
        L_0x0219:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.b(r7, r5)
            goto L_0x023c
        L_0x0222:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.a(r7, r5)
            goto L_0x023c
        L_0x022b:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.h(r7, r5)
            goto L_0x023c
        L_0x0234:
            java.util.List r5 = a(r15, r8)
            int r5 = defpackage.dfl.i(r7, r5)
        L_0x023c:
            int r4 = r4 + r5
            goto L_0x034e
        L_0x023f:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x0245:
            java.lang.Object r5 = defpackage.dgh.f(r15, r8)
            deq r5 = (defpackage.deq) r5
            dfj r6 = r14.a(r3)
            int r5 = com.google.android.gms.internal.ads.zzbav.c(r7, r5, r6)
            goto L_0x023c
        L_0x0254:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = defpackage.dgh.b(r15, r8)
        L_0x025e:
            int r5 = com.google.android.gms.internal.ads.zzbav.f(r7, r5)
            goto L_0x023c
        L_0x0263:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = defpackage.dgh.a(r15, r8)
        L_0x026d:
            int r5 = com.google.android.gms.internal.ads.zzbav.h(r7, r5)
            goto L_0x023c
        L_0x0272:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x0278:
            int r5 = com.google.android.gms.internal.ads.zzbav.h(r7)
            goto L_0x023c
        L_0x027d:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x0283:
            int r5 = com.google.android.gms.internal.ads.zzbav.f(r7)
            goto L_0x023c
        L_0x0288:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = defpackage.dgh.a(r15, r8)
        L_0x0292:
            int r5 = com.google.android.gms.internal.ads.zzbav.i(r7, r5)
            goto L_0x023c
        L_0x0297:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = defpackage.dgh.a(r15, r8)
        L_0x02a1:
            int r5 = com.google.android.gms.internal.ads.zzbav.g(r7, r5)
            goto L_0x023c
        L_0x02a6:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x02ac:
            java.lang.Object r5 = defpackage.dgh.f(r15, r8)
        L_0x02b0:
            com.google.android.gms.internal.ads.zzbah r5 = (com.google.android.gms.internal.ads.zzbah) r5
            int r5 = com.google.android.gms.internal.ads.zzbav.c(r7, r5)
            goto L_0x023c
        L_0x02b7:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x02bd:
            java.lang.Object r5 = defpackage.dgh.f(r15, r8)
            dfj r6 = r14.a(r3)
            int r5 = defpackage.dfl.a(r7, r5, r6)
            goto L_0x023c
        L_0x02cb:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            java.lang.Object r5 = defpackage.dgh.f(r15, r8)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.zzbah
            if (r6 == 0) goto L_0x02da
        L_0x02d9:
            goto L_0x02b0
        L_0x02da:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.android.gms.internal.ads.zzbav.b(r7, r5)
            goto L_0x023c
        L_0x02e2:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x02e8:
            int r5 = com.google.android.gms.internal.ads.zzbav.k(r7)
            goto L_0x023c
        L_0x02ee:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x02f4:
            int r5 = com.google.android.gms.internal.ads.zzbav.e(r7)
            goto L_0x023c
        L_0x02fa:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x0300:
            int r5 = com.google.android.gms.internal.ads.zzbav.g(r7)
            goto L_0x023c
        L_0x0306:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            int r5 = defpackage.dgh.a(r15, r8)
        L_0x0310:
            int r5 = com.google.android.gms.internal.ads.zzbav.f(r7, r5)
            goto L_0x023c
        L_0x0316:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = defpackage.dgh.b(r15, r8)
        L_0x0320:
            int r5 = com.google.android.gms.internal.ads.zzbav.e(r7, r5)
            goto L_0x023c
        L_0x0326:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
            long r5 = defpackage.dgh.b(r15, r8)
        L_0x0330:
            int r5 = com.google.android.gms.internal.ads.zzbav.d(r7, r5)
            goto L_0x023c
        L_0x0336:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x033c:
            int r5 = com.google.android.gms.internal.ads.zzbav.i(r7)
            goto L_0x023c
        L_0x0342:
            boolean r5 = r14.a((T) r15, r3)
            if (r5 == 0) goto L_0x034e
        L_0x0348:
            int r5 = com.google.android.gms.internal.ads.zzbav.j(r7)
            goto L_0x023c
        L_0x034e:
            int r3 = r3 + 4
            goto L_0x000d
        L_0x0352:
            dgb<?, ?> r0 = r14.q
            int r15 = a(r0, (T) r15)
            int r4 = r4 + r15
            return r4
        L_0x035a:
            sun.misc.Unsafe r0 = a
            r4 = -1
            r4 = 0
            r5 = 0
            r6 = -1
            r7 = 0
        L_0x0361:
            int[] r8 = r14.b
            int r8 = r8.length
            if (r4 >= r8) goto L_0x06b1
            int r8 = r14.c(r4)
            int[] r9 = r14.b
            r10 = r9[r4]
            r11 = r8 & r1
            int r11 = r11 >>> 20
            r12 = 17
            if (r11 > r12) goto L_0x038b
            int r12 = r4 + 2
            r9 = r9[r12]
            r12 = r9 & r2
            int r9 = r9 >>> 20
            r13 = 1
            int r9 = r13 << r9
            if (r12 == r6) goto L_0x038c
            long r6 = (long) r12
            int r6 = r0.getInt(r15, r6)
            r7 = r6
            r6 = r12
            goto L_0x038c
        L_0x038b:
            r9 = 0
        L_0x038c:
            r8 = r8 & r2
            long r12 = (long) r8
            switch(r11) {
                case 0: goto L_0x06a3;
                case 1: goto L_0x0699;
                case 2: goto L_0x068b;
                case 3: goto L_0x067d;
                case 4: goto L_0x066f;
                case 5: goto L_0x0665;
                case 6: goto L_0x065b;
                case 7: goto L_0x0651;
                case 8: goto L_0x063c;
                case 9: goto L_0x062b;
                case 10: goto L_0x061c;
                case 11: goto L_0x060f;
                case 12: goto L_0x0602;
                case 13: goto L_0x05f9;
                case 14: goto L_0x05f0;
                case 15: goto L_0x05e3;
                case 16: goto L_0x05d6;
                case 17: goto L_0x05c3;
                case 18: goto L_0x05b6;
                case 19: goto L_0x05ab;
                case 20: goto L_0x05a0;
                case 21: goto L_0x0595;
                case 22: goto L_0x058a;
                case 23: goto L_0x05b6;
                case 24: goto L_0x05ab;
                case 25: goto L_0x057f;
                case 26: goto L_0x0574;
                case 27: goto L_0x0565;
                case 28: goto L_0x055a;
                case 29: goto L_0x054f;
                case 30: goto L_0x0543;
                case 31: goto L_0x05ab;
                case 32: goto L_0x05b6;
                case 33: goto L_0x0537;
                case 34: goto L_0x052b;
                case 35: goto L_0x0512;
                case 36: goto L_0x0505;
                case 37: goto L_0x04f8;
                case 38: goto L_0x04eb;
                case 39: goto L_0x04de;
                case 40: goto L_0x04d1;
                case 41: goto L_0x04c4;
                case 42: goto L_0x04b7;
                case 43: goto L_0x04a9;
                case 44: goto L_0x049b;
                case 45: goto L_0x048d;
                case 46: goto L_0x047f;
                case 47: goto L_0x0471;
                case 48: goto L_0x0463;
                case 49: goto L_0x0453;
                case 50: goto L_0x0447;
                case 51: goto L_0x043f;
                case 52: goto L_0x0437;
                case 53: goto L_0x042b;
                case 54: goto L_0x041f;
                case 55: goto L_0x0413;
                case 56: goto L_0x040b;
                case 57: goto L_0x0403;
                case 58: goto L_0x03fb;
                case 59: goto L_0x03eb;
                case 60: goto L_0x03e3;
                case 61: goto L_0x03db;
                case 62: goto L_0x03cf;
                case 63: goto L_0x03c3;
                case 64: goto L_0x03bb;
                case 65: goto L_0x03b3;
                case 66: goto L_0x03a7;
                case 67: goto L_0x039b;
                case 68: goto L_0x0393;
                default: goto L_0x0391;
            }
        L_0x0391:
            goto L_0x06ad
        L_0x0393:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x05c7
        L_0x039b:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            long r8 = e(r15, r12)
            goto L_0x05de
        L_0x03a7:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            int r8 = d(r15, r12)
            goto L_0x05eb
        L_0x03b3:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x05f4
        L_0x03bb:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x05fd
        L_0x03c3:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            int r8 = d(r15, r12)
            goto L_0x060a
        L_0x03cf:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            int r8 = d(r15, r12)
            goto L_0x0617
        L_0x03db:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x0620
        L_0x03e3:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x062f
        L_0x03eb:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.ads.zzbah
            if (r9 == 0) goto L_0x0649
            goto L_0x0648
        L_0x03fb:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x0655
        L_0x0403:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x065f
        L_0x040b:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x0669
        L_0x0413:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            int r8 = d(r15, r12)
            goto L_0x0677
        L_0x041f:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            long r8 = e(r15, r12)
            goto L_0x0685
        L_0x042b:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            long r8 = e(r15, r12)
            goto L_0x0693
        L_0x0437:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x069d
        L_0x043f:
            boolean r8 = r14.a((T) r15, r10, r4)
            if (r8 == 0) goto L_0x06ad
            goto L_0x06a7
        L_0x0447:
            del r8 = r14.s
            java.lang.Object r9 = r0.getObject(r15, r12)
            int r8 = r8.e(r9)
            goto L_0x05c0
        L_0x0453:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            dfj r9 = r14.a(r4)
            int r8 = defpackage.dfl.b(r10, r8, r9)
            goto L_0x05c0
        L_0x0463:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.c(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x0471:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.g(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x047f:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.i(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x048d:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.h(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x049b:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.d(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04a9:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.f(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04b7:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.j(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04c4:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.h(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04d1:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.i(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04de:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.e(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04eb:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.b(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x04f8:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.a(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x0505:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.h(r8)
            if (r8 <= 0) goto L_0x06ad
            goto L_0x051e
        L_0x0512:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.i(r8)
            if (r8 <= 0) goto L_0x06ad
        L_0x051e:
            int r9 = com.google.android.gms.internal.ads.zzbav.l(r10)
            int r10 = com.google.android.gms.internal.ads.zzbav.n(r8)
            int r9 = r9 + r10
            int r9 = r9 + r8
            int r5 = r5 + r9
            goto L_0x06ad
        L_0x052b:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.c(r10, r8)
            goto L_0x05c0
        L_0x0537:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.g(r10, r8)
            goto L_0x05c0
        L_0x0543:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.d(r10, r8)
            goto L_0x05c0
        L_0x054f:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.f(r10, r8)
            goto L_0x05c0
        L_0x055a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.l(r10, r8)
            goto L_0x05c0
        L_0x0565:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            dfj r9 = r14.a(r4)
            int r8 = defpackage.dfl.a(r10, r8, r9)
            goto L_0x05c0
        L_0x0574:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.k(r10, r8)
            goto L_0x05c0
        L_0x057f:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.j(r10, r8)
            goto L_0x05c0
        L_0x058a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.e(r10, r8)
            goto L_0x05c0
        L_0x0595:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.b(r10, r8)
            goto L_0x05c0
        L_0x05a0:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.a(r10, r8)
            goto L_0x05c0
        L_0x05ab:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.h(r10, r8)
            goto L_0x05c0
        L_0x05b6:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = defpackage.dfl.i(r10, r8)
        L_0x05c0:
            int r5 = r5 + r8
            goto L_0x06ad
        L_0x05c3:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x05c7:
            java.lang.Object r8 = r0.getObject(r15, r12)
            deq r8 = (defpackage.deq) r8
            dfj r9 = r14.a(r4)
            int r8 = com.google.android.gms.internal.ads.zzbav.c(r10, r8, r9)
            goto L_0x05c0
        L_0x05d6:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            long r8 = r0.getLong(r15, r12)
        L_0x05de:
            int r8 = com.google.android.gms.internal.ads.zzbav.f(r10, r8)
            goto L_0x05c0
        L_0x05e3:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            int r8 = r0.getInt(r15, r12)
        L_0x05eb:
            int r8 = com.google.android.gms.internal.ads.zzbav.h(r10, r8)
            goto L_0x05c0
        L_0x05f0:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x05f4:
            int r8 = com.google.android.gms.internal.ads.zzbav.h(r10)
            goto L_0x05c0
        L_0x05f9:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x05fd:
            int r8 = com.google.android.gms.internal.ads.zzbav.f(r10)
            goto L_0x05c0
        L_0x0602:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            int r8 = r0.getInt(r15, r12)
        L_0x060a:
            int r8 = com.google.android.gms.internal.ads.zzbav.i(r10, r8)
            goto L_0x05c0
        L_0x060f:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            int r8 = r0.getInt(r15, r12)
        L_0x0617:
            int r8 = com.google.android.gms.internal.ads.zzbav.g(r10, r8)
            goto L_0x05c0
        L_0x061c:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x0620:
            java.lang.Object r8 = r0.getObject(r15, r12)
        L_0x0624:
            com.google.android.gms.internal.ads.zzbah r8 = (com.google.android.gms.internal.ads.zzbah) r8
            int r8 = com.google.android.gms.internal.ads.zzbav.c(r10, r8)
            goto L_0x05c0
        L_0x062b:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x062f:
            java.lang.Object r8 = r0.getObject(r15, r12)
            dfj r9 = r14.a(r4)
            int r8 = defpackage.dfl.a(r10, r8, r9)
            goto L_0x05c0
        L_0x063c:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.ads.zzbah
            if (r9 == 0) goto L_0x0649
        L_0x0648:
            goto L_0x0624
        L_0x0649:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.ads.zzbav.b(r10, r8)
            goto L_0x05c0
        L_0x0651:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x0655:
            int r8 = com.google.android.gms.internal.ads.zzbav.k(r10)
            goto L_0x05c0
        L_0x065b:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x065f:
            int r8 = com.google.android.gms.internal.ads.zzbav.e(r10)
            goto L_0x05c0
        L_0x0665:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x0669:
            int r8 = com.google.android.gms.internal.ads.zzbav.g(r10)
            goto L_0x05c0
        L_0x066f:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            int r8 = r0.getInt(r15, r12)
        L_0x0677:
            int r8 = com.google.android.gms.internal.ads.zzbav.f(r10, r8)
            goto L_0x05c0
        L_0x067d:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            long r8 = r0.getLong(r15, r12)
        L_0x0685:
            int r8 = com.google.android.gms.internal.ads.zzbav.e(r10, r8)
            goto L_0x05c0
        L_0x068b:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
            long r8 = r0.getLong(r15, r12)
        L_0x0693:
            int r8 = com.google.android.gms.internal.ads.zzbav.d(r10, r8)
            goto L_0x05c0
        L_0x0699:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x069d:
            int r8 = com.google.android.gms.internal.ads.zzbav.i(r10)
            goto L_0x05c0
        L_0x06a3:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x06ad
        L_0x06a7:
            int r8 = com.google.android.gms.internal.ads.zzbav.j(r10)
            goto L_0x05c0
        L_0x06ad:
            int r4 = r4 + 4
            goto L_0x0361
        L_0x06b1:
            dgb<?, ?> r0 = r14.q
            int r0 = a(r0, (T) r15)
            int r5 = r5 + r0
            boolean r0 = r14.h
            if (r0 == 0) goto L_0x070a
            ddg<?> r0 = r14.r
            ddj r15 = r0.a(r15)
            r0 = 0
        L_0x06c3:
            dfm<FieldDescriptorType, java.lang.Object> r1 = r15.a
            int r1 = r1.b()
            if (r3 >= r1) goto L_0x06e3
            dfm<FieldDescriptorType, java.lang.Object> r1 = r15.a
            java.util.Map$Entry r1 = r1.b(r3)
            java.lang.Object r2 = r1.getKey()
            ddl r2 = (defpackage.ddl) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = defpackage.ddj.a(r2, r1)
            int r0 = r0 + r1
            int r3 = r3 + 1
            goto L_0x06c3
        L_0x06e3:
            dfm<FieldDescriptorType, java.lang.Object> r15 = r15.a
            java.lang.Iterable r15 = r15.c()
            java.util.Iterator r15 = r15.iterator()
        L_0x06ed:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x0709
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            ddl r2 = (defpackage.ddl) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = defpackage.ddj.a(r2, r1)
            int r0 = r0 + r1
            goto L_0x06ed
        L_0x0709:
            int r5 = r5 + r0
        L_0x070a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.b(java.lang.Object):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        defpackage.dgh.a((java.lang.Object) r7, r2, defpackage.dgh.f(r8, r2));
        b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        defpackage.dgh.a((java.lang.Object) r7, r2, defpackage.dgh.f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        defpackage.dgh.a((java.lang.Object) r7, r2, defpackage.dgh.a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        defpackage.dgh.a((java.lang.Object) r7, r2, defpackage.dgh.b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(T r7, T r8) {
        /*
            r6 = this;
            if (r8 == 0) goto L_0x0105
            r0 = 0
        L_0x0003:
            int[] r1 = r6.b
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f2
            int r1 = r6.c(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.b
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00c2;
                case 3: goto L_0x00bb;
                case 4: goto L_0x00ad;
                case 5: goto L_0x00a6;
                case 6: goto L_0x009f;
                case 7: goto L_0x0091;
                case 8: goto L_0x0083;
                case 9: goto L_0x007e;
                case 10: goto L_0x0077;
                case 11: goto L_0x0070;
                case 12: goto L_0x0069;
                case 13: goto L_0x0062;
                case 14: goto L_0x005a;
                case 15: goto L_0x0053;
                case 16: goto L_0x004b;
                case 17: goto L_0x007e;
                case 18: goto L_0x0044;
                case 19: goto L_0x0044;
                case 20: goto L_0x0044;
                case 21: goto L_0x0044;
                case 22: goto L_0x0044;
                case 23: goto L_0x0044;
                case 24: goto L_0x0044;
                case 25: goto L_0x0044;
                case 26: goto L_0x0044;
                case 27: goto L_0x0044;
                case 28: goto L_0x0044;
                case 29: goto L_0x0044;
                case 30: goto L_0x0044;
                case 31: goto L_0x0044;
                case 32: goto L_0x0044;
                case 33: goto L_0x0044;
                case 34: goto L_0x0044;
                case 35: goto L_0x0044;
                case 36: goto L_0x0044;
                case 37: goto L_0x0044;
                case 38: goto L_0x0044;
                case 39: goto L_0x0044;
                case 40: goto L_0x0044;
                case 41: goto L_0x0044;
                case 42: goto L_0x0044;
                case 43: goto L_0x0044;
                case 44: goto L_0x0044;
                case 45: goto L_0x0044;
                case 46: goto L_0x0044;
                case 47: goto L_0x0044;
                case 48: goto L_0x0044;
                case 49: goto L_0x0044;
                case 50: goto L_0x003d;
                case 51: goto L_0x002b;
                case 52: goto L_0x002b;
                case 53: goto L_0x002b;
                case 54: goto L_0x002b;
                case 55: goto L_0x002b;
                case 56: goto L_0x002b;
                case 57: goto L_0x002b;
                case 58: goto L_0x002b;
                case 59: goto L_0x002b;
                case 60: goto L_0x0026;
                case 61: goto L_0x001f;
                case 62: goto L_0x001f;
                case 63: goto L_0x001f;
                case 64: goto L_0x001f;
                case 65: goto L_0x001f;
                case 66: goto L_0x001f;
                case 67: goto L_0x001f;
                case 68: goto L_0x0026;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x00ee
        L_0x001f:
            boolean r1 = r6.a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0031
        L_0x0026:
            r6.b((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x002b:
            boolean r1 = r6.a((T) r8, r4, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0031:
            java.lang.Object r1 = defpackage.dgh.f(r8, r2)
            defpackage.dgh.a(r7, r2, r1)
            r6.b((T) r7, r4, r0)
            goto L_0x00ee
        L_0x003d:
            del r1 = r6.s
            defpackage.dfl.a(r1, r7, r8, r2)
            goto L_0x00ee
        L_0x0044:
            dec r1 = r6.p
            r1.a(r7, r8, r2)
            goto L_0x00ee
        L_0x004b:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0053:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x005a:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x0062:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x006f
        L_0x0069:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x006f:
            goto L_0x00b3
        L_0x0070:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x0077:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x0089
        L_0x007e:
            r6.a((T) r7, (T) r8, r0)
            goto L_0x00ee
        L_0x0083:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x0089:
            java.lang.Object r1 = defpackage.dgh.f(r8, r2)
            defpackage.dgh.a(r7, r2, r1)
            goto L_0x00eb
        L_0x0091:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            boolean r1 = defpackage.dgh.c(r8, r2)
            defpackage.dgh.a(r7, r2, r1)
            goto L_0x00eb
        L_0x009f:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00b3
        L_0x00a6:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00ad:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00b3:
            int r1 = defpackage.dgh.a(r8, r2)
            defpackage.dgh.a(r7, r2, r1)
            goto L_0x00eb
        L_0x00bb:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            goto L_0x00c8
        L_0x00c2:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
        L_0x00c8:
            long r4 = defpackage.dgh.b(r8, r2)
            defpackage.dgh.a(r7, r2, r4)
            goto L_0x00eb
        L_0x00d0:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            float r1 = defpackage.dgh.d(r8, r2)
            defpackage.dgh.a(r7, r2, r1)
            goto L_0x00eb
        L_0x00de:
            boolean r1 = r6.a((T) r8, r0)
            if (r1 == 0) goto L_0x00ee
            double r4 = defpackage.dgh.e(r8, r2)
            defpackage.dgh.a(r7, r2, r4)
        L_0x00eb:
            r6.b((T) r7, r0)
        L_0x00ee:
            int r0 = r0 + 4
            goto L_0x0003
        L_0x00f2:
            boolean r0 = r6.j
            if (r0 != 0) goto L_0x0104
            dgb<?, ?> r0 = r6.q
            defpackage.dfl.a(r0, r7, r8)
            boolean r0 = r6.h
            if (r0 == 0) goto L_0x0104
            ddg<?> r0 = r6.r
            defpackage.dfl.a(r0, r7, r8)
        L_0x0104:
            return
        L_0x0105:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>()
            goto L_0x010c
        L_0x010b:
            throw r7
        L_0x010c:
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.b(java.lang.Object, java.lang.Object):void");
    }

    public final void c(T t) {
        int[] iArr = this.m;
        if (iArr != null) {
            for (int c2 : iArr) {
                long c3 = (long) (c(c2) & 1048575);
                Object f2 = dgh.f(t, c3);
                if (f2 != null) {
                    dgh.a((Object) t, c3, this.s.d(f2));
                }
            }
        }
        int[] iArr2 = this.n;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.p.b(t, (long) i2);
            }
        }
        this.q.d(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0115 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int[] r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L_0x012d
            int r4 = r2.length
            if (r4 != 0) goto L_0x000e
            goto L_0x012d
        L_0x000e:
            r4 = -1
            int r5 = r2.length
            r6 = 0
            r4 = 0
            r7 = -1
            r8 = 0
        L_0x0014:
            if (r4 >= r5) goto L_0x011a
            r9 = r2[r4]
            int r10 = r0.f(r9)
            int r11 = r0.c(r10)
            boolean r12 = r0.j
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r12 != 0) goto L_0x0042
            int[] r12 = r0.b
            int r14 = r10 + 2
            r12 = r12[r14]
            r14 = r12 & r13
            int r12 = r12 >>> 20
            int r12 = r3 << r12
            if (r14 == r7) goto L_0x0040
            sun.misc.Unsafe r7 = a
            r15 = r4
            long r3 = (long) r14
            int r3 = r7.getInt(r1, r3)
            r8 = r3
            r7 = r14
            goto L_0x0044
        L_0x0040:
            r15 = r4
            goto L_0x0044
        L_0x0042:
            r15 = r4
            r12 = 0
        L_0x0044:
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            r3 = r3 & r11
            if (r3 == 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 == 0) goto L_0x0055
            boolean r3 = r0.a((T) r1, r10, r8, r12)
            if (r3 != 0) goto L_0x0055
            return r6
        L_0x0055:
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r11
            int r3 = r3 >>> 20
            r4 = 9
            if (r3 == r4) goto L_0x0104
            r4 = 17
            if (r3 == r4) goto L_0x0104
            r4 = 27
            if (r3 == r4) goto L_0x00d7
            r4 = 60
            if (r3 == r4) goto L_0x00c6
            r4 = 68
            if (r3 == r4) goto L_0x00c6
            r4 = 49
            if (r3 == r4) goto L_0x00d7
            r4 = 50
            if (r3 == r4) goto L_0x0078
            goto L_0x0115
        L_0x0078:
            del r3 = r0.s
            r4 = r11 & r13
            long r9 = (long) r4
            java.lang.Object r4 = defpackage.dgh.f(r1, r9)
            java.util.Map r3 = r3.b(r4)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x00c2
            del r4 = r0.s
            dek r4 = r4.b()
            com.google.android.gms.internal.ads.zzbes r4 = r4.c
            com.google.android.gms.internal.ads.zzbex r4 = r4.zzeas
            com.google.android.gms.internal.ads.zzbex r9 = com.google.android.gms.internal.ads.zzbex.MESSAGE
            if (r4 != r9) goto L_0x00c2
            r4 = 0
            java.util.Collection r3 = r3.values()
            java.util.Iterator r3 = r3.iterator()
        L_0x00a2:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x00c2
            java.lang.Object r9 = r3.next()
            if (r4 != 0) goto L_0x00ba
            dfd r4 = defpackage.dfd.a()
            java.lang.Class r10 = r9.getClass()
            dfj r4 = r4.a(r10)
        L_0x00ba:
            boolean r9 = r4.d(r9)
            if (r9 != 0) goto L_0x00a2
            r3 = 0
            goto L_0x00c3
        L_0x00c2:
            r3 = 1
        L_0x00c3:
            if (r3 != 0) goto L_0x0115
            return r6
        L_0x00c6:
            boolean r3 = r0.a((T) r1, r9, r10)
            if (r3 == 0) goto L_0x0115
            dfj r3 = r0.a(r10)
            boolean r3 = a(r1, r11, r3)
            if (r3 != 0) goto L_0x0115
            return r6
        L_0x00d7:
            r3 = r11 & r13
            long r3 = (long) r3
            java.lang.Object r3 = defpackage.dgh.f(r1, r3)
            java.util.List r3 = (java.util.List) r3
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0100
            dfj r4 = r0.a(r10)
            r9 = 0
        L_0x00eb:
            int r10 = r3.size()
            if (r9 >= r10) goto L_0x0100
            java.lang.Object r10 = r3.get(r9)
            boolean r10 = r4.d(r10)
            if (r10 != 0) goto L_0x00fd
            r3 = 0
            goto L_0x0101
        L_0x00fd:
            int r9 = r9 + 1
            goto L_0x00eb
        L_0x0100:
            r3 = 1
        L_0x0101:
            if (r3 != 0) goto L_0x0115
            return r6
        L_0x0104:
            boolean r3 = r0.a((T) r1, r10, r8, r12)
            if (r3 == 0) goto L_0x0115
            dfj r3 = r0.a(r10)
            boolean r3 = a(r1, r11, r3)
            if (r3 != 0) goto L_0x0115
            return r6
        L_0x0115:
            int r4 = r15 + 1
            r3 = 1
            goto L_0x0014
        L_0x011a:
            boolean r2 = r0.h
            if (r2 == 0) goto L_0x012b
            ddg<?> r2 = r0.r
            ddj r1 = r2.a(r1)
            boolean r1 = r1.d()
            if (r1 != 0) goto L_0x012b
            return r6
        L_0x012b:
            r1 = 1
            return r1
        L_0x012d:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deu.d(java.lang.Object):boolean");
    }
}
