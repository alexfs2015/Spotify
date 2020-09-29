package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: eey reason: default package */
public abstract class eey extends eev implements eex {
    public static eex a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof eex ? (eex) queryLocalInterface : new eez(iBinder);
    }
}
