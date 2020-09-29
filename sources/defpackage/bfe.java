package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

@cey
/* renamed from: bfe reason: default package */
public final class bfe extends bxf {
    public static final Creator<bfe> CREATOR = new bfg();
    public final boolean a;
    public final dqm b;

    bfe(boolean z, IBinder iBinder) {
        this.a = z;
        this.b = iBinder != null ? dqn.a(iBinder) : null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 1, this.a);
        dqm dqm = this.b;
        bxg.a(parcel, 2, dqm == null ? null : dqm.asBinder(), false);
        bxg.b(parcel, a2);
    }
}
