package defpackage;

import com.spotify.cosmos.router.RxRouter;
import com.spotify.mobile.android.service.SpotifyService;

/* renamed from: hlb reason: default package */
public final class hlb implements wig<RxRouter> {
    private final wzi<SpotifyService> a;

    private hlb(wzi<SpotifyService> wzi) {
        this.a = wzi;
    }

    public static hlb a(wzi<SpotifyService> wzi) {
        return new hlb(wzi);
    }

    public final /* synthetic */ Object get() {
        return (RxRouter) wil.a(((SpotifyService) this.a.get()).c.o, "Cannot return null from a non-@Nullable @Provides method");
    }
}
