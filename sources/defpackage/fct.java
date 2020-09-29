package defpackage;

import java.util.Map.Entry;

/* renamed from: fct reason: default package */
public abstract class fct<K, V> extends fcw implements Entry<K, V> {
    protected fct() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Entry<K, V> delegate();

    public boolean equals(Object obj) {
        return delegate().equals(obj);
    }

    public K getKey() {
        return delegate().getKey();
    }

    public V getValue() {
        return delegate().getValue();
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public V setValue(V v) {
        return delegate().setValue(v);
    }
}
