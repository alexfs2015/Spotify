package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.Observable;

/* renamed from: lhr reason: default package */
public final class lhr implements vua<RxRouter> {
    private final wlc<RxResolver> a;

    private lhr(wlc<RxResolver> wlc) {
        this.a = wlc;
    }

    public static lhr a(wlc<RxResolver> wlc) {
        return new lhr(wlc);
    }

    public final /* synthetic */ Object get() {
        return (RxRouter) vuf.a(new RxRouter((RxResolver) this.a.get()) {
            private /* synthetic */ RxResolver a;

            {
                this.a = r1;
            }

            public final Observable<Response> resolve(Request request) {
                return this.a.resolve(request);
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
