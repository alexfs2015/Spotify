package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dqt reason: default package */
public final class dqt extends djx implements dqs {
    dqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
    }

    public final long a() {
        Parcel a = a(1, K_());
        long readLong = a.readLong();
        a.recycle();
        return readLong;
    }
}
