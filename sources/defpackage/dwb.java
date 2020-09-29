package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwb reason: default package */
public abstract class dwb extends dkp implements dwa {
    public dwb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static dwa a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof dwa ? (dwa) queryLocalInterface : new dwc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a(a.a(parcel.readStrongBinder()));
        } else if (i == 2) {
            a();
        } else if (i != 3) {
            return false;
        } else {
            b(a.a(parcel.readStrongBinder()));
        }
        parcel2.writeNoException();
        return true;
    }
}
