package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: dkt reason: default package */
public abstract class dkt extends dkp implements dks {
    public static dks a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof dks ? (dks) queryLocalInterface : new dku(iBinder);
    }
}
