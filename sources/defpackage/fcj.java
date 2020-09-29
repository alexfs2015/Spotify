package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fcj reason: default package */
public abstract class fcj<E> extends fch<E> implements fdr<E> {
    private transient fdr<E> a;
    final Comparator<? super E> comparator;

    /* renamed from: fcj$a */
    class a extends fco<E> {
        a() {
        }

        /* access modifiers changed from: 0000 */
        public final fdr<E> a() {
            return fcj.this;
        }

        /* access modifiers changed from: 0000 */
        public final Iterator<defpackage.fdh.a<E>> c() {
            return fcj.this.l();
        }

        public final Iterator<E> iterator() {
            return Multisets.a((fdh<E>) fcj.this.m());
        }
    }

    fcj() {
        this(fdl.b());
    }

    protected fcj(Comparator<? super E> comparator2) {
        this.comparator = (Comparator) fbp.a(comparator2);
    }

    public fdr<E> a(E e, BoundType boundType, E e2, BoundType boundType2) {
        fbp.a(boundType);
        fbp.a(boundType2);
        return c(e, boundType).d(e2, boundType2);
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Set e() {
        return new b(this);
    }

    /* renamed from: g */
    public NavigableSet<E> d() {
        return (NavigableSet) super.d();
    }

    public defpackage.fdh.a<E> h() {
        Iterator b = b();
        if (b.hasNext()) {
            return (defpackage.fdh.a) b.next();
        }
        return null;
    }

    public defpackage.fdh.a<E> i() {
        Iterator l = l();
        if (l.hasNext()) {
            return (defpackage.fdh.a) l.next();
        }
        return null;
    }

    public defpackage.fdh.a<E> j() {
        Iterator b = b();
        if (!b.hasNext()) {
            return null;
        }
        defpackage.fdh.a aVar = (defpackage.fdh.a) b.next();
        defpackage.fdh.a<E> a2 = Multisets.a(aVar.b(), aVar.a());
        b.remove();
        return a2;
    }

    public defpackage.fdh.a<E> k() {
        Iterator l = l();
        if (!l.hasNext()) {
            return null;
        }
        defpackage.fdh.a aVar = (defpackage.fdh.a) l.next();
        defpackage.fdh.a<E> a2 = Multisets.a(aVar.b(), aVar.a());
        l.remove();
        return a2;
    }

    /* access modifiers changed from: protected */
    public abstract Iterator<defpackage.fdh.a<E>> l();

    public fdr<E> m() {
        fdr<E> fdr = this.a;
        if (fdr != null) {
            return fdr;
        }
        a aVar = new a();
        this.a = aVar;
        return aVar;
    }
}
