package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: byw reason: default package */
public final class byw extends eiw implements byu {
    byw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(can can, car car) {
        Parcel c = c();
        eiy.a(c, (Parcelable) can);
        eiy.a(c, (IInterface) car);
        Parcel a = a(5, c);
        boolean a2 = eiy.a(a);
        a.recycle();
        return a2;
    }
}
