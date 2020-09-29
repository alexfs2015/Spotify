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

@cey
/* renamed from: cfu reason: default package */
public final class cfu extends bxf {
    public static final Creator<cfu> CREATOR = new cfw();
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
    public final drf O;
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
    public final doy c;
    public final dpc d;
    public final String e;
    public final ApplicationInfo f;
    public final PackageInfo g;
    public final String h;
    public final String i;
    public final String j;
    public final coy k;
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
    public final dup y;
    public final List<String> z;

    cfu(int i2, Bundle bundle, doy doy, dpc dpc, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, coy coy, Bundle bundle2, int i3, List<String> list, Bundle bundle3, boolean z2, int i4, int i5, float f2, String str5, long j2, String str6, List<String> list2, String str7, dup dup, List<String> list3, long j3, String str8, float f3, boolean z3, int i6, int i7, boolean z4, boolean z5, String str9, String str10, boolean z6, int i8, Bundle bundle4, String str11, drf drf, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i9, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this.a = i2;
        this.b = bundle;
        this.c = doy;
        this.d = dpc;
        this.e = str;
        this.f = applicationInfo;
        this.g = packageInfo;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = coy;
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
        this.y = dup;
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
        this.O = drf;
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

    private cfu(Bundle bundle, doy doy, dpc dpc, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, coy coy, Bundle bundle2, int i2, List<String> list, List<String> list2, Bundle bundle3, boolean z2, int i3, int i4, float f2, String str5, long j2, String str6, List<String> list3, String str7, dup dup, long j3, String str8, float f3, boolean z3, int i5, int i6, boolean z4, boolean z5, String str9, String str10, boolean z6, int i7, Bundle bundle4, String str11, drf drf, boolean z7, Bundle bundle5, String str12, String str13, String str14, boolean z8, List<Integer> list4, String str15, List<String> list5, int i8, boolean z9, boolean z10, boolean z11, ArrayList<String> arrayList) {
        this(24, bundle, doy, dpc, str, applicationInfo, packageInfo, str2, str3, str4, coy, bundle2, i2, list, bundle3, z2, i3, i4, f2, str5, j2, str6, list3, str7, dup, list2, j3, str8, f3, z3, i5, i6, z4, z5, str9, str10, z6, i7, bundle4, str11, drf, z7, bundle5, str12, str13, str14, z8, list4, str15, list5, i8, z9, z10, z11, arrayList);
    }

    public cfu(cfv cfv, long j2, String str, String str2, String str3) {
        cfv cfv2 = cfv;
        long j3 = j2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Bundle bundle = cfv2.a;
        doy doy = cfv2.b;
        dpc dpc = cfv2.c;
        String str7 = "";
        String str8 = str7;
        this(bundle, doy, dpc, cfv2.d, cfv2.e, cfv2.f, (String) cpg.a(cfv2.Q, str7), cfv2.g, cfv2.h, cfv2.j, cfv2.i, cfv2.k, cfv2.l, cfv2.m, cfv2.o, cfv2.p, cfv2.q, cfv2.r, cfv2.s, cfv2.t, cfv2.u, cfv2.v, cfv2.w, cfv2.x, cfv2.y, j3, cfv2.z, cfv2.A, cfv2.B, cfv2.C, cfv2.D, cfv2.E, cfv2.F, (String) cpg.a(cfv2.G, str8, 1, TimeUnit.SECONDS), cfv2.H, cfv2.I, cfv2.J, cfv2.K, cfv2.L, cfv2.M, cfv2.N, cfv2.O, str4, str5, str6, cfv2.P, cfv2.R, cfv2.S, cfv2.n, cfv2.T, cfv2.U, cfv2.V, cfv2.W, cfv2.X);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, this.b, false);
        bxg.a(parcel, 3, (Parcelable) this.c, i2, false);
        bxg.a(parcel, 4, (Parcelable) this.d, i2, false);
        bxg.a(parcel, 5, this.e, false);
        bxg.a(parcel, 6, (Parcelable) this.f, i2, false);
        bxg.a(parcel, 7, (Parcelable) this.g, i2, false);
        bxg.a(parcel, 8, this.h, false);
        bxg.a(parcel, 9, this.i, false);
        bxg.a(parcel, 10, this.j, false);
        bxg.a(parcel, 11, (Parcelable) this.k, i2, false);
        bxg.a(parcel, 12, this.l, false);
        bxg.b(parcel, 13, this.m);
        bxg.a(parcel, 14, this.n, false);
        bxg.a(parcel, 15, this.o, false);
        bxg.a(parcel, 16, this.p);
        bxg.b(parcel, 18, this.q);
        bxg.b(parcel, 19, this.r);
        bxg.a(parcel, 20, this.s);
        bxg.a(parcel, 21, this.t, false);
        bxg.a(parcel, 25, this.u);
        bxg.a(parcel, 26, this.v, false);
        bxg.a(parcel, 27, this.w, false);
        bxg.a(parcel, 28, this.x, false);
        bxg.a(parcel, 29, (Parcelable) this.y, i2, false);
        bxg.a(parcel, 30, this.z, false);
        bxg.a(parcel, 31, this.A);
        bxg.a(parcel, 33, this.B, false);
        bxg.a(parcel, 34, this.C);
        bxg.b(parcel, 35, this.D);
        bxg.b(parcel, 36, this.E);
        bxg.a(parcel, 37, this.F);
        bxg.a(parcel, 38, this.G);
        bxg.a(parcel, 39, this.H, false);
        bxg.a(parcel, 40, this.I);
        bxg.a(parcel, 41, this.J, false);
        bxg.a(parcel, 42, this.K);
        bxg.b(parcel, 43, this.L);
        bxg.a(parcel, 44, this.M, false);
        bxg.a(parcel, 45, this.N, false);
        bxg.a(parcel, 46, (Parcelable) this.O, i2, false);
        bxg.a(parcel, 47, this.P);
        bxg.a(parcel, 48, this.Q, false);
        bxg.a(parcel, 49, this.R, false);
        bxg.a(parcel, 50, this.S, false);
        bxg.a(parcel, 51, this.T, false);
        bxg.a(parcel, 52, this.U);
        List<Integer> list = this.V;
        if (list != null) {
            int a3 = bxg.a(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel.writeInt(((Integer) list.get(i3)).intValue());
            }
            bxg.b(parcel, a3);
        }
        bxg.a(parcel, 54, this.W, false);
        bxg.a(parcel, 55, this.X, false);
        bxg.b(parcel, 56, this.Y);
        bxg.a(parcel, 57, this.Z);
        bxg.a(parcel, 58, this.aa);
        bxg.a(parcel, 59, this.ab);
        bxg.a(parcel, 60, (List<String>) this.ac, false);
        bxg.b(parcel, a2);
    }
}
