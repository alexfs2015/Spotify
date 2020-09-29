package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dre reason: default package */
public abstract class dre extends dkp implements drd {
    public dre() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static drd a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof drd ? (drd) queryLocalInterface : new drf(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
