package defpackage;

import android.content.Context;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: umr reason: default package */
public final class umr implements vua<Flowable<Boolean>> {
    private final wlc<hvl> a;
    private final wlc<Scheduler> b;
    private final wlc<Context> c;
    private final wlc<jvy> d;

    private umr(wlc<hvl> wlc, wlc<Scheduler> wlc2, wlc<Context> wlc3, wlc<jvy> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static umr a(wlc<hvl> wlc, wlc<Scheduler> wlc2, wlc<Context> wlc3, wlc<jvy> wlc4) {
        return new umr(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(new ume((hvl) this.a.get(), (Scheduler) this.b.get(), (Context) this.c.get(), (jvy) this.d.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
