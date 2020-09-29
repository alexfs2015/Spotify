package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Response;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.Map;

/* renamed from: hgt reason: default package */
final class hgt {
    final RxResolver a;
    final Function<Response, Optional<Map<String, String>>> b;
    final ObservableTransformer<Optional<Map<String, String>>, Map<String, String>> c;

    public hgt(RxResolver rxResolver, Function<Response, Optional<Map<String, String>>> function, ObservableTransformer<Optional<Map<String, String>>, Map<String, String>> observableTransformer) {
        this.a = rxResolver;
        this.b = function;
        this.c = observableTransformer;
    }
}
