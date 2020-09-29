package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cck reason: default package */
public final class cck extends djx implements cci {
    cck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void a(int i, int i2, Intent intent) {
        Parcel K_ = K_();
        K_.writeInt(i);
        K_.writeInt(i2);
        djz.a(K_, (Parcelable) intent);
        b(12, K_);
    }

    public final void a(Bundle bundle) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) bundle);
        b(1, K_);
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(13, K_);
    }

    public final void b(Bundle bundle) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) bundle);
        Parcel a = a(6, K_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    public final void d() {
        b(10, K_());
    }

    public final boolean e() {
        Parcel a = a(11, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final void f() {
        b(2, K_());
    }

    public final void g() {
        b(3, K_());
    }

    public final void h() {
        b(4, K_());
    }

    public final void i() {
        b(5, K_());
    }

    public final void j() {
        b(7, K_());
    }

    public final void k() {
        b(8, K_());
    }

    public final void l() {
        b(9, K_());
    }
}
