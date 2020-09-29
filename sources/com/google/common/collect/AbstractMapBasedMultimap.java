package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractMapBasedMultimap<K, V> extends fbp<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    /* access modifiers changed from: 0000 */
    public transient Map<K, Collection<V>> a;
    /* access modifiers changed from: private */
    public transient int b;

    class a extends com.google.common.collect.Maps.i<K, Collection<V>> {
        final transient Map<K, Collection<V>> a;

        /* renamed from: com.google.common.collect.AbstractMapBasedMultimap$a$a reason: collision with other inner class name */
        class C0009a extends com.google.common.collect.Maps.c<K, Collection<V>> {
            C0009a() {
            }

            /* access modifiers changed from: 0000 */
            public final Map<K, Collection<V>> a() {
                return a.this;
            }

            public final Iterator<Entry<K, Collection<V>>> iterator() {
                return new b();
            }

            public final boolean contains(Object obj) {
                return fbv.a((Collection<?>) a.this.a.entrySet(), obj);
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                AbstractMapBasedMultimap.a(AbstractMapBasedMultimap.this, ((Entry) obj).getKey());
                return true;
            }
        }

        class b implements Iterator<Entry<K, Collection<V>>> {
            private Iterator<Entry<K, Collection<V>>> a = a.this.a.entrySet().iterator();
            private Collection<V> b;

            b() {
            }

            public final boolean hasNext() {
                return this.a.hasNext();
            }

            public final void remove() {
                fay.b(this.b != null, "no calls to next() since the last call to remove()");
                this.a.remove();
                AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - this.b.size();
                this.b.clear();
                this.b = null;
            }

            public final /* synthetic */ Object next() {
                Entry entry = (Entry) this.a.next();
                this.b = (Collection) entry.getValue();
                return a.this.a(entry);
            }
        }

        a(Map<K, Collection<V>> map) {
            this.a = map;
        }

        /* access modifiers changed from: protected */
        public final Set<Entry<K, Collection<V>>> a() {
            return new C0009a();
        }

        public boolean containsKey(Object obj) {
            return Maps.b(this.a, obj);
        }

        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.m();
        }

        public int size() {
            return this.a.size();
        }

        public boolean equals(Object obj) {
            return this == obj || this.a.equals(obj);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return this.a.toString();
        }

        public void clear() {
            if (this.a == AbstractMapBasedMultimap.this.a) {
                AbstractMapBasedMultimap.this.f();
            } else {
                Iterators.c(new b());
            }
        }

        /* access modifiers changed from: 0000 */
        public final Entry<K, Collection<V>> a(Entry<K, Collection<V>> entry) {
            Object key = entry.getKey();
            return Maps.a(key, AbstractMapBasedMultimap.this.a(key, (Collection) entry.getValue()));
        }

        public /* synthetic */ Object remove(Object obj) {
            Collection collection = (Collection) this.a.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection c = AbstractMapBasedMultimap.this.c();
            c.addAll(collection);
            AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
            abstractMapBasedMultimap.b = abstractMapBasedMultimap.b - collection.size();
            collection.clear();
            return c;
        }

        public /* synthetic */ Object get(Object obj) {
            Collection collection = (Collection) Maps.a(this.a, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.a(obj, collection);
        }
    }

    abstract class b<T> implements Iterator<T> {
        private Iterator<Entry<K, Collection<V>>> a;
        private K b = null;
        private Collection<V> c = null;
        private Iterator<V> d = EmptyModifiableIterator.INSTANCE;

        /* access modifiers changed from: 0000 */
        public abstract T a(K k, V v);

        b() {
            this.a = AbstractMapBasedMultimap.this.a.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.a.hasNext() || this.d.hasNext();
        }

        public T next() {
            if (!this.d.hasNext()) {
                Entry entry = (Entry) this.a.next();
                this.b = entry.getKey();
                this.c = (Collection) entry.getValue();
                this.d = this.c.iterator();
            }
            return a(this.b, this.d.next());
        }

        public void remove() {
            this.d.remove();
            if (this.c.isEmpty()) {
                this.a.remove();
            }
            AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - 1;
        }
    }

    class c extends g<K, Collection<V>> {
        c(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterators.c(iterator());
        }

        public Iterator<K> iterator() {
            final Iterator it = this.b.entrySet().iterator();
            return new Iterator<K>() {
                private Entry<K, Collection<V>> a;

                public final boolean hasNext() {
                    return it.hasNext();
                }

                public final K next() {
                    this.a = (Entry) it.next();
                    return this.a.getKey();
                }

                public final void remove() {
                    fay.b(this.a != null, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.a.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - collection.size();
                    collection.clear();
                    this.a = null;
                }
            };
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.b.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b - i;
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        public boolean containsAll(Collection<?> collection) {
            return this.b.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || this.b.keySet().equals(obj);
        }

        public int hashCode() {
            return this.b.keySet().hashCode();
        }
    }

    class d extends g implements NavigableMap<K, Collection<V>> {
        d(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final Entry<K, Collection<V>> pollFirstEntry() {
            return a(entrySet().iterator());
        }

        public final Entry<K, Collection<V>> pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        private Entry<K, Collection<V>> a(Iterator<Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Entry entry = (Entry) it.next();
            Collection c2 = AbstractMapBasedMultimap.this.c();
            c2.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.a(entry.getKey(), AbstractMapBasedMultimap.this.a(c2));
        }

        public final NavigableMap<K, Collection<V>> descendingMap() {
            return new d(((NavigableMap) super.d()).descendingMap());
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public NavigableSet<K> e() {
            return new e((NavigableMap) super.d());
        }

        public final NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        public final NavigableMap<K, Collection<V>> subMap(K k, boolean z, K k2, boolean z2) {
            return new d(((NavigableMap) super.d()).subMap(k, z, k2, z2));
        }

        public final NavigableMap<K, Collection<V>> headMap(K k, boolean z) {
            return new d(((NavigableMap) super.d()).headMap(k, z));
        }

        public final NavigableMap<K, Collection<V>> tailMap(K k, boolean z) {
            return new d(((NavigableMap) super.d()).tailMap(k, z));
        }

        public final Entry<K, Collection<V>> lowerEntry(K k) {
            Entry lowerEntry = ((NavigableMap) super.d()).lowerEntry(k);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        public final K lowerKey(K k) {
            return ((NavigableMap) super.d()).lowerKey(k);
        }

        public final Entry<K, Collection<V>> floorEntry(K k) {
            Entry floorEntry = ((NavigableMap) super.d()).floorEntry(k);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public final K floorKey(K k) {
            return ((NavigableMap) super.d()).floorKey(k);
        }

        public final Entry<K, Collection<V>> ceilingEntry(K k) {
            Entry ceilingEntry = ((NavigableMap) super.d()).ceilingEntry(k);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public final K ceilingKey(K k) {
            return ((NavigableMap) super.d()).ceilingKey(k);
        }

        public final Entry<K, Collection<V>> higherEntry(K k) {
            Entry higherEntry = ((NavigableMap) super.d()).higherEntry(k);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public final K higherKey(K k) {
            return ((NavigableMap) super.d()).higherKey(k);
        }

        public final Entry<K, Collection<V>> firstEntry() {
            Entry firstEntry = ((NavigableMap) super.d()).firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public final Entry<K, Collection<V>> lastEntry() {
            Entry lastEntry = ((NavigableMap) super.d()).lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public final NavigableSet<K> navigableKeySet() {
            return (NavigableSet) super.keySet();
        }

        public final /* bridge */ /* synthetic */ SortedSet c() {
            return (NavigableSet) super.keySet();
        }

        public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ SortedMap d() {
            return (NavigableMap) super.d();
        }

        public final /* synthetic */ Set keySet() {
            return (NavigableSet) super.keySet();
        }
    }

    class e extends h implements NavigableSet<K> {
        e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public final K pollFirst() {
            return Iterators.b(iterator());
        }

        public final K pollLast() {
            return Iterators.b(descendingIterator());
        }

        public final NavigableSet<K> descendingSet() {
            return new e(((NavigableMap) super.a()).descendingMap());
        }

        public final Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        public final NavigableSet<K> headSet(K k, boolean z) {
            return new e(((NavigableMap) super.a()).headMap(k, z));
        }

        public final NavigableSet<K> subSet(K k, boolean z, K k2, boolean z2) {
            return new e(((NavigableMap) super.a()).subMap(k, z, k2, z2));
        }

        public final NavigableSet<K> tailSet(K k, boolean z) {
            return new e(((NavigableMap) super.a()).tailMap(k, z));
        }

        public final K lower(K k) {
            return ((NavigableMap) super.a()).lowerKey(k);
        }

        public final K floor(K k) {
            return ((NavigableMap) super.a()).floorKey(k);
        }

        public final K ceiling(K k) {
            return ((NavigableMap) super.a()).ceilingKey(k);
        }

        public final K higher(K k) {
            return ((NavigableMap) super.a()).higherKey(k);
        }

        public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ SortedMap a() {
            return (NavigableMap) super.a();
        }
    }

    class f extends j implements RandomAccess {
        f(K k, List<V> list, i iVar) {
            super(k, list, iVar);
        }
    }

    class g extends a implements SortedMap<K, Collection<V>> {
        private SortedSet<K> c;

        g(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: 0000 */
        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.a;
        }

        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public K firstKey() {
            return d().firstKey();
        }

        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new g(d().headMap(k));
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new g(d().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new g(d().tailMap(k));
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.c;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b = e();
            this.c = b;
            return b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public SortedSet<K> e() {
            return new h(d());
        }
    }

    class h extends c implements SortedSet<K> {
        h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public Comparator<? super K> comparator() {
            return a().comparator();
        }

        public K first() {
            return a().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new h(a().headMap(k));
        }

        public K last() {
            return a().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new h(a().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new h(a().tailMap(k));
        }

        /* access modifiers changed from: 0000 */
        public SortedMap<K, Collection<V>> a() {
            return (SortedMap) this.b;
        }
    }

    class i extends AbstractCollection<V> {
        final K a;
        Collection<V> b;
        final i c;
        private Collection<V> e;

        class a implements Iterator<V> {
            final Iterator<V> a;
            private Collection<V> b = i.this.b;

            a() {
                this.a = AbstractMapBasedMultimap.b((Collection) i.this.b);
            }

            a(Iterator<V> it) {
                this.a = it;
            }

            /* access modifiers changed from: 0000 */
            public final void a() {
                i.this.a();
                if (i.this.b != this.b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                a();
                return this.a.hasNext();
            }

            public V next() {
                a();
                return this.a.next();
            }

            public void remove() {
                this.a.remove();
                AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - 1;
                i.this.b();
            }
        }

        i(K k, Collection<V> collection, i iVar) {
            this.a = k;
            this.b = collection;
            this.c = iVar;
            this.e = iVar == null ? null : iVar.b;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            i iVar = this.c;
            if (iVar != null) {
                iVar.a();
                if (this.c.b != this.e) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.b.isEmpty()) {
                Collection<V> collection = (Collection) AbstractMapBasedMultimap.this.a.get(this.a);
                if (collection != null) {
                    this.b = collection;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            i iVar = this.c;
            if (iVar != null) {
                iVar.b();
                return;
            }
            if (this.b.isEmpty()) {
                AbstractMapBasedMultimap.this.a.remove(this.a);
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            i iVar = this.c;
            if (iVar != null) {
                iVar.c();
            } else {
                AbstractMapBasedMultimap.this.a.put(this.a, this.b);
            }
        }

        public int size() {
            a();
            return this.b.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.b.equals(obj);
        }

        public int hashCode() {
            a();
            return this.b.hashCode();
        }

        public String toString() {
            a();
            return this.b.toString();
        }

        public Iterator<V> iterator() {
            a();
            return new a();
        }

        public boolean add(V v) {
            a();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(v);
            if (add) {
                AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b + 1;
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                int size2 = this.b.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b + (size2 - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public boolean contains(Object obj) {
            a();
            return this.b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            a();
            return this.b.containsAll(collection);
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.b.clear();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b - size;
                b();
            }
        }

        public boolean remove(Object obj) {
            a();
            boolean remove = this.b.remove(obj);
            if (remove) {
                AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - 1;
                b();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                int size2 = this.b.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b + (size2 - size);
                b();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            fay.a(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                int size2 = this.b.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b + (size2 - size);
                b();
            }
            return retainAll;
        }
    }

    class j extends i implements List<V> {

        class a extends com.google.common.collect.AbstractMapBasedMultimap$i.a implements ListIterator<V> {
            a() {
                super();
            }

            public a(int i) {
                super(j.this.d().listIterator(i));
            }

            public final boolean hasPrevious() {
                return b().hasPrevious();
            }

            public final V previous() {
                return b().previous();
            }

            public final int nextIndex() {
                return b().nextIndex();
            }

            public final int previousIndex() {
                return b().previousIndex();
            }

            public final void set(V v) {
                b().set(v);
            }

            public final void add(V v) {
                boolean isEmpty = j.this.isEmpty();
                b().add(v);
                AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b + 1;
                if (isEmpty) {
                    j.this.c();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [com.google.common.collect.AbstractMapBasedMultimap$j$a, com.google.common.collect.AbstractMapBasedMultimap$i$a] */
            private ListIterator<V> b() {
                a();
                return (ListIterator) this.a;
            }
        }

        j(K k, List<V> list, i iVar) {
            super(k, list, iVar);
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = d().addAll(i, collection);
            if (addAll) {
                int size2 = this.b.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b + (size2 - size);
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public V get(int i) {
            a();
            return d().get(i);
        }

        public V set(int i, V v) {
            a();
            return d().set(i, v);
        }

        public void add(int i, V v) {
            a();
            boolean isEmpty = this.b.isEmpty();
            d().add(i, v);
            AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b + 1;
            if (isEmpty) {
                c();
            }
        }

        public V remove(int i) {
            a();
            V remove = d().remove(i);
            AbstractMapBasedMultimap.this.b = AbstractMapBasedMultimap.this.b - 1;
            b();
            return remove;
        }

        public int indexOf(Object obj) {
            a();
            return d().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            a();
            return d().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            a();
            return new a();
        }

        public ListIterator<V> listIterator(int i) {
            a();
            return new a(i);
        }

        public List<V> subList(int i, int i2) {
            a();
            return AbstractMapBasedMultimap.this.a(this.a, d().subList(i, i2), this.c == null ? this : this.c);
        }

        /* access modifiers changed from: 0000 */
        public final List<V> d() {
            return (List) this.b;
        }
    }

    class k extends m implements NavigableSet<V> {
        k(K k, NavigableSet<V> navigableSet, i iVar) {
            super(k, navigableSet, iVar);
        }

        public final V pollFirst() {
            return Iterators.b(iterator());
        }

        public final V pollLast() {
            return Iterators.b(descendingIterator());
        }

        private NavigableSet<V> a(NavigableSet<V> navigableSet) {
            return new k(this.a, navigableSet, this.c == null ? this : this.c);
        }

        public final Iterator<V> descendingIterator() {
            return new a(((NavigableSet) super.d()).descendingIterator());
        }

        public final V lower(V v) {
            return ((NavigableSet) super.d()).lower(v);
        }

        public final V floor(V v) {
            return ((NavigableSet) super.d()).floor(v);
        }

        public final V ceiling(V v) {
            return ((NavigableSet) super.d()).ceiling(v);
        }

        public final V higher(V v) {
            return ((NavigableSet) super.d()).higher(v);
        }

        public final NavigableSet<V> descendingSet() {
            return a(((NavigableSet) super.d()).descendingSet());
        }

        public final NavigableSet<V> subSet(V v, boolean z, V v2, boolean z2) {
            return a(((NavigableSet) super.d()).subSet(v, z, v2, z2));
        }

        public final NavigableSet<V> headSet(V v, boolean z) {
            return a(((NavigableSet) super.d()).headSet(v, z));
        }

        public final NavigableSet<V> tailSet(V v, boolean z) {
            return a(((NavigableSet) super.d()).tailSet(v, z));
        }

        /* access modifiers changed from: 0000 */
        public final /* bridge */ /* synthetic */ SortedSet d() {
            return (NavigableSet) super.d();
        }
    }

    class l extends i implements Set<V> {
        l(K k, Set<V> set) {
            super(k, set, null);
        }

        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = Sets.a((Set) this.b, collection);
            if (a) {
                int size2 = this.b.size();
                AbstractMapBasedMultimap abstractMapBasedMultimap = AbstractMapBasedMultimap.this;
                abstractMapBasedMultimap.b = abstractMapBasedMultimap.b + (size2 - size);
                b();
            }
            return a;
        }
    }

    class m extends i implements SortedSet<V> {
        m(K k, SortedSet<V> sortedSet, i iVar) {
            super(k, sortedSet, iVar);
        }

        public Comparator<? super V> comparator() {
            return d().comparator();
        }

        public V first() {
            a();
            return d().first();
        }

        public V last() {
            a();
            return d().last();
        }

        public SortedSet<V> headSet(V v) {
            a();
            return new m(this.a, d().headSet(v), this.c == null ? this : this.c);
        }

        public SortedSet<V> subSet(V v, V v2) {
            a();
            return new m(this.a, d().subSet(v, v2), this.c == null ? this : this.c);
        }

        public SortedSet<V> tailSet(V v) {
            a();
            return new m(this.a, d().tailSet(v), this.c == null ? this : this.c);
        }

        /* access modifiers changed from: 0000 */
        public SortedSet<V> d() {
            return (SortedSet) this.b;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract Collection<V> c();

    protected AbstractMapBasedMultimap(Map<K, Collection<V>> map) {
        fay.a(map.isEmpty());
        this.a = map;
    }

    /* access modifiers changed from: 0000 */
    public final void a(Map<K, Collection<V>> map) {
        this.a = map;
        this.b = 0;
        for (Collection collection : map.values()) {
            fay.a(!collection.isEmpty());
            this.b += collection.size();
        }
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> d() {
        return a(c());
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> e(K k2) {
        return c();
    }

    public int e() {
        return this.b;
    }

    public boolean f(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean a(K k2, V v) {
        Collection collection = (Collection) this.a.get(k2);
        if (collection == null) {
            Collection e2 = e(k2);
            if (e2.add(v)) {
                this.b++;
                this.a.put(k2, e2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (!collection.add(v)) {
            return false;
        } else {
            this.b++;
            return true;
        }
    }

    public Collection<V> d(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return d();
        }
        Collection c2 = c();
        c2.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return a(c2);
    }

    /* access modifiers changed from: 0000 */
    public <E> Collection<E> a(Collection<E> collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public void f() {
        for (Collection clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public Collection<V> c(K k2) {
        Collection collection = (Collection) this.a.get(k2);
        if (collection == null) {
            collection = e(k2);
        }
        return a(k2, collection);
    }

    /* access modifiers changed from: 0000 */
    public Collection<V> a(K k2, Collection<V> collection) {
        return new i(k2, collection, null);
    }

    /* access modifiers changed from: 0000 */
    public final List<V> a(K k2, List<V> list, i iVar) {
        return list instanceof RandomAccess ? new f(k2, list, iVar) : new j(k2, list, iVar);
    }

    public Set<K> g() {
        return new c(this.a);
    }

    public Collection<Entry<K, V>> h() {
        return super.h();
    }

    public final Collection<Entry<K, V>> i() {
        if (this instanceof fcw) {
            return new defpackage.fbp.b();
        }
        return new defpackage.fbp.a();
    }

    public Iterator<Entry<K, V>> j() {
        return new b<Entry<K, V>>() {
            /* access modifiers changed from: 0000 */
            public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
                return Maps.a(obj, obj2);
            }
        };
    }

    public Map<K, Collection<V>> k() {
        return new a(this.a);
    }

    static /* synthetic */ Iterator b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    static /* synthetic */ void a(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj) {
        Collection collection = (Collection) Maps.c(abstractMapBasedMultimap.a, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractMapBasedMultimap.b -= size;
        }
    }
}
