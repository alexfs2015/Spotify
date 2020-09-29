package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

public final class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements NavigableMap<K, V> {
    private static final ImmutableSortedMap<Comparable, Object> c = new ImmutableSortedMap<>(ImmutableSortedSet.a((Comparator<? super E>) fdl.b()), ImmutableList.d());
    private static final long serialVersionUID = 0;
    public final transient RegularImmutableSortedSet<K> a;
    public final transient ImmutableList<V> b;
    private transient ImmutableSortedMap<K, V> d;

    static class SerializedForm extends SerializedForm {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        SerializedForm(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return a(new a(this.comparator));
        }
    }

    public static class a<K, V> extends com.google.common.collect.ImmutableMap.a<K, V> {
        private transient Object[] d;
        private transient Object[] e;
        private final Comparator<? super K> f;

        public a(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private a(Comparator<? super K> comparator, int i) {
            this.f = (Comparator) fbp.a(comparator);
            this.d = new Object[4];
            this.e = new Object[4];
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Iterable iterable) {
            super.a(iterable);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Entry entry) {
            super.a(entry);
            return this;
        }

        public final /* bridge */ /* synthetic */ com.google.common.collect.ImmutableMap.a a(Map map) {
            super.a(map);
            return this;
        }

        /* renamed from: a */
        public final a<K, V> b(K k, V v) {
            int i = this.b + 1;
            Object[] objArr = this.d;
            if (i > objArr.length) {
                int a = b.a(objArr.length, i);
                this.d = Arrays.copyOf(this.d, a);
                this.e = Arrays.copyOf(this.e, a);
            }
            fcl.a((Object) k, (Object) v);
            this.d[this.b] = k;
            this.e[this.b] = v;
            this.b++;
            return this;
        }

        /* renamed from: a */
        public final ImmutableSortedMap<K, V> b() {
            int i = this.b;
            if (i == 0) {
                return ImmutableSortedMap.a(this.f);
            }
            if (i == 1) {
                return ImmutableSortedMap.a(this.f, this.d[0], this.e[0]);
            }
            Object[] copyOf = Arrays.copyOf(this.d, this.b);
            Object[] objArr = copyOf;
            Arrays.sort(objArr, this.f);
            Object[] objArr2 = new Object[this.b];
            for (int i2 = 0; i2 < this.b; i2++) {
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    if (this.f.compare(copyOf[i3], copyOf[i2]) == 0) {
                        StringBuilder sb = new StringBuilder("keys required to be distinct but compared as equal: ");
                        sb.append(copyOf[i3]);
                        sb.append(" and ");
                        sb.append(copyOf[i2]);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                objArr2[Arrays.binarySearch(objArr, this.d[i2], this.f)] = this.e[i2];
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.b(copyOf), this.f), ImmutableList.b(objArr2));
        }
    }

    static {
        fdl.b();
    }

    ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    private ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.a = regularImmutableSortedSet;
        this.b = immutableList;
        this.d = immutableSortedMap;
    }

    public static <K, V> ImmutableSortedMap<K, V> a() {
        return c;
    }

    private ImmutableSortedMap<K, V> a(int i, int i2) {
        return (i == 0 && i2 == size()) ? this : i == i2 ? a(comparator()) : new ImmutableSortedMap<>(this.a.a(i, i2), this.b.subList(i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ImmutableSortedMap<K, V> headMap(K k, boolean z) {
        return a(0, this.a.e(fbp.a(k), z));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public ImmutableSortedMap<K, V> subMap(K k, boolean z, K k2, boolean z2) {
        fbp.a(k);
        fbp.a(k2);
        fbp.a(comparator().compare(k, k2) <= 0, "expected fromKey <= toKey but %s > %s", k, k2);
        return headMap(k2, z2).tailMap(k, z);
    }

    static <K, V> ImmutableSortedMap<K, V> a(Comparator<? super K> comparator) {
        return fdl.b().equals(comparator) ? c : new ImmutableSortedMap<>(ImmutableSortedSet.a(comparator), ImmutableList.d());
    }

    static /* synthetic */ ImmutableSortedMap a(Comparator comparator, Object obj, Object obj2) {
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.a(obj), (Comparator) fbp.a(comparator)), ImmutableList.a(obj2));
    }

    public static <K extends Comparable<?>, V> a<K, V> b() {
        return new a<>(fdl.b());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public ImmutableSortedMap<K, V> tailMap(K k, boolean z) {
        return a(this.a.f(fbp.a(k), z), size());
    }

    public final Entry<K, V> ceilingEntry(K k) {
        return tailMap(k, true).firstEntry();
    }

    public final K ceilingKey(K k) {
        return Maps.a(ceilingEntry(k));
    }

    public final Comparator<? super K> comparator() {
        return this.a.comparator();
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableCollection<V> d() {
        throw new AssertionError("should never be called");
    }

    public final /* synthetic */ NavigableSet descendingKeySet() {
        return this.a.descendingSet();
    }

    public final /* synthetic */ NavigableMap descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.d;
        if (immutableSortedMap == null) {
            if (isEmpty()) {
                return a((Comparator<? super K>) fdl.a(comparator()).a());
            }
            immutableSortedMap = new ImmutableSortedMap<>((RegularImmutableSortedSet) this.a.descendingSet(), this.b.e(), this);
        }
        return immutableSortedMap;
    }

    public final ImmutableCollection<V> e() {
        return this.b;
    }

    public final /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) super.entrySet().f().get(0);
    }

    public final K firstKey() {
        return this.a.first();
    }

    public final Entry<K, V> floorEntry(K k) {
        return headMap(k, true).lastEntry();
    }

    public final K floorKey(K k) {
        return Maps.a(floorEntry(k));
    }

    public final V get(Object obj) {
        int c2 = this.a.c(obj);
        if (c2 == -1) {
            return null;
        }
        return this.b.get(c2);
    }

    public final ImmutableSet<Entry<K, V>> h() {
        return super.entrySet();
    }

    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap((K) obj, false);
    }

    public final Entry<K, V> higherEntry(K k) {
        return tailMap(k, false).firstEntry();
    }

    public final K higherKey(K k) {
        return Maps.a(higherEntry(k));
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<Entry<K, V>> i() {
        return isEmpty() ? ImmutableSet.h() : new ImmutableMapEntrySet<K, V>() {
            public final fdz<Entry<K, V>> R_() {
                return f().R_();
            }

            /* access modifiers changed from: 0000 */
            public final ImmutableMap<K, V> b() {
                return ImmutableSortedMap.this;
            }

            /* access modifiers changed from: 0000 */
            public final ImmutableList<Entry<K, V>> i() {
                return new ImmutableList<Entry<K, V>>() {
                    /* access modifiers changed from: 0000 */
                    public final boolean c() {
                        return true;
                    }

                    public /* synthetic */ Object get(int i) {
                        return new SimpleImmutableEntry(ImmutableSortedMap.this.a.f().get(i), ImmutableSortedMap.this.b.get(i));
                    }

                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }
                };
            }

            public /* synthetic */ Iterator iterator() {
                return f().R_();
            }
        };
    }

    public final /* bridge */ /* synthetic */ ImmutableSet j() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final ImmutableSet<K> k() {
        throw new AssertionError("should never be called");
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        return this.a.c.c() || this.b.c();
    }

    public final Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Entry) super.entrySet().f().get(size() - 1);
    }

    public final K lastKey() {
        return this.a.last();
    }

    public final Entry<K, V> lowerEntry(K k) {
        return headMap(k, false).lastEntry();
    }

    public final K lowerKey(K k) {
        return Maps.a(lowerEntry(k));
    }

    public final /* bridge */ /* synthetic */ NavigableSet navigableKeySet() {
        return this.a;
    }

    @Deprecated
    public final Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.b.size();
    }

    public final /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    public final /* bridge */ /* synthetic */ Collection values() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new SerializedForm(this);
    }
}
