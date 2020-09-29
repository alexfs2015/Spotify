package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class AbstractBiMap<K, V> extends fca<K, V> implements BiMap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: 0000 */
    public transient Map<K, V> a;
    transient AbstractBiMap<V, K> b;
    private transient Set<K> c;
    private transient Set<V> d;
    private transient Set<Entry<K, V>> e;

    static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        public /* bridge */ /* synthetic */ Object delegate() {
            return AbstractBiMap.super.delegate();
        }

        public /* bridge */ /* synthetic */ Collection values() {
            return AbstractBiMap.super.values();
        }

        Inverse(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
            super(map, abstractBiMap, 0);
        }

        /* access modifiers changed from: 0000 */
        public final K a(K k) {
            return this.b.b(k);
        }

        /* access modifiers changed from: 0000 */
        public final V b(V v) {
            return this.b.a(v);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        private void readObject(ObjectInputStream objectInputStream) {
            objectInputStream.defaultReadObject();
            this.b = (AbstractBiMap) objectInputStream.readObject();
        }

        /* access modifiers changed from: 0000 */
        public Object readResolve() {
            return inverse().inverse();
        }
    }

    class a extends fcb<K, V> {
        private final Entry<K, V> a;

        a(Entry<K, V> entry) {
            this.a = entry;
        }

        public final Entry<K, V> a() {
            return this.a;
        }

        public final V setValue(V v) {
            AbstractBiMap.this.b(v);
            String str = "entry no longer in map";
            fay.b(AbstractBiMap.this.entrySet().contains(this), str);
            if (faw.a(v, getValue())) {
                return v;
            }
            fay.a(!AbstractBiMap.this.containsValue(v), "value already present: %s", (Object) v);
            V value = this.a.setValue(v);
            fay.b(faw.a(v, AbstractBiMap.this.get(getKey())), str);
            AbstractBiMap.this.a(getKey(), true, value, v);
            return value;
        }

        public final /* bridge */ /* synthetic */ Object delegate() {
            return this.a;
        }
    }

    class b extends fcg<Entry<K, V>> {
        private Set<Entry<K, V>> a;

        private b() {
            this.a = AbstractBiMap.this.a.entrySet();
        }

        /* synthetic */ b(AbstractBiMap abstractBiMap, byte b2) {
            this();
        }

        public final Set<Entry<K, V>> a() {
            return this.a;
        }

        public final void clear() {
            AbstractBiMap.this.clear();
        }

        public final boolean remove(Object obj) {
            if (!this.a.contains(obj)) {
                return false;
            }
            Entry entry = (Entry) obj;
            AbstractBiMap.this.b.a.remove(entry.getValue());
            this.a.remove(entry);
            return true;
        }

        public final Iterator<Entry<K, V>> iterator() {
            AbstractBiMap abstractBiMap = AbstractBiMap.this;
            return new Iterator<Entry<K, V>>(abstractBiMap.a.entrySet().iterator()) {
                private Entry<K, V> a;
                private /* synthetic */ Iterator b;

                {
                    this.b = r2;
                }

                public final boolean hasNext() {
                    return this.b.hasNext();
                }

                public final void remove() {
                    fay.b(this.a != null, "no calls to next() since the last call to remove()");
                    Object value = this.a.getValue();
                    this.b.remove();
                    AbstractBiMap.this.d(value);
                    this.a = null;
                }

                public final /* synthetic */ Object next() {
                    this.a = (Entry) this.b.next();
                    return new a(this.a);
                }
            };
        }

        public final Object[] toArray() {
            return n();
        }

        public final boolean removeAll(Collection<?> collection) {
            return b(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return c(collection);
        }

        public final <T> T[] toArray(T[] tArr) {
            return fcq.a((Collection<?>) this, tArr);
        }

        public final boolean contains(Object obj) {
            Set<Entry<K, V>> set = this.a;
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            fay.a(entry);
            return set.contains(new fbo<K, V>(entry) {
                private /* synthetic */ Entry a;

                {
                    this.a = r1;
                }

                public final K getKey() {
                    return this.a.getKey();
                }

                public final V getValue() {
                    return this.a.getValue();
                }
            });
        }

        public final boolean containsAll(Collection<?> collection) {
            return fbv.a((Collection<?>) this, collection);
        }

        public final /* bridge */ /* synthetic */ Collection b() {
            return this.a;
        }

        public final /* bridge */ /* synthetic */ Object delegate() {
            return this.a;
        }
    }

    class c extends fcg<K> {
        private c() {
        }

        /* synthetic */ c(AbstractBiMap abstractBiMap, byte b) {
            this();
        }

        /* renamed from: a */
        public final Set<K> delegate() {
            return AbstractBiMap.this.a.keySet();
        }

        public final void clear() {
            AbstractBiMap.this.clear();
        }

        public final boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractBiMap.this.c(obj);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            return b(collection);
        }

        public final boolean retainAll(Collection<?> collection) {
            return c(collection);
        }

        public final Iterator<K> iterator() {
            return Maps.a(AbstractBiMap.this.entrySet().iterator());
        }
    }

    class d extends fcg<V> {
        private Set<V> a;

        private d() {
            this.a = AbstractBiMap.this.b.keySet();
        }

        /* synthetic */ d(AbstractBiMap abstractBiMap, byte b2) {
            this();
        }

        public final Set<V> a() {
            return this.a;
        }

        public final Iterator<V> iterator() {
            return Maps.b(AbstractBiMap.this.entrySet().iterator());
        }

        public final Object[] toArray() {
            return n();
        }

        public final String toString() {
            return l();
        }

        public final <T> T[] toArray(T[] tArr) {
            return fcq.a((Collection<?>) this, tArr);
        }

        public final /* bridge */ /* synthetic */ Collection b() {
            return this.a;
        }

        public final /* bridge */ /* synthetic */ Object delegate() {
            return this.a;
        }
    }

    /* access modifiers changed from: 0000 */
    public K a(K k) {
        return k;
    }

    /* access modifiers changed from: 0000 */
    public V b(V v) {
        return v;
    }

    /* synthetic */ AbstractBiMap(Map map, AbstractBiMap abstractBiMap, byte b2) {
        this(map, abstractBiMap);
    }

    private AbstractBiMap(Map<K, V> map, AbstractBiMap<V, K> abstractBiMap) {
        this.a = map;
        this.b = abstractBiMap;
    }

    public Map<K, V> delegate() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Map<K, V> map, Map<V, K> map2) {
        boolean z = false;
        fay.b(this.a == null);
        if (this.b == null) {
            z = true;
        }
        fay.b(z);
        fay.a(map.isEmpty());
        fay.a(map2.isEmpty());
        fay.a(true);
        this.a = map;
        this.b = new Inverse(map2, this);
    }

    public boolean containsValue(Object obj) {
        return this.b.containsKey(obj);
    }

    public V put(K k, V v) {
        return a(k, v, false);
    }

    public V forcePut(K k, V v) {
        return a(k, v, true);
    }

    private V a(K k, V v, boolean z) {
        a(k);
        b(v);
        boolean containsKey = containsKey(k);
        if (containsKey && faw.a(v, get(k))) {
            return v;
        }
        if (z) {
            inverse().remove(v);
        } else {
            fay.a(!containsValue(v), "value already present: %s", (Object) v);
        }
        V put = this.a.put(k, v);
        a(k, containsKey, put, v);
        return put;
    }

    /* access modifiers changed from: private */
    public void a(K k, boolean z, V v, V v2) {
        if (z) {
            d(v);
        }
        this.b.a.put(v2, k);
    }

    public V remove(Object obj) {
        if (containsKey(obj)) {
            return c(obj);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public V c(Object obj) {
        V remove = this.a.remove(obj);
        d(remove);
        return remove;
    }

    /* access modifiers changed from: private */
    public void d(V v) {
        this.b.a.remove(v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void clear() {
        this.a.clear();
        this.b.a.clear();
    }

    public BiMap<V, K> inverse() {
        return this.b;
    }

    public Set<K> keySet() {
        Set<K> set = this.c;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, 0);
        this.c = cVar;
        return cVar;
    }

    public Set<V> values() {
        Set<V> set = this.d;
        if (set != null) {
            return set;
        }
        d dVar = new d(this, 0);
        this.d = dVar;
        return dVar;
    }

    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> set = this.e;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, 0);
        this.e = bVar;
        return bVar;
    }
}
