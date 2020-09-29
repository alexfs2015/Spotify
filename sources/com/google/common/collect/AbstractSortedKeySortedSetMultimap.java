package com.google.common.collect;

import java.util.Collection;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractSortedKeySortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
    /* renamed from: p */
    public SortedMap<K, Collection<V>> b() {
        return (SortedMap) super.b();
    }

    /* renamed from: q */
    public SortedSet<K> m() {
        return (SortedSet) super.m();
    }

    public final Set<K> g() {
        if (this.a instanceof NavigableMap) {
            return new e((NavigableMap) this.a);
        }
        if (this.a instanceof SortedMap) {
            return new h((SortedMap) this.a);
        }
        return new c(this.a);
    }
}
