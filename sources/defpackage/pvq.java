package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Scheduler;

/* renamed from: pvq reason: default package */
public final class pvq implements vua<pvp> {
    private final wlc<Scheduler> a;
    private final wlc<a> b;
    private final wlc<uzi> c;
    private final wlc<pvt> d;

    private pvq(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<uzi> wlc3, wlc<pvt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pvq a(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<uzi> wlc3, wlc<pvt> wlc4) {
        return new pvq(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pvp((Scheduler) this.a.get(), (a) this.b.get(), (uzi) this.c.get(), (pvt) this.d.get());
    }
}
