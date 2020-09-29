package defpackage;

import com.google.common.collect.ComparatorOrdering;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.ReverseOrdering;
import java.util.Comparator;

/* renamed from: fct reason: default package */
public abstract class fct<T> implements Comparator<T> {
    public abstract int compare(T t, T t2);

    public static <C extends Comparable> fct<C> b() {
        return NaturalOrdering.a;
    }

    public static <T> fct<T> a(Comparator<T> comparator) {
        return comparator instanceof fct ? (fct) comparator : new ComparatorOrdering(comparator);
    }

    protected fct() {
    }

    public <S extends T> fct<S> a() {
        return new ReverseOrdering(this);
    }
}
