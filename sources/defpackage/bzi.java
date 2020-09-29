package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bzi reason: default package */
public abstract class bzi extends ejo implements bzh {
    public bzi() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static bzh a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof bzh ? (bzh) queryLocalInterface : new bzj(iBinder);
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            cbi a = a();
            parcel2.writeNoException();
            ejp.a(parcel2, (IInterface) a);
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
