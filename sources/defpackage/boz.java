package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: boz reason: default package */
public final class boz extends bxw {
    public static final Creator<boz> CREATOR = new bpx();
    public final int a;
    public final int b;
    private final int c;

    public boz(int i, int i2, int i3) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 2, this.c);
        bxx.b(parcel, 3, this.a);
        bxx.b(parcel, 4, this.b);
        bxx.b(parcel, a2);
    }
}
