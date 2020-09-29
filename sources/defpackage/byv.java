package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: byv reason: default package */
public abstract class byv extends eix implements byu {
    public static byu a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        if (queryLocalInterface instanceof byu) {
            return (byu) queryLocalInterface;
        }
        return new byw(iBinder);
    }
}
