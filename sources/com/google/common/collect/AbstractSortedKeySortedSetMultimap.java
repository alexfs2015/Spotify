package com.google.common.collect;

import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    public final Set<K> g() {
        return this.a instanceof NavigableMap ? new e((NavigableMap) this.a) : this.a instanceof SortedMap ? new h((SortedMap) this.a) : new c(this.a);
    }

    /* renamed from: p */
    public SortedMap<K, Collection<V>> b() {
        return (SortedMap) super.b();
    }

    /* renamed from: q */
    public SortedSet<K> m() {
        return (SortedSet) super.m();
    }
}
