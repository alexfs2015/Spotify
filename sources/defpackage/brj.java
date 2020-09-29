package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: brj reason: default package */
public abstract class brj extends egx implements bqi {
    public brj() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            cbi a = a(parcel.readString());
            parcel2.writeNoException();
            ehz.a(parcel2, (IInterface) a);
        } else if (i == 2) {
            boolean a2 = a();
            parcel2.writeNoException();
            ehz.a(parcel2, a2);
        } else if (i == 3) {
            String b = b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451009);
        }
        return true;
    }
}
