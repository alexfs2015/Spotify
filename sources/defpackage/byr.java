package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: byr reason: default package */
public abstract class byr extends eix implements byq {
    public byr() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static byq a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof byq) {
            return (byq) queryLocalInterface;
        }
        return new bys(iBinder);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            car a = a();
            parcel2.writeNoException();
            eiy.a(parcel2, (IInterface) a);
        } else if (i != 2) {
            return false;
        } else {
            int b = b();
            parcel2.writeNoException();
            parcel2.writeInt(b);
        }
        return true;
    }
}
