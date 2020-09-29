package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dkd reason: default package */
public final class dkd extends djx implements dkb {
    dkd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void a() {
        b(3, K_());
    }

    public final void a(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(6, K_);
    }

    public final void a(car car, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        b(2, K_);
    }

    public final void a(byte[] bArr) {
        Parcel K_ = K_();
        K_.writeByteArray(bArr);
        b(5, K_);
    }

    public final void b() {
        Parcel K_ = K_();
        K_.writeIntArray(null);
        b(4, K_);
    }

    public final void b(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(7, K_);
    }

    public final void b(car car, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        K_.writeString(null);
        b(8, K_);
    }
}
