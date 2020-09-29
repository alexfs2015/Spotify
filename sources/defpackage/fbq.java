package defpackage;

import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets.c;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: fbq reason: default package */
public abstract class fbq<E> extends AbstractCollection<E> implements fcp<E> {
    private transient Set<E> a;
    private transient Set<defpackage.fcp.a<E>> b;

    /* renamed from: fbq$a */
    class a extends com.google.common.collect.Multisets.b<E> {
        a() {
        }

        public final fcp<E> a() {
            return fbq.this;
        }

        public final Iterator<E> iterator() {
            return fbq.this.a();
        }
    }

    /* renamed from: fbq$b */
    class b extends c<E> {
        b() {
        }

        public final fcp<E> a() {
            return fbq.this;
        }

        public final Iterator<defpackage.fcp.a<E>> iterator() {
            return fbq.this.b();
        }

        public final int size() {
            return fbq.this.c();
        }
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<E> a();

    /* access modifiers changed from: protected */
    public abstract Iterator<defpackage.fcp.a<E>> b();

    /* access modifiers changed from: protected */
    public abstract int c();

    protected fbq() {
    }

    public boolean isEmpty() {
        return S_().isEmpty();
    }

    public boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public final boolean add(E e) {
        a(e, 1);
        return true;
    }

    public int a(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        return b(obj, 1) > 0;
    }

    public int b(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.a((fcp<E>) this, collection);
    }

    public final boolean removeAll(Collection<?> collection) {
        return Multisets.b(this, collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return Multisets.c(this, collection);
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

    public Set<defpackage.fcp.a<E>> S_() {
        Set<defpackage.fcp.a<E>> set = this.b;
        if (set != null) {
            return set;
        }
        b bVar = new b();
        this.b = bVar;
        return bVar;
    }

    public final boolean equals(Object obj) {
        return Multisets.a((fcp<?>) this, obj);
    }

    public final int hashCode() {
        return S_().hashCode();
    }

    public final String toString() {
        return S_().toString();
    }

    public int c(E e, int i) {
        fbu.a(i, "count");
        int a2 = a(e);
        int i2 = i - a2;
        if (i2 > 0) {
            a(e, i2);
        } else if (i2 < 0) {
            b(e, -i2);
        }
        return a2;
    }

    public boolean a(E e, int i, int i2) {
        fbu.a(i, "oldCount");
        fbu.a(i2, "newCount");
        if (a(e) != i) {
            return false;
        }
        c(e, i2);
        return true;
    }
}
