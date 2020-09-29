package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: dkc reason: default package */
public abstract class dkc extends djy implements dkb {
    public static dkb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return queryLocalInterface instanceof dkb ? (dkb) queryLocalInterface : new dkd(iBinder);
    }
}
