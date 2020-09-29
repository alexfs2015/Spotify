package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fco reason: default package */
abstract class fco<E> extends fcv<E> implements fdr<E> {
    private transient Comparator<? super E> a;
    private transient NavigableSet<E> b;
    private transient Set<defpackage.fdh.a<E>> c;

    /* renamed from: fco$a */
    class a extends c<E> {
        a() {
        }

        public final fdh<E> a() {
            return fco.this;
        }

        public final Iterator<defpackage.fdh.a<E>> iterator() {
            return fco.this.c();
        }

        public final int size() {
            return fco.this.delegate().S_().size();
        }
    }

    fco() {
    }

    public final Set<defpackage.fdh.a<E>> S_() {
        Set<defpackage.fdh.a<E>> set = this.c;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.c = aVar;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract fdr<E> delegate();

    public final fdr<E> a(E e, BoundType boundType, E e2, BoundType boundType2) {
        return delegate().a(e2, boundType2, e, boundType).m();
    }

    public final fdr<E> c(E e, BoundType boundType) {
        return delegate().d(e, boundType).m();
    }

    /* access modifiers changed from: 0000 */
    public abstract Iterator<defpackage.fdh.a<E>> c();

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.a;
        if (comparator != null) {
            return comparator;
        }
        fdl a2 = fdl.a(delegate().comparator()).a();
        this.a = a2;
        return a2;
    }

    public final fdr<E> d(E e, BoundType boundType) {
        return delegate().c(e, boundType).m();
    }

    /* access modifiers changed from: protected */
    public final fdh<E> e() {
        return delegate();
    }

    /* renamed from: g */
    public final NavigableSet<E> d() {
        NavigableSet<E> navigableSet = this.b;
        if (navigableSet != null) {
            return navigableSet;
        }
        b bVar = new b(this);
        this.b = bVar;
        return bVar;
    }

    public final defpackage.fdh.a<E> h() {
        return delegate().i();
    }

    public final defpackage.fdh.a<E> i() {
        return delegate().h();
    }

    public Iterator<E> iterator() {
        return Multisets.a((fdh<E>) this);
    }

    public final defpackage.fdh.a<E> j() {
        return delegate().k();
    }

    public final defpackage.fdh.a<E> k() {
        return delegate().j();
    }

    public final fdr<E> m() {
        return delegate();
    }

    public Object[] toArray() {
        return n();
    }

    public <T> T[] toArray(T[] tArr) {
        return fdi.a((Collection<?>) this, tArr);
    }

    public String toString() {
        return S_().toString();
    }
}
