package com.google.common.collect;

import java.io.Serializable;

public final class NaturalOrdering extends fct<Comparable> implements Serializable {
    public static final NaturalOrdering a = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        fay.a(comparable);
        fay.a(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final <S extends Comparable> fct<S> a() {
        return ReverseNaturalOrdering.a;
    }

    private Object readResolve() {
        return a;
    }

    private NaturalOrdering() {
    }
}
