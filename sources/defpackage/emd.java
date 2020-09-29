package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: emd reason: default package */
public abstract class emd extends eko implements elm {
    public static elm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof elm) {
            return (elm) queryLocalInterface;
        }
        return new emz(iBinder);
    }
}
