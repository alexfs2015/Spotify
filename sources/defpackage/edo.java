package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: edo reason: default package */
public final class edo extends dko implements edm {
    edo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(3, K_);
    }

    public final void a(dwn dwn, String str) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) dwn);
        K_.writeString(str);
        b(10, K_);
    }

    public final void a(edp edp) {
        Parcel K_ = K_();
        dkq.a(K_, (IInterface) edp);
        b(7, K_);
    }

    public final void a(String str) {
        Parcel K_ = K_();
        K_.writeString(str);
        b(12, K_);
    }

    public final void a(String str, String str2) {
        Parcel K_ = K_();
        K_.writeString(str);
        K_.writeString(str2);
        b(9, K_);
    }

    public final void b() {
        b(2, K_());
    }

    public final void c() {
        b(4, K_());
    }

    public final void d() {
        b(5, K_());
    }

    public final void e() {
        b(6, K_());
    }

    public final void f() {
        b(8, K_());
    }

    public final void g() {
        b(11, K_());
    }
}
