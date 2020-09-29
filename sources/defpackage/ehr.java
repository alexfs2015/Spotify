package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ehr reason: default package */
public final class ehr extends bxc<eii> {
    public ehr(Context context, Looper looper, bwy bwy, b bVar, c cVar) {
        super(context, looper, 161, bwy, bVar, cVar);
    }

    public final String C_() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        return queryLocalInterface instanceof eii ? (eii) queryLocalInterface : new eil(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    public final int e() {
        return bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final bsn[] n() {
        return brp.a;
    }
}
