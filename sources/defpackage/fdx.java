package defpackage;

import java.util.ListIterator;

/* renamed from: fdx reason: default package */
public abstract class fdx<F, T> extends fdw<F, T> implements ListIterator<T> {
    protected fdx(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> a() {
        return (ListIterator) this.b;
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final T previous() {
        return a(a().previous());
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
