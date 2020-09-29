package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: exo reason: default package */
public final class exo extends bxw {
    public static final Creator<exo> CREATOR = new exp();
    public final ConnectionResult a;
    public final bxq b;
    private final int c;

    public exo() {
        this(new ConnectionResult(8, null));
    }

    exo(int i, ConnectionResult connectionResult, bxq bxq) {
        this.c = i;
        this.a = connectionResult;
        this.b = bxq;
    }

    private exo(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = bxx.a(parcel, 20293);
        bxx.b(parcel, 1, this.c);
        bxx.a(parcel, 2, (Parcelable) this.a, i, false);
        bxx.a(parcel, 3, (Parcelable) this.b, i, false);
        bxx.b(parcel, a2);
    }
}
