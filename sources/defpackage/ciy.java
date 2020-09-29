package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: ciy reason: default package */
public final class ciy extends djx implements ciw {
    ciy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(7, K_);
    }

    public final void a(cil cil) {
        Parcel K_ = K_();
        djz.a(K_, (IInterface) cil);
        b(5, K_);
    }

    public final void b() {
        b(2, K_());
    }

    public final void c() {
        b(3, K_());
    }

    public final void d() {
        b(4, K_());
    }

    public final void e() {
        b(6, K_());
    }

    public final void f() {
        b(8, K_());
    }
}
