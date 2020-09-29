package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;

/* renamed from: kqo reason: default package */
public final class kqo {
    Disposable a = Disposables.b();
    private final Observable<RadioSeedBundle> b;
    private final jjf c;
    private final ufq d;
    private final Observable<PlayerState> e;
    private final jrp f;
    private final Player g;

    kqo(Observable<RadioSeedBundle> observable, jjf jjf, ufq ufq, Flowable<PlayerState> flowable, jrp jrp, Player player) {
        this.b = observable;
        this.c = jjf;
        this.d = ufq;
        this.e = flowable.j();
        this.f = jrp;
        this.g = player;
    }

    public final void a(Context context) {
        this.a.bf_();
        this.a = this.b.h(new $$Lambda$kqo$rpaFla_T6dz_aRYDWwDtxyYrjDA(this, context)).h(new $$Lambda$kqo$jNTl2WbScoGAnhJF5Ny7K773VKY(this.e)).a((Consumer<? super T>) new $$Lambda$kqo$VC5Ek_zSsmLZhxm_3ddYeHFBRg<Object>(this), (Consumer<? super Throwable>) $$Lambda$kqo$Lunv1t5ukjMqPBDlX23zkxn9rg8.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Context context, RadioSeedBundle radioSeedBundle) {
        if (!uhq.g(radioSeedBundle.getRadioSeed())) {
            return Observable.b((Callable<? extends T>) new $$Lambda$kqo$K4SHgqKFZFCSljVzpkixLAxOgFU<Object>(this, radioSeedBundle));
        }
        return kqn.a(this.e, radioSeedBundle, this.c, this.f, (Context) fay.a(context), this.d).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$kqo$lHK3qu3fOFyGyh8Rzyinc08QsdE<Object,Object>(radioSeedBundle), false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RadioSeedBundle a(RadioSeedBundle radioSeedBundle) {
        this.g.play(PlayerContext.create(radioSeedBundle.getRadioSeed(), radioSeedBundle.getRadioSeed()), new Builder().build());
        return radioSeedBundle;
    }

    /* access modifiers changed from: private */
    public void a(ho<PlayerState, RadioSeedBundle> hoVar) {
        String radioSeed = ((RadioSeedBundle) fay.a(hoVar.b)).getRadioSeed();
        if (!((PlayerState) fay.a(hoVar.a)).contextUri().contains(radioSeed)) {
            String playbackId = ((PlayerState) hoVar.a).playbackId();
            String contextUri = ((PlayerState) hoVar.a).contextUri();
            jjf jjf = this.c;
            bf bfVar = new bf(playbackId, "autoplay", contextUri, null, 0, radioSeed, "AUTOPLAY_STOPPED", null, (double) this.f.a());
            jjf.a(bfVar);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(RadioSeedBundle radioSeedBundle, Boolean bool) {
        if (bool.booleanValue()) {
            return Observable.b(radioSeedBundle);
        }
        return Observable.c();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(RadioSeedBundle radioSeedBundle, PlayerState playerState) {
        return !playerState.contextUri().contains(radioSeedBundle.getRadioSeed());
    }
}
