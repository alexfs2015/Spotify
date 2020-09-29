package defpackage;

import android.os.Parcel;

/* renamed from: bqr reason: default package */
public abstract class bqr extends egx implements bqs {
    public bqr() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a(parcel.readString(), parcel.readString());
            parcel2.writeNoException();
        } else if (i == 2) {
            a(parcel.readString(), (boa) ehz.a(parcel, boa.CREATOR));
            parcel2.writeNoException();
        } else if (i == 3) {
            a(parcel.readString());
            parcel2.writeNoException();
        } else if (i == 4) {
            a(parcel.readInt());
            parcel2.writeNoException();
        } else if (i != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
