package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: dsp reason: default package */
public final class dsp extends bxw {
    public static final Creator<dsp> CREATOR = new dsq();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public dsp(bfm bfm) {
        this(bfm.a, bfm.b, bfm.c);
    }

    public dsp(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 2, this.a);
        bxx.a(parcel, 3, this.b);
        bxx.a(parcel, 4, this.c);
        bxx.b(parcel, a2);
    }
}
