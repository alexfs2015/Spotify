package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqx reason: default package */
public abstract class bqx extends egx implements bqy {
    public bqx() {
        super("com.google.android.gms.cast.framework.ICastStateListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            cbi a = a();
            parcel2.writeNoException();
            ehz.a(parcel2, (IInterface) a);
        } else if (i == 2) {
            a(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 3) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
