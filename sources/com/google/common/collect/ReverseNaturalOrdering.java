package com.google.common.collect;

import java.io.Serializable;

final class ReverseNaturalOrdering extends fdl<Comparable> implements Serializable {
    static final ReverseNaturalOrdering a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    private ReverseNaturalOrdering() {
    }

    private Object readResolve() {
        return a;
    }

    public final <S extends Comparable> fdl<S> a() {
        return NaturalOrdering.a;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        fbp.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
