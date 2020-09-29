package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ekc reason: default package */
public class ekc {
    static {
        ekc.class.getClassLoader();
    }

    private ekc() {
    }

    public static void a(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
