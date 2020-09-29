package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqp reason: default package */
public abstract class bqp extends egx implements bqq {
    public bqp() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            cbi a = a();
            parcel2.writeNoException();
            ehz.a(parcel2, (IInterface) a);
        } else if (i == 2) {
            b();
            parcel2.writeNoException();
        } else if (i == 3) {
            c();
            parcel2.writeNoException();
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
