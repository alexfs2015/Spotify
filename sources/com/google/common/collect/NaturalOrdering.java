package com.google.common.collect;

import java.io.Serializable;

public final class NaturalOrdering extends fdl<Comparable> implements Serializable {
    public static final NaturalOrdering a = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return a;
    }

    public final <S extends Comparable> fdl<S> a() {
        return ReverseNaturalOrdering.a;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        fbp.a(comparable);
        fbp.a(comparable2);
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
