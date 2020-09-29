package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@cfp
/* renamed from: bfv reason: default package */
public final class bfv extends bxw {
    public static final Creator<bfv> CREATOR = new bfx();
    public final boolean a;
    public final drd b;

    bfv(boolean z, IBinder iBinder) {
        this.a = z;
        this.b = iBinder != null ? dre.a(iBinder) : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.a(parcel, 1, this.a);
        drd drd = this.b;
        bxx.a(parcel, 2, drd == null ? null : drd.asBinder(), false);
        bxx.b(parcel, a2);
    }
}
