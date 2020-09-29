package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: exm reason: default package */
public final class exm extends bxw {
    public static final Creator<exm> CREATOR = new exn();
    private final int a;
    private final bxp b;

    exm(int i, bxp bxp) {
        this.a = i;
        this.b = bxp;
    }

    public exm(bxp bxp) {
        this(1, bxp);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, (Parcelable) this.b, i, false);
        bxx.b(parcel, a2);
    }
}
