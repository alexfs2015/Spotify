package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: drn reason: default package */
public final class drn extends dko implements drl {
    drn(IBinder iBinder) {
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

    public final void a(cbi cbi, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) cbi);
        K_.writeString(str);
        b(5, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(3, K_);
    }

    public final void a(String str, cbi cbi) {
        Parcel K_ = K_();
        K_.writeString(str);
        dkq.a(K_, (IInterface) cbi);
        b(6, K_);
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
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
        boolean a2 = dkq.a(a);
        a.recycle();
        return a2;
    }
}
