package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: kqy reason: default package */
public final class kqy implements vua<kqo> {
    private final wlc<Observable<RadioSeedBundle>> a;
    private final wlc<jjf> b;
    private final wlc<ufq> c;
    private final wlc<Flowable<PlayerState>> d;
    private final wlc<jrp> e;
    private final wlc<Player> f;

    public static kqo a(Observable<RadioSeedBundle> observable, jjf jjf, ufq ufq, Flowable<PlayerState> flowable, jrp jrp, Player player) {
        kqo kqo = new kqo(observable, jjf, ufq, flowable, jrp, player);
        return kqo;
    }

    public final /* synthetic */ Object get() {
        kqo kqo = new kqo((Observable) this.a.get(), (jjf) this.b.get(), (ufq) this.c.get(), (Flowable) this.d.get(), (jrp) this.e.get(), (Player) this.f.get());
        return kqo;
    }
}
