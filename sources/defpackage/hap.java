package defpackage;

import com.google.common.base.Predicates.ObjectPredicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hap reason: default package */
public final class hap {
    public static <K, V> ImmutableMap<K, V> a(Map<? extends K, ? extends V> map) {
        if (map == null) {
            return ImmutableMap.f();
        }
        if (map instanceof ImmutableMap) {
            return ImmutableMap.a(map);
        }
        return ImmutableMap.a(Maps.a(map, (faz<? super Entry<K, V>>) $$Lambda$hap$606HLIvyFHijDPSQBUBfYkdLtWA.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entry entry) {
        return (entry == null || entry.getKey() == null || entry.getValue() == null) ? false : true;
    }

    public static <E> ImmutableList<E> a(List<E> list) {
        if (list == null) {
            return ImmutableList.d();
        }
        if (list instanceof ImmutableList) {
            return (ImmutableList) list;
        }
        return ImmutableList.a(fbx.a((Iterable<E>) list).a((faz<? super E>) ObjectPredicate.NOT_NULL).a());
    }

    public static <K> boolean a(Map<K, ?> map, K k, Object obj) {
        fay.a(map);
        fay.a(k);
        return faw.a(obj, map.get(k));
    }

    public static boolean a(gzq gzq, String str, Object obj) {
        fay.a(gzq);
        fay.a(str);
        return faw.a(obj, gzq.get(str));
    }
}
