package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: bzm reason: default package */
public abstract class bzm extends ejo implements bzl {
    public static bzl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof bzl ? (bzl) queryLocalInterface : new bzn(iBinder);
    }
}
