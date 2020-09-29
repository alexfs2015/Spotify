package defpackage;

import java.util.Iterator;

/* renamed from: fdw reason: default package */
public abstract class fdw<F, T> implements Iterator<T> {
    final Iterator<? extends F> b;

    protected fdw(Iterator<? extends F> it) {
        this.b = (Iterator) fbp.a(it);
    }

    /* access modifiers changed from: protected */
    public abstract T a(F f);

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public final T next() {
        return a(this.b.next());
    }

    public final void remove() {
        this.b.remove();
    }
}
