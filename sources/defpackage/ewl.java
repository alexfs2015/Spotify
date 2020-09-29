package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ewl reason: default package */
public final class ewl extends bxw {
    public static final Creator<ewl> CREATOR = new ewm();
    public String a;
    public String b;
    public ewa c;
    public long d;
    public boolean e;
    public String f;
    public erb g;
    public long h;
    public erb i;
    public long j;
    public erb k;

    ewl(ewl ewl) {
        bxo.a(ewl);
        this.a = ewl.a;
        this.b = ewl.b;
        this.c = ewl.c;
        this.d = ewl.d;
        this.e = ewl.e;
        this.f = ewl.f;
        this.g = ewl.g;
        this.h = ewl.h;
        this.i = ewl.i;
        this.j = ewl.j;
        this.k = ewl.k;
    }

    ewl(String str, String str2, ewa ewa, long j2, boolean z, String str3, erb erb, long j3, erb erb2, long j4, erb erb3) {
        this.a = str;
        this.b = str2;
        this.c = ewa;
        this.d = j2;
        this.e = z;
        this.f = str3;
        this.g = erb;
        this.h = j3;
        this.i = erb2;
        this.j = j4;
        this.k = erb3;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, this.b, false);
        bxx.a(parcel, 4, (Parcelable) this.c, i2, false);
        bxx.a(parcel, 5, this.d);
        bxx.a(parcel, 6, this.e);
        bxx.a(parcel, 7, this.f, false);
        bxx.a(parcel, 8, (Parcelable) this.g, i2, false);
        bxx.a(parcel, 9, this.h);
        bxx.a(parcel, 10, (Parcelable) this.i, i2, false);
        bxx.a(parcel, 11, this.j);
        bxx.a(parcel, 12, (Parcelable) this.k, i2, false);
        bxx.b(parcel, a2);
    }
}
