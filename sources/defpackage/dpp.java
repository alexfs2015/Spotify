package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

@cfp
/* renamed from: dpp reason: default package */
public final class dpp extends bxw {
    public static final Creator<dpp> CREATOR = new dpr();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final dsl j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    public final boolean r;

    public dpp(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, dsl dsl, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.a = i2;
        this.b = j2;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i3;
        this.e = list;
        this.f = z;
        this.g = i4;
        this.h = z2;
        this.i = str;
        this.j = dsl;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    public final dpp a() {
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        Bundle bundle = this.m.getBundle(str);
        if (bundle == null) {
            bundle = this.c;
            this.m.putBundle(str, bundle);
        }
        dpp dpp = new dpp(this.a, this.b, bundle, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        return dpp;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dpp)) {
            return false;
        }
        dpp dpp = (dpp) obj;
        return this.a == dpp.a && this.b == dpp.b && bxm.a(this.c, dpp.c) && this.d == dpp.d && bxm.a(this.e, dpp.e) && this.f == dpp.f && this.g == dpp.g && this.h == dpp.h && bxm.a(this.i, dpp.i) && bxm.a(this.j, dpp.j) && bxm.a(this.k, dpp.k) && bxm.a(this.l, dpp.l) && bxm.a(this.m, dpp.m) && bxm.a(this.n, dpp.n) && bxm.a(this.o, dpp.o) && bxm.a(this.p, dpp.p) && bxm.a(this.q, dpp.q) && this.r == dpp.r;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r)});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, this.b);
        bxx.a(parcel, 3, this.c, false);
        bxx.b(parcel, 4, this.d);
        bxx.a(parcel, 5, this.e, false);
        bxx.a(parcel, 6, this.f);
        bxx.b(parcel, 7, this.g);
        bxx.a(parcel, 8, this.h);
        bxx.a(parcel, 9, this.i, false);
        bxx.a(parcel, 10, (Parcelable) this.j, i2, false);
        bxx.a(parcel, 11, (Parcelable) this.k, i2, false);
        bxx.a(parcel, 12, this.l, false);
        bxx.a(parcel, 13, this.m, false);
        bxx.a(parcel, 14, this.n, false);
        bxx.a(parcel, 15, this.o, false);
        bxx.a(parcel, 16, this.p, false);
        bxx.a(parcel, 17, this.q, false);
        bxx.a(parcel, 18, this.r);
        bxx.b(parcel, a2);
    }
}
