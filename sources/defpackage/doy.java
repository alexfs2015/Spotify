package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.List;

@cey
/* renamed from: doy reason: default package */
public final class doy extends bxf {
    public static final Creator<doy> CREATOR = new dpa();
    public final int a;
    public final long b;
    public final Bundle c;
    public final int d;
    public final List<String> e;
    public final boolean f;
    public final int g;
    public final boolean h;
    public final String i;
    public final dru j;
    public final Location k;
    public final String l;
    public final Bundle m;
    public final Bundle n;
    public final List<String> o;
    public final String p;
    public final String q;
    public final boolean r;

    public doy(int i2, long j2, Bundle bundle, int i3, List<String> list, boolean z, int i4, boolean z2, String str, dru dru, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3) {
        this.a = i2;
        this.b = j2;
        this.c = bundle == null ? new Bundle() : bundle;
        this.d = i3;
        this.e = list;
        this.f = z;
        this.g = i4;
        this.h = z2;
        this.i = str;
        this.j = dru;
        this.k = location;
        this.l = str2;
        this.m = bundle2 == null ? new Bundle() : bundle2;
        this.n = bundle3;
        this.o = list2;
        this.p = str3;
        this.q = str4;
        this.r = z3;
    }

    public final doy a() {
        String str = "com.google.ads.mediation.admob.AdMobAdapter";
        Bundle bundle = this.m.getBundle(str);
        if (bundle == null) {
            bundle = this.c;
            this.m.putBundle(str, bundle);
        }
        doy doy = new doy(this.a, this.b, bundle, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        return doy;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof doy)) {
            return false;
        }
        doy doy = (doy) obj;
        return this.a == doy.a && this.b == doy.b && bwv.a(this.c, doy.c) && this.d == doy.d && bwv.a(this.e, doy.e) && this.f == doy.f && this.g == doy.g && this.h == doy.h && bwv.a(this.i, doy.i) && bwv.a(this.j, doy.j) && bwv.a(this.k, doy.k) && bwv.a(this.l, doy.l) && bwv.a(this.m, doy.m) && bwv.a(this.n, doy.n) && bwv.a(this.o, doy.o) && bwv.a(this.p, doy.p) && bwv.a(this.q, doy.q) && this.r == doy.r;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, this.b);
        bxg.a(parcel, 3, this.c, false);
        bxg.b(parcel, 4, this.d);
        bxg.a(parcel, 5, this.e, false);
        bxg.a(parcel, 6, this.f);
        bxg.b(parcel, 7, this.g);
        bxg.a(parcel, 8, this.h);
        bxg.a(parcel, 9, this.i, false);
        bxg.a(parcel, 10, (Parcelable) this.j, i2, false);
        bxg.a(parcel, 11, (Parcelable) this.k, i2, false);
        bxg.a(parcel, 12, this.l, false);
        bxg.a(parcel, 13, this.m, false);
        bxg.a(parcel, 14, this.n, false);
        bxg.a(parcel, 15, this.o, false);
        bxg.a(parcel, 16, this.p, false);
        bxg.a(parcel, 17, this.q, false);
        bxg.a(parcel, 18, this.r);
        bxg.b(parcel, a2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), this.e, Boolean.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.h), this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, Boolean.valueOf(this.r)});
    }
}
