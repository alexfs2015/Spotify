package defpackage;

import defpackage.wrj;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: wrh reason: default package */
public class wrh<K, V, T extends wrj<K, V, T>> implements wrj<K, V, T> {
    protected final a<K, V> a;
    public final wrm<V> b;
    private final a<K, V>[] c;
    private final byte d;
    private final c<K> e;
    private final wvk<K> f;
    private int g;

    /* renamed from: wrh$a */
    public static class a<K, V> implements Entry<K, V> {
        protected final int a;
        protected final K b;
        protected V c;
        protected a<K, V> d;
        protected a<K, V> e;
        private a<K, V> f;

        a() {
            this.a = -1;
            this.b = null;
            this.e = this;
            this.f = this;
        }

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
            wxq.a(v, "value");
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

    /* renamed from: wrh$b */
    final class b implements Iterator<Entry<K, V>> {
        private a<K, V> a;

        private b() {
            this.a = wrh.this.a;
        }

        /* synthetic */ b(wrh wrh, byte b2) {
            this();
        }

        public final boolean hasNext() {
            return this.a.e != wrh.this.a;
        }

        public final /* synthetic */ Object next() {
            this.a = this.a.e;
            if (this.a != wrh.this.a) {
                return this.a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("read-only iterator");
        }
    }

    /* renamed from: wrh$c */
    public interface c<K> {
        public static final c a = new c() {
            public final void a(Object obj) {
                wxq.a(obj, "name");
            }
        };

        void a(K k);
    }

    public wrh(wvk<K> wvk, wrm<V> wrm, c<K> cVar) {
        this(wvk, wrm, cVar, 16);
    }

    private wrh(wvk<K> wvk, wrm<V> wrm, c<K> cVar, int i) {
        this.b = (wrm) wxq.a(wrm, "valueConverter");
        this.e = (c) wxq.a(cVar, "nameValidator");
        this.f = (wvk) wxq.a(wvk, "nameHashingStrategy");
        this.c = new a[wxm.a(Math.max(2, Math.min(16, 128)))];
        this.d = (byte) (this.c.length - 1);
        this.a = new a<>();
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

    private a<K, V> a(int i, K k, V v, a<K, V> aVar) {
        a aVar2 = new a(i, k, v, aVar, this.a);
        return aVar2;
    }

    private void a(int i, int i2, K k, V v) {
        a<K, V>[] aVarArr = this.c;
        aVarArr[i2] = a(i, k, v, aVarArr[i2]);
        this.g++;
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

    public final int a() {
        return this.g;
    }

    public final int a(wvk<V> wvk) {
        int i = -1028477387;
        for (Object next : c()) {
            i = (i * 31) + this.f.a(next);
            List b2 = b(next);
            for (int i2 = 0; i2 < b2.size(); i2++) {
                i = (i * 31) + wvk.a(b2.get(i2));
            }
        }
        return i;
    }

    public final V a(K k) {
        wxq.a(k, "name");
        int a2 = this.f.a(k);
        V v = null;
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b)) {
                v = aVar.c;
            }
        }
        return v;
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

    public T a(K k, V v) {
        this.e.a(k);
        wxq.a(v, "value");
        int a2 = this.f.a(k);
        a(a2, (int) this.d & a2, k, v);
        return this;
    }

    public final boolean a(K k, V v, wvk<? super V> wvk) {
        wxq.a(k, "name");
        int a2 = this.f.a(k);
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b) && wvk.a(v, aVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(wrj<K, V, ?> wrj, wvk<V> wvk) {
        if (wrj.a() != this.g) {
            return false;
        }
        if (this == wrj) {
            return true;
        }
        for (Object next : c()) {
            List b2 = wrj.b(next);
            List b3 = b(next);
            if (b2.size() != b3.size()) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i < b2.size()) {
                    if (!wvk.a(b2.get(i), b3.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public List<V> b(K k) {
        wxq.a(k, "name");
        LinkedList linkedList = new LinkedList();
        int a2 = this.f.a(k);
        for (a<K, V> aVar = this.c[this.d & a2]; aVar != null; aVar = aVar.d) {
            if (aVar.a == a2 && this.f.a(k, aVar.b)) {
                linkedList.addFirst(aVar.getValue());
            }
        }
        return linkedList;
    }

    public final T b(K k, Object obj) {
        return a(k, (V) this.b.b(wxq.a(obj, "value")));
    }

    public final boolean b() {
        a<K, V> aVar = this.a;
        return aVar == aVar.e;
    }

    public final T c(K k, V v) {
        this.e.a(k);
        wxq.a(v, "value");
        int a2 = this.f.a(k);
        byte b2 = this.d & a2;
        a(a2, (int) b2, k);
        a(a2, (int) b2, k, v);
        return this;
    }

    public final boolean c(K k) {
        return a(k) != null;
    }

    public T d(K k, Object obj) {
        wxq.a(obj, "value");
        return c(k, wxq.a(this.b.b(obj), "convertedValue"));
    }

    public final boolean d(K k) {
        int a2 = this.f.a(k);
        return a(a2, (int) this.d & a2, (K) wxq.a(k, "name")) != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wrj)) {
            return false;
        }
        return a((wrj) obj, wvk.a);
    }

    public int hashCode() {
        return a(wvk.a);
    }

    public Iterator<Entry<K, V>> iterator() {
        return new b(this, 0);
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
}
