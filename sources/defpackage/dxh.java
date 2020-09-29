package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dxh reason: default package */
public abstract class dxh extends dkp implements dxg {
    public dxh() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        dxl dxl;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dxl = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            dxl = queryLocalInterface instanceof dxl ? (dxl) queryLocalInterface : new dxn(readStrongBinder);
        }
        a(dxl);
        parcel2.writeNoException();
        return true;
    }
}
