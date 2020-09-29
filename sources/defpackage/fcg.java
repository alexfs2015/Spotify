package defpackage;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: fcg reason: default package */
public abstract class fcg<K, V> implements fdf<K, V> {
    private transient Collection<Entry<K, V>> a;
    private transient Set<K> b;
    private transient Map<K, Collection<V>> c;

    /* renamed from: fcg$a */
    public class a extends b<K, V> {
        public a() {
        }

        /* access modifiers changed from: 0000 */
        public final fdf<K, V> a() {
            return fcg.this;
        }

        public Iterator<Entry<K, V>> iterator() {
            return fcg.this.j();
        }
    }

    /* renamed from: fcg$b */
    public class b extends a implements Set<Entry<K, V>> {
        public b() {
            super();
        }

        public final boolean equals(Object obj) {
            return Sets.a((Set<?>) this, obj);
        }

        public final int hashCode() {
            return Sets.a((Set<?>) this);
        }
    }

    protected fcg() {
    }

    public boolean a(K k, V v) {
        return c(k).add(v);
    }

    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> k = k();
        this.c = k;
        return k;
    }

    public boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fdf)) {
            return false;
        }
        return b().equals(((fdf) obj).b());
    }

    /* access modifiers changed from: protected */
    public abstract Set<K> g();

    public Collection<Entry<K, V>> h() {
        Collection<Entry<K, V>> collection = this.a;
        if (collection != null) {
            return collection;
        }
        Collection<Entry<K, V>> i = i();
        this.a = i;
        return i;
    }

    public int hashCode() {
        return b().hashCode();
    }

    /* access modifiers changed from: protected */
    public abstract Collection<Entry<K, V>> i();

    /* access modifiers changed from: protected */
    public abstract Iterator<Entry<K, V>> j();

    /* access modifiers changed from: protected */
    public abstract Map<K, Collection<V>> k();

    public boolean l() {
        return e() == 0;
    }

    public Set<K> m() {
        Set<K> set = this.b;
        if (set != null) {
            return set;
        }
        Set<K> g = g();
        this.b = g;
        return g;
    }

    public String toString() {
        return b().toString();
    }
}
