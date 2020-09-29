package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: tvo reason: default package */
public final class tvo implements vua<tvn> {
    private final wlc<tvp> a;
    private final wlc<a> b;
    private final wlc<Scheduler> c;

    private tvo(wlc<tvp> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tvo a(wlc<tvp> wlc, wlc<a> wlc2, wlc<Scheduler> wlc3) {
        return new tvo(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tvn((tvp) this.a.get(), (a) this.b.get(), (Scheduler) this.c.get());
    }
}
