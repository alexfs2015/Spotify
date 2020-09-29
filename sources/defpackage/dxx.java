package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

@cfp
/* renamed from: dxx reason: default package */
public final class dxx extends bwx<dyc> {
    dxx(Context context, Looper looper, a aVar, b bVar) {
        super(context, looper, 166, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof dyc ? (dyc) queryLocalInterface : new dyd(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final dyc s() {
        return (dyc) super.q();
    }
}
