package defpackage;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;

@Deprecated
/* renamed from: gmp reason: default package */
public final class gmp<T extends JacksonModel> implements gmm<T> {
    private final RxResolver a;
    private final JacksonResponseParser<T> b;

    public gmp(Class<T> cls, ObjectMapper objectMapper, RxResolver rxResolver, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = JacksonResponseParser.forClass((Class) fbp.a(cls), objectMapper, scheduler);
    }

    public gmp(Class<T> cls, rwl rwl, RxResolver rxResolver, Scheduler scheduler) {
        this(cls, rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), rxResolver, scheduler);
    }

    public final xii<T> resolve(Request request) {
        return wit.a((ObservableSource<T>) this.a.resolve(request).a((ObservableTransformer<? super T, ? extends R>) this.b), BackpressureStrategy.LATEST);
    }
}
