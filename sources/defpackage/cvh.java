package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: cvh reason: default package */
public abstract class cvh extends djy implements cvg {
    public static cvg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.omid.IOmid");
        return queryLocalInterface instanceof cvg ? (cvg) queryLocalInterface : new cvi(iBinder);
    }
}
