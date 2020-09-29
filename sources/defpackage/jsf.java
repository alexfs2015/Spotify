package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: jsf reason: default package */
public final class jsf {
    public static byte[] a(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        parcelable.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
