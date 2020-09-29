package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: mab reason: default package */
public final class mab implements vua<maa> {
    private final wlc<wud<Boolean>> a;
    private final wlc<kvb> b;
    private final wlc<kvd> c;
    private final wlc<Flowable<PlayerState>> d;

    private mab(wlc<wud<Boolean>> wlc, wlc<kvb> wlc2, wlc<kvd> wlc3, wlc<Flowable<PlayerState>> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mab a(wlc<wud<Boolean>> wlc, wlc<kvb> wlc2, wlc<kvd> wlc3, wlc<Flowable<PlayerState>> wlc4) {
        return new mab(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new maa((wud) this.a.get(), (kvb) this.b.get(), (kvd) this.c.get(), (Flowable) this.d.get());
    }
}
