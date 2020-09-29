package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: fcp reason: default package */
public interface fcp<E> extends Collection<E> {

    /* renamed from: fcp$a */
    public interface a<E> {
        int a();

        E b();

        String toString();
    }

    Set<a<E>> S_();

    int a(Object obj);

    int a(E e, int i);

    boolean a(E e, int i, int i2);

    boolean add(E e);

    int b(Object obj, int i);

    int c(E e, int i);

    boolean contains(Object obj);

    boolean containsAll(Collection<?> collection);

    Set<E> d();

    boolean equals(Object obj);

    int hashCode();

    boolean remove(Object obj);

    int size();
}
