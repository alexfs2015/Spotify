package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: mex reason: default package */
public final class mex implements vua<mew> {
    private final wlc<Context> a;
    private final wlc<rox> b;
    private final wlc<Scheduler> c;

    private mex(wlc<Context> wlc, wlc<rox> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mex a(wlc<Context> wlc, wlc<rox> wlc2, wlc<Scheduler> wlc3) {
        return new mex(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mew((Context) this.a.get(), (rox) this.b.get(), (Scheduler) this.c.get());
    }
}
