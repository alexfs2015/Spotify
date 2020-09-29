package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements fdc<K, V> {
    private static final long serialVersionUID = 430848587173315748L;

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public abstract SortedSet<V> c();

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Collection a(Collection collection) {
        return c(collection);
    }

    private static <E> SortedSet<E> c(Collection<E> collection) {
        if (collection instanceof NavigableSet) {
            return Sets.a((NavigableSet) collection);
        }
        return Collections.unmodifiableSortedSet((SortedSet) collection);
    }

    /* access modifiers changed from: 0000 */
    public final Collection<V> a(K k, Collection<V> collection) {
        if (collection instanceof NavigableSet) {
            return new k(k, (NavigableSet) collection, null);
        }
        return new m(k, (SortedSet) collection, null);
    }

    /* renamed from: g */
    public SortedSet<V> c(K k) {
        return (SortedSet) super.c(k);
    }

    /* renamed from: h */
    public SortedSet<V> d(Object obj) {
        return (SortedSet) super.d(obj);
    }

    public Map<K, Collection<V>> b() {
        return super.b();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Set n() {
        return c((Collection<E>) c());
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Collection d() {
        return c((Collection<E>) c());
    }
}
