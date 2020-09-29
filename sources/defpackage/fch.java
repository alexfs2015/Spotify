package defpackage;

import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets.c;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: fch reason: default package */
public abstract class fch<E> extends AbstractCollection<E> implements fdh<E> {
    private transient Set<E> a;
    private transient Set<defpackage.fdh.a<E>> b;

    /* renamed from: fch$a */
    class a extends com.google.common.collect.Multisets.b<E> {
        a() {
        }

        public final fdh<E> a() {
            return fch.this;
        }

        public final Iterator<E> iterator() {
            return fch.this.a();
        }
    }

    /* renamed from: fch$b */
    class b extends c<E> {
        b() {
        }

        public final fdh<E> a() {
            return fch.this;
        }

        public final Iterator<defpackage.fdh.a<E>> iterator() {
            return fch.this.b();
        }

        public final int size() {
            return fch.this.c();
        }
    }

    protected fch() {
    }

    public Set<defpackage.fdh.a<E>> S_() {
        Set<defpackage.fdh.a<E>> set = this.b;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.b = bVar;
        return bVar;
    }

    public int a(E e, int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<E> a();

    public boolean a(E e, int i, int i2) {
        fcl.a(i, "oldCount");
        fcl.a(i2, "newCount");
        if (a(e) != i) {
            return false;
        }
        c(e, i2);
        return true;
    }

    public final boolean add(E e) {
        a(e, 1);
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.a((fdh<E>) this, collection);
    }

    public int b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<defpackage.fdh.a<E>> b();

    /* access modifiers changed from: protected */
    public abstract int c();

    public int c(E e, int i) {
        fcl.a(i, "count");
        int a2 = a(e);
        int i2 = i - a2;
        if (i2 > 0) {
            a(e, i2);
        } else if (i2 < 0) {
            b(e, -i2);
        }
        return a2;
    }

    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public Set<E> d() {
        Set<E> set = this.a;
        if (set != null) {
            return set;
        }
        Set<E> e = e();
        this.a = e;
        return e;
    }

    /* access modifiers changed from: 0000 */
    public Set<E> e() {
        return new a();
    }

    public final boolean equals(Object obj) {
        return Multisets.a((fdh<?>) this, obj);
    }

    public final int hashCode() {
        return S_().hashCode();
    }

    public boolean isEmpty() {
        return S_().isEmpty();
    }

    public final boolean remove(Object obj) {
        return b(obj, 1) > 0;
    }

    public final boolean removeAll(Collection<?> collection) {
        return Multisets.b(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return Multisets.c(this, collection);
    }

    public final String toString() {
        return S_().toString();
    }
}
