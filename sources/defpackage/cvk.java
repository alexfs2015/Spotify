package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: cvk reason: default package */
public final class cvk extends bwg<cvp> {
    public cvk(Context context, Looper looper, a aVar, b bVar) {
        super(context, looper, a.aD, aVar, bVar, null);
    }

    public final String C_() {
        return "com.google.android.gms.gass.START";
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return queryLocalInterface instanceof cvp ? (cvp) queryLocalInterface : new cvq(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final cvp s() {
        return (cvp) super.q();
    }
}
