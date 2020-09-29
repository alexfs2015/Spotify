package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.media.ExternalIntegrationServicePlaybackImpl;
import com.spotify.music.podcast.speedcontrol.SpeedControlInteractor;
import io.reactivex.Flowable;

/* renamed from: hoe reason: default package */
public final class hoe implements vua<ExternalIntegrationServicePlaybackImpl> {
    private final wlc<Player> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<hvl> c;
    private final wlc<hou> d;
    private final wlc<uxc> e;
    private final wlc<tjv> f;
    private final wlc<SpeedControlInteractor> g;
    private final wlc<hte> h;

    private hoe(wlc<Player> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<hvl> wlc3, wlc<hou> wlc4, wlc<uxc> wlc5, wlc<tjv> wlc6, wlc<SpeedControlInteractor> wlc7, wlc<hte> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static hoe a(wlc<Player> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<hvl> wlc3, wlc<hou> wlc4, wlc<uxc> wlc5, wlc<tjv> wlc6, wlc<SpeedControlInteractor> wlc7, wlc<hte> wlc8) {
        hoe hoe = new hoe(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return hoe;
    }

    public final /* synthetic */ Object get() {
        ExternalIntegrationServicePlaybackImpl externalIntegrationServicePlaybackImpl = new ExternalIntegrationServicePlaybackImpl((Player) this.a.get(), (Flowable) this.b.get(), (hvl) this.c.get(), (hou) this.d.get(), (uxc) this.e.get(), (tjv) this.f.get(), (SpeedControlInteractor) this.g.get(), (hte) this.h.get());
        return externalIntegrationServicePlaybackImpl;
    }
}
