package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: edh reason: default package */
public abstract class edh extends dkp implements edg {
    public edh() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static edg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof edg ? (edg) queryLocalInterface : new edi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = a(parcel.readString());
        } else if (i == 2) {
            boolean b = b(parcel.readString());
            parcel2.writeNoException();
            dkq.a(parcel2, b);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = c(parcel.readString());
        }
        parcel2.writeNoException();
        dkq.a(parcel2, iInterface);
        return true;
    }
}
