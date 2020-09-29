package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;

/* renamed from: tbo reason: default package */
public final class tbo implements vua<Flowable<PlayerState>> {
    private final wlc<url> a;

    private tbo(wlc<url> wlc) {
        this.a = wlc;
    }

    public static tbo a(wlc<url> wlc) {
        return new tbo(wlc);
    }

    public final /* synthetic */ Object get() {
        url url = (url) this.a.get();
        return (Flowable) vuf.a(url.a().a(BackpressureStrategy.LATEST).a(1).c(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
