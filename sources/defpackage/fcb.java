package defpackage;

import java.util.Map.Entry;

/* renamed from: fcb reason: default package */
public abstract class fcb<K, V> extends fce implements Entry<K, V> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Entry<K, V> delegate();

    protected fcb() {
    }

    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }

    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }
}
