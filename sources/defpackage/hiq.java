package defpackage;

import android.app.Service;
import android.content.Context;

/* renamed from: hiq reason: default package */
public final class hiq implements vua<hip> {
    private final wlc<Context> a;
    private final wlc<Class<? extends Service>> b;
    private final wlc<a> c;

    private hiq(wlc<Context> wlc, wlc<Class<? extends Service>> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hiq a(wlc<Context> wlc, wlc<Class<? extends Service>> wlc2, wlc<a> wlc3) {
        return new hiq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hip((Context) this.a.get(), (Class) this.b.get(), (a) this.c.get());
    }
}
