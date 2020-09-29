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

/* renamed from: nbc reason: default package */
public final class nbc {
    private final nbd a;
    private final nbe b;
    private final nbj c;
    private final nbi d;
    private final Scheduler e;
    private final Scheduler f;
    private final naj g;
    private final naf h;
    private final FullscreenStoryLogger i;

    public nbc(nbj nbj, nbd nbd, nbe nbe, nbi nbi, Scheduler scheduler, Scheduler scheduler2, naj naj, naf naf, FullscreenStoryLogger fullscreenStoryLogger) {
        this.c = nbj;
        this.a = nbd;
        this.b = nbe;
        this.d = nbi;
        this.e = scheduler;
        this.f = scheduler2;
        this.g = naj;
        this.h = naf;
        this.i = fullscreenStoryLogger;
    }

    public final ObservableTransformer<nau, naw> a() {
        a a2 = klb.a().a(c.class, this.a.a()).a(j.class, this.b.a());
        Class<f> cls = f.class;
        $$Lambda$nbc$0xcObYjXKST_D4WsmJrzwCeoi1Y r2 = new $$Lambda$nbc$0xcObYjXKST_D4WsmJrzwCeoi1Y(this);
        Scheduler scheduler = this.e;
        kkr.a(cls);
        kkr.a(r2);
        nbj nbj = this.c;
        nbj.getClass();
        nbj nbj2 = this.c;
        nbj2.getClass();
        return a2.a(cls, kle.a((Function<F, E>) r2, scheduler)).a(a.class, (Action) new $$Lambda$73268DPe969QmPkyEpZcdWe4rlc(nbj), this.e).a(e.class, (Action) new $$Lambda$73268DPe969QmPkyEpZcdWe4rlc(nbj2), this.e).a(k.class, (Consumer<G>) new $$Lambda$nbc$4gYCR_O84RANmOLJfehxz91XkvY<G>(this), this.e).a(b.class, (Consumer<G>) new $$Lambda$nbc$hTY15401aEmjMU3pZdlZGyM7n74<G>(this), this.e).a(i.class, (Consumer<G>) new $$Lambda$nbc$WWiA3fQX9t7hvqCo4Y4FiU5bU8c<G>(this), this.e).a(g.class, (Consumer<G>) new $$Lambda$nbc$XF68iI3jeWy_gl4ZJQuRyoSRuI<G>(this), this.f).a(d.class, (Consumer<G>) new $$Lambda$nbc$2lW70OojXDSENIKUtNiV2ymq3Oc<G>(this), this.f).a(h.class, (Consumer<G>) new $$Lambda$nbc$YM86bBUp3ZDlTaWdJ2e9l4zJxFA<G>(this), this.e).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ naw a(f fVar) {
        this.d.a(fVar.c, fVar.b);
        return new k(fVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar) {
        this.d.a(kVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        this.g.a(bVar.a, bVar.b);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(i iVar) {
        this.g.a(iVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        naf naf = this.h;
        List<Chapter> list = gVar.a;
        ArrayList<String> a2 = Lists.a();
        for (Chapter chapter : list) {
            if (ChapterCase.a(chapter.d) == ChapterCase.TRACK_CHAPTER) {
                a2.add(chapter.k().f);
                if (!fax.a(chapter.k().k().f)) {
                    a2.add(chapter.k().k().f);
                }
            }
        }
        for (String a3 : a2) {
            naf.a.a(a3).i();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(d dVar) {
        this.i.a(dVar.a);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(h hVar) {
        this.g.a(hVar.a);
    }
}
