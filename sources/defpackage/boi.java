package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: boi reason: default package */
public final class boi extends bxf {
    public static final Creator<boi> CREATOR = new bpg();
    public final int a;
    public final int b;
    private final int c;

    public boi(int i, int i2, int i3) {
        this.c = i;
        this.a = i2;
        this.b = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 2, this.c);
        bxg.b(parcel, 3, this.a);
        bxg.b(parcel, 4, this.b);
        bxg.b(parcel, a2);
    }
}
