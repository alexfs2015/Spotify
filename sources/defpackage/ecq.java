package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ecq reason: default package */
public abstract class ecq extends djy implements ecp {
    public ecq() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static ecp a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof ecp ? (ecp) queryLocalInterface : new ecr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        IInterface iInterface;
        if (i == 1) {
            iInterface = a(parcel.readString());
        } else if (i == 2) {
            boolean b = b(parcel.readString());
            parcel2.writeNoException();
            djz.a(parcel2, b);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            iInterface = c(parcel.readString());
        }
        parcel2.writeNoException();
        djz.a(parcel2, iInterface);
        return true;
    }
}
