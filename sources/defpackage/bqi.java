package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: bqi reason: default package */
public final class bqi extends egt implements bqj {
    bqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    public final car a() {
        Parcel a = a(5, e());
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
