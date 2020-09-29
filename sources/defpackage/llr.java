package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import io.reactivex.Observable;

/* renamed from: llr reason: default package */
public final class llr implements wig<RxRouter> {
    private final wzi<RxResolver> a;

    private llr(wzi<RxResolver> wzi) {
        this.a = wzi;
    }

    public static llr a(wzi<RxResolver> wzi) {
        return new llr(wzi);
    }

    public final /* synthetic */ Object get() {
        return (RxRouter) wil.a(new RxRouter((RxResolver) this.a.get()) {
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
