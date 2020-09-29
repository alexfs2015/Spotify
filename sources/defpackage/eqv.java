package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: eqv reason: default package */
public final class eqv extends bwg<eqn> {
    public eqv(Context context, Looper looper, a aVar, b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.measurement.START";
    }

    public final String b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final int e() {
        return brz.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof eqn) {
            return (eqn) queryLocalInterface;
        }
        return new eqp(iBinder);
    }
}
