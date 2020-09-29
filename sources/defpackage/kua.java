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

/* renamed from: kua reason: default package */
public interface kua {

    /* renamed from: kua$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Player a(PlayerFactory playerFactory) {
            return playerFactory.create(ViewUris.U.toString(), uqo.am, rta.m);
        }

        public static Observable<PlayerState> a(Flowable<PlayerState> flowable) {
            return ktv.a(flowable.j(), flowable.j());
        }

        public static Observable<RadioSeedBundle> a(Observable<PlayerState> observable, jyk<RadioSeedBundle> jyk, ktz ktz, kui kui, kuk kuk) {
            Observable b = observable.b((Consumer<? super T>) $$Lambda$vJUmYppYF5n4pWDPkwPFJTANZAs.INSTANCE);
            ktz.getClass();
            return b.a((Predicate<? super T>) new $$Lambda$E5rFeluIz9_VQQBfH6m0yVQufcM<Object>(ktz)).c((Function<? super T, ? extends R>) kuk).b((Consumer<? super T>) $$Lambda$kua$1C03UJWGolFDWx8tcYyiGevHzGs.INSTANCE).h(kui).a(wit.a((c<T, R>) jyk, BackpressureStrategy.LATEST));
        }

        public static /* synthetic */ Boolean a(SessionState sessionState, ConnectState connectState) {
            boolean z = false;
            boolean z2 = connectState == ConnectState.ACTIVE || connectState == ConnectState.CONNECTING;
            if (sessionState.connected() && !z2) {
                z = true;
            }
            return Boolean.valueOf(z);
        }

        public static jyk<RadioSeedBundle> a(hxx hxx, xii<ConnectState> xii) {
            return new jyk<>(xii.a(wit.a((xfk<T>) hxx.a), xii, (xiz<? super T1, ? super T2, ? extends R>) $$Lambda$kua$UXU2nCjduOeFj8BvbrCCvPUY1U.INSTANCE).b());
        }

        public static void a(PlayerState playerState) {
            Logger.b("AutoPlay: Context Finished %s, %s. Will try to map to radio seed", playerState.contextUri(), playerState.playbackId());
        }
    }
}
