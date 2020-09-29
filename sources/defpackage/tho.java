package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: tho reason: default package */
public final class tho implements vua<thn> {
    private final wlc<idq> a;
    private final wlc<Flowable<PlayerTrack>> b;

    private tho(wlc<idq> wlc, wlc<Flowable<PlayerTrack>> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tho a(wlc<idq> wlc, wlc<Flowable<PlayerTrack>> wlc2) {
        return new tho(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new thn((idq) this.a.get(), (Flowable) this.b.get());
    }
}
