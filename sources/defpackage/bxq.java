package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bxq reason: default package */
public final class bxq extends bxw {
    public static final Creator<bxq> CREATOR = new byx();
    public IBinder a;
    public ConnectionResult b;
    public boolean c;
    public boolean d;
    private final int e;

    bxq(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
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
        if (!(obj instanceof bxq)) {
            return false;
        }
        bxq bxq = (bxq) obj;
        return this.b.equals(bxq.b) && a.a(this.a).equals(a.a(bxq.a));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.e);
        bxx.a(parcel, 2, this.a, false);
        bxx.a(parcel, 3, (Parcelable) this.b, i, false);
        bxx.a(parcel, 4, this.c);
        bxx.a(parcel, 5, this.d);
        bxx.b(parcel, a2);
    }
}
