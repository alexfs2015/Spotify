package defpackage;

import defpackage.wdd;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: wdb reason: default package */
public class wdb<K, V, T extends wdd<K, V, T>> implements wdd<K, V, T> {
    protected final a<K, V> a;
    public final wdg<V> b;
    private final a<K, V>[] c;
    private final byte d;
    private final c<K> e;
    private final whe<K> f;
    private int g;

    /* renamed from: wdb$a */
    public static class a<K, V> implements Entry<K, V> {
        protected final int a;
        protected final K b;
        protected V c;
        protected a<K, V> d;
        protected a<K, V> e;
        private a<K, V> f;

        a(int i, K k, V v, a<K, V> aVar, a<K, V> aVar2) {
            this.a = i;
            this.b = k;
            this.c = v;
            this.d = aVar;
            this.e = aVar2;
            this.f = aVar2.f;
            this.f.e = this;
            this.e.f = this;
        }

        a() {
            this.a = -1;
            this.b = null;
            this.e = this;
            this.f = this;
        }

        /* access modifiers changed from: protected */
        public final void a() {
            a<K, V> aVar = this.f;
            aVar.e = this.e;
            this.e.f = aVar;
        }

        public final K getKey() {
            return this.b;
        }

        public final V getValue() {
            return this.c;
        }

        public final V setValue(V v) {
            wjk.a(v, "value");
            V v2 = this.c;
            this.c = v;
            return v2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.toString());
            sb.append('=');
            sb.append(this.c.toString());
            return sb.toString();
        }
    }

    /* renamed from: wdb$b */
    final class b implements Iterator<Entry<K, V>> {
        private a<K, V> a;

        private b() {
            this.a = wdb.this.a;
        }

        /* synthetic */ b(wdb wdb, byte b2) {
            this();
        }

        public final boolean hasNext() {
            return this.a.e != wdb.this.a;
        }

        public final void remove() {
            throw new UnsupportedOperationException("read-only iterator");
        }

        public final /* synthetic */ Object next() {
            this.a = this.a.e;
            if (this.a != wdb.this.a) {
                return this.a;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: wdb$c */
    public interface c<K> {
        public static final c a = new c() {
            public final void a(Object obj) {
                wjk.a(obj, "name");
            }
        };

        void a(K k);
    }

    public wdb(whe<K> whe, wdg<V> wdg, c<K> cVar) {
        this(whe, wdg, cVar, 16);
    }

    private wdb(whe<K> whe, wdg<V> wdg, c<K> cVar, int i) {
        this.b = (wdg) wjk.a(wdg, "valueConverter");
        this.e = (c) wjk.a(cVar, "nameValidator");
        this.f = (whe) wjk.a(whe, "nameHashingStrategy");
        this.c = new a[wjg.a(Math.max(2, Math.min(16, 128)))];
        this.d = (byte) (this.c.length - 1);
        this.a = new a<>();
    }

    public final V a(K k) {
        wjk.a(k, "name");
        int a2 = this.f.a(k);
        V v = null;
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b)) {
                v = aVar.c;
            }
        }
        return v;
    }

    public List<V> b(K k) {
        wjk.a(k, "name");
        LinkedList linkedList = new LinkedList();
        int a2 = this.f.a(k);
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b)) {
                linkedList.addFirst(aVar.getValue());
            }
        }
        return linkedList;
    }

    public final boolean c(K k) {
        return a(k) != null;
    }

    public final boolean a(K k, V v, whe<? super V> whe) {
        wjk.a(k, "name");
        int a2 = this.f.a(k);
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b) && whe.a(v, aVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int a() {
        return this.g;
    }

    public final boolean b() {
        a<K, V> aVar = this.a;
        return aVar == aVar.e;
    }

    private Set<K> c() {
        if (b()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.g);
        for (a<K, V> aVar = this.a.e; aVar != this.a; aVar = aVar.e) {
            linkedHashSet.add(aVar.getKey());
        }
        return linkedHashSet;
    }

    public T a(K k, V v) {
        this.e.a(k);
        wjk.a(v, "value");
        int a2 = this.f.a(k);
        a(a2, (int) this.d & a2, k, v);
        return this;
    }

    public final T b(K k, Object obj) {
        return a(k, (V) this.b.b(wjk.a(obj, "value")));
    }

    public final T c(K k, V v) {
        this.e.a(k);
        wjk.a(v, "value");
        int a2 = this.f.a(k);
        byte b2 = this.d & a2;
        a(a2, (int) b2, k);
        a(a2, (int) b2, k, v);
        return this;
    }

    public T d(K k, Object obj) {
        wjk.a(obj, "value");
        return c(k, wjk.a(this.b.b(obj), "convertedValue"));
    }

    public T a(K k, Iterable<?> iterable) {
        this.e.a(k);
        int a2 = this.f.a(k);
        byte b2 = this.d & a2;
        a(a2, (int) b2, k);
        for (Object next : iterable) {
            if (next == null) {
                break;
            }
            a(a2, (int) b2, k, (V) this.b.b(next));
        }
        return this;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new b(this, 0);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wdd)) {
            return false;
        }
        return a((wdd) obj, whe.a);
    }

    public int hashCode() {
        return a(whe.a);
    }

    public final boolean a(wdd<K, V, ?> wdd, whe<V> whe) {
        if (wdd.a() != this.g) {
            return false;
        }
        if (this == wdd) {
            return true;
        }
        for (Object next : c()) {
            List b2 = wdd.b(next);
            List b3 = b(next);
            if (b2.size() != b3.size()) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i < b2.size()) {
                    if (!whe.a(b2.get(i), b3.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public final int a(whe<V> whe) {
        int i = -1028477387;
        for (Object next : c()) {
            i = (i * 31) + this.f.a(next);
            List b2 = b(next);
            for (int i2 = 0; i2 < b2.size(); i2++) {
                i = (i * 31) + whe.a(b2.get(i2));
            }
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        String str = "";
        for (Object next : c()) {
            List b2 = b(next);
            int i = 0;
            while (i < b2.size()) {
                sb.append(str);
                sb.append(next);
                sb.append(": ");
                sb.append(b2.get(i));
                i++;
                str = ", ";
            }
        }
        sb.append(']');
        return sb.toString();
    }

    private a<K, V> a(int i, K k, V v, a<K, V> aVar) {
        a aVar2 = new a(i, k, v, aVar, this.a);
        return aVar2;
    }

    private void a(int i, int i2, K k, V v) {
        a<K, V>[] aVarArr = this.c;
        aVarArr[i2] = a(i, k, v, aVarArr[i2]);
        this.g++;
    }

    private V a(int i, int i2, K k) {
        a<K, V> aVar = this.c[i2];
        V v = null;
        if (aVar == null) {
            return null;
        }
        for (a<K, V> aVar2 = aVar.d; aVar2 != null; aVar2 = aVar.d) {
            if (aVar2.a != i || !this.f.a(k, aVar2.b)) {
                aVar = aVar2;
            } else {
                v = aVar2.c;
                aVar.d = aVar2.d;
                aVar2.a();
                this.g--;
            }
        }
        a<K, V> aVar3 = this.c[i2];
        if (aVar3.a == i && this.f.a(k, aVar3.b)) {
            if (v == null) {
                v = aVar3.c;
            }
            this.c[i2] = aVar3.d;
            aVar3.a();
            this.g--;
        }
        return v;
    }

    public final boolean d(K k) {
        int a2 = this.f.a(k);
        return a(a2, (int) this.d & a2, (K) wjk.a(k, "name")) != null;
    }
}
