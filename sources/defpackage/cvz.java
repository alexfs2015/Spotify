package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cvz reason: default package */
public final class cvz extends dko implements cvx {
    cvz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    public final cbi a(String str, cbi cbi, String str2, String str3, String str4) {
        Parcel K_ = K_();
        K_.writeString(str);
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str2);
        K_.writeString(str3);
        K_.writeString(str4);
        Parcel a = a(3, K_);
        cbi a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String a() {
        Parcel a = a(6, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(cbi cbi, cbi cbi2) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (IInterface) cbi2);
        b(5, K_);
    }

    public final boolean a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        Parcel a = a(2, K_);
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }

    public final void b(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(4, K_);
    }

    public final void c(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(7, K_);
    }
}
