package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: lua reason: default package */
public final class lua implements vua<ltz> {
    private final wlc<Context> a;
    private final wlc<lui> b;
    private final wlc<Scheduler> c;
    private final wlc<Scheduler> d;

    private lua(wlc<Context> wlc, wlc<lui> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lua a(wlc<Context> wlc, wlc<lui> wlc2, wlc<Scheduler> wlc3, wlc<Scheduler> wlc4) {
        return new lua(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        ltz ltz = new ltz((Context) this.a.get(), (lui) this.b.get());
        ltz.a = (Scheduler) this.c.get();
        ltz.b = (Scheduler) this.d.get();
        return ltz;
    }
}
