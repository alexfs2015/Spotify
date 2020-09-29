package defpackage;

import com.google.common.base.Predicates.ObjectPredicate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: hdi reason: default package */
public final class hdi {
    public static <E> ImmutableList<E> a(List<E> list) {
        return list == null ? ImmutableList.d() : list instanceof ImmutableList ? (ImmutableList) list : ImmutableList.a(fcp.a((Iterable<E>) list).a((fbq<? super E>) ObjectPredicate.NOT_NULL).a());
    }

    public static <K, V> ImmutableMap<K, V> a(Map<? extends K, ? extends V> map) {
        return map == null ? ImmutableMap.f() : map instanceof ImmutableMap ? ImmutableMap.a(map) : ImmutableMap.a(Maps.a(map, (fbq<? super Entry<K, V>>) $$Lambda$hdi$9lOiS8ChGQuyeb6fLGaRmBeGoc.INSTANCE));
    }

    public static boolean a(hcj hcj, String str, Object obj) {
        fbp.a(hcj);
        fbp.a(str);
        return fbn.a(obj, hcj.get(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entry entry) {
        return (entry == null || entry.getKey() == null || entry.getValue() == null) ? false : true;
    }

    public static <K> boolean a(Map<K, ?> map, K k, Object obj) {
        fbp.a(map);
        fbp.a(k);
        return fbn.a(obj, map.get(k));
    }
}
