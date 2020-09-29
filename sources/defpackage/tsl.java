package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: tsl reason: default package */
public final class tsl implements vua<tsi> {
    private final wlc<Context> a;
    private final wlc<b> b;
    private final wlc<jrp> c;
    private final wlc<Scheduler> d;

    private tsl(wlc<Context> wlc, wlc<b> wlc2, wlc<jrp> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static tsl a(wlc<Context> wlc, wlc<b> wlc2, wlc<jrp> wlc3, wlc<Scheduler> wlc4) {
        return new tsl(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new tsi((Context) this.a.get(), (b) this.b.get(), (jrp) this.c.get(), (Scheduler) this.d.get());
    }
}
