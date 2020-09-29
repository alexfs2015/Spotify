package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: bif reason: default package */
public final class bif extends bxf {
    public static final Creator<bif> CREATOR = new big();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final float d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    private final String i;

    bif(boolean z, boolean z2, String str, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.i = str;
        this.c = z3;
        this.d = f2;
        this.e = i2;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public bif(boolean z, boolean z2, boolean z3, float f2, int i2, boolean z4, boolean z5, boolean z6) {
        this(z, z2, null, z3, f2, i2, z4, z5, z6);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b);
        bxg.a(parcel, 4, this.i, false);
        bxg.a(parcel, 5, this.c);
        bxg.a(parcel, 6, this.d);
        bxg.b(parcel, 7, this.e);
        bxg.a(parcel, 8, this.f);
        bxg.a(parcel, 9, this.g);
        bxg.a(parcel, 10, this.h);
        bxg.b(parcel, a2);
    }
}
