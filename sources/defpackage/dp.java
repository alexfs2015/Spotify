package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: dp reason: default package */
public final class dp<K, V> extends dv<K, V> implements Map<K, V> {
    private du<K, V> c;

    public dp() {
    }

    public dp(int i) {
        super(i);
    }

    public dp(dv dvVar) {
        super(dvVar);
    }

    private du<K, V> a() {
        if (this.c == null) {
            this.c = new du<K, V>() {
                /* access modifiers changed from: protected */
                public final int a() {
                    return dp.this.b;
                }

                /* access modifiers changed from: protected */
                public final int a(Object obj) {
                    return dp.this.a(obj);
                }

                /* access modifiers changed from: protected */
                public final Object a(int i, int i2) {
                    return dp.this.a[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final V a(int i, V v) {
                    return dp.this.a(i, v);
                }

                /* access modifiers changed from: protected */
                public final void a(int i) {
                    dp.this.d(i);
                }

                /* access modifiers changed from: protected */
                public final void a(K k, V v) {
                    dp.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final int b(Object obj) {
                    return dp.this.b(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> b() {
                    return dp.this;
                }

                /* access modifiers changed from: protected */
                public final void c() {
                    dp.this.clear();
                }
            };
        }
        return this.c;
    }

    public final Set<Entry<K, V>> entrySet() {
        du a = a();
        if (a.a == null) {
            a.a = new b<>();
        }
        return a.a;
    }

    public final Set<K> keySet() {
        return a().d();
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        a(this.b + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection<V> values() {
        du a = a();
        if (a.b == null) {
            a.b = new e<>();
        }
        return a.b;
    }
}
