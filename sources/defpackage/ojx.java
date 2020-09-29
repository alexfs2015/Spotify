package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Scheduler;

/* renamed from: ojx reason: default package */
public final class ojx implements vua<ojw> {
    private final wlc<ojs> a;
    private final wlc<OffliningLogger> b;
    private final wlc<Scheduler> c;
    private final wlc<String> d;
    private final wlc<uxt> e;
    private final wlc<uxh> f;
    private final wlc<til> g;
    private final wlc<spi> h;

    private ojx(wlc<ojs> wlc, wlc<OffliningLogger> wlc2, wlc<Scheduler> wlc3, wlc<String> wlc4, wlc<uxt> wlc5, wlc<uxh> wlc6, wlc<til> wlc7, wlc<spi> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static ojx a(wlc<ojs> wlc, wlc<OffliningLogger> wlc2, wlc<Scheduler> wlc3, wlc<String> wlc4, wlc<uxt> wlc5, wlc<uxh> wlc6, wlc<til> wlc7, wlc<spi> wlc8) {
        ojx ojx = new ojx(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return ojx;
    }

    public final /* synthetic */ Object get() {
        ojw ojw = new ojw((ojs) this.a.get(), (OffliningLogger) this.b.get(), (Scheduler) this.c.get(), (String) this.d.get(), (uxt) this.e.get(), (uxh) this.f.get(), (til) this.g.get(), (spi) this.h.get());
        return ojw;
    }
}
