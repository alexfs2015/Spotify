package defpackage;

import android.os.Parcel;

/* renamed from: eew reason: default package */
public class eew {
    static {
        eew.class.getClassLoader();
    }

    private eew() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel) {
        parcel.writeInt(1);
    }
}
