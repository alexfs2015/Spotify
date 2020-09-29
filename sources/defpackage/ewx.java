package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ewx reason: default package */
public final class ewx extends bxf {
    public static final Creator<ewx> CREATOR = new ewy();
    public final ConnectionResult a;
    public final bwz b;
    private final int c;

    ewx(int i, ConnectionResult connectionResult, bwz bwz) {
        this.c = i;
        this.a = connectionResult;
        this.b = bwz;
    }

    public ewx() {
        this(new ConnectionResult(8, null));
    }

    private ewx(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxg.a(parcel, 20293);
        bxg.b(parcel, 1, this.c);
        bxg.a(parcel, 2, (Parcelable) this.a, i, false);
        bxg.a(parcel, 3, (Parcelable) this.b, i, false);
        bxg.b(parcel, a2);
    }
}
