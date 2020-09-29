package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;
import io.reactivex.Scheduler;

/* renamed from: orb reason: default package */
public final class orb implements wig<ora> {
    private final wzi<oqw> a;
    private final wzi<OffliningLogger> b;
    private final wzi<Scheduler> c;
    private final wzi<String> d;
    private final wzi<vjv> e;
    private final wzi<vjj> f;
    private final wzi<ttd> g;
    private final wzi<szp> h;

    private orb(wzi<oqw> wzi, wzi<OffliningLogger> wzi2, wzi<Scheduler> wzi3, wzi<String> wzi4, wzi<vjv> wzi5, wzi<vjj> wzi6, wzi<ttd> wzi7, wzi<szp> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static orb a(wzi<oqw> wzi, wzi<OffliningLogger> wzi2, wzi<Scheduler> wzi3, wzi<String> wzi4, wzi<vjv> wzi5, wzi<vjj> wzi6, wzi<ttd> wzi7, wzi<szp> wzi8) {
        orb orb = new orb(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return orb;
    }

    public final /* synthetic */ Object get() {
        ora ora = new ora((oqw) this.a.get(), (OffliningLogger) this.b.get(), (Scheduler) this.c.get(), (String) this.d.get(), (vjv) this.e.get(), (vjj) this.f.get(), (ttd) this.g.get(), (szp) this.h.get());
        return ora;
    }
}
