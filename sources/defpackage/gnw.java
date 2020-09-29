package defpackage;

import android.os.Parcelable;

/* renamed from: gnw reason: default package */
public final class gnw {
    public final gnl<? extends Parcelable> a;
    public final Runnable b;
    public final defpackage.gnx.b c;

    /* renamed from: gnw$a */
    public interface a {
        void onError(Throwable th);
    }

    /* renamed from: gnw$b */
    public interface b {
        void onSuccess(defpackage.gnl.a aVar);
    }

    public gnw(gnl<? extends Parcelable> gnl, Runnable runnable, defpackage.gnx.b bVar) {
        this.a = (gnl) fbp.a(gnl);
        this.b = (Runnable) fbp.a(runnable);
        this.c = (defpackage.gnx.b) fbp.a(bVar);
    }
}
