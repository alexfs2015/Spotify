package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.a;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: haj reason: default package */
final class haj {
    public static <K, V, I> ImmutableMap<K, I> a(Map<K, ? extends V> map, Class<I> cls, Function<V, I> function) {
        fay.a(cls);
        fay.a(function);
        if (map == null || map.isEmpty()) {
            return ImmutableMap.f();
        }
        if ((map instanceof ImmutableMap) && fcl.d(map.values(), Predicates.a(cls))) {
            return (ImmutableMap) map;
        }
        a g = ImmutableMap.g();
        for (Entry entry : map.entrySet()) {
            Object apply = function.apply(entry.getValue());
            if (apply != null) {
                g.b(entry.getKey(), fay.a(apply));
            }
        }
        return g.b();
    }
}
