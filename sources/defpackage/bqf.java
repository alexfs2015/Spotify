package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: bqf reason: default package */
public final class bqf extends egt implements bqd {
    bqf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    public final void a(Bundle bundle) {
        Parcel e = e();
        ehi.a(e, (Parcelable) bundle);
        b(1, e);
    }

    public final void a(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(2, e);
    }

    public final void a(ConnectionResult connectionResult) {
        Parcel e = e();
        ehi.a(e, (Parcelable) connectionResult);
        b(3, e);
    }

    public final void a(bng bng, String str, String str2, boolean z) {
        Parcel e = e();
        ehi.a(e, (Parcelable) bng);
        e.writeString(str);
        e.writeString(str2);
        ehi.a(e, z);
        b(4, e);
    }

    public final void b(int i) {
        Parcel e = e();
        e.writeInt(i);
        b(5, e);
    }

    public final void a(boolean z) {
        Parcel e = e();
        ehi.a(e, z);
        e.writeInt(0);
        b(6, e);
    }
}
