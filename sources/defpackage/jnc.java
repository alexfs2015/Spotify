package defpackage;

import com.spotify.cosmos.android.RxResolver;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: jnc reason: default package */
public interface jnc<T> {
    public static final jnc<Void> a = new jnc<Void>() {
        public final wud<joc<Void>> load(RxResolver rxResolver, joc<Void> joc) {
            return ScalarSynchronousObservable.d(joc);
        }
    };

    wud<joc<T>> load(RxResolver rxResolver, joc<T> joc);
}
