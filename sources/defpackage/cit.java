package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cit reason: default package */
public final class cit extends djx implements ciq {
    cit(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void a() {
        b(2, K_());
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(9, K_);
    }

    public final void a(cio cio) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) cio);
        b(16, K_);
    }

    public final void a(ciw ciw) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) ciw);
        b(3, K_);
    }

    public final void a(cjc cjc) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) cjc);
        b(1, K_);
    }

    public final void a(dqi dqi) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) dqi);
        b(14, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(13, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        djz.a(K_, z);
        b(34, K_);
    }

    public final Bundle b() {
        Parcel a = a(15, K_());
        Bundle bundle = (Bundle) djz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void b(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(10, K_);
    }

    public final void c(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(11, K_);
    }

    public final boolean c() {
        Parcel a = a(5, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }

    public final void d() {
        b(6, K_());
    }

    public final void e() {
        b(7, K_());
    }

    public final void f() {
        b(8, K_());
    }

    public final String g() {
        Parcel a = a(12, K_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
