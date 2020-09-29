package defpackage;

import java.util.ListIterator;

/* renamed from: fdi reason: default package */
public abstract class fdi<E> extends fdh<E> implements ListIterator<E> {
    protected fdi() {
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
