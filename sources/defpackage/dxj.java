package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: dxj reason: default package */
public final class dxj extends bxf {
    public static final Creator<dxj> CREATOR = new dxk();
    public final boolean a;
    public final String b;
    public final int c;
    public final byte[] d;
    public final String[] e;
    public final String[] f;
    public final boolean g;
    public final long h;

    dxj(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
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
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a);
        bxg.a(parcel, 2, this.b, false);
        bxg.b(parcel, 3, this.c);
        bxg.a(parcel, 4, this.d, false);
        bxg.a(parcel, 5, this.e, false);
        bxg.a(parcel, 6, this.f, false);
        bxg.a(parcel, 7, this.g);
        bxg.a(parcel, 8, this.h);
        bxg.b(parcel, a2);
    }
}
