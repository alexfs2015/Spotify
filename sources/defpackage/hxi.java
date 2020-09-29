package defpackage;

import io.reactivex.disposables.Disposables;

/* renamed from: hxi reason: default package */
public final class hxi implements a, b {
    private final gir a;

    public hxi(gir gir) {
        this.a = gir;
    }

    public final void X_() {
        gir gir = this.a;
        gir.a.a();
        gir.b.a();
    }

    public final void a() {
        this.a.a();
    }

    public final void b() {
        gir gir = this.a;
        gir.e.a(Disposables.b());
        gir.d.a(Disposables.b());
        gir.c.a.bd_();
    }

    public final String c() {
        return "HttpLifecycleListener";
    }
}
