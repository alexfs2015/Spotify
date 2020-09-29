package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.spotlets.ads.model.AdBreakState;
import io.reactivex.Observable;

/* renamed from: hyr reason: default package */
public final class hyr implements wig<Observable<AdBreakState>> {
    private final wzi<RxResolver> a;

    private hyr(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static hyr a(wzi<RxResolver> wzi) {
        return new hyr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.a((RxResolver) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
