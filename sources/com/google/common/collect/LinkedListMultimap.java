package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

public class LinkedListMultimap<K, V> extends fcg<K, V> implements fde<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public transient e<K, V> a;
    /* access modifiers changed from: private */
    public transient e<K, V> b;
    /* access modifiers changed from: private */
    public transient Map<K, d<K, V>> c;
    /* access modifiers changed from: private */
    public transient int d;
    /* access modifiers changed from: private */
    public transient int e;

    class a extends AbstractSequentialList<Entry<K, V>> {
        a() {
        }

        public final ListIterator<Entry<K, V>> listIterator(int i) {
            return new f(i);
        }

        public final int size() {
            return LinkedListMultimap.this.d;
        }
    }

    class b extends c<K> {
        b() {
        }

        public final boolean contains(Object obj) {
            return LinkedListMultimap.this.f(obj);
        }

        public final Iterator<K> iterator() {
            return new c(LinkedListMultimap.this, 0);
        }

        public final boolean remove(Object obj) {
            return !LinkedListMultimap.this.d(obj).isEmpty();
        }

        public final int size() {
            return LinkedListMultimap.this.c.size();
        }
    }

    class c implements Iterator<K> {
        private Set<K> a;
        private e<K, V> b;
        private e<K, V> c;
        private int d;

        private c() {
            this.a = Sets.a(LinkedListMultimap.this.m().size());
            this.b = LinkedListMultimap.this.a;
            this.d = LinkedListMultimap.this.e;
        }

        /* synthetic */ c(LinkedListMultimap linkedListMultimap, byte b2) {
            this();
        }

        private void a() {
            if (LinkedListMultimap.this.e != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            a();
            return this.b != null;
        }

        public final K next() {
            e<K, V> eVar;
            a();
            LinkedListMultimap.b((Object) this.b);
            this.c = this.b;
            this.a.add(this.c.a);
            do {
                this.b = this.b.c;
                eVar = this.b;
                if (eVar == null) {
                    break;
                }
            } while (!this.a.add(eVar.a));
            return this.c.a;
        }

        public final void remove() {
            a();
            fbp.b(this.c != null, "no calls to next() since the last call to remove()");
            LinkedListMultimap.this.e((Object) this.c.a);
            this.c = null;
            this.d = LinkedListMultimap.this.e;
        }
    }

    static class d<K, V> {
        e<K, V> a;
        e<K, V> b;
        int c = 1;

        d(e<K, V> eVar) {
            this.a = eVar;
            this.b = eVar;
        }
    }

    static final class e<K, V> extends fcf<K, V> {
        final K a;
        V b;
        e<K, V> c;
        e<K, V> d;
        e<K, V> e = null;
        e<K, V> f = null;

        e(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final K getKey() {
            return this.a;
        }

        public final V getValue() {
            return this.b;
        }

        public final V setValue(V v) {
            V v2 = this.b;
            this.b = v;
            return v2;
        }
    }

    class f implements ListIterator<Entry<K, V>> {
        private int a;
        private e<K, V> b;
        private e<K, V> c;
        private e<K, V> d;
        private int e = LinkedListMultimap.this.e;

        f(int i) {
            int e2 = LinkedListMultimap.this.e();
            fbp.b(i, e2, "index");
            if (i < e2 / 2) {
                this.b = LinkedListMultimap.this.a;
                while (true) {
                    int i2 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i2;
                }
            } else {
                this.d = LinkedListMultimap.this.b;
                this.a = e2;
                while (true) {
                    int i3 = i + 1;
                    if (i >= e2) {
                        break;
                    }
                    previous();
                    i = i3;
                }
            }
            this.c = null;
        }

        private void a() {
            if (LinkedListMultimap.this.e != this.e) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public e<K, V> next() {
            a();
            LinkedListMultimap.b((Object) this.b);
            e<K, V> eVar = this.b;
            this.c = eVar;
            this.d = eVar;
            this.b = eVar.c;
            this.a++;
            return this.c;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public e<K, V> previous() {
            a();
            LinkedListMultimap.b((Object) this.d);
            e<K, V> eVar = this.d;
            this.c = eVar;
            this.b = eVar;
            this.d = eVar.d;
            this.a--;
            return this.c;
        }

        public final /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean hasNext() {
            a();
            return this.b != null;
        }

        public final boolean hasPrevious() {
            a();
            return this.d != null;
        }

        public final int nextIndex() {
            return this.a;
        }

        public final int previousIndex() {
            return this.a - 1;
        }

        public final void remove() {
            a();
            fbp.b(this.c != null, "no calls to next() since the last call to remove()");
            e<K, V> eVar = this.c;
            if (eVar != this.b) {
                this.d = eVar.d;
                this.a--;
            } else {
                this.b = eVar.c;
            }
            LinkedListMultimap.a(LinkedListMultimap.this, (e) this.c);
            this.c = null;
            this.e = LinkedListMultimap.this.e;
        }

        public final /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    class g implements ListIterator<V> {
        private Object a;
        private int b;
        private e<K, V> c;
        private e<K, V> d;
        private e<K, V> e;

        g(Object obj) {
            this.a = obj;
            d dVar = (d) LinkedListMultimap.this.c.get(obj);
            this.c = dVar == null ? null : dVar.a;
        }

        public g(Object obj, int i) {
            d dVar = (d) LinkedListMultimap.this.c.get(obj);
            int i2 = dVar == null ? 0 : dVar.c;
            fbp.b(i, i2, "index");
            if (i < i2 / 2) {
                this.c = dVar == null ? null : dVar.a;
                while (true) {
                    int i3 = i - 1;
                    if (i <= 0) {
                        break;
                    }
                    next();
                    i = i3;
                }
            } else {
                this.e = dVar == null ? null : dVar.b;
                this.b = i2;
                while (true) {
                    int i4 = i + 1;
                    if (i >= i2) {
                        break;
                    }
                    previous();
                    i = i4;
                }
            }
            this.a = obj;
            this.d = null;
        }

        public final void add(V v) {
            this.e = LinkedListMultimap.this.a(this.a, v, this.c);
            this.b++;
            this.d = null;
        }

        public final boolean hasNext() {
            return this.c != null;
        }

        public final boolean hasPrevious() {
            return this.e != null;
        }

        public final V next() {
            LinkedListMultimap.b((Object) this.c);
            e<K, V> eVar = this.c;
            this.d = eVar;
            this.e = eVar;
            this.c = eVar.e;
            this.b++;
            return this.d.b;
        }

        public final int nextIndex() {
            return this.b;
        }

        public final V previous() {
            LinkedListMultimap.b((Object) this.e);
            e<K, V> eVar = this.e;
            this.d = eVar;
            this.c = eVar;
            this.e = eVar.f;
            this.b--;
            return this.d.b;
        }

        public final int previousIndex() {
            return this.b - 1;
        }

        public final void remove() {
            fbp.b(this.d != null, "no calls to next() since the last call to remove()");
            e<K, V> eVar = this.d;
            if (eVar != this.c) {
                this.e = eVar.f;
                this.b--;
            } else {
                this.c = eVar.e;
            }
            LinkedListMultimap.a(LinkedListMultimap.this, (e) this.d);
            this.d = null;
        }

        public final void set(V v) {
            fbp.b(this.d != null);
            this.d.b = v;
        }
    }

    LinkedListMultimap() {
        this(12);
    }

    private LinkedListMultimap(int i) {
        this.c = CompactHashMap.a(12);
    }

    /* access modifiers changed from: private */
    public e<K, V> a(K k, V v, e<K, V> eVar) {
        e<K, V> eVar2 = new e<>(k, v);
        if (this.a == null) {
            this.b = eVar2;
            this.a = eVar2;
            this.c.put(k, new d(eVar2));
            this.e++;
        } else if (eVar == null) {
            e<K, V> eVar3 = this.b;
            eVar3.c = eVar2;
            eVar2.d = eVar3;
            this.b = eVar2;
            d dVar = (d) this.c.get(k);
            if (dVar == null) {
                this.c.put(k, new d(eVar2));
                this.e++;
            } else {
                dVar.c++;
                e<K, V> eVar4 = dVar.b;
                eVar4.e = eVar2;
                eVar2.f = eVar4;
                dVar.b = eVar2;
            }
        } else {
            d dVar2 = (d) this.c.get(k);
            dVar2.c++;
            eVar2.d = eVar.d;
            eVar2.f = eVar.f;
            eVar2.c = eVar;
            eVar2.e = eVar;
            if (eVar.f == null) {
                ((d) this.c.get(k)).a = eVar2;
            } else {
                eVar.f.e = eVar2;
            }
            if (eVar.d == null) {
                this.a = eVar2;
            } else {
                eVar.d.c = eVar2;
            }
            eVar.d = eVar2;
            eVar.f = eVar2;
        }
        this.d++;
        return eVar2;
    }

    public static <K, V> LinkedListMultimap<K, V> a() {
        return new LinkedListMultimap<>();
    }

    static /* synthetic */ void a(LinkedListMultimap linkedListMultimap, e eVar) {
        if (eVar.d != null) {
            eVar.d.c = eVar.c;
        } else {
            linkedListMultimap.a = eVar.c;
        }
        if (eVar.c != null) {
            eVar.c.d = eVar.d;
        } else {
            linkedListMultimap.b = eVar.d;
        }
        if (eVar.f == null && eVar.e == null) {
            ((d) linkedListMultimap.c.remove(eVar.a)).c = 0;
            linkedListMultimap.e++;
        } else {
            d dVar = (d) linkedListMultimap.c.get(eVar.a);
            dVar.c--;
            if (eVar.f == null) {
                dVar.a = eVar.e;
            } else {
                eVar.f.e = eVar.e;
            }
            if (eVar.e == null) {
                dVar.b = eVar.f;
            } else {
                eVar.e.f = eVar.f;
            }
        }
        linkedListMultimap.d--;
    }

    static /* synthetic */ void b(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    /* access modifiers changed from: private */
    public void e(Object obj) {
        Iterators.c(new g(obj));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = CompactLinkedHashMap.c();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            a((K) objectInputStream.readObject(), (V) objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.d);
        for (Entry entry : (List) super.h()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* renamed from: a */
    public final List<V> d(Object obj) {
        List<V> unmodifiableList = Collections.unmodifiableList(Lists.a((Iterator<? extends E>) new g<Object>(obj)));
        e(obj);
        return unmodifiableList;
    }

    public final boolean a(K k, V v) {
        a(k, v, null);
        return true;
    }

    public final /* bridge */ /* synthetic */ Map b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        return super.b(obj, obj2);
    }

    public final /* synthetic */ Collection c(final Object obj) {
        return new AbstractSequentialList<V>() {
            public final ListIterator<V> listIterator(int i) {
                return new g(obj, i);
            }

            public final int size() {
                d dVar = (d) LinkedListMultimap.this.c.get(obj);
                if (dVar == null) {
                    return 0;
                }
                return dVar.c;
            }
        };
    }

    public final /* bridge */ /* synthetic */ boolean c(Object obj, Object obj2) {
        return super.c(obj, obj2);
    }

    public final int e() {
        return this.d;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final void f() {
        this.a = null;
        this.b = null;
        this.c.clear();
        this.d = 0;
        this.e++;
    }

    public final boolean f(Object obj) {
        return this.c.containsKey(obj);
    }

    public final Set<K> g() {
        return new b();
    }

    public final /* bridge */ /* synthetic */ Collection h() {
        return (List) super.h();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* synthetic */ Collection i() {
        return new a();
    }

    public final Iterator<Entry<K, V>> j() {
        throw new AssertionError("should never be called");
    }

    public final Map<K, Collection<V>> k() {
        return new defpackage.fdg.a(this);
    }

    public final boolean l() {
        return this.a == null;
    }

    public final /* bridge */ /* synthetic */ Set m() {
        return super.m();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
