package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

@cey
/* renamed from: dxg reason: default package */
public final class dxg extends bwg<dxl> {
    dxg(Context context, Looper looper, a aVar, b bVar) {
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
        return queryLocalInterface instanceof dxl ? (dxl) queryLocalInterface : new dxm(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    public final dxl s() {
        return (dxl) super.q();
    }
}
