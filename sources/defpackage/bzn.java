package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bzn reason: default package */
public final class bzn extends ejn implements bzl {
    bzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final boolean a(cbe cbe, cbi cbi) {
        Parcel c = c();
        ejp.a(c, (Parcelable) cbe);
        ejp.a(c, (IInterface) cbi);
        Parcel a = a(5, c);
        boolean a2 = ejp.a(a);
        a.recycle();
        return a2;
    }
}
