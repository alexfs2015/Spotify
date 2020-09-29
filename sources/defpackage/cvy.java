package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cvy reason: default package */
public abstract class cvy extends dkp implements cvx {
    public static cvx a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof cvx ? (cvx) queryLocalInterface : new cvz(iBinder);
    }
}
