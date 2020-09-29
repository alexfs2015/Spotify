package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: efp reason: default package */
public abstract class efp extends efm implements efo {
    public static efo a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof efo ? (efo) queryLocalInterface : new efq(iBinder);
    }
}
