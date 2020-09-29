package defpackage;

import java.util.Comparator;
import java.util.SortedSet;

/* renamed from: fdq reason: default package */
public final class fdq {
    private static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? fdl.b() : comparator;
    }

    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        fbp.a(comparator);
        fbp.a(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof fdp)) {
            return false;
        } else {
            comparator2 = ((fdp) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
