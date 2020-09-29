package defpackage;

import android.os.Parcel;

@cfp
/* renamed from: dsn reason: default package */
public final class dsn extends dpt {
    public dsn(dpt dpt) {
        super(dpt.a, dpt.b, dpt.c, dpt.d, dpt.e, dpt.f, dpt.g, dpt.h, dpt.i, dpt.j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a, false);
        bxx.b(parcel, 3, this.b);
        bxx.b(parcel, 6, this.e);
        bxx.b(parcel, a);
    }
}
