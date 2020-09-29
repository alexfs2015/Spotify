package com.google.common.collect;

import com.google.common.collect.ImmutableCollection.b;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;

public abstract class ImmutableMap<K, V> implements Serializable, Map<K, V> {
    private transient ImmutableSet<Entry<K, V>> a;
    private transient ImmutableSet<K> b;
    private transient ImmutableCollection<V> c;

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        SerializedForm(ImmutableMap<?, ?> immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            fdh R_ = immutableMap.entrySet().iterator();
            int i = 0;
            while (R_.hasNext()) {
                Entry entry = (Entry) R_.next();
                this.keys[i] = entry.getKey();
                this.values[i] = entry.getValue();
                i++;
            }
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return a(new a(this.keys.length));
        }

        /* access modifiers changed from: 0000 */
        public final Object a(a<Object, Object> aVar) {
            int i = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i >= objArr.length) {
                    return aVar.b();
                }
                aVar.b(objArr[i], this.values[i]);
                i++;
            }
        }
    }

    public static class a<K, V> {
        Object[] a;
        int b;
        boolean c;

        public a() {
            this(4);
        }

        a(int i) {
            this.a = new Object[(i * 2)];
            this.b = 0;
            this.c = false;
        }

        private void a(int i) {
            int i2 = i << 1;
            Object[] objArr = this.a;
            if (i2 > objArr.length) {
                this.a = Arrays.copyOf(objArr, b.a(objArr.length, i2));
                this.c = false;
            }
        }

        public a<K, V> b(K k, V v) {
            a(this.b + 1);
            fbu.a((Object) k, (Object) v);
            Object[] objArr = this.a;
            int i = this.b;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.b = i + 1;
            return this;
        }

        public a<K, V> a(Entry<? extends K, ? extends V> entry) {
            return b(entry.getKey(), entry.getValue());
        }

        public a<K, V> a(Map<? extends K, ? extends V> map) {
            return a((Iterable<? extends Entry<? extends K, ? extends V>>) map.entrySet());
        }

        public a<K, V> a(Iterable<? extends Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                a(this.b + ((Collection) iterable).size());
            }
            for (Entry a2 : iterable) {
                a(a2);
            }
            return this;
        }

        public ImmutableMap<K, V> b() {
            this.c = true;
            return RegularImmutableMap.a(this.b, this.a);
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract ImmutableCollection<V> d();

    public abstract V get(Object obj);

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSet<Entry<K, V>> i();

    /* access modifiers changed from: 0000 */
    public abstract ImmutableSet<K> k();

    /* access modifiers changed from: 0000 */
    public abstract boolean l();

    public static <K, V> ImmutableMap<K, V> f() {
        return RegularImmutableMap.a;
    }

    public static <K, V> ImmutableMap<K, V> b(K k, V v) {
        fbu.a((Object) k, (Object) v);
        return RegularImmutableMap.a(1, new Object[]{k, v});
    }

    public static <K, V> ImmutableMap<K, V> a(K k, V v, K k2, V v2) {
        fbu.a((Object) k, (Object) v);
        fbu.a((Object) k2, (Object) v2);
        return RegularImmutableMap.a(2, new Object[]{k, v, k2, v2});
    }

    public static <K, V> ImmutableMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        fbu.a((Object) k, (Object) v);
        fbu.a((Object) k2, (Object) v2);
        fbu.a((Object) k3, (Object) v3);
        return RegularImmutableMap.a(3, new Object[]{k, v, k2, v2, k3, v3});
    }

    public static <K, V> ImmutableMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        fbu.a((Object) k, (Object) v);
        fbu.a((Object) k2, (Object) v2);
        fbu.a((Object) k3, (Object) v3);
        fbu.a((Object) k4, (Object) v4);
        return RegularImmutableMap.a(4, new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> ImmutableMap<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        fbu.a((Object) k, (Object) v);
        fbu.a((Object) k2, (Object) v2);
        fbu.a((Object) k3, (Object) v3);
        fbu.a((Object) k4, (Object) v4);
        fbu.a((Object) k5, (Object) v5);
        return RegularImmutableMap.a(5, new Object[]{k, v, k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> a<K, V> g() {
        return new a<>();
    }

    public static <K, V> a<K, V> a(int i) {
        fbu.a(i, "expectedSize");
        return new a<>(i);
    }

    public static <K, V> ImmutableMap<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.l()) {
                return immutableMap;
            }
        }
        Set entrySet = map.entrySet();
        a aVar = new a(entrySet instanceof Collection ? entrySet.size() : 4);
        aVar.a((Iterable<? extends Entry<? extends K, ? extends V>>) entrySet);
        return aVar.b();
    }

    ImmutableMap() {
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public ImmutableSet<Entry<K, V>> entrySet() {
        ImmutableSet<Entry<K, V>> immutableSet = this.a;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Entry<K, V>> i = i();
        this.a = i;
        return i;
    }

    /* renamed from: j */
    public ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> k = k();
        this.b = k;
        return k;
    }

    /* renamed from: e */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.c;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> d = d();
        this.c = d;
        return d;
    }

    public boolean equals(Object obj) {
        return Maps.d(this, obj);
    }

    public int hashCode() {
        return Sets.a((Set<?>) entrySet());
    }

    public String toString() {
        return Maps.b((Map<?, ?>) this);
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
