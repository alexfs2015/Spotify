package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: erm reason: default package */
public final class erm extends bwx<ere> {
    public erm(Context context, Looper looper, a aVar, b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.measurement.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof ere ? (ere) queryLocalInterface : new erg(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final int e() {
        return bsq.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }
}
