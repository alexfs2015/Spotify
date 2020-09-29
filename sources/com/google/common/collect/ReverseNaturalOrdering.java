package com.google.common.collect;

import java.io.Serializable;

final class ReverseNaturalOrdering extends fct<Comparable> implements Serializable {
    static final ReverseNaturalOrdering a = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        fay.a(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    private Object readResolve() {
        return a;
    }

    private ReverseNaturalOrdering() {
    }

    public final <S extends Comparable> fct<S> a() {
        return NaturalOrdering.a;
    }
}
