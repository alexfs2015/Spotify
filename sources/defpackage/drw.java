package defpackage;

import android.os.Parcel;

@cey
/* renamed from: drw reason: default package */
public final class drw extends dpc {
    public drw(dpc dpc) {
        super(dpc.a, dpc.b, dpc.c, dpc.d, dpc.e, dpc.f, dpc.g, dpc.h, dpc.i, dpc.j);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a, false);
        bxg.b(parcel, 3, this.b);
        bxg.b(parcel, 6, this.e);
        bxg.b(parcel, a);
    }
}
