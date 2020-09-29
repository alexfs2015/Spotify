package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bya reason: default package */
public final class bya extends egb implements bwu {
    bya(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final car a(car car, bxa bxa) {
        Parcel a = a();
        egd.a(a, (IInterface) car);
        egd.a(a, (Parcelable) bxa);
        Parcel a2 = a(2, a);
        car a3 = a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
