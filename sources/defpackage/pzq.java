package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.features.quicksilver.triggerengine.domain.TriggerEngineModel;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import java.util.ArrayList;

/* renamed from: pzq reason: default package */
public interface pzq {

    /* renamed from: pzq$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Observable<qab> a(hgy hgy, Flowable<PlayerState> flowable, pzl pzl) {
            return hgy.a(qbb.b).j().h(new $$Lambda$pzq$_ybYCubt122fKtgvRN9o6LPBOFw(flowable.j().a((ObservableTransformer<? super T, ? extends R>) pzl)));
        }

        public static Observable<qab> a(hgy hgy, pwe pwe) {
            return hgy.a(qbb.d).j().h(new $$Lambda$pzq$fVarXEuQIbwkcf0sNJ0kJp4igFg(pwe.b.b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$pzq$ep039qZuw5cuIdXI8RiVcUYjX7o.INSTANCE)));
        }

        public static Observable<qab> a(hgy hgy, rtg rtg) {
            return hgy.a(qbb.c).j().h(new $$Lambda$pzq$oeWc6FkCs638ZSOi4RrKE_xHks(rtg.a.c((Function<? super T, ? extends R>) $$Lambda$pzq$TnsIq9mNwpIVuNYU3w_r05X0PWA.INSTANCE)));
        }

        public static Observable<qab> a(Flowable<PlayerState> flowable) {
            return flowable.j().a((ObservableTransformer<? super T, ? extends R>) $$Lambda$pzq$xhSS53eXICouqWsNRJx2JYCyg.INSTANCE);
        }

        public static /* synthetic */ ObservableSource a(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }

        public static /* synthetic */ Iterable a(pwi pwi) {
            ArrayList arrayList = new ArrayList(0);
            String str = "URI";
            if (pwi.c()) {
                arrayList.add(qab.b(pwi.a(), str));
            }
            arrayList.add(qab.a(pwi.b(), str));
            return arrayList;
        }

        public static a<TriggerEngineModel, qab, qaa> a(Observable<qab> observable, Observable<qab> observable2, Observable<qab> observable3, Observable<qab> observable4, pzj pzj, qae qae, pxt pxt, pzo pzo, qba qba, hgy hgy, qbc qbc, jty jty, Scheduler scheduler, Observable<Boolean> observable5) {
            Scheduler scheduler2 = scheduler;
            qae qae2 = qae;
            qba qba2 = qba;
            pxt pxt2 = pxt;
            return knc.a((kni<M, E, F>) $$Lambda$IJ5ShMjTBb4bLfWszCFDMZMmBzg.INSTANCE, koi.a(kok.a().a(b.class, qad.a(qae, qba)).a(e.class, qad.a(scheduler)).a(a.class, qad.a(pxt, hgy, jty)).a(d.class, qad.a(pzo)).a(c.class, qad.a(qbc)).a())).b(new $$Lambda$pzq$umCpKwl9NARB6SD0vx1FaOC_m0(scheduler2)).a((kny<koe>) new $$Lambda$pzq$zbJcasozBKGpgYZTMvLDQaUilk<koe>(scheduler2)).a((kmx<M, F>) $$Lambda$9O3Gf6suE8PAU4yt7IW2wPVgmCo.INSTANCE).a(koj.a(observable, observable2, observable4, observable3, pzj.a, observable5.c((Function<? super T, ? extends R>) $$Lambda$pzq$eqhgIsp8z_GtjH6J3JPH8UpoHjc.INSTANCE))).a(knq.a("InAppMessagingMobius"));
        }

        public static /* synthetic */ koe a(Scheduler scheduler) {
            return new kom(scheduler);
        }

        public static pxt a(pxw pxw, pxu pxu, qbh qbh, SpSharedPreferences<Object> spSharedPreferences) {
            return new pxv(pxw, qbh, pxu, spSharedPreferences);
        }

        public static pxw a(gix gix) {
            return (pxw) gix.a(pxw.class);
        }

        public static /* synthetic */ qab a(PlayerState playerState) {
            return new a(qat.a(playerState));
        }

        public static /* synthetic */ qab a(Boolean bool) {
            return bool.booleanValue() ? new c() : new b();
        }

        public static /* synthetic */ qab a(rtf rtf) {
            return (qab) rtf.a($$Lambda$pzq$Q8U8g1LsWvGAIXDrb6pgpomKAT8.INSTANCE, $$Lambda$pzq$1SjLF0OCv1tg7k8_tXUlQg5zB64.INSTANCE);
        }

        public static /* synthetic */ ObservableSource b(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }

        public static /* synthetic */ koe b(Scheduler scheduler) {
            return new kom(scheduler);
        }

        public static qaf b(gix gix) {
            return (qaf) gix.a(qaf.class);
        }

        public static /* synthetic */ ObservableSource c(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }
    }
}
