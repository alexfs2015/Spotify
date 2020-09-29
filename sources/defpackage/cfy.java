package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@cey
/* renamed from: cfy reason: default package */
public final class cfy extends bxf {
    public static final Creator<cfy> CREATOR = new cfz();
    public final cjx A;
    public final List<String> B;
    public final List<String> C;
    public final boolean D;
    public final cga E;
    public final boolean F;
    public String G;
    public final List<String> H;
    public final boolean I;
    public final String J;
    public final ckh K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final boolean Q;
    public final List<String> R;
    public final boolean S;
    public final String T;
    private cfu U;
    private final int V;
    private cgk W;
    private Bundle X;
    public final String a;
    public String b;
    public final List<String> c;
    public final int d;
    public final List<String> e;
    public final long f;
    public final boolean g;
    public final long h;
    public final List<String> i;
    public final long j;
    public final int k;
    public final String l;
    public final long m;
    public final String n;
    public final boolean o;
    public final String p;
    public final String q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public String w;
    public final String x;
    public final boolean y;
    public final boolean z;

    public cfy(int i2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public cfy(int i2, long j2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, j2, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    cfy(int i2, String str, String str2, List<String> list, int i3, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i4, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, cgk cgk, String str7, String str8, boolean z9, boolean z10, cjx cjx, List<String> list4, List<String> list5, boolean z11, cga cga, boolean z12, String str9, List<String> list6, boolean z13, String str10, ckh ckh, String str11, boolean z14, boolean z15, Bundle bundle, boolean z16, int i5, boolean z17, List<String> list7, boolean z18, String str12) {
        this.V = i2;
        this.a = str;
        this.b = str2;
        List<String> list8 = null;
        this.c = list != null ? Collections.unmodifiableList(list) : null;
        this.d = i3;
        this.e = list2 != null ? Collections.unmodifiableList(list2) : null;
        this.f = j2;
        this.g = z2;
        this.h = j3;
        this.i = list3 != null ? Collections.unmodifiableList(list3) : null;
        this.j = j4;
        this.k = i4;
        this.l = str3;
        this.m = j5;
        this.n = str4;
        this.o = z3;
        this.p = str5;
        this.q = str6;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.M = z14;
        this.v = z8;
        this.W = cgk;
        this.w = str7;
        this.x = str8;
        if (this.b == null) {
            cgk cgk2 = this.W;
            if (cgk2 != null) {
                cgz cgz = (cgz) cgk2.a(cgz.CREATOR);
                if (cgz != null && !TextUtils.isEmpty(cgz.a)) {
                    this.b = cgz.a;
                }
            }
        }
        this.y = z9;
        this.z = z10;
        this.A = cjx;
        this.B = list4;
        this.C = list5;
        this.D = z11;
        this.E = cga;
        this.F = z12;
        this.G = str9;
        this.H = list6;
        this.I = z13;
        this.J = str10;
        this.K = ckh;
        this.L = str11;
        this.N = z15;
        this.X = bundle;
        this.O = z16;
        this.P = i5;
        this.Q = z17;
        if (list7 != null) {
            list8 = Collections.unmodifiableList(list7);
        }
        this.R = list8;
        this.S = z18;
        this.T = str12;
    }

    public cfy(cfu cfu, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, boolean z10, cjx cjx, List<String> list4, List<String> list5, boolean z11, cga cga, boolean z12, String str8, List<String> list6, boolean z13, String str9, ckh ckh, String str10, boolean z14, boolean z15, boolean z16, boolean z17, List<String> list7, boolean z18, String str11) {
        this(19, str, str2, list, -2, list2, j2, z2, j3, list3, j4, i2, str3, j5, str4, z3, str5, str6, z4, z5, z6, z7, z8, null, null, str7, z9, z10, cjx, list4, list5, z11, cga, z12, str8, list6, z13, str9, ckh, str10, z14, z15, null, z16, 0, z17, list7, z18, str11);
        this.U = cfu;
    }

    public cfy(cfu cfu, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, List<String> list3, long j3, int i2, String str3, long j4, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, cjx cjx, List<String> list4, List<String> list5, boolean z9, cga cga, boolean z10, String str7, List<String> list6, boolean z11, String str8, ckh ckh, String str9, boolean z12, boolean z13, boolean z14, int i3, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j2, z2, -1, list3, j3, i2, str3, j4, str4, false, null, str5, z3, z4, z5, z6, false, null, null, str6, z7, z8, cjx, list4, list5, z9, cga, z10, str7, list6, z11, str8, ckh, str9, z12, z13, null, z14, i3, z15, list7, z16, str10);
        this.U = cfu;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        cfu cfu = this.U;
        if (cfu != null && cfu.a >= 9 && !TextUtils.isEmpty(this.b)) {
            this.W = new cgk((SafeParcelable) new cgz(this.b));
            this.b = null;
        }
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.V);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.a(parcel, 4, this.c, false);
        bxg.b(parcel, 5, this.d);
        bxg.a(parcel, 6, this.e, false);
        bxg.a(parcel, 7, this.f);
        bxg.a(parcel, 8, this.g);
        bxg.a(parcel, 9, this.h);
        bxg.a(parcel, 10, this.i, false);
        bxg.a(parcel, 11, this.j);
        bxg.b(parcel, 12, this.k);
        bxg.a(parcel, 13, this.l, false);
        bxg.a(parcel, 14, this.m);
        bxg.a(parcel, 15, this.n, false);
        bxg.a(parcel, 18, this.o);
        bxg.a(parcel, 19, this.p, false);
        bxg.a(parcel, 21, this.q, false);
        bxg.a(parcel, 22, this.r);
        bxg.a(parcel, 23, this.s);
        bxg.a(parcel, 24, this.t);
        bxg.a(parcel, 25, this.u);
        bxg.a(parcel, 26, this.v);
        bxg.a(parcel, 28, (Parcelable) this.W, i2, false);
        bxg.a(parcel, 29, this.w, false);
        bxg.a(parcel, 30, this.x, false);
        bxg.a(parcel, 31, this.y);
        bxg.a(parcel, 32, this.z);
        bxg.a(parcel, 33, (Parcelable) this.A, i2, false);
        bxg.a(parcel, 34, this.B, false);
        bxg.a(parcel, 35, this.C, false);
        bxg.a(parcel, 36, this.D);
        bxg.a(parcel, 37, (Parcelable) this.E, i2, false);
        bxg.a(parcel, 38, this.F);
        bxg.a(parcel, 39, this.G, false);
        bxg.a(parcel, 40, this.H, false);
        bxg.a(parcel, 42, this.I);
        bxg.a(parcel, 43, this.J, false);
        bxg.a(parcel, 44, (Parcelable) this.K, i2, false);
        bxg.a(parcel, 45, this.L, false);
        bxg.a(parcel, 46, this.M);
        bxg.a(parcel, 47, this.N);
        bxg.a(parcel, 48, this.X, false);
        bxg.a(parcel, 49, this.O);
        bxg.b(parcel, 50, this.P);
        bxg.a(parcel, 51, this.Q);
        bxg.a(parcel, 52, this.R, false);
        bxg.a(parcel, 53, this.S);
        bxg.a(parcel, 54, this.T, false);
        bxg.b(parcel, a2);
    }
}
