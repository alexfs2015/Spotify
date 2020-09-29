package defpackage;

import com.google.common.collect.Lists;
import com.spotify.music.features.fullscreen.story.logger.FullscreenStoryLogger;
import com.spotify.stories.v1.view.proto.Chapter;
import com.spotify.stories.v1.view.proto.Chapter.ChapterCase;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ngm reason: default package */
public final class ngm {
    private final ngo a;
    private final ngp b;
    private final ngk c;
    private final ngu d;
    private final ngt e;
    private final Scheduler f;
    private final Scheduler g;
    private final nfq h;
    private final nfm i;
    private final FullscreenStoryLogger j;

    public ngm(ngu ngu, ngo ngo, ngk ngk, ngp ngp, ngt ngt, Scheduler scheduler, Scheduler scheduler2, nfq nfq, nfm nfm, FullscreenStoryLogger fullscreenStoryLogger) {
        this.d = ngu;
        this.a = ngo;
        this.b = ngp;
        this.c = ngk;
        this.e = ngt;
        this.f = scheduler;
        this.g = scheduler2;
        this.h = nfq;
        this.i = nfm;
        this.j = fullscreenStoryLogger;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ nge a(f fVar) {
        this.e.a(fVar.c, fVar.b);
        return new k(fVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.h.a(bVar.a, bVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.j.a(dVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        nfm nfm = this.i;
        List<Chapter> list = gVar.a;
        ArrayList<String> a2 = Lists.a();
        for (Chapter chapter : list) {
            if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                a2.add(chapter.k().f);
                if (!fbo.a(chapter.k().k().f)) {
                    a2.add(chapter.k().k().f);
                }
            }
        }
        for (String a3 : a2) {
            nfm.a.a(a3).i();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        this.h.a(hVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(i iVar) {
        this.h.a(iVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(j jVar) {
        this.c.a(jVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(l lVar) {
        this.e.a(lVar.a);
    }

    public final ObservableTransformer<ngc, nge> a() {
        a a2 = kok.a().a(c.class, this.a.a()).a(k.class, this.b.a());
        Class<f> cls = f.class;
        $$Lambda$ngm$rkEO00aqfdeXmaSXbUkRiH3FsXs r2 = new $$Lambda$ngm$rkEO00aqfdeXmaSXbUkRiH3FsXs(this);
        Scheduler scheduler = this.f;
        koa.a(cls);
        koa.a(r2);
        ngu ngu = this.d;
        ngu.getClass();
        ngu ngu2 = this.d;
        ngu2.getClass();
        return a2.a(cls, kon.a((Function<F, E>) r2, scheduler)).a(a.class, (Action) new $$Lambda$6vjoRRAEdEVKxakxzhbCbdRi498(ngu), this.f).a(e.class, (Action) new $$Lambda$6vjoRRAEdEVKxakxzhbCbdRi498(ngu2), this.f).a(j.class, (Consumer<G>) new $$Lambda$ngm$5Rldph8_E1qCmNt16Ej7wxT453o<G>(this), this.f).a(l.class, (Consumer<G>) new $$Lambda$ngm$Twm5LTWqOYfAEL2Ei4r9mLbPCM<G>(this), this.f).a(b.class, (Consumer<G>) new $$Lambda$ngm$POc5QUKf31l2MjHYaLqWegxKDg<G>(this), this.f).a(i.class, (Consumer<G>) new $$Lambda$ngm$NSk2n2EpEJatqCkPZcTFIjKmWEQ<G>(this), this.f).a(g.class, (Consumer<G>) new $$Lambda$ngm$GV3npqdpM5Cd2j7ZDXw2PEYLOs<G>(this), this.g).a(d.class, (Consumer<G>) new $$Lambda$ngm$g6L20uefkBC10Fcf_D3BRGHDf3c<G>(this), this.g).a(h.class, (Consumer<G>) new $$Lambda$ngm$1WpaPLdSBFnLUjNSxK8m4Lki0S8<G>(this), this.f).a();
    }
}
