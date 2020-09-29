package defpackage;

import android.app.Application;
import android.os.Handler;

/* renamed from: rwn reason: default package */
public final class rwn implements vua<rwr> {
    private final wlc<glo> a;
    private final wlc<glv> b;
    private final wlc<Handler> c;
    private final wlc<Application> d;

    private rwn(wlc<glo> wlc, wlc<glv> wlc2, wlc<Handler> wlc3, wlc<Application> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static rwn a(wlc<glo> wlc, wlc<glv> wlc2, wlc<Handler> wlc3, wlc<Application> wlc4) {
        return new rwn(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (rwr) vuf.a(new rwr((glo) this.a.get(), (glv) this.b.get(), (Handler) this.c.get(), ((Application) this.d.get()).getApplicationContext()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
