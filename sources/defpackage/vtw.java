package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vtw reason: default package */
abstract class vtw<K, V, V2> implements vua<Map<K, V2>> {
    final Map<K, wlc<V>> a;

    /* renamed from: vtw$a */
    public static abstract class a<K, V, V2> {
        final LinkedHashMap<K, wlc<V>> a;

        a(int i) {
            this.a = vtx.b(i);
        }

        /* access modifiers changed from: 0000 */
        public a<K, V, V2> a(K k, wlc<V> wlc) {
            this.a.put(vuf.a(k, "key"), vuf.a(wlc, "provider"));
            return this;
        }
    }

    vtw(Map<K, wlc<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
