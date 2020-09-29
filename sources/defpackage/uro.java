package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import io.reactivex.Flowable;

/* renamed from: uro reason: default package */
public final class uro implements vua<urn> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<a> b;

    private uro(wlc<Flowable<PlayerTrack>> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static uro a(wlc<Flowable<PlayerTrack>> wlc, wlc<a> wlc2) {
        return new uro(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new urn((Flowable) this.a.get(), (a) this.b.get());
    }
}
