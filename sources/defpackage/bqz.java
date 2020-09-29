package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bqz reason: default package */
public final class bqz extends ehk implements bra {
    bqz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final cbi a() {
        Parcel a = a(5, e());
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
