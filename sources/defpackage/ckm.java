package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ckm reason: default package */
public final class ckm extends dko implements ckk {
    ckm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void a(Bundle bundle) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) bundle);
        b(12, K_);
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(1, K_);
    }

    public final void a(cbi cbi, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeInt(i);
        b(2, K_);
    }

    public final void a(cbi cbi, cko cko) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        dkq.a(K_, (Parcelable) cko);
        b(7, K_);
    }

    public final void b(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(3, K_);
    }

    public final void b(cbi cbi, int i) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeInt(i);
        b(9, K_);
    }

    public final void c(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(4, K_);
    }

    public final void d(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(5, K_);
    }

    public final void e(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(6, K_);
    }

    public final void f(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(8, K_);
    }

    public final void g(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(10, K_);
    }

    public final void h(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(11, K_);
    }
}
