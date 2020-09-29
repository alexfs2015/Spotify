package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.BiFunction;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hdo reason: default package */
final class hdo implements ObservableTransformer<Optional<Map<String, String>>, Map<String, String>> {
    hdo() {
    }

    public final ObservableSource<Map<String, String>> apply(Observable<Optional<Map<String, String>>> observable) {
        return observable.a(ImmutableMap.f(), (BiFunction<R, ? super T, R>) $$Lambda$hdo$IuuegbJ2WqBaVeSE5AJClJJEESs.INSTANCE).b(1);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Map a(Map map, Optional optional) {
        if (!optional.b()) {
            return ImmutableMap.f();
        }
        HashMap a = Maps.a(map.size() + ((Map) optional.c()).size());
        a.putAll(map);
        a.putAll((Map) optional.c());
        return ImmutableMap.a((Map<? extends K, ? extends V>) a);
    }
}
