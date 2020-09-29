package defpackage;

import android.content.Context;
import io.reactivex.Scheduler;

/* renamed from: izc reason: default package */
public final class izc implements vua<izb> {
    private final wlc<Context> a;
    private final wlc<Scheduler> b;

    private izc(wlc<Context> wlc, wlc<Scheduler> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static izc a(wlc<Context> wlc, wlc<Scheduler> wlc2) {
        return new izc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new izb((Context) this.a.get(), (Scheduler) this.b.get());
    }
}
