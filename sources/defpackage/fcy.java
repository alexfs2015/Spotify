package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: fcy reason: default package */
public final class fcy {
    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        fay.a(comparator);
        fay.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof fcx)) {
            return false;
        } else {
            comparator2 = ((fcx) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    private static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? fct.b() : comparator;
    }
}
