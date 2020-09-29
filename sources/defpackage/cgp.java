package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@cfp
/* renamed from: cgp reason: default package */
public final class cgp extends bxw {
    public static final Creator<cgp> CREATOR = new cgq();
    public final cko A;
    public final List<String> B;
    public final List<String> C;
    public final boolean D;
    public final cgr E;
    public final boolean F;
    public String G;
    public final List<String> H;
    public final boolean I;
    public final String J;
    public final cky K;
    public final String L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final int P;
    public final boolean Q;
    public final List<String> R;
    public final boolean S;
    public final String T;
    private cgl U;
    private final int V;
    private chb W;
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

    public cgp(int i2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, -1, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    public cgp(int i2, long j2) {
        this(19, null, null, null, i2, null, -1, false, -1, null, j2, -1, null, -1, null, false, null, null, false, false, false, true, false, null, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, true, false, null, false, 0, false, null, false, null);
    }

    cgp(int i2, String str, String str2, List<String> list, int i3, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i4, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, chb chb, String str7, String str8, boolean z9, boolean z10, cko cko, List<String> list4, List<String> list5, boolean z11, cgr cgr, boolean z12, String str9, List<String> list6, boolean z13, String str10, cky cky, String str11, boolean z14, boolean z15, Bundle bundle, boolean z16, int i5, boolean z17, List<String> list7, boolean z18, String str12) {
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
        this.W = chb;
        this.w = str7;
        this.x = str8;
        if (this.b == null) {
            chb chb2 = this.W;
            if (chb2 != null) {
                chq chq = (chq) chb2.a(chq.CREATOR);
                if (chq != null && !TextUtils.isEmpty(chq.a)) {
                    this.b = chq.a;
                }
            }
        }
        this.y = z9;
        this.z = z10;
        this.A = cko;
        this.B = list4;
        this.C = list5;
        this.D = z11;
        this.E = cgr;
        this.F = z12;
        this.G = str9;
        this.H = list6;
        this.I = z13;
        this.J = str10;
        this.K = cky;
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

    public cgp(cgl cgl, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, long j3, List<String> list3, long j4, int i2, String str3, long j5, String str4, boolean z3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str7, boolean z9, boolean z10, cko cko, List<String> list4, List<String> list5, boolean z11, cgr cgr, boolean z12, String str8, List<String> list6, boolean z13, String str9, cky cky, String str10, boolean z14, boolean z15, boolean z16, boolean z17, List<String> list7, boolean z18, String str11) {
        this(19, str, str2, list, -2, list2, j2, z2, j3, list3, j4, i2, str3, j5, str4, z3, str5, str6, z4, z5, z6, z7, z8, null, null, str7, z9, z10, cko, list4, list5, z11, cgr, z12, str8, list6, z13, str9, cky, str10, z14, z15, null, z16, 0, z17, list7, z18, str11);
        this.U = cgl;
    }

    public cgp(cgl cgl, String str, String str2, List<String> list, List<String> list2, long j2, boolean z2, List<String> list3, long j3, int i2, String str3, long j4, String str4, String str5, boolean z3, boolean z4, boolean z5, boolean z6, String str6, boolean z7, boolean z8, cko cko, List<String> list4, List<String> list5, boolean z9, cgr cgr, boolean z10, String str7, List<String> list6, boolean z11, String str8, cky cky, String str9, boolean z12, boolean z13, boolean z14, int i3, boolean z15, List<String> list7, boolean z16, String str10) {
        this(19, str, str2, list, -2, list2, j2, z2, -1, list3, j3, i2, str3, j4, str4, false, null, str5, z3, z4, z5, z6, false, null, null, str6, z7, z8, cko, list4, list5, z9, cgr, z10, str7, list6, z11, str8, cky, str9, z12, z13, null, z14, i3, z15, list7, z16, str10);
        this.U = cgl;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        cgl cgl = this.U;
        if (cgl != null && cgl.a >= 9 && !TextUtils.isEmpty(this.b)) {
            this.W = new chb((SafeParcelable) new chq(this.b));
            this.b = null;
        }
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.V);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.a(parcel, 4, this.c, false);
        bxx.b(parcel, 5, this.d);
        bxx.a(parcel, 6, this.e, false);
        bxx.a(parcel, 7, this.f);
        bxx.a(parcel, 8, this.g);
        bxx.a(parcel, 9, this.h);
        bxx.a(parcel, 10, this.i, false);
        bxx.a(parcel, 11, this.j);
        bxx.b(parcel, 12, this.k);
        bxx.a(parcel, 13, this.l, false);
        bxx.a(parcel, 14, this.m);
        bxx.a(parcel, 15, this.n, false);
        bxx.a(parcel, 18, this.o);
        bxx.a(parcel, 19, this.p, false);
        bxx.a(parcel, 21, this.q, false);
        bxx.a(parcel, 22, this.r);
        bxx.a(parcel, 23, this.s);
        bxx.a(parcel, 24, this.t);
        bxx.a(parcel, 25, this.u);
        bxx.a(parcel, 26, this.v);
        bxx.a(parcel, 28, (Parcelable) this.W, i2, false);
        bxx.a(parcel, 29, this.w, false);
        bxx.a(parcel, 30, this.x, false);
        bxx.a(parcel, 31, this.y);
        bxx.a(parcel, 32, this.z);
        bxx.a(parcel, 33, (Parcelable) this.A, i2, false);
        bxx.a(parcel, 34, this.B, false);
        bxx.a(parcel, 35, this.C, false);
        bxx.a(parcel, 36, this.D);
        bxx.a(parcel, 37, (Parcelable) this.E, i2, false);
        bxx.a(parcel, 38, this.F);
        bxx.a(parcel, 39, this.G, false);
        bxx.a(parcel, 40, this.H, false);
        bxx.a(parcel, 42, this.I);
        bxx.a(parcel, 43, this.J, false);
        bxx.a(parcel, 44, (Parcelable) this.K, i2, false);
        bxx.a(parcel, 45, this.L, false);
        bxx.a(parcel, 46, this.M);
        bxx.a(parcel, 47, this.N);
        bxx.a(parcel, 48, this.X, false);
        bxx.a(parcel, 49, this.O);
        bxx.b(parcel, 50, this.P);
        bxx.a(parcel, 51, this.Q);
        bxx.a(parcel, 52, this.R, false);
        bxx.a(parcel, 53, this.S);
        bxx.a(parcel, 54, this.T, false);
        bxx.b(parcel, a2);
    }
}
