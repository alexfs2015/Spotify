package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: eha reason: default package */
public final class eha extends bwl<ehr> {
    public eha(Context context, Looper looper, bwh bwh, b bVar, c cVar) {
        super(context, looper, 161, bwh, bVar, cVar);
    }

    public final String C_() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    public final String b() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    public final int e() {
        return brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final brw[] n() {
        return bqy.a;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof ehr) {
            return (ehr) queryLocalInterface;
        }
        return new ehu(iBinder);
    }
}
