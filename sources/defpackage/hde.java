package defpackage;

import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hde reason: default package */
final class hde<K, V> {
    Map<K, V> a;

    public hde(Map<K, V> map) {
        this.a = (Map) fbp.a(map);
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        Map<K, V> map = this.a;
        if (map instanceof ImmutableMap) {
            this.a = new HashMap(map);
        }
    }

    public final void a(Map<K, V> map) {
        if (map instanceof ImmutableMap) {
            this.a = map;
            return;
        }
        Map<K, V> map2 = this.a;
        if (!(map2 instanceof ImmutableMap)) {
            map2.clear();
            if (map != null) {
                this.a.putAll(map);
            }
        } else if (map == null || map.isEmpty()) {
            this.a = ImmutableMap.f();
        } else {
            this.a = new HashMap(map);
        }
    }
}
