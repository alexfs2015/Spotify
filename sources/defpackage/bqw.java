package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bqw reason: default package */
public final class bqw extends ehk implements bqu {
    bqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    public final void a(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(2, e);
    }

    public final void a(Bundle bundle) {
        Parcel e = e();
        ehz.a(e, (Parcelable) bundle);
        b(1, e);
    }

    public final void a(bnx bnx, String str, String str2, boolean z) {
        Parcel e = e();
        ehz.a(e, (Parcelable) bnx);
        e.writeString(str);
        e.writeString(str2);
        ehz.a(e, z);
        b(4, e);
    }

    public final void a(ConnectionResult connectionResult) {
        Parcel e = e();
        ehz.a(e, (Parcelable) connectionResult);
        b(3, e);
    }

    public final void a(boolean z) {
        Parcel e = e();
        ehz.a(e, z);
        e.writeInt(0);
        b(6, e);
    }

    public final void b(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(5, e);
    }
}
