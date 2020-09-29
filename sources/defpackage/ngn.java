package defpackage;

import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import io.reactivex.Scheduler;

/* renamed from: ngn reason: default package */
public final class ngn implements wig<ngm> {
    private final wzi<ngu> a;
    private final wzi<ngo> b;
    private final wzi<ngk> c;
    private final wzi<ngp> d;
    private final wzi<ngt> e;
    private final wzi<Scheduler> f;
    private final wzi<Scheduler> g;
    private final wzi<nfq> h;
    private final wzi<nfm> i;
    private final wzi<FullscreenStoryLogger> j;

    public static ngm a(ngu ngu, ngo ngo, Object obj, ngp ngp, ngt ngt, Scheduler scheduler, Scheduler scheduler2, nfq nfq, nfm nfm, FullscreenStoryLogger fullscreenStoryLogger) {
        ngm ngm = new ngm(ngu, ngo, (ngk) obj, ngp, ngt, scheduler, scheduler2, nfq, nfm, fullscreenStoryLogger);
        return ngm;
    }

    public final /* synthetic */ Object get() {
        ngm ngm = new ngm((ngu) this.a.get(), (ngo) this.b.get(), (ngk) this.c.get(), (ngp) this.d.get(), (ngt) this.e.get(), (Scheduler) this.f.get(), (Scheduler) this.g.get(), (nfq) this.h.get(), (nfm) this.i.get(), (FullscreenStoryLogger) this.j.get());
        return ngm;
    }
}
