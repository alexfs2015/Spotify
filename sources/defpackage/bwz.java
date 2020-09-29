package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bwz reason: default package */
public final class bwz extends bxf {
    public static final Creator<bwz> CREATOR = new byg();
    public IBinder a;
    public ConnectionResult b;
    public boolean c;
    public boolean d;
    private final int e;

    bwz(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.e = i;
        this.a = iBinder;
        this.b = connectionResult;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwz)) {
            return false;
        }
        bwz bwz = (bwz) obj;
        return this.b.equals(bwz.b) && a.a(this.a).equals(a.a(bwz.a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.e);
        bxg.a(parcel, 2, this.a, false);
        bxg.a(parcel, 3, (Parcelable) this.b, i, false);
        bxg.a(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.b(parcel, a2);
    }
}
