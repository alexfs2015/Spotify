package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dwz reason: default package */
public abstract class dwz extends dkp implements dwy {
    public dwz() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        dwn dwn;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            dwn = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            dwn = queryLocalInterface instanceof dwn ? (dwn) queryLocalInterface : new dwp(readStrongBinder);
        }
        a(dwn, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
