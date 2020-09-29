package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cjv reason: default package */
public final class cjv extends djx implements cjt {
    cjv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void a(Bundle bundle) {
        Parcel K_ = K_();
        djz.a(K_, (Parcelable) bundle);
        b(12, K_);
    }

    public final void a(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(1, K_);
    }

    public final void a(car car, int i) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeInt(i);
        b(2, K_);
    }

    public final void a(car car, cjx cjx) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        djz.a(K_, (Parcelable) cjx);
        b(7, K_);
    }

    public final void b(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(3, K_);
    }

    public final void b(car car, int i) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeInt(i);
        b(9, K_);
    }

    public final void c(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(4, K_);
    }

    public final void d(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(5, K_);
    }

    public final void e(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(6, K_);
    }

    public final void f(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(8, K_);
    }

    public final void g(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(10, K_);
    }

    public final void h(car car) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        b(11, K_);
    }
}
