package defpackage;

import java.util.Iterator;

/* renamed from: fde reason: default package */
public abstract class fde<F, T> implements Iterator<T> {
    final Iterator<? extends F> b;

    /* access modifiers changed from: protected */
    public abstract T a(F f);

    protected fde(Iterator<? extends F> it) {
        this.b = (Iterator) fay.a(it);
    }

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
