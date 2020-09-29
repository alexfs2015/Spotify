package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tmg reason: default package */
public final class tmg implements wig<tmf> {
    private final wzi<Flowable<PlayerState>> a;
    private final wzi<tmo> b;

    private tmg(wzi<Flowable<PlayerState>> wzi, wzi<tmo> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static tmg a(wzi<Flowable<PlayerState>> wzi, wzi<tmo> wzi2) {
        return new tmg(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new tmf((Flowable) this.a.get(), (tmo) this.b.get());
    }
}
