package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jup reason: default package */
public final class jup {
    public static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
