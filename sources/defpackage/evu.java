package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: evu reason: default package */
public final class evu extends bxf {
    public static final Creator<evu> CREATOR = new evv();
    public String a;
    public String b;
    public evj c;
    public long d;
    public boolean e;
    public String f;
    public eqk g;
    public long h;
    public eqk i;
    public long j;
    public eqk k;

    evu(evu evu) {
        bwx.a(evu);
        this.a = evu.a;
        this.b = evu.b;
        this.c = evu.c;
        this.d = evu.d;
        this.e = evu.e;
        this.f = evu.f;
        this.g = evu.g;
        this.h = evu.h;
        this.i = evu.i;
        this.j = evu.j;
        this.k = evu.k;
    }

    evu(String str, String str2, evj evj, long j2, boolean z, String str3, eqk eqk, long j3, eqk eqk2, long j4, eqk eqk3) {
        this.a = str;
        this.b = str2;
        this.c = evj;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = eqk;
        this.h = j3;
        this.i = eqk2;
        this.j = j4;
        this.k = eqk3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, this.b, false);
        bxg.a(parcel, 4, (Parcelable) this.c, i2, false);
        bxg.a(parcel, 5, this.d);
        bxg.a(parcel, 6, this.e);
        bxg.a(parcel, 7, this.f, false);
        bxg.a(parcel, 8, (Parcelable) this.g, i2, false);
        bxg.a(parcel, 9, this.h);
        bxg.a(parcel, 10, (Parcelable) this.i, i2, false);
        bxg.a(parcel, 11, this.j);
        bxg.a(parcel, 12, (Parcelable) this.k, i2, false);
        bxg.b(parcel, a2);
    }
}
