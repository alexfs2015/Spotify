package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bzy reason: default package */
public final class bzy {
    public static <K, V> Map<K, V> a(int i) {
        return i <= 256 ? new dp(i) : new HashMap(i, 1.0f);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map a = a(3);
        a.put(k, v);
        a.put(k2, v2);
        a.put(k3, v3);
        return Collections.unmodifiableMap(a);
    }

    public static <T> Set<T> a(int i, boolean z) {
        return i <= 256 ? new dq(i) : new HashSet(i, 1.0f);
    }
}
