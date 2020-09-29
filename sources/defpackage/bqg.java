package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bqg reason: default package */
public abstract class bqg extends egg implements bqh {
    public bqg() {
        super("com.google.android.gms.cast.framework.ICastStateListener");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            car a = a();
            parcel2.writeNoException();
            ehi.a(parcel2, (IInterface) a);
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
