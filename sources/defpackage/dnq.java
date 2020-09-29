package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

@cfp
/* renamed from: dnq reason: default package */
public final class dnq extends bwx<dnu> {
    dnq(Context context, Looper looper, a aVar, b bVar) {
        super(context, looper, 123, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof dnu ? (dnu) queryLocalInterface : new dnv(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    public final dnu s() {
        return (dnu) super.q();
    }
}
