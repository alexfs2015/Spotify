package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.DisplayMetrics;

@cey
/* renamed from: dpc reason: default package */
public class dpc extends bxf {
    public static final Creator<dpc> CREATOR = new dpd();
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final dpc[] g;
    public final boolean h;
    public final boolean i;
    public boolean j;

    public dpc() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false);
    }

    public dpc(Context context, ber ber) {
        this(context, new ber[]{ber});
    }

    public dpc(dpc dpc, dpc[] dpcArr) {
        this(dpc.a, dpc.b, dpc.c, dpc.d, dpc.e, dpc.f, dpcArr, dpc.h, dpc.i, dpc.j);
    }

    dpc(String str, int i2, int i3, boolean z, int i4, int i5, dpc[] dpcArr, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = i4;
        this.f = i5;
        this.g = dpcArr;
        this.h = z2;
        this.i = z3;
        this.j = z4;
    }

    public static int a(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels;
    }

    public static dpc a() {
        dpc dpc = new dpc("320x50_mb", 0, 0, false, 0, 0, null, true, false, false);
        return dpc;
    }

    public static int b(DisplayMetrics displayMetrics) {
        return (int) (((float) c(displayMetrics)) * displayMetrics.density);
    }

    public static dpc b() {
        dpc dpc = new dpc("reward_mb", 0, 0, true, 0, 0, null, false, false, false);
        return dpc;
    }

    private static int c(DisplayMetrics displayMetrics) {
        int i2 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
        if (i2 <= 400) {
            return 32;
        }
        return i2 <= 720 ? 50 : 90;
    }

    public final ber c() {
        return bli.a(this.e, this.b, this.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dpc(android.content.Context r13, defpackage.ber[] r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = 0
            r1 = r14[r0]
            r12.d = r0
            int r2 = r1.j
            r3 = 1
            r4 = -3
            if (r2 != r4) goto L_0x0015
            int r2 = r1.k
            r4 = -4
            if (r2 != r4) goto L_0x0015
            r2 = 1
            goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            r12.i = r2
            boolean r2 = r12.i
            if (r2 == 0) goto L_0x0029
            ber r2 = defpackage.ber.a
            int r2 = r2.j
            r12.e = r2
            ber r2 = defpackage.ber.a
            int r2 = r2.k
            r12.b = r2
            goto L_0x0031
        L_0x0029:
            int r2 = r1.j
            r12.e = r2
            int r2 = r1.k
            r12.b = r2
        L_0x0031:
            int r2 = r12.e
            r4 = -1
            if (r2 != r4) goto L_0x0038
            r2 = 1
            goto L_0x0039
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r4 = r12.b
            r5 = -2
            if (r4 != r5) goto L_0x0040
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            android.content.res.Resources r5 = r13.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            if (r2 == 0) goto L_0x0088
            defpackage.dpn.a()
            boolean r6 = defpackage.col.g(r13)
            if (r6 == 0) goto L_0x0068
            defpackage.dpn.a()
            boolean r6 = defpackage.col.h(r13)
            if (r6 == 0) goto L_0x0068
            int r6 = r5.widthPixels
            defpackage.dpn.a()
            int r7 = defpackage.col.i(r13)
            int r6 = r6 - r7
            goto L_0x006a
        L_0x0068:
            int r6 = r5.widthPixels
        L_0x006a:
            r12.f = r6
            int r6 = r12.f
            float r6 = (float) r6
            float r7 = r5.density
            float r6 = r6 / r7
            double r6 = (double) r6
            int r8 = (int) r6
            double r9 = (double) r8
            java.lang.Double.isNaN(r6)
            java.lang.Double.isNaN(r9)
            double r6 = r6 - r9
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0095
            int r8 = r8 + 1
            goto L_0x0095
        L_0x0088:
            int r8 = r12.e
            defpackage.dpn.a()
            int r6 = r12.e
            int r6 = defpackage.col.a(r5, r6)
            r12.f = r6
        L_0x0095:
            if (r4 == 0) goto L_0x009c
            int r6 = c(r5)
            goto L_0x009e
        L_0x009c:
            int r6 = r12.b
        L_0x009e:
            defpackage.dpn.a()
            int r5 = defpackage.col.a(r5, r6)
            r12.c = r5
            if (r2 != 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            boolean r2 = r12.i
            if (r2 == 0) goto L_0x00b3
            java.lang.String r1 = "320x50_mb"
            goto L_0x00d3
        L_0x00b3:
            java.lang.String r1 = r1.toString()
            goto L_0x00d3
        L_0x00b8:
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "x"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = "_as"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L_0x00d3:
            r12.a = r1
            int r1 = r14.length
            if (r1 <= r3) goto L_0x00ef
            int r1 = r14.length
            dpc[] r1 = new defpackage.dpc[r1]
            r12.g = r1
            r1 = 0
        L_0x00de:
            int r2 = r14.length
            if (r1 >= r2) goto L_0x00f2
            dpc[] r2 = r12.g
            dpc r3 = new dpc
            r4 = r14[r1]
            r3.<init>(r13, r4)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00de
        L_0x00ef:
            r13 = 0
            r12.g = r13
        L_0x00f2:
            r12.h = r0
            r12.j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpc.<init>(android.content.Context, ber[]):void");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, 3, this.b);
        bxg.b(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.b(parcel, 6, this.e);
        bxg.b(parcel, 7, this.f);
        bxg.a(parcel, 8, (T[]) this.g, i2, false);
        bxg.a(parcel, 9, this.h);
        bxg.a(parcel, 10, this.i);
        bxg.a(parcel, 11, this.j);
        bxg.b(parcel, a2);
    }
}
