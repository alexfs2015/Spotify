package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: db reason: default package */
public class db<K, V> implements Iterable<Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* renamed from: db$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.c;
        }

        /* access modifiers changed from: 0000 */
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* renamed from: db$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: 0000 */
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.d;
        }

        /* access modifiers changed from: 0000 */
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* renamed from: db$c */
    public static class c<K, V> implements Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        public c<K, V> d;

        c(K k, V v) {
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
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("=");
            sb.append(this.b);
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final int hashCode() {
            return this.a.hashCode() ^ this.b.hashCode();
        }
    }

    /* renamed from: db$d */
    public class d implements f<K, V>, Iterator<Entry<K, V>> {
        private c<K, V> a;
        private boolean b = true;

        d() {
        }

        public final void a_(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                this.a = cVar2.d;
                this.b = this.a == null;
            }
        }

        public final boolean hasNext() {
            if (this.b) {
                return db.this.b != null;
            }
            c<K, V> cVar = this.a;
            return (cVar == null || cVar.c == null) ? false : true;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            c<K, V> cVar;
            if (this.b) {
                this.b = false;
                cVar = db.this.b;
            } else {
                c<K, V> cVar2 = this.a;
                cVar = cVar2 != null ? cVar2.c : null;
            }
            this.a = cVar;
            return this.a;
        }
    }

    /* renamed from: db$e */
    static abstract class e<K, V> implements f<K, V>, Iterator<Entry<K, V>> {
        private c<K, V> a;
        private c<K, V> b;

        /* access modifiers changed from: 0000 */
        public abstract c<K, V> a(c<K, V> cVar);

        /* access modifiers changed from: 0000 */
        public abstract c<K, V> b(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        public boolean hasNext() {
            return this.b != null;
        }

        public final void a_(c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = a();
            }
        }

        private c<K, V> a() {
            c<K, V> cVar = this.b;
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return a(cVar);
        }

        public /* synthetic */ Object next() {
            c<K, V> cVar = this.b;
            this.b = a();
            return cVar;
        }
    }

    /* renamed from: db$f */
    interface f<K, V> {
        void a_(c<K, V> cVar);
    }

    /* access modifiers changed from: protected */
    public c<K, V> a(K k) {
        c<K, V> cVar = this.b;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public V a(K k, V v) {
        c a2 = a(k);
        if (a2 != null) {
            return a2.b;
        }
        b(k, v);
        return null;
    }

    /* access modifiers changed from: protected */
    public final c<K, V> b(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
            this.c = this.b;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.c = cVar;
        return cVar;
    }

    public V b(K k) {
        c a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f a_ : this.d.keySet()) {
                a_.a_(a2);
            }
        }
        if (a2.d != null) {
            a2.d.c = a2.c;
        } else {
            this.b = a2.c;
        }
        if (a2.c != null) {
            a2.c.d = a2.d;
        } else {
            this.c = a2.d;
        }
        a2.c = null;
        a2.d = null;
        return a2.b;
    }

    public Iterator<Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public final d a() {
        d dVar = new d<>();
        this.d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        if (this.e != dbVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = dbVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Entry) it.next()).hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
