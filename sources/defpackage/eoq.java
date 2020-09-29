package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: eoq reason: default package */
class eoq<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean a;
    private final int b;
    /* access modifiers changed from: private */
    public List<eox> c;
    /* access modifiers changed from: private */
    public Map<K, V> d;
    private volatile eoz e;
    /* access modifiers changed from: private */
    public Map<K, V> f;
    private volatile eot g;

    static <FieldDescriptorType extends emr<FieldDescriptorType>> eoq<FieldDescriptorType, Object> a(int i) {
        return new eor(i);
    }

    private eoq(int i) {
        this.b = i;
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    public void a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.a) {
            if (this.d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.d);
            }
            this.d = map;
            if (this.f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f);
            }
            this.f = map2;
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
            return eou.a();
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
            return ((eox) this.c.get(a2)).getValue();
        }
        return this.d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        e();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((eox) this.c.get(a2)).setValue(v);
        }
        e();
        if (this.c.isEmpty() && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(this.b);
        }
        int i = -(a2 + 1);
        if (i >= this.b) {
            return f().put(k, v);
        }
        int size = this.c.size();
        int i2 = this.b;
        if (size == i2) {
            eox eox = (eox) this.c.remove(i2 - 1);
            f().put((Comparable) eox.getKey(), eox.getValue());
        }
        this.c.add(i, new eox(this, k, v));
        return null;
    }

    public void clear() {
        e();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    public V remove(Object obj) {
        e();
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
    public final V c(int i) {
        e();
        V value = ((eox) this.c.remove(i)).getValue();
        if (!this.d.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.c.add(new eox(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((eox) this.c.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((eox) this.c.get(i2)).getKey());
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
            this.e = new eoz(this, 0);
        }
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public final Set<Entry<K, V>> d() {
        if (this.g == null) {
            this.g = new eot(this, 0);
        }
        return this.g;
    }

    /* access modifiers changed from: private */
    public final void e() {
        if (this.a) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> f() {
        e();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            this.d = new TreeMap();
            this.f = ((TreeMap) this.d).descendingMap();
        }
        return (SortedMap) this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoq)) {
            return super.equals(obj);
        }
        eoq eoq = (eoq) obj;
        int size = size();
        if (size != eoq.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != eoq.b()) {
            return entrySet().equals(eoq.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(eoq.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.d.equals(eoq.d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((eox) this.c.get(i2)).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
    }

    /* synthetic */ eoq(int i, byte b2) {
        this(i);
    }
}
