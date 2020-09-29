package defpackage;

import android.os.Parcelable;

/* renamed from: gmh reason: default package */
public final class gmh {
    public final glw<? extends Parcelable> a;
    public final Runnable b;
    public final defpackage.gmi.b c;

    /* renamed from: gmh$a */
    public interface a {
        void onError(Throwable th);
    }

    /* renamed from: gmh$b */
    public interface b {
        void onSuccess(defpackage.glw.a aVar);
    }

    public gmh(glw<? extends Parcelable> glw, Runnable runnable, defpackage.gmi.b bVar) {
        this.a = (glw) fay.a(glw);
        this.b = (Runnable) fay.a(runnable);
        this.c = (defpackage.gmi.b) fay.a(bVar);
    }
}
