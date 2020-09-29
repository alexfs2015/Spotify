package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: byr reason: default package */
public final class byr extends egs implements bxl {
    byr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final cbi a(cbi cbi, bxr bxr) {
        Parcel a = a();
        egu.a(a, (IInterface) cbi);
        egu.a(a, (Parcelable) bxr);
        Parcel a2 = a(2, a);
        cbi a3 = a.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
