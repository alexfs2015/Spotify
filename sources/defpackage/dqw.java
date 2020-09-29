package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dqw reason: default package */
public final class dqw extends djx implements dqu {
    dqw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(float f) {
        Parcel K_ = K_();
        K_.writeFloat(f);
        b(2, K_);
    }

    public final void a(car car, String str) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) car);
        K_.writeString(str);
        b(5, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(3, K_);
    }

    public final void a(String str, car car) {
        Parcel K_ = K_();
        K_.writeString(str);
        djz.a(K_, (IInterface) car);
        b(6, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        djz.a(K_, z);
        b(4, K_);
    }

    public final float b() {
        Parcel a = a(7, K_());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean c() {
        Parcel a = a(8, K_());
        boolean a2 = djz.a(a);
        a.recycle();
        return a2;
    }
}
