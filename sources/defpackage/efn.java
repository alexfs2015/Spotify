package defpackage;

import android.os.Parcel;

/* renamed from: efn reason: default package */
public class efn {
    static {
        efn.class.getClassLoader();
    }

    private efn() {
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static void b(Parcel parcel) {
        parcel.writeInt(1);
    }
}
