package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: hdy reason: default package */
public final class hdy implements vua<hdx> {
    private final wlc<RxResolver> a;
    private final wlc<Function<Response, Optional<Map<String, String>>>> b;
    private final wlc<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> c;

    private hdy(wlc<RxResolver> wlc, wlc<Function<Response, Optional<Map<String, String>>>> wlc2, wlc<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hdy a(wlc<RxResolver> wlc, wlc<Function<Response, Optional<Map<String, String>>>> wlc2, wlc<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> wlc3) {
        return new hdy(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hdx((RxResolver) this.a.get(), (Function) this.b.get(), (ObservableTransformer) this.c.get());
    }
}
