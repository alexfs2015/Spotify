package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cdk reason: default package */
public final class cdk extends dkp implements cdi {
    public static cdi a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return queryLocalInterface instanceof cdi ? (cdi) queryLocalInterface : new cdl(iBinder);
    }
}
