package defpackage;

import com.spotify.cosmos.android.RxResolver;
import io.reactivex.Observable;

/* renamed from: hsy reason: default package */
public final class hsy implements vua<Observable<uyy<uys>>> {
    private final wlc<RxResolver> a;
    private final wlc<hvl> b;

    private hsy(wlc<RxResolver> wlc, wlc<hvl> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hsy a(wlc<RxResolver> wlc, wlc<hvl> wlc2) {
        return new hsy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (Observable) vuf.a(hsw.a((RxResolver) this.a.get(), (hvl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
