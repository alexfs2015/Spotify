package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: gmo reason: default package */
public final class gmo implements vua<gmn> {
    private final wlc<Context> a;
    private final wlc<String> b;
    private final wlc<jro> c;
    private final wlc<Scheduler> d;
    private final wlc<ghm> e;
    private final wlc<Boolean> f;

    private gmo(wlc<Context> wlc, wlc<String> wlc2, wlc<jro> wlc3, wlc<Scheduler> wlc4, wlc<ghm> wlc5, wlc<Boolean> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static gmo a(wlc<Context> wlc, wlc<String> wlc2, wlc<jro> wlc3, wlc<Scheduler> wlc4, wlc<ghm> wlc5, wlc<Boolean> wlc6) {
        gmo gmo = new gmo(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return gmo;
    }

    public final /* synthetic */ Object get() {
        gmn gmn = new gmn((Context) this.a.get(), (String) this.b.get(), (jro) this.c.get(), (Scheduler) this.d.get(), (ghm) this.e.get(), ((Boolean) this.f.get()).booleanValue());
        return gmn;
    }
}
