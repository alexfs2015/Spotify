package defpackage;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: hih reason: default package */
public final class hih implements vua<RxRouter> {
    private final wlc<SpotifyService> a;

    private hih(wlc<SpotifyService> wlc) {
        this.a = wlc;
    }

    public static hih a(wlc<SpotifyService> wlc) {
        return new hih(wlc);
    }

    public final /* synthetic */ Object get() {
        return (RxRouter) vuf.a(((SpotifyService) this.a.get()).c.o, "Cannot return null from a non-@Nullable @Provides method");
    }
}
