package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: drw reason: default package */
public final class drw extends bxw {
    public static final Creator<drw> CREATOR = new drx();
    public final int a;

    public drw(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 2, this.a);
        bxx.b(parcel, a2);
    }
}
