package defpackage;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Set;

/* renamed from: fcv reason: default package */
public abstract class fcv<E> extends fcq<E> implements fdh<E> {
    protected fcv() {
    }

    public Set<a<E>> S_() {
        return delegate().S_();
    }

    public final int a(Object obj) {
        return delegate().a(obj);
    }

    public final int a(E e, int i) {
        return delegate().a(e, i);
    }

    public final boolean a(E e, int i, int i2) {
        return delegate().a(e, i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(Collection<? extends E> collection) {
        return Multisets.a((fdh<E>) this, collection);
    }

    public final int b(Object obj, int i) {
        return delegate().b(obj, i);
    }

    /* access modifiers changed from: protected */
    public final boolean b(Collection<?> collection) {
        return Multisets.b(this, collection);
    }

    public final int c(E e, int i) {
        return delegate().c(e, i);
    }

    /* access modifiers changed from: protected */
    public final boolean c(Collection<?> collection) {
        return Multisets.c(this, collection);
    }

    public Set<E> d() {
        return delegate().d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract fdh<E> delegate();

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    /* access modifiers changed from: protected */
    public final String l() {
        return S_().toString();
    }
}
