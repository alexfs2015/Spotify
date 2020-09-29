package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: sqo reason: default package */
public final class sqo implements vua<Flowable<sze>> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<kug> b;
    private final wlc<PlayerState> c;
    private final wlc<fpt> d;

    private sqo(wlc<Flowable<PlayerTrack>> wlc, wlc<kug> wlc2, wlc<PlayerState> wlc3, wlc<fpt> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static sqo a(wlc<Flowable<PlayerTrack>> wlc, wlc<kug> wlc2, wlc<PlayerState> wlc3, wlc<fpt> wlc4) {
        return new sqo(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get(), (kug) this.b.get(), this.c, (fpt) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
