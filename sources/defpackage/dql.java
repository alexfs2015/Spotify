package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: dql reason: default package */
public final class dql extends dko implements dqj {
    dql(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(int i) {
        Parcel K_ = K_();
        K_.writeInt(i);
        b(2, K_);
    }

    public final void b() {
        b(3, K_());
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
        b(7, K_());
    }
}
