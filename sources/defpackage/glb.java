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
/* renamed from: glb reason: default package */
public final class glb<T extends JacksonModel> implements gky<T> {
    private final RxResolver a;
    private final JacksonResponseParser<T> b;

    public glb(Class<T> cls, rnf rnf, RxResolver rxResolver, Scheduler scheduler) {
        this(cls, rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(), rxResolver, scheduler);
    }

    public glb(Class<T> cls, ObjectMapper objectMapper, RxResolver rxResolver, Scheduler scheduler) {
        this.a = rxResolver;
        this.b = JacksonResponseParser.forClass((Class) fay.a(cls), objectMapper, scheduler);
    }

    public final wud<T> resolve(Request request) {
        return vun.a((ObservableSource<T>) this.a.resolve(request).a((ObservableTransformer<? super T, ? extends R>) this.b), BackpressureStrategy.LATEST);
    }
}
