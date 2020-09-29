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

/* renamed from: dev reason: default package */
class dev<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    boolean a;
    private final int b;
    /* access modifiers changed from: private */
    public List<dfc> c;
    /* access modifiers changed from: private */
    public Map<K, V> d;
    private volatile dfe e;
    /* access modifiers changed from: private */
    public Map<K, V> f;
    private volatile dey g;

    private dev(int i) {
        this.b = i;
        this.c = Collections.emptyList();
        this.d = Collections.emptyMap();
        this.f = Collections.emptyMap();
    }

    /* synthetic */ dev(int i, byte b2) {
        this(i);
    }

    private final int a(K k) {
        int size = this.c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((dfc) this.c.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((dfc) this.c.get(i2)).getKey());
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

    static <FieldDescriptorType extends dcu<FieldDescriptorType>> dev<FieldDescriptorType, Object> a(int i) {
        return new dew(i);
    }

    /* access modifiers changed from: private */
    public final V c(int i) {
        e();
        V value = ((dfc) this.c.remove(i)).getValue();
        if (!this.d.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            this.c.add(new dfc(this, (Entry) it.next()));
            it.remove();
        }
        return value;
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

    /* renamed from: a */
    public final V put(K k, V v) {
        e();
        int a2 = a(k);
        if (a2 >= 0) {
            return ((dfc) this.c.get(a2)).setValue(v);
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
            dfc dfc = (dfc) this.c.remove(i2 - 1);
            f().put((Comparable) dfc.getKey(), dfc.getValue());
        }
        this.c.add(i, new dfc(this, k, v));
        return null;
    }

    public void a() {
        if (!this.a) {
            this.d = this.d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.d);
            this.f = this.f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f);
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
        return this.d.isEmpty() ? dez.a() : this.d.entrySet();
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

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((K) comparable) >= 0 || this.d.containsKey(comparable);
    }

    /* access modifiers changed from: 0000 */
    public final Set<Entry<K, V>> d() {
        if (this.g == null) {
            this.g = new dey(this, 0);
        }
        return this.g;
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new dfe(this, 0);
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev)) {
            return super.equals(obj);
        }
        dev dev = (dev) obj;
        int size = size();
        if (size != dev.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != dev.b()) {
            return entrySet().equals(dev.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(dev.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.d.equals(dev.d);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((K) comparable);
        return a2 >= 0 ? ((dfc) this.c.get(a2)).getValue() : this.d.get(comparable);
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < b(); i2++) {
            i += ((dfc) this.c.get(i2)).hashCode();
        }
        return this.d.size() > 0 ? i + this.d.hashCode() : i;
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

    public int size() {
        return this.c.size() + this.d.size();
    }
}
