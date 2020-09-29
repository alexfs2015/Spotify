package com.google.common.collect;

import java.util.Map.Entry;

final class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    static final RegularImmutableBiMap<Object, Object> a = new RegularImmutableBiMap<>();
    private final transient int[] b;
    private transient Object[] c;
    private final transient int d;
    private final transient int e;
    private final transient RegularImmutableBiMap<V, K> f;

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        return false;
    }

    private RegularImmutableBiMap() {
        this.b = null;
        this.c = new Object[0];
        this.d = 0;
        this.e = 0;
        this.f = this;
    }

    RegularImmutableBiMap(Object[] objArr, int i) {
        this.c = objArr;
        this.e = i;
        this.d = 0;
        int b2 = i >= 2 ? ImmutableSet.b(i) : 0;
        this.b = RegularImmutableMap.a(objArr, i, b2, 0);
        this.f = new RegularImmutableBiMap<>(RegularImmutableMap.a(objArr, i, b2, 1), objArr, i, this);
    }

    private RegularImmutableBiMap(int[] iArr, Object[] objArr, int i, RegularImmutableBiMap<V, K> regularImmutableBiMap) {
        this.b = iArr;
        this.c = objArr;
        this.d = 1;
        this.e = i;
        this.f = regularImmutableBiMap;
    }

    public final int size() {
        return this.e;
    }

    public final ImmutableBiMap<V, K> c() {
        return this.f;
    }

    public final V get(Object obj) {
        return RegularImmutableMap.a(this.b, this.c, this.e, this.d, obj);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> i() {
        return new EntrySet(this, this.c, this.d, this.e);
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> k() {
        return new KeySet(this, new KeysOrValuesAsList(this.c, this.d, this.e));
    }

    public final /* bridge */ /* synthetic */ BiMap inverse() {
        return this.f;
    }
}
