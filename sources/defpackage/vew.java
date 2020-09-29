package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: vew reason: default package */
final class vew {
    public static <K, V extends Collection<I>, I> void a(Map<K, V> map, Map<K, V> map2) {
        for (Entry entry : map2.entrySet()) {
            Collection collection = (Collection) map.get(entry.getKey());
            if (collection != null) {
                collection.addAll((Collection) entry.getValue());
            } else {
                map.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
