package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements fdo<K, V> {
    private static final long serialVersionUID = 7431625294878419160L;

    protected AbstractSetMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> a(K k, Collection<V> collection) {
        return new l(k, (Set) collection);
    }

    /* access modifiers changed from: 0000 */
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableSet((Set) collection);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract Set<V> c();

    /* renamed from: a */
    public Set<V> c(K k) {
        return (Set) super.c(k);
    }

    public boolean a(K k, V v) {
        return super.a(k, v);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    /* renamed from: b */
    public Set<V> d(Object obj) {
        return (Set) super.d(obj);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public Set<V> d() {
        return Collections.emptySet();
    }

    /* renamed from: o */
    public Set<Entry<K, V>> h() {
        return (Set) super.h();
    }
}
