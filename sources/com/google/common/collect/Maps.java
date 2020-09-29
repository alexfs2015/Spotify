package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Maps {

    public enum EntryFunction implements Function<Entry<?, ?>, Object> {
        KEY {
            public final /* synthetic */ Object apply(Object obj) {
                return ((Entry) obj).getKey();
            }
        },
        VALUE {
            public final /* synthetic */ Object apply(Object obj) {
                return ((Entry) obj).getValue();
            }
        }
    }

    static abstract class a<K, V> extends i<K, V> {
        final Map<K, V> a;
        final faz<? super Entry<K, V>> b;

        a(Map<K, V> map, faz<? super Entry<K, V>> faz) {
            this.a = map;
            this.b = faz;
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(Object obj, V v) {
            return this.b.apply(Maps.a(obj, v));
        }

        public V put(K k, V v) {
            fay.a(a(k, v));
            return this.a.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Entry entry : map.entrySet()) {
                fay.a(a(entry.getKey(), entry.getValue()));
            }
            this.a.putAll(map);
        }

        public boolean containsKey(Object obj) {
            return this.a.containsKey(obj) && a(obj, this.a.get(obj));
        }

        public V get(Object obj) {
            V v = this.a.get(obj);
            if (v == null || !a(obj, v)) {
                return null;
            }
            return v;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.a.remove(obj);
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final Collection<V> P_() {
            return new f(this, this.a, this.b);
        }
    }

    public static class b<K, V> extends i<K, V> {
        final Set<K> a;
        final Function<? super K, V> b;

        class a extends c<K, V> {
            a() {
            }

            /* access modifiers changed from: 0000 */
            public final Map<K, V> a() {
                return b.this;
            }

            public final Iterator<Entry<K, V>> iterator() {
                return Maps.a(b.this.a, b.this.b);
            }
        }

        public b(Set<K> set, Function<? super K, V> function) {
            this.a = (Set) fay.a(set);
            this.b = (Function) fay.a(function);
        }

        /* access modifiers changed from: 0000 */
        public final Collection<V> P_() {
            return fbv.a((Collection<F>) this.a, this.b);
        }

        /* access modifiers changed from: protected */
        public final Set<Entry<K, V>> a() {
            return new a();
        }

        public final Set<K> e() {
            return new fcg<E>(this.a) {
                private /* synthetic */ Set a;

                {
                    this.a = r1;
                }

                public final Set<E> a() {
                    return this.a;
                }

                public final boolean add(E e) {
                    throw new UnsupportedOperationException();
                }

                public final boolean addAll(Collection<? extends E> collection) {
                    throw new UnsupportedOperationException();
                }

                public final /* bridge */ /* synthetic */ Collection b() {
                    return this.a;
                }

                public final /* bridge */ /* synthetic */ Object delegate() {
                    return this.a;
                }
            };
        }

        public final int size() {
            return this.a.size();
        }

        public final boolean containsKey(Object obj) {
            return this.a.contains(obj);
        }

        public final V get(Object obj) {
            if (fbv.a((Collection<?>) this.a, obj)) {
                return this.b.apply(obj);
            }
            return null;
        }

        public final V remove(Object obj) {
            if (this.a.remove(obj)) {
                return this.b.apply(obj);
            }
            return null;
        }

        public final void clear() {
            this.a.clear();
        }
    }

    public static abstract class c<K, V> extends c<Entry<K, V>> {
        /* access modifiers changed from: protected */
        public abstract Map<K, V> a();

        protected c() {
        }

        public int size() {
            return a().size();
        }

        public void clear() {
            a().clear();
        }

        public boolean contains(Object obj) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                Object key = entry.getKey();
                Object a = Maps.a(a(), key);
                if (faw.a(a, entry.getValue()) && (a != null || a().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        public boolean isEmpty() {
            return a().isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            return a().keySet().remove(((Entry) obj).getKey());
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) fay.a(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.a((Set<?>) this, collection.iterator());
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) fay.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = Sets.a(collection.size());
                for (Object next : collection) {
                    if (contains(next)) {
                        a.add(((Entry) next).getKey());
                    }
                }
                return a().keySet().retainAll(a);
            }
        }
    }

    static class d<K, V> extends a<K, V> {
        final Set<Entry<K, V>> c;

        class a extends fcg<Entry<K, V>> {
            private a() {
            }

            /* synthetic */ a(d dVar, byte b) {
                this();
            }

            public final Set<Entry<K, V>> a() {
                return d.this.c;
            }

            public final Iterator<Entry<K, V>> iterator() {
                return new fde<Entry<K, V>, Entry<K, V>>(d.this.c.iterator()) {
                    public final /* synthetic */ Object a(Object obj) {
                        final Entry entry = (Entry) obj;
                        return new fcb<K, V>() {
                            public final Entry<K, V> a() {
                                return entry;
                            }

                            public final V setValue(V v) {
                                fay.a(d.this.a(getKey(), v));
                                return super.setValue(v);
                            }

                            public final /* bridge */ /* synthetic */ Object delegate() {
                                return entry;
                            }
                        };
                    }
                };
            }

            public final /* bridge */ /* synthetic */ Collection b() {
                return d.this.c;
            }

            public final /* bridge */ /* synthetic */ Object delegate() {
                return d.this.c;
            }
        }

        class b extends g<K, V> {
            b() {
                super(d.this);
            }

            public final boolean remove(Object obj) {
                if (!d.this.containsKey(obj)) {
                    return false;
                }
                d.this.a.remove(obj);
                return true;
            }

            public final boolean removeAll(Collection<?> collection) {
                return d.a(d.this.a, d.this.b, collection);
            }

            public final boolean retainAll(Collection<?> collection) {
                return d.b(d.this.a, d.this.b, collection);
            }

            public final Object[] toArray() {
                return Lists.a(iterator()).toArray();
            }

            public final <T> T[] toArray(T[] tArr) {
                return Lists.a(iterator()).toArray(tArr);
            }
        }

        d(Map<K, V> map, faz<? super Entry<K, V>> faz) {
            super(map, faz);
            this.c = Sets.a(map.entrySet(), this.b);
        }

        /* access modifiers changed from: protected */
        public final Set<Entry<K, V>> a() {
            return new a(this, 0);
        }

        /* access modifiers changed from: 0000 */
        public final Set<K> e() {
            return new b();
        }

        static <K, V> boolean a(Map<K, V> map, faz<? super Entry<K, V>> faz, Collection<?> collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (faz.apply(entry) && collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        static <K, V> boolean b(Map<K, V> map, faz<? super Entry<K, V>> faz, Collection<?> collection) {
            Iterator it = map.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (faz.apply(entry) && !collection.contains(entry.getKey())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public static class e<K, V> extends a<K, V> {
        private faz<? super K> c;

        public e(Map<K, V> map, faz<? super K> faz, faz<? super Entry<K, V>> faz2) {
            super(map, faz2);
            this.c = faz;
        }

        /* access modifiers changed from: protected */
        public final Set<Entry<K, V>> a() {
            return Sets.a(this.a.entrySet(), this.b);
        }

        /* access modifiers changed from: 0000 */
        public final Set<K> e() {
            return Sets.a(this.a.keySet(), this.c);
        }

        public final boolean containsKey(Object obj) {
            return this.a.containsKey(obj) && this.c.apply(obj);
        }
    }

    static final class f<K, V> extends h<K, V> {
        private Map<K, V> a;
        private faz<? super Entry<K, V>> b;

        f(Map<K, V> map, Map<K, V> map2, faz<? super Entry<K, V>> faz) {
            super(map);
            this.a = map2;
            this.b = faz;
        }

        public final boolean remove(Object obj) {
            Iterator it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.b.apply(entry) && faw.a(entry.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        public final boolean removeAll(Collection<?> collection) {
            Iterator it = this.a.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.b.apply(entry) && collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            Iterator it = this.a.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (this.b.apply(entry) && !collection.contains(entry.getValue())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public final Object[] toArray() {
            return Lists.a(iterator()).toArray();
        }

        public final <T> T[] toArray(T[] tArr) {
            return Lists.a(iterator()).toArray(tArr);
        }
    }

    static class g<K, V> extends c<K> {
        final Map<K, V> b;

        g(Map<K, V> map) {
            this.b = (Map) fay.a(map);
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            this.b.remove(obj);
            return true;
        }

        public Iterator<K> iterator() {
            return Maps.a(this.b.entrySet().iterator());
        }

        public int size() {
            return this.b.size();
        }

        public boolean isEmpty() {
            return this.b.isEmpty();
        }

        public boolean contains(Object obj) {
            return this.b.containsKey(obj);
        }

        public void clear() {
            this.b.clear();
        }
    }

    static class h<K, V> extends AbstractCollection<V> {
        private Map<K, V> a;

        h(Map<K, V> map) {
            this.a = (Map) fay.a(map);
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Entry entry : this.a.entrySet()) {
                    if (faw.a(obj, entry.getValue())) {
                        this.a.remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) fay.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Entry entry : this.a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.a.keySet().removeAll(hashSet);
            }
        }

        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) fay.a(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Entry entry : this.a.entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSet.add(entry.getKey());
                    }
                }
                return this.a.keySet().retainAll(hashSet);
            }
        }

        public Iterator<V> iterator() {
            return Maps.b(this.a.entrySet().iterator());
        }

        public int size() {
            return this.a.size();
        }

        public boolean isEmpty() {
            return this.a.isEmpty();
        }

        public boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        public void clear() {
            this.a.clear();
        }
    }

    public static abstract class i<K, V> extends AbstractMap<K, V> {
        private transient Set<Entry<K, V>> a;
        private transient Set<K> b;
        private transient Collection<V> c;

        /* access modifiers changed from: protected */
        public abstract Set<Entry<K, V>> a();

        protected i() {
        }

        public Set<Entry<K, V>> entrySet() {
            Set<Entry<K, V>> set = this.a;
            if (set != null) {
                return set;
            }
            Set<Entry<K, V>> a2 = a();
            this.a = a2;
            return a2;
        }

        public Set<K> keySet() {
            Set<K> set = this.b;
            if (set != null) {
                return set;
            }
            Set<K> e = e();
            this.b = e;
            return e;
        }

        /* access modifiers changed from: 0000 */
        public Set<K> e() {
            return new g(this);
        }

        public Collection<V> values() {
            Collection<V> collection = this.c;
            if (collection != null) {
                return collection;
            }
            Collection<V> P_ = P_();
            this.c = P_;
            return P_;
        }

        /* access modifiers changed from: 0000 */
        public Collection<V> P_() {
            return new h(this);
        }
    }

    public static <K, V> Iterator<K> a(Iterator<Entry<K, V>> it) {
        return new fde<Entry<K, V>, K>(it) {
            public final /* synthetic */ Object a(Object obj) {
                return ((Entry) obj).getKey();
            }
        };
    }

    public static <K, V> Iterator<V> b(Iterator<Entry<K, V>> it) {
        return new fde<Entry<K, V>, V>(it) {
            public final /* synthetic */ Object a(Object obj) {
                return ((Entry) obj).getValue();
            }
        };
    }

    public static <K, V> HashMap<K, V> a(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> HashMap<K, V> a(int i2) {
        return new HashMap<>(b(i2));
    }

    static int b(int i2) {
        if (i2 < 3) {
            fbu.a(i2, "expectedSize");
            return i2 + 1;
        } else if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static <K, V> Iterator<Entry<K, V>> a(Set<K> set, final Function<? super K, V> function) {
        return new fde<K, Entry<K, V>>(set.iterator()) {
            public final /* synthetic */ Object a(Object obj) {
                return Maps.a(obj, function.apply(obj));
            }
        };
    }

    public static <K, V> Entry<K, V> a(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    public static <K, V> Map<K, V> a(Map<K, V> map, faz<? super Entry<K, V>> faz) {
        fay.a(faz);
        if (!(map instanceof a)) {
            return new d((Map) fay.a(map), faz);
        }
        a aVar = (a) map;
        return new d(aVar.a, Predicates.a(aVar.b, faz));
    }

    static <V> V a(Map<?, V> map, Object obj) {
        fay.a(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static boolean b(Map<?, ?> map, Object obj) {
        fay.a(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static <V> V c(Map<?, V> map, Object obj) {
        fay.a(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean d(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return map.entrySet().equals(((Map) obj).entrySet());
    }

    public static String b(Map<?, ?> map) {
        StringBuilder a2 = fbv.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Entry entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            z = false;
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
        }
        a2.append('}');
        return a2.toString();
    }

    static <K> K a(Entry<K, ?> entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }
}
