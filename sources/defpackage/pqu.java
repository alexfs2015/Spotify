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

/* renamed from: pqu reason: default package */
public interface pqu {

    /* renamed from: pqu$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static a<TriggerEngineModel, prf, pre> a(Observable<prf> observable, Observable<prf> observable2, Observable<prf> observable3, Observable<prf> observable4, pqn pqn, pri pri, pox pox, pqs pqs, pse pse, hec hec, psg psg, jro jro, Scheduler scheduler, Scheduler scheduler2, Observable<Boolean> observable5) {
            pri pri2 = pri;
            pse pse2 = pse;
            pox pox2 = pox;
            hec hec2 = hec;
            return kjt.a((kjz<M, E, F>) $$Lambda$QB0D59UdXjyTlK1jaGFWEmFa2tU.INSTANCE, kkz.a(klb.a().a(b.class, prh.a(pri, pse)).a(e.class, prh.a(scheduler2)).a(a.class, prh.a(pox, hec, jro)).a(d.class, prh.a(pqs)).a(c.class, prh.a(psg)).a())).b(new $$Lambda$pqu$VAR3aVq_8byD4I57KtZ_umY7RJI(scheduler)).a((kkp<kkv>) new $$Lambda$pqu$nFf06YmeEwl6IV_f2wjyf8VHy6A<kkv>(scheduler2)).a((kjo<M, F>) $$Lambda$1DjSXciwSeq2GoJHo5zOThHSxWE.INSTANCE).a(kla.a(observable, observable2, observable4, observable3, pqn.a, observable5.c((Function<? super T, ? extends R>) $$Lambda$pqu$8TStMSzLobdeLPkY9e17XNaqC0.INSTANCE))).a(kkh.a("InAppMessagingMobius"));
        }

        public static /* synthetic */ kkv b(Scheduler scheduler) {
            return new kld(scheduler);
        }

        public static /* synthetic */ kkv a(Scheduler scheduler) {
            return new kld(scheduler);
        }

        public static /* synthetic */ prf a(Boolean bool) {
            if (bool.booleanValue()) {
                return new c();
            }
            return new b();
        }

        public static pox a(ppa ppa, poy poy, psl psl, SpSharedPreferences<Object> spSharedPreferences) {
            return new poz(ppa, psl, poy, spSharedPreferences);
        }

        public static ppa a(ghm ghm) {
            return (ppa) ghm.a(ppa.class);
        }

        public static prj b(ghm ghm) {
            return (prj) ghm.a(prj.class);
        }

        public static /* synthetic */ prf a(rjz rjz) {
            return (prf) rjz.a($$Lambda$pqu$jqnR0BOtI9wjRlzA8Ir8LDkL9os.INSTANCE, $$Lambda$pqu$e3UQhb9xaHwtzBE928BDzb0zD4.INSTANCE);
        }

        public static /* synthetic */ ObservableSource c(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }

        public static Observable<prf> a(hec hec, Flowable<PlayerState> flowable, pqp pqp) {
            return hec.a(psf.b).j().h(new $$Lambda$pqu$EyyUDBljQ1VV_YvTUn02GflHPo(flowable.j().a((ObservableTransformer<? super T, ? extends R>) pqp)));
        }

        public static /* synthetic */ ObservableSource b(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }

        public static Observable<prf> a(Flowable<PlayerState> flowable) {
            return flowable.j().a((ObservableTransformer<? super T, ? extends R>) $$Lambda$pqu$4WsPrclTNEid8NOe3_01CepbKKE.INSTANCE);
        }

        public static /* synthetic */ prf a(PlayerState playerState) {
            return new a(prx.a(playerState));
        }

        public static /* synthetic */ Iterable a(pnm pnm) {
            ArrayList arrayList = new ArrayList(0);
            String str = "URI";
            if (pnm.c()) {
                arrayList.add(prf.b(pnm.a(), str));
            }
            arrayList.add(prf.a(pnm.b(), str));
            return arrayList;
        }

        public static /* synthetic */ ObservableSource a(Observable observable, Boolean bool) {
            return bool.booleanValue() ? observable : Observable.c();
        }

        public static Observable<prf> a(hec hec, rka rka) {
            return hec.a(psf.c).j().h(new $$Lambda$pqu$75dZuGH3V97SE4qewqoKvHcEpjM(rka.a.c((Function<? super T, ? extends R>) $$Lambda$pqu$nqA4D8HXJQF4O8xO4C0ql5gIOc.INSTANCE)));
        }

        public static Observable<prf> a(hec hec, pni pni) {
            return hec.a(psf.d).j().h(new $$Lambda$pqu$4Yowvh2sSg_19irAZC9zQNHpmC4(pni.b.b((Function<? super T, ? extends Iterable<? extends U>>) $$Lambda$pqu$s6d2sUueJjR9cydyebQoMqMXu8k.INSTANCE)));
        }
    }
}
