package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: drv reason: default package */
public final class drv extends dko implements drt {
    drv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void a() {
        b(1, K_());
    }

    public final void a(boolean z) {
        Parcel K_ = K_();
        dkq.a(K_, z);
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
}
