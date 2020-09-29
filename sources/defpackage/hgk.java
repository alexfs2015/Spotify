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

/* renamed from: hgk reason: default package */
final class hgk implements ObservableTransformer<Optional<Map<String, String>>, Map<String, String>> {
    hgk() {
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

    public final ObservableSource<Map<String, String>> apply(Observable<Optional<Map<String, String>>> observable) {
        return observable.a(ImmutableMap.f(), (BiFunction<R, ? super T, R>) $$Lambda$hgk$gu5lbbggrLR2kg58ATep65kQayw.INSTANCE).b(1);
    }
}
