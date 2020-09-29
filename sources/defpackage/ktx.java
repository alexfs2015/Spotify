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

/* renamed from: ktx reason: default package */
public final class ktx {
    Disposable a = Disposables.b();
    private final Observable<RadioSeedBundle> b;
    private final jlr c;
    private final ure d;
    private final Observable<PlayerState> e;
    private final jtz f;
    private final Player g;

    ktx(Observable<RadioSeedBundle> observable, jlr jlr, ure ure, Flowable<PlayerState> flowable, jtz jtz, Player player) {
        this.b = observable;
        this.c = jlr;
        this.d = ure;
        this.e = flowable.j();
        this.f = jtz;
        this.g = player;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ RadioSeedBundle a(RadioSeedBundle radioSeedBundle) {
        this.g.play(PlayerContext.create(radioSeedBundle.getRadioSeed(), radioSeedBundle.getRadioSeed()), new Builder().build());
        return radioSeedBundle;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(Context context, RadioSeedBundle radioSeedBundle) {
        if (!ute.f(radioSeedBundle.getRadioSeed())) {
            return Observable.b((Callable<? extends T>) new $$Lambda$ktx$LO_bEBnSW3_PmqM6pOuqEMx2mk<Object>(this, radioSeedBundle));
        }
        return ktw.a(this.e, radioSeedBundle, this.c, this.f, (Context) fbp.a(context), this.d).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$ktx$Apjhh0sykRoyckITbPijM1UU2Q<Object,Object>(radioSeedBundle), false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(RadioSeedBundle radioSeedBundle, Boolean bool) {
        return bool.booleanValue() ? Observable.b(radioSeedBundle) : Observable.c();
    }

    /* access modifiers changed from: private */
    public void a(ho<PlayerState, RadioSeedBundle> hoVar) {
        String radioSeed = ((RadioSeedBundle) fbp.a(hoVar.b)).getRadioSeed();
        if (!((PlayerState) fbp.a(hoVar.a)).contextUri().contains(radioSeed)) {
            String playbackId = ((PlayerState) hoVar.a).playbackId();
            String contextUri = ((PlayerState) hoVar.a).contextUri();
            jlr jlr = this.c;
            be beVar = new be(playbackId, "autoplay", contextUri, null, 0, radioSeed, "AUTOPLAY_STOPPED", null, (double) this.f.a());
            jlr.a(beVar);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(RadioSeedBundle radioSeedBundle, PlayerState playerState) {
        return !playerState.contextUri().contains(radioSeedBundle.getRadioSeed());
    }

    public final void a(Context context) {
        this.a.bd_();
        this.a = this.b.h(new $$Lambda$ktx$2kxg_sp63RFF7cCwpCNHLTvKdOw(this, context)).h(new $$Lambda$ktx$YgmW8ouNT_5NpaYIZXu_LwFWe30(this.e)).a((Consumer<? super T>) new $$Lambda$ktx$MVzNvySQsihWCuITEyvv0fXuyRY<Object>(this), (Consumer<? super Throwable>) $$Lambda$ktx$cVmINdLEvF181vB7Ra2GiDntHQA.INSTANCE);
    }
}
