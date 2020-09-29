package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: fku reason: default package */
class fku<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean a;
    private final int b;
    /* access modifiers changed from: private */
    public List<b> c;
    /* access modifiers changed from: private */
    public Map<K, V> d;
    private volatile d e;

    /* renamed from: fku$a */
    static class a {
        /* access modifiers changed from: private */
        public static final Iterator<Object> a = new Iterator<Object>() {
            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        };
        private static final Iterable<Object> b = new Iterable<Object>() {
            public final Iterator<Object> iterator() {
                return a.a;
            }
        };

        static <T> Iterable<T> a() {
            return b;
        }
    }

    /* renamed from: fku$b */
    class b implements Comparable<b>, Entry<K, V> {
        final K a;
        private V b;

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return this.a.compareTo(((b) obj).a);
        }

        b(fku fku, Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        b(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final V getValue() {
            return this.b;
        }

        public final V setValue(V v) {
            fku.this.d();
            V v2 = this.b;
            this.b = v;
            return v2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
        }

        public final int hashCode() {
            K k = this.a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("=");
            sb.append(this.b);
            return sb.toString();
        }

        private static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public final /* bridge */ /* synthetic */ Object getKey() {
            return this.a;
        }
    }

    /* renamed from: fku$c */
    class c implements Iterator<Entry<K, V>> {
        private int a;
        private boolean b;
        private Iterator<Entry<K, V>> c;

        private c() {
            this.a = -1;
        }

        /* synthetic */ c(fku fku, byte b2) {
            this();
        }

        public final boolean hasNext() {
            if (this.a + 1 < fku.this.c.size() || a().hasNext()) {
                return true;
            }
            return false;
        }

        public final void remove() {
            if (this.b) {
                this.b = false;
                fku.this.d();
                if (this.a < fku.this.c.size()) {
                    fku fku = fku.this;
                    int i = this.a;
                    this.a = i - 1;
                    fku.c(i);
                    return;
                }
                a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        private Iterator<Entry<K, V>> a() {
            if (this.c == null) {
                this.c = fku.this.d.entrySet().iterator();
            }
            return this.c;
        }

        public final /* synthetic */ Object next() {
            this.b = true;
            int i = this.a + 1;
            this.a = i;
            if (i < fku.this.c.size()) {
                return (Entry) fku.this.c.get(this.a);
            }
            return (Entry) a().next();
        }
    }

    /* renamed from: fku$d */
    class d extends AbstractSet<Entry<K, V>> {
        private d() {
        }

        /* synthetic */ d(fku fku, byte b) {
            this();
        }

        public final /* synthetic */ boolean add(Object obj) {
            Entry entry = (Entry) obj;
            if (contains(entry)) {
                return false;
            }
            fku.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new c(fku.this, 0);
        }

        public final int size() {
            return fku.this.size();
        }

        public final boolean contains(Object obj) {
            Entry entry = (Entry) obj;
            Object obj2 = fku.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public final boolean remove(Object obj) {
            Entry entry = (Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            fku.this.remove(entry.getKey());
            return true;
        }

        public final void clear() {
            fku.this.clear();
        }
    }

    /* synthetic */ fku(int i, byte b2) {
        this(i);
    }

    static <FieldDescriptorType extends defpackage.fkf.a<FieldDescriptorType>> fku<FieldDescriptorType, Object> a(int i) {
        return new fku<FieldDescriptorType, Object>(i) {
            public final /* synthetic */ Object put(Object obj, Object obj2) {
                return fku.super.put((defpackage.fkf.a) obj, obj2);
            }

            public final void a() {
                if (!this.a) {
                    for (int i = 0; i < b(); i++) {
                        Entry b = b(i);
                        if (((defpackage.fkf.a) b.getKey()).b()) {
                            b.setValue(Collections.unmodifiableList((List) b.getValue()));
                        }
                    }
                    for (Entry entry : c()) {
                        if (((defpackage.fkf.a) entry.getKey()).b()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                fku.super.a();
            }
        };
    }

    private fku(int i) {
        this.b = i;
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
    }

    public void a() {
        Map<K, V> map;
        if (!this.a) {
            if (this.d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.d);
            }
            this.d = map;
            this.a = true;
        }
    }

    public final int b() {
        return this.c.size();
    }

    public final Entry<K, V> b(int i) {
        return (Entry) this.c.get(i);
    }

    public final Iterable<Entry<K, V>> c() {
        if (this.d.isEmpty()) {
            return a.a();
        }
        return this.d.entrySet();
    }

    public int size() {
        return this.c.size() + this.d.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((K) comparable) >= 0 || this.d.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        if (a2 >= 0) {
            return ((b) this.c.get(a2)).getValue();
        }
        return this.d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        d();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((b) this.c.get(a2)).setValue(v);
        }
        f();
        int i = -(a2 + 1);
        if (i >= this.b) {
            return e().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.b;
        if (size == i2) {
            b bVar = (b) this.c.remove(i2 - 1);
            e().put(bVar.a, bVar.getValue());
        }
        this.c.add(i, new b(k, v));
        return null;
    }

    public void clear() {
        d();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    public V remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    /* access modifiers changed from: private */
    public V c(int i) {
        d();
        V value = ((b) this.c.remove(i)).getValue();
        if (!this.d.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.c.add(new b(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(((b) this.c.get(size)).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(((b) this.c.get(i2)).a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d<>(this, 0);
        }
        return this.e;
    }

    /* access modifiers changed from: private */
    public void d() {
        if (this.a) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> e() {
        d();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            this.d = new TreeMap();
        }
        return (SortedMap) this.d;
    }

    private void f() {
        d();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fku)) {
            return super.equals(obj);
        }
        fku fku = (fku) obj;
        int size = size();
        if (size != fku.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != fku.b()) {
            return entrySet().equals(fku.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(fku.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.d.equals(fku.d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((b) this.c.get(i2)).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }
}
