package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cct reason: default package */
public final class cct extends djy implements ccr {
    public static ccr a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseManager");
        return queryLocalInterface instanceof ccr ? (ccr) queryLocalInterface : new ccu(iBinder);
    }
}
