package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import com.google.common.collect.Multisets.c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fbw reason: default package */
abstract class fbw<E> extends fcd<E> implements fcz<E> {
    private transient Comparator<? super E> a;
    private transient NavigableSet<E> b;
    private transient Set<defpackage.fcp.a<E>> c;

    /* renamed from: fbw$a */
    class a extends c<E> {
        a() {
        }

        public final fcp<E> a() {
            return fbw.this;
        }

        public final Iterator<defpackage.fcp.a<E>> iterator() {
            return fbw.this.c();
        }

        public final int size() {
            return fbw.this.delegate().S_().size();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract fcz<E> delegate();

    /* access modifiers changed from: 0000 */
    public abstract Iterator<defpackage.fcp.a<E>> c();

    fbw() {
    }

    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.a;
        if (comparator != null) {
            return comparator;
        }
        fct a2 = fct.a(delegate().comparator()).a();
        this.a = a2;
        return a2;
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

    public final defpackage.fcp.a<E> j() {
        return delegate().k();
    }

    public final defpackage.fcp.a<E> k() {
        return delegate().j();
    }

    public final fcz<E> d(E e, BoundType boundType) {
        return delegate().c(e, boundType).m();
    }

    public final fcz<E> a(E e, BoundType boundType, E e2, BoundType boundType2) {
        return delegate().a(e2, boundType2, e, boundType).m();
    }

    public final fcz<E> c(E e, BoundType boundType) {
        return delegate().d(e, boundType).m();
    }

    /* access modifiers changed from: protected */
    public final fcp<E> e() {
        return delegate();
    }

    public final fcz<E> m() {
        return delegate();
    }

    public final defpackage.fcp.a<E> h() {
        return delegate().i();
    }

    public final defpackage.fcp.a<E> i() {
        return delegate().h();
    }

    public final Set<defpackage.fcp.a<E>> S_() {
        Set<defpackage.fcp.a<E>> set = this.c;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.c = aVar;
        return aVar;
    }

    public Iterator<E> iterator() {
        return Multisets.a((fcp<E>) this);
    }

    public Object[] toArray() {
        return n();
    }

    public String toString() {
        return S_().toString();
    }

    public <T> T[] toArray(T[] tArr) {
        return fcq.a((Collection<?>) this, tArr);
    }
}
