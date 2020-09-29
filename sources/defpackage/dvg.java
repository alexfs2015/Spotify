package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dvg reason: default package */
public final class dvg extends djx implements dve {
    dvg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final car a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        Parcel a = a(2, K_);
        car a2 = a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void a() {
        b(4, K_());
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(3, K_);
    }

    public final void a(car car, int i) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeInt(i);
        b(5, K_);
    }

    public final void a(String str, car car) {
        Parcel K_ = K_();
        K_.writeString(str);
        djz.a(K_, (IInterface) car);
        b(1, K_);
    }

    public final void b(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(6, K_);
    }
}
