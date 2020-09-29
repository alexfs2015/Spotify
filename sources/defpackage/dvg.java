package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: dvg reason: default package */
public final class dvg extends bxw {
    public static final Creator<dvg> CREATOR = new dvh();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final dsp f;

    public dvg(int i, boolean z, int i2, boolean z2, int i3, dsp dsp) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = dsp;
    }

    public dvg(bfq bfq) {
        boolean z = bfq.a;
        int i = bfq.b;
        boolean z2 = bfq.c;
        int i2 = bfq.d;
        dsp dsp = bfq.e != null ? new dsp(bfq.e) : null;
        this(3, z, i, z2, i2, dsp);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.a);
        bxx.a(parcel, 2, this.b);
        bxx.b(parcel, 3, this.c);
        bxx.a(parcel, 4, this.d);
        bxx.b(parcel, 5, this.e);
        bxx.a(parcel, 6, (Parcelable) this.f, i, false);
        bxx.b(parcel, a2);
    }
}
