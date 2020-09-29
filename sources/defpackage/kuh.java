package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Flowable;
import io.reactivex.Observable;

/* renamed from: kuh reason: default package */
public final class kuh implements wig<ktx> {
    private final wzi<Observable<RadioSeedBundle>> a;
    private final wzi<jlr> b;
    private final wzi<ure> c;
    private final wzi<Flowable<PlayerState>> d;
    private final wzi<jtz> e;
    private final wzi<Player> f;

    public static ktx a(Observable<RadioSeedBundle> observable, jlr jlr, ure ure, Flowable<PlayerState> flowable, jtz jtz, Player player) {
        ktx ktx = new ktx(observable, jlr, ure, flowable, jtz, player);
        return ktx;
    }

    public final /* synthetic */ Object get() {
        ktx ktx = new ktx((Observable) this.a.get(), (jlr) this.b.get(), (ure) this.c.get(), (Flowable) this.d.get(), (jtz) this.e.get(), (Player) this.f.get());
        return ktx;
    }
}
