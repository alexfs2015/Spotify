package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: sqg reason: default package */
public final class sqg implements vua<Flowable<sze>> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<kug> b;
    private final wlc<fpt> c;

    private sqg(wlc<Flowable<PlayerTrack>> wlc, wlc<kug> wlc2, wlc<fpt> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static sqg a(wlc<Flowable<PlayerTrack>> wlc, wlc<kug> wlc2, wlc<fpt> wlc3) {
        return new sqg(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return (Flowable) vuf.a(CC.a((Flowable) this.a.get(), (kug) this.b.get(), (fpt) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
