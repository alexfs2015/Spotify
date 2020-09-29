package defpackage;

import com.spotify.mobile.android.spotlets.ads.model.Event;
import io.reactivex.Scheduler;

/* renamed from: iee reason: default package */
public final class iee implements vua<ied> {
    private final wlc<gky<Event>> a;
    private final wlc<hxh> b;
    private final wlc<ify> c;
    private final wlc<Scheduler> d;

    private iee(wlc<gky<Event>> wlc, wlc<hxh> wlc2, wlc<ify> wlc3, wlc<Scheduler> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static iee a(wlc<gky<Event>> wlc, wlc<hxh> wlc2, wlc<ify> wlc3, wlc<Scheduler> wlc4) {
        return new iee(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new ied((gky) this.a.get(), (hxh) this.b.get(), (ify) this.c.get(), (Scheduler) this.d.get());
    }
}
