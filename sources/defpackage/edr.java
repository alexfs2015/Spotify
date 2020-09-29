package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: edr reason: default package */
public final class edr extends dko implements edp {
    edr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int a() {
        Parcel a = a(1, K_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
