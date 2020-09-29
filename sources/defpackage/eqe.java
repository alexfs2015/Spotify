package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: eqe reason: default package */
public class eqe {
    static {
        eqe.class.getClassLoader();
    }

    private eqe() {
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
