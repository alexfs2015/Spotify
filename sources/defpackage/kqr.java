package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.connect.ConnectManager.ConnectState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.autoplay.RadioSeedBundle;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: kqr reason: default package */
public interface kqr {

    /* renamed from: kqr$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Boolean a(SessionState sessionState, ConnectState connectState) {
            boolean z = false;
            boolean z2 = connectState == ConnectState.ACTIVE || connectState == ConnectState.CONNECTING;
            if (sessionState.connected() && !z2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public static Observable<RadioSeedBundle> a(Observable<PlayerState> observable, jwc<RadioSeedBundle> jwc, kqq kqq, kqz kqz, krb krb) {
            Observable b = observable.b((Consumer<? super T>) $$Lambda$fTJA3TEpxPv6OISU1C50x7Khra0.INSTANCE);
            kqq.getClass();
            return b.a((Predicate<? super T>) new $$Lambda$3JKoaFy2zKEXfUAYqsBxOuQSZV8<Object>(kqq)).c((Function<? super T, ? extends R>) krb).b((Consumer<? super T>) $$Lambda$kqr$D1BOqXIAJpFjHf9glTl7gGjZHI4.INSTANCE).h(kqz).a(vun.a((c<T, R>) jwc, BackpressureStrategy.LATEST));
        }

        public static Player a(PlayerFactory playerFactory) {
            return playerFactory.create(ViewUris.V.toString(), udt.am, rju.m);
        }

        public static Observable<PlayerState> a(Flowable<PlayerState> flowable) {
            return kqm.a(flowable.j(), flowable.j());
        }

        public static void a(PlayerState playerState) {
            Logger.b("AutoPlay: Context Finished %s, %s. Will try to map to radio seed", playerState.contextUri(), playerState.playbackId());
        }

        public static jwc<RadioSeedBundle> a(hvl hvl, wud<ConnectState> wud) {
            return new jwc<>(wud.a(vun.a((wrf<T>) hvl.a), wud, (wuu<? super T1, ? super T2, ? extends R>) $$Lambda$kqr$bAV0E9eqAm30QgKPtuFhsgXtbKk.INSTANCE).b());
        }
    }
}
