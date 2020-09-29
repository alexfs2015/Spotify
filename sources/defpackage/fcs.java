package defpackage;

import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: fcs reason: default package */
public abstract class fcs<K, V> extends fcw implements Map<K, V> {
    protected fcs() {
    }

    public void clear() {
        delegate().clear();
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return delegate().containsValue(obj);
    }

    /* access modifiers changed from: protected */
    public abstract Map<K, V> delegate();

    public Set<Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public Set<K> keySet() {
        return delegate().keySet();
    }

    public V put(K k, V v) {
        return delegate().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        delegate().putAll(map);
    }

    public V remove(Object obj) {
        return delegate().remove(obj);
    }

    public int size() {
        return delegate().size();
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        Iterators.c(entrySet().iterator());
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsKey(Object obj) {
        return Iterators.a(Maps.a(entrySet().iterator()), obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsValue(Object obj) {
        return Iterators.a(Maps.b(entrySet().iterator()), obj);
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return Maps.d(this, obj);
    }

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        return Sets.a(entrySet());
    }

    /* access modifiers changed from: protected */
    public boolean standardIsEmpty() {
        return !entrySet().iterator().hasNext();
    }

    /* access modifiers changed from: protected */
    public void standardPutAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: protected */
    public V standardRemove(Object obj) {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (fbn.a(entry.getKey(), obj)) {
                V value = entry.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return Maps.b((Map<?, ?>) this);
    }

    public Collection<V> values() {
        return delegate().values();
    }
}
