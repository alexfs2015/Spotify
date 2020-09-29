package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: du reason: default package */
public abstract class du<K, V> {
    b a;
    e b;
    private c c;

    /* renamed from: du$a */
    final class a<T> implements Iterator<T> {
        private int a;
        private int b;
        private int c;
        private boolean d = false;

        a(int i) {
            this.a = i;
            this.b = du.this.a();
        }

        public final boolean hasNext() {
            return this.c < this.b;
        }

        public final T next() {
            if (hasNext()) {
                T a2 = du.this.a(this.c, this.a);
                this.c++;
                this.d = true;
                return a2;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.d) {
                this.c--;
                this.b--;
                this.d = false;
                du.this.a(this.c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: du$b */
    final class b implements Set<Entry<K, V>> {
        b() {
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a2 = du.this.a();
            for (Entry entry : collection) {
                du.this.a(entry.getKey(), entry.getValue());
            }
            return a2 != du.this.a();
        }

        public final void clear() {
            du.this.c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a2 = du.this.a(entry.getKey());
            if (a2 < 0) {
                return false;
            }
            return dr.a(du.this.a(a2, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return du.this.a() == 0;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return du.this.a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return du.a((Set<T>) this, obj);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int a2 = du.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = du.this.a(a2, 0);
                Object a4 = du.this.a(a2, 1);
                if (a3 == null) {
                    i = 0;
                } else {
                    i = a3.hashCode();
                }
                if (a4 == null) {
                    i2 = 0;
                } else {
                    i2 = a4.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: du$c */
    final class c implements Set<K> {
        c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            du.this.c();
        }

        public final boolean contains(Object obj) {
            return du.this.a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = du.this.b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return du.this.a() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int a2 = du.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            du.this.a(a2);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = du.this.b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return du.a(du.this.b(), collection);
        }

        public final int size() {
            return du.this.a();
        }

        public final Object[] toArray() {
            return du.this.b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return du.this.a(tArr, 0);
        }

        public final boolean equals(Object obj) {
            return du.a((Set<T>) this, obj);
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            for (int a2 = du.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = du.this.a(a2, 0);
                if (a3 == null) {
                    i = 0;
                } else {
                    i = a3.hashCode();
                }
                i2 += i;
            }
            return i2;
        }
    }

    /* renamed from: du$d */
    final class d implements Iterator<Entry<K, V>>, Entry<K, V> {
        private int a;
        private int b;
        private boolean c = false;

        d() {
            this.a = du.this.a() - 1;
            this.b = -1;
        }

        public final boolean hasNext() {
            return this.b < this.a;
        }

        public final void remove() {
            if (this.c) {
                du.this.a(this.b);
                this.b--;
                this.a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final K getKey() {
            if (this.c) {
                return du.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.c) {
                return du.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V setValue(V v) {
            if (this.c) {
                return du.this.a(this.b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                if (!dr.a(entry.getKey(), du.this.a(this.b, 0)) || !dr.a(entry.getValue(), du.this.a(this.b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public final int hashCode() {
            int i;
            if (this.c) {
                int i2 = 0;
                Object a2 = du.this.a(this.b, 0);
                Object a3 = du.this.a(this.b, 1);
                if (a2 == null) {
                    i = 0;
                } else {
                    i = a2.hashCode();
                }
                if (a3 != null) {
                    i2 = a3.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append("=");
            sb.append(getValue());
            return sb.toString();
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: du$e */
    final class e implements Collection<V> {
        e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            du.this.c();
        }

        public final boolean contains(Object obj) {
            return du.this.b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return du.this.a() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int b = du.this.b(obj);
            if (b < 0) {
                return false;
            }
            du.this.a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a2 = du.this.a();
            int i = 0;
            boolean z = false;
            while (i < a2) {
                if (collection.contains(du.this.a(i, 1))) {
                    du.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a2 = du.this.a();
            int i = 0;
            boolean z = false;
            while (i < a2) {
                if (!collection.contains(du.this.a(i, 1))) {
                    du.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return du.this.a();
        }

        public final Object[] toArray() {
            return du.this.b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return du.this.a(tArr, 1);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public abstract void c();

    du() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final <T> T[] a(T[] tArr, int i) {
        int a2 = a();
        if (tArr.length < a2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2);
        }
        for (int i2 = 0; i2 < a2; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > a2) {
            tArr[a2] = null;
        }
        return tArr;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public final Set<K> d() {
        if (this.c == null) {
            this.c = new c<>();
        }
        return this.c;
    }
}
