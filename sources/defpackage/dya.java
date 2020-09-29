package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: dya reason: default package */
public final class dya extends bxw {
    public static final Creator<dya> CREATOR = new dyb();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    dya(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.a = z;
        this.b = str;
        this.c = i;
        this.d = bArr;
        this.e = strArr;
        this.f = strArr2;
        this.g = z2;
        this.h = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a);
        bxx.a(parcel, 2, this.b, false);
        bxx.b(parcel, 3, this.c);
        bxx.a(parcel, 4, this.d, false);
        bxx.a(parcel, 5, this.e, false);
        bxx.a(parcel, 6, this.f, false);
        bxx.a(parcel, 7, this.g);
        bxx.a(parcel, 8, this.h);
        bxx.b(parcel, a2);
    }
}
