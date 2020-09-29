package defpackage;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fdr reason: default package */
public interface fdr<E> extends fdp<E>, fds<E> {
    Set<a<E>> S_();

    fdr<E> a(E e, BoundType boundType, E e2, BoundType boundType2);

    fdr<E> c(E e, BoundType boundType);

    Comparator<? super E> comparator();

    fdr<E> d(E e, BoundType boundType);

    NavigableSet<E> g();

    a<E> h();

    a<E> i();

    a<E> j();

    a<E> k();

    fdr<E> m();
}
