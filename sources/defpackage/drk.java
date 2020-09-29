package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: drk reason: default package */
public final class drk extends dko implements drj {
    drk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long a() {
        Parcel a = a(1, K_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
