package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fbs reason: default package */
public abstract class fbs<E> extends fbq<E> implements fcz<E> {
    private transient fcz<E> a;
    final Comparator<? super E> comparator;

    /* renamed from: fbs$a */
    class a extends fbw<E> {
        a() {
        }

        /* access modifiers changed from: 0000 */
        public final fcz<E> a() {
            return fbs.this;
        }

        /* access modifiers changed from: 0000 */
        public final Iterator<defpackage.fcp.a<E>> c() {
            return fbs.this.l();
        }

        public final Iterator<E> iterator() {
            return Multisets.a((fcp<E>) fbs.this.m());
        }
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<defpackage.fcp.a<E>> l();

    fbs() {
        this(fct.b());
    }

    protected fbs(Comparator<? super E> comparator2) {
        this.comparator = (Comparator) fay.a(comparator2);
    }

    /* renamed from: g */
    public NavigableSet<E> d() {
        return (NavigableSet) super.d();
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public defpackage.fcp.a<E> h() {
        Iterator b = b();
        if (b.hasNext()) {
            return (defpackage.fcp.a) b.next();
        }
        return null;
    }

    public defpackage.fcp.a<E> i() {
        Iterator l = l();
        if (l.hasNext()) {
            return (defpackage.fcp.a) l.next();
        }
        return null;
    }

    public defpackage.fcp.a<E> j() {
        Iterator b = b();
        if (!b.hasNext()) {
            return null;
        }
        defpackage.fcp.a aVar = (defpackage.fcp.a) b.next();
        defpackage.fcp.a<E> a2 = Multisets.a(aVar.b(), aVar.a());
        b.remove();
        return a2;
    }

    public defpackage.fcp.a<E> k() {
        Iterator l = l();
        if (!l.hasNext()) {
            return null;
        }
        defpackage.fcp.a aVar = (defpackage.fcp.a) l.next();
        defpackage.fcp.a<E> a2 = Multisets.a(aVar.b(), aVar.a());
        l.remove();
        return a2;
    }

    public fcz<E> a(E e, BoundType boundType, E e2, BoundType boundType2) {
        fay.a(boundType);
        fay.a(boundType2);
        return c(e, boundType).d(e2, boundType2);
    }

    public fcz<E> m() {
        fcz<E> fcz = this.a;
        if (fcz != null) {
            return fcz;
        }
        a aVar = new a();
        this.a = aVar;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Set e() {
        return new b(this);
    }
}
