package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.Flowable;

/* renamed from: stx reason: default package */
public final class stx implements vua<stw> {
    private final wlc<Flowable<PlayerTrack>> a;

    private stx(wlc<Flowable<PlayerTrack>> wlc) {
        this.a = wlc;
    }

    public static stx a(wlc<Flowable<PlayerTrack>> wlc) {
        return new stx(wlc);
    }

    public final /* synthetic */ Object get() {
        return new stw((Flowable) this.a.get());
    }
}
