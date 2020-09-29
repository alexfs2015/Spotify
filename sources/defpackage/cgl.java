package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

@cfp
/* renamed from: cgl reason: default package */
public final class cgl extends bxw {
    public static final Creator<cgl> CREATOR = new cgn();
    public final long A;
    public final String B;
    public final float C;
    public final int D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final String H;
    public final boolean I;
    public final String J;
    public final boolean K;
    public final int L;
    public final Bundle M;
    public final String N;
    public final drw O;
    public final boolean P;
    public final Bundle Q;
    public final String R;
    public final String S;
    public final String T;
    public final boolean U;
    public final List<Integer> V;
    public final String W;
    public final List<String> X;
    public final int Y;
    public final boolean Z;
    public final int a;
    public final boolean aa;
    public final boolean ab;
    public final ArrayList<String> ac;
    public final Bundle b;
    public final dpp c;
    public final dpt d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final cpp k;
    public final Bundle l;
    public final int m;
    public final List<String> n;
    public final Bundle o;
    public final boolean p;
    public final int q;
    public final int r;
    public final float s;
    public final String t;
    public final long u;
    public final String v;
    public final List<String> w;
    public final String x;
    public final dvg y;
    public final List<String> z;

    cgl(int i2, Bundle bundle, dpp dpp, dpt dpt, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, cpp cpp, Bundle bundle2, int i3, List<String> list, Bundle bundle3, boolean z2, int i4, int i5, float f2, String str5, long j2, String str6, List<String> list2, String str7, dvg dvg, List<String> list3, long j3, String str8, float f3, boolean z3, int i6, int i7, boolean z4, boolean z5, String str9, String str10, boolean z6, int i8, Bundle bundle4, String str11, drw drw, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i9, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this.a = i2;
        this.b = bundle;
        this.c = dpp;
        this.d = dpt;
        this.e = str;
        this.f = applicationInfo;
        this.g = packageInfo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = cpp;
        this.l = bundle2;
        this.m = i3;
        this.n = list;
        this.z = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
        this.o = bundle3;
        this.p = z2;
        this.q = i4;
        this.r = i5;
        this.s = f2;
        this.t = str5;
        this.u = j2;
        this.v = str6;
        this.w = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.x = str7;
        this.y = dvg;
        this.A = j3;
        this.B = str8;
        this.C = f3;
        this.I = z3;
        this.D = i6;
        this.E = i7;
        this.F = z4;
        this.G = z5;
        this.H = str9;
        this.J = str10;
        this.K = z6;
        this.L = i8;
        this.M = bundle4;
        this.N = str11;
        this.O = drw;
        this.P = z7;
        this.Q = bundle5;
        this.R = str12;
        this.S = str13;
        this.T = str14;
        this.U = z8;
        this.V = list4;
        this.W = str15;
        this.X = list5;
        this.Y = i9;
        this.Z = z9;
        this.aa = z10;
        this.ab = z11;
        this.ac = arrayList;
    }

    private cgl(Bundle bundle, dpp dpp, dpt dpt, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, cpp cpp, Bundle bundle2, int i2, List<String> list, List<String> list2, Bundle bundle3, boolean z2, int i3, int i4, float f2, String str5, long j2, String str6, List<String> list3, String str7, dvg dvg, long j3, String str8, float f3, boolean z3, int i5, int i6, boolean z4, boolean z5, String str9, String str10, boolean z6, int i7, Bundle bundle4, String str11, drw drw, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i8, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this(24, bundle, dpp, dpt, str, applicationInfo, packageInfo, str2, str3, str4, cpp, bundle2, i2, list, bundle3, z2, i3, i4, f2, str5, j2, str6, list3, str7, dvg, list2, j3, str8, f3, z3, i5, i6, z4, z5, str9, str10, z6, i7, bundle4, str11, drw, z7, bundle5, str12, str13, str14, z8, list4, str15, list5, i8, z9, z10, z11, arrayList);
    }

    public cgl(cgm cgm, long j2, String str, String str2, String str3) {
        cgm cgm2 = cgm;
        long j3 = j2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Bundle bundle = cgm2.a;
        dpp dpp = cgm2.b;
        dpt dpt = cgm2.c;
        String str7 = "";
        String str8 = str7;
        this(bundle, dpp, dpt, cgm2.d, cgm2.e, cgm2.f, (String) cpx.a(cgm2.Q, str7), cgm2.g, cgm2.h, cgm2.j, cgm2.i, cgm2.k, cgm2.l, cgm2.m, cgm2.o, cgm2.p, cgm2.q, cgm2.r, cgm2.s, cgm2.t, cgm2.u, cgm2.v, cgm2.w, cgm2.x, cgm2.y, j3, cgm2.z, cgm2.A, cgm2.B, cgm2.C, cgm2.D, cgm2.E, cgm2.F, (String) cpx.a(cgm2.G, str8, 1, TimeUnit.SECONDS), cgm2.H, cgm2.I, cgm2.J, cgm2.K, cgm2.L, cgm2.M, cgm2.N, cgm2.O, str4, str5, str6, cgm2.P, cgm2.R, cgm2.S, cgm2.n, cgm2.T, cgm2.U, cgm2.V, cgm2.W, cgm2.X);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, this.b, false);
        bxx.a(parcel, 3, (Parcelable) this.c, i2, false);
        bxx.a(parcel, 4, (Parcelable) this.d, i2, false);
        bxx.a(parcel, 5, this.e, false);
        bxx.a(parcel, 6, (Parcelable) this.f, i2, false);
        bxx.a(parcel, 7, (Parcelable) this.g, i2, false);
        bxx.a(parcel, 8, this.h, false);
        bxx.a(parcel, 9, this.i, false);
        bxx.a(parcel, 10, this.j, false);
        bxx.a(parcel, 11, (Parcelable) this.k, i2, false);
        bxx.a(parcel, 12, this.l, false);
        bxx.b(parcel, 13, this.m);
        bxx.a(parcel, 14, this.n, false);
        bxx.a(parcel, 15, this.o, false);
        bxx.a(parcel, 16, this.p);
        bxx.b(parcel, 18, this.q);
        bxx.b(parcel, 19, this.r);
        bxx.a(parcel, 20, this.s);
        bxx.a(parcel, 21, this.t, false);
        bxx.a(parcel, 25, this.u);
        bxx.a(parcel, 26, this.v, false);
        bxx.a(parcel, 27, this.w, false);
        bxx.a(parcel, 28, this.x, false);
        bxx.a(parcel, 29, (Parcelable) this.y, i2, false);
        bxx.a(parcel, 30, this.z, false);
        bxx.a(parcel, 31, this.A);
        bxx.a(parcel, 33, this.B, false);
        bxx.a(parcel, 34, this.C);
        bxx.b(parcel, 35, this.D);
        bxx.b(parcel, 36, this.E);
        bxx.a(parcel, 37, this.F);
        bxx.a(parcel, 38, this.G);
        bxx.a(parcel, 39, this.H, false);
        bxx.a(parcel, 40, this.I);
        bxx.a(parcel, 41, this.J, false);
        bxx.a(parcel, 42, this.K);
        bxx.b(parcel, 43, this.L);
        bxx.a(parcel, 44, this.M, false);
        bxx.a(parcel, 45, this.N, false);
        bxx.a(parcel, 46, (Parcelable) this.O, i2, false);
        bxx.a(parcel, 47, this.P);
        bxx.a(parcel, 48, this.Q, false);
        bxx.a(parcel, 49, this.R, false);
        bxx.a(parcel, 50, this.S, false);
        bxx.a(parcel, 51, this.T, false);
        bxx.a(parcel, 52, this.U);
        List<Integer> list = this.V;
        if (list != null) {
            int a3 = bxx.a(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel.writeInt(((Integer) list.get(i3)).intValue());
            }
            bxx.b(parcel, a3);
        }
        bxx.a(parcel, 54, this.W, false);
        bxx.a(parcel, 55, this.X, false);
        bxx.b(parcel, 56, this.Y);
        bxx.a(parcel, 57, this.Z);
        bxx.a(parcel, 58, this.aa);
        bxx.a(parcel, 59, this.ab);
        bxx.a(parcel, 60, (List<String>) this.ac, false);
        bxx.b(parcel, a2);
    }
}
