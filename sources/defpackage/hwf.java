package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: hwf reason: default package */
public final class hwf implements vua<Observable<AdBreakState>> {
    private final wlc<RxResolver> a;

    private hwf(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static hwf a(wlc<RxResolver> wlc) {
        return new hwf(wlc);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(CC.a((RxResolver) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
