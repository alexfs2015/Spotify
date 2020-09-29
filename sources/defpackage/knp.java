package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.ads.api.SlotApi;
import io.reactivex.Flowable;

/* renamed from: knp reason: default package */
public final class knp implements vua<c<knw, knt, kns>> {
    private final wlc<Player> a;
    private final wlc<Flowable<PlayerState>> b;
    private final wlc<jrp> c;
    private final wlc<igj> d;
    private final wlc<vos> e;
    private final wlc<SlotApi> f;
    private final wlc<koe> g;
    private final wlc<gdz<fko>> h;
    private final wlc<kob> i;
    private final wlc<rnf> j;

    private knp(wlc<Player> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<jrp> wlc3, wlc<igj> wlc4, wlc<vos> wlc5, wlc<SlotApi> wlc6, wlc<koe> wlc7, wlc<gdz<fko>> wlc8, wlc<kob> wlc9, wlc<rnf> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static knp a(wlc<Player> wlc, wlc<Flowable<PlayerState>> wlc2, wlc<jrp> wlc3, wlc<igj> wlc4, wlc<vos> wlc5, wlc<SlotApi> wlc6, wlc<koe> wlc7, wlc<gdz<fko>> wlc8, wlc<kob> wlc9, wlc<rnf> wlc10) {
        knp knp = new knp(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return knp;
    }

    public final /* synthetic */ Object get() {
        return (c) vuf.a(CC.a((Player) this.a.get(), (Flowable) this.b.get(), (jrp) this.c.get(), (igj) this.d.get(), (vos) this.e.get(), (SlotApi) this.f.get(), (koe) this.g.get(), (gdz) this.h.get(), (kob) this.i.get(), (rnf) this.j.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
