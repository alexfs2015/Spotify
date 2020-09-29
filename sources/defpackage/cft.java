package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

@cey
/* renamed from: cft reason: default package */
public final class cft extends bwg<cgc> {
    public cft(Context context, Looper looper, a aVar, b bVar) {
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        super(context, looper, 8, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.ads.service.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof cgc ? (cgc) queryLocalInterface : new cge(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final cgc s() {
        return (cgc) super.q();
    }
}
