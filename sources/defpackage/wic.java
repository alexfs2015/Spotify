package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wic reason: default package */
abstract class wic<K, V, V2> implements wig<Map<K, V2>> {
    final Map<K, wzi<V>> a;

    /* renamed from: wic$a */
    public static abstract class a<K, V, V2> {
        final LinkedHashMap<K, wzi<V>> a;

        a(int i) {
            this.a = wid.b(i);
        }

        /* access modifiers changed from: 0000 */
        public a<K, V, V2> a(K k, wzi<V> wzi) {
            this.a.put(wil.a(k, "key"), wil.a(wzi, "provider"));
            return this;
        }
    }

    wic(Map<K, wzi<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }
}
