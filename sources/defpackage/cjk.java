package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cjk reason: default package */
public final class cjk extends dko implements cjh {
    cjk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    public final void a() {
        b(2, K_());
    }

    public final void a(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(9, K_);
    }

    public final void a(cjf cjf) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cjf);
        b(16, K_);
    }

    public final void a(cjn cjn) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cjn);
        b(3, K_);
    }

    public final void a(cjt cjt) {
        Parcel K_ = K_();
        dkq.a(K_, (Parcelable) cjt);
        b(1, K_);
    }

    public final void a(dqz dqz) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dqz);
        b(14, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(13, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
        b(34, K_);
    }

    public final Bundle b() {
        Parcel a = a(15, K_());
        Bundle bundle = (Bundle) dkq.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }

    public final void b(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(10, K_);
    }

    public final void c(cbi cbi) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        b(11, K_);
    }

    public final boolean c() {
        Parcel a = a(5, K_());
        boolean a2 = dkq.a(a);
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
