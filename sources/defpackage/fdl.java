package defpackage;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* renamed from: fdl reason: default package */
public abstract class fdl<T> implements Comparator<T> {
    protected fdl() {
    }

    public static <T> fdl<T> a(Comparator<T> comparator) {
        return comparator instanceof fdl ? (fdl) comparator : new ComparatorOrdering(comparator);
    }

    public static <C extends Comparable> fdl<C> b() {
        return NaturalOrdering.a;
    }

    public <S extends T> fdl<S> a() {
        return new ReverseOrdering(this);
    }

    public abstract int compare(T t, T t2);
}
