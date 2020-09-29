package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: bzh reason: default package */
public final class bzh {
    public static <T> Set<T> a(int i, boolean z) {
        if (i <= 256) {
            return new dq(i);
        }
        return new HashSet(i, 1.0f);
    }

    public static <K, V> Map<K, V> a(int i) {
        if (i <= 256) {
            return new dp(i);
        }
        return new HashMap(i, 1.0f);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map a = a(3);
        a.put(k, v);
        a.put(k2, v2);
        a.put(k3, v3);
        return Collections.unmodifiableMap(a);
    }
}
