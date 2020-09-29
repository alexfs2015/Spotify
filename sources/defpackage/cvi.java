package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: cvi reason: default package */
public final class cvi extends djx implements cvg {
    cvi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    public final car a(String str, car car, String str2, String str3, String str4) {
        Parcel K_ = K_();
        K_.writeString(str);
        djz.a(K_, (IInterface) car);
        K_.writeString(str2);
        K_.writeString(str3);
        K_.writeString(str4);
        Parcel a = a(3, K_);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final String a() {
        Parcel a = a(6, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(car car, car car2) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (IInterface) car2);
        b(5, K_);
    }

    public final boolean a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        Parcel a = a(2, K_);
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final void b(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(4, K_);
    }

    public final void c(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(7, K_);
    }
}
