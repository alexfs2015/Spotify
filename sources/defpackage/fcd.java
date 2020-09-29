package defpackage;

import com.google.common.collect.Multisets;
import java.util.Collection;
import java.util.Set;

/* renamed from: fcd reason: default package */
public abstract class fcd<E> extends fby<E> implements fcp<E> {
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract fcp<E> delegate();

    protected fcd() {
    }

    public final int a(Object obj) {
        return delegate().a(obj);
    }

    public final int a(E e, int i) {
        return delegate().a(e, i);
    }

    public final int b(Object obj, int i) {
        return delegate().b(obj, i);
    }

    public Set<E> d() {
        return delegate().d();
    }

    public Set<a<E>> S_() {
        return delegate().S_();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public final int c(E e, int i) {
        return delegate().c(e, i);
    }

    public final boolean a(E e, int i, int i2) {
        return delegate().a(e, i, i2);
    }

    /* access modifiers changed from: protected */
    public final boolean a(Collection<? extends E> collection) {
        return Multisets.a((fcp<E>) this, collection);
    }

    /* access modifiers changed from: protected */
    public final boolean b(Collection<?> collection) {
        return Multisets.b(this, collection);
    }

    /* access modifiers changed from: protected */
    public final boolean c(Collection<?> collection) {
        return Multisets.c(this, collection);
    }

    /* access modifiers changed from: protected */
    public final String l() {
        return S_().toString();
    }
}
