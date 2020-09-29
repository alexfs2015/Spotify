package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: ewh reason: default package */
public final class ewh extends bxw {
    public static final Creator<ewh> CREATOR = new ewi();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;

    ewh(String str, String str2, String str3, long j2, String str4, long j3, long j4, String str5, boolean z, boolean z2, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7) {
        bxo.a(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j2;
        this.d = str4;
        this.e = j3;
        this.f = j4;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
    }

    ewh(String str, String str2, String str3, String str4, long j2, long j3, String str5, boolean z, boolean z2, long j4, String str6, long j5, long j6, int i2, boolean z3, boolean z4, boolean z5, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j4;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j5;
        this.m = j6;
        this.n = i2;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.a(parcel, 4, this.c, false);
        bxx.a(parcel, 5, this.d, false);
        bxx.a(parcel, 6, this.e);
        bxx.a(parcel, 7, this.f);
        bxx.a(parcel, 8, this.g, false);
        bxx.a(parcel, 9, this.h);
        bxx.a(parcel, 10, this.i);
        bxx.a(parcel, 11, this.j);
        bxx.a(parcel, 12, this.k, false);
        bxx.a(parcel, 13, this.l);
        bxx.a(parcel, 14, this.m);
        bxx.b(parcel, 15, this.n);
        bxx.a(parcel, 16, this.o);
        bxx.a(parcel, 17, this.p);
        bxx.a(parcel, 18, this.q);
        bxx.a(parcel, 19, this.r, false);
        bxx.b(parcel, a2);
    }
}
