package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: eqv reason: default package */
public class eqv {
    static {
        eqv.class.getClassLoader();
    }

    private eqv() {
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
