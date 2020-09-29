package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cey
/* renamed from: dup reason: default package */
public final class dup extends bxf {
    public static final Creator<dup> CREATOR = new duq();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final dry f;

    public dup(int i, boolean z, int i2, boolean z2, int i3, dry dry) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = dry;
    }

    public dup(bez bez) {
        boolean z = bez.a;
        int i = bez.b;
        boolean z2 = bez.c;
        int i2 = bez.d;
        dry dry = bez.e != null ? new dry(bez.e) : null;
        this(3, z, i, z2, i2, dry);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.a);
        bxg.a(parcel, 2, this.b);
        bxg.b(parcel, 3, this.c);
        bxg.a(parcel, 4, this.d);
        bxg.b(parcel, 5, this.e);
        bxg.a(parcel, 6, (Parcelable) this.f, i, false);
        bxg.b(parcel, a2);
    }
}
