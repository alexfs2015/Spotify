package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: dry reason: default package */
public final class dry extends bxf {
    public static final Creator<dry> CREATOR = new drz();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public dry(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public dry(bev bev) {
        this(bev.a, bev.b, bev.c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, this.a);
        bxg.a(parcel, 3, this.b);
        bxg.a(parcel, 4, this.c);
        bxg.b(parcel, a2);
    }
}
