package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eda reason: default package */
public final class eda extends djx implements ecy {
    eda(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
    }

    public final int a() {
        Parcel a = a(1, K_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
