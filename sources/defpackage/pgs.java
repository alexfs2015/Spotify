package defpackage;

import com.spotify.music.features.podcast.entity.topic.CETopicsRolloutHelper;
import io.reactivex.Scheduler;

/* renamed from: pgs reason: default package */
public final class pgs implements wig<pgr> {
    private final wzi<CETopicsRolloutHelper> a;
    private final wzi<a> b;
    private final wzi<ueh> c;
    private final wzi<pgt> d;
    private final wzi<Scheduler> e;
    private final wzi<String> f;
    private final wzi<a> g;
    private final wzi<Boolean> h;

    private pgs(wzi<CETopicsRolloutHelper> wzi, wzi<a> wzi2, wzi<ueh> wzi3, wzi<pgt> wzi4, wzi<Scheduler> wzi5, wzi<String> wzi6, wzi<a> wzi7, wzi<Boolean> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static pgs a(wzi<CETopicsRolloutHelper> wzi, wzi<a> wzi2, wzi<ueh> wzi3, wzi<pgt> wzi4, wzi<Scheduler> wzi5, wzi<String> wzi6, wzi<a> wzi7, wzi<Boolean> wzi8) {
        pgs pgs = new pgs(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return pgs;
    }

    public final /* synthetic */ Object get() {
        pgr pgr = new pgr((CETopicsRolloutHelper) this.a.get(), wif.b(this.b), (ueh) this.c.get(), (pgt) this.d.get(), (Scheduler) this.e.get(), (String) this.f.get(), (a) this.g.get(), ((Boolean) this.h.get()).booleanValue());
        return pgr;
    }
}
