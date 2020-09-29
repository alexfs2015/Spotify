package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dww reason: default package */
public abstract class dww extends dkp implements dwu {
    public dww() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        dwj dwj;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dwj = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            dwj = queryLocalInterface instanceof dwj ? (dwj) queryLocalInterface : new dwl(readStrongBinder);
        }
        a(dwj);
        parcel2.writeNoException();
        return true;
    }
}
