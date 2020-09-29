package defpackage;

import java.util.HashMap;

/* renamed from: da reason: default package */
public final class da<K, V> extends db<K, V> {
    public HashMap<K, c<K, V>> a = new HashMap<>();

    /* access modifiers changed from: protected */
    public final c<K, V> a(K k) {
        return (c) this.a.get(k);
    }

    public final V a(K k, V v) {
        c a2 = a(k);
        if (a2 != null) {
            return a2.b;
        }
        this.a.put(k, b(k, v));
        return null;
    }

    public final V b(K k) {
        V b = super.b(k);
        this.a.remove(k);
        return b;
    }

    public final boolean c(K k) {
        return this.a.containsKey(k);
    }
}
