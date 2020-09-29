package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: fda reason: default package */
public abstract class fda<E> extends fcy<E> implements SortedSet<E> {
    protected fda() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract SortedSet<E> delegate();

    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    public E first() {
        return delegate().first();
    }

    public SortedSet<E> headSet(E e) {
        return delegate().headSet(e);
    }

    public E last() {
        return delegate().last();
    }

    public SortedSet<E> subSet(E e, E e2) {
        return delegate().subSet(e, e2);
    }

    public SortedSet<E> tailSet(E e) {
        return delegate().tailSet(e);
    }
}
