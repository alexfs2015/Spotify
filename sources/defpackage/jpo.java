package defpackage;

import com.spotify.cosmos.android.RxResolver;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: jpo reason: default package */
public interface jpo<T> {
    public static final jpo<Void> a = new jpo<Void>() {
        public final xii<jqo<Void>> load(RxResolver rxResolver, jqo<Void> jqo) {
            return ScalarSynchronousObservable.d(jqo);
        }
    };

    xii<jqo<T>> load(RxResolver rxResolver, jqo<T> jqo);
}
