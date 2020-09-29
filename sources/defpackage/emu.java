package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: emu reason: default package */
public abstract class emu extends elf implements emd {
    public static emd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return queryLocalInterface instanceof emd ? (emd) queryLocalInterface : new enq(iBinder);
    }
}
