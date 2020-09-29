package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.ExternalIntegrationServicePlaybackImpl;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Flowable;

/* renamed from: hqg reason: default package */
public final class hqg implements wig<ExternalIntegrationServicePlaybackImpl> {
    private final wzi<Player> a;
    private final wzi<Flowable<PlayerState>> b;
    private final wzi<hxx> c;
    private final wzi<hqy> d;
    private final wzi<vje> e;
    private final wzi<tvn> f;
    private final wzi<SpeedControlInteractor> g;
    private final wzi<hvs> h;

    private hqg(wzi<Player> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<hxx> wzi3, wzi<hqy> wzi4, wzi<vje> wzi5, wzi<tvn> wzi6, wzi<SpeedControlInteractor> wzi7, wzi<hvs> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static hqg a(wzi<Player> wzi, wzi<Flowable<PlayerState>> wzi2, wzi<hxx> wzi3, wzi<hqy> wzi4, wzi<vje> wzi5, wzi<tvn> wzi6, wzi<SpeedControlInteractor> wzi7, wzi<hvs> wzi8) {
        hqg hqg = new hqg(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return hqg;
    }

    public final /* synthetic */ Object get() {
        ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl = new ExternalIntegrationServicePlaybackImpl((Player) this.a.get(), (Flowable) this.b.get(), (hxx) this.c.get(), (hqy) this.d.get(), (vje) this.e.get(), (tvn) this.f.get(), (SpeedControlInteractor) this.g.get(), (hvs) this.h.get());
        return externalIntegrationServicePlaybackImpl;
    }
}
