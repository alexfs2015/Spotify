package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Flowable;

/* renamed from: tyc reason: default package */
public final class tyc implements vua<reu<?>> {
    private final wlc<Flowable<PlayerState>> a;
    private final wlc<tyd> b;

    private tyc(wlc<Flowable<PlayerState>> wlc, wlc<tyd> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tyc a(wlc<Flowable<PlayerState>> wlc, wlc<tyd> wlc2) {
        return new tyc(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (reu) vuf.a(new txx((Flowable) this.a.get(), (tyd) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
