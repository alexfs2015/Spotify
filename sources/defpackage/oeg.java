package defpackage;

import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;

/* renamed from: oeg reason: default package */
public final class oeg {
    public static ObservableTransformer<odp, odq> a(vid vid, lar lar, tmu tmu, rpa rpa, ttf ttf, Scheduler scheduler) {
        SkipToPrevTrackOptions build = SkipToPrevTrackOptions.builder().allowSeeking(Boolean.FALSE).build();
        ttf.getClass();
        tmu.getClass();
        return kok.a().a(c.class, (ObservableTransformer<G, E>) new $$Lambda$oeg$3rja1WDPhCKC3M7ySJHcXcUtjU<G,E>(vid)).a(d.class, (ObservableTransformer<G, E>) new $$Lambda$oeg$UhL7avHSf5zaHJ7KctEUkd3ewwc<G,E>(vid)).a(e.class, (ObservableTransformer<G, E>) new $$Lambda$oeg$3qfa67xxEGYcQwaFhJHWoSFa4<G,E>(vid)).a(f.class, (ObservableTransformer<G, E>) new $$Lambda$oeg$uVvf2OmScjMA6Ne2G184kulwjY<G,E>(vid, new j(SkipToPrevTrackCommand.builder().options(build).build()))).a(g.class, (Action) new $$Lambda$oeg$aYjaHxBEK1QWeDO6ng3qcmnRJz0(rpa)).a(h.class, (Action) new $$Lambda$f4kLuPY9BbiSZUzBAGpGka5490k(ttf)).a(a.class, (Consumer<G>) new $$Lambda$oeg$6GlNAwC5wm1OtUZepnoROodO3AU<G>(lar)).a(b.class, (Action) new $$Lambda$jUNIbXeSk_FczJhYJEho3yp9U(tmu), scheduler).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(lar lar, a aVar) {
        if (aVar.b.f()) {
            lar.a(aVar.b.b(), true);
        } else {
            lar.a(aVar.b.b(), aVar.a, true);
        }
    }
}
