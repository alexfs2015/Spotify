package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: eez reason: default package */
public final class eez extends eeu implements eex {
    eez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String a() {
        Parcel a = a(1, L_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean b() {
        Parcel L_ = L_();
        eew.b(L_);
        Parcel a = a(2, L_);
        boolean a2 = eew.a(a);
        a.recycle();
        return a2;
    }

    public final boolean c() {
        Parcel a = a(6, L_());
        boolean a2 = eew.a(a);
        a.recycle();
        return a2;
    }
}
