package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements fcm<K, V> {
    private static final long serialVersionUID = 6588350623831699109L;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract List<V> c();

    protected AbstractListMultimap(Map<K, Collection<V>> map) {
        super(map);
    }

    /* access modifiers changed from: 0000 */
    public final <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: 0000 */
    public final Collection<V> a(K k, Collection<V> collection) {
        return a(k, (List) collection, null);
    }

    /* renamed from: a */
    public List<V> c(K k) {
        return (List) super.c(k);
    }

    /* renamed from: b */
    public List<V> d(Object obj) {
        return (List) super.d(obj);
    }

    public boolean a(K k, V v) {
        return super.a(k, v);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Collection d() {
        return Collections.emptyList();
    }
}
