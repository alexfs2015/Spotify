package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: hgu reason: default package */
public final class hgu implements wig<hgt> {
    private final wzi<RxResolver> a;
    private final wzi<Function<Response, Optional<Map<String, String>>>> b;
    private final wzi<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> c;

    private hgu(wzi<RxResolver> wzi, wzi<Function<Response, Optional<Map<String, String>>>> wzi2, wzi<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static hgu a(wzi<RxResolver> wzi, wzi<Function<Response, Optional<Map<String, String>>>> wzi2, wzi<ObservableTransformer<Optional<Map<String, String>>, Map<String, String>>> wzi3) {
        return new hgu(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new hgt((RxResolver) this.a.get(), (Function) this.b.get(), (ObservableTransformer) this.c.get());
    }
}
