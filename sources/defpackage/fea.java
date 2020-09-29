package defpackage;

import java.util.ListIterator;

/* renamed from: fea reason: default package */
public abstract class fea<E> extends fdz<E> implements ListIterator<E> {
    protected fea() {
    }

    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
