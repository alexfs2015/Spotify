package defpackage;

import com.google.common.collect.BoundType;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* renamed from: fcz reason: default package */
public interface fcz<E> extends fcx<E>, fda<E> {
    Set<a<E>> S_();

    fcz<E> a(E e, BoundType boundType, E e2, BoundType boundType2);

    fcz<E> c(E e, BoundType boundType);

    Comparator<? super E> comparator();

    fcz<E> d(E e, BoundType boundType);

    NavigableSet<E> g();

    a<E> h();

    a<E> i();

    a<E> j();

    a<E> k();

    fcz<E> m();
}
