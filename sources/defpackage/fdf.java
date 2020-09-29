package defpackage;

import java.util.ListIterator;

/* renamed from: fdf reason: default package */
public abstract class fdf<F, T> extends fde<F, T> implements ListIterator<T> {
    protected fdf(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> a() {
        return (ListIterator) this.b;
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final T previous() {
        return a(a().previous());
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }
}
