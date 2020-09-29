package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;

public final class ComparatorOrdering<T> extends fdl<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    public ComparatorOrdering(Comparator<T> comparator2) {
        this.comparator = (Comparator) fbp.a(comparator2);
    }

    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComparatorOrdering)) {
            return false;
        }
        return this.comparator.equals(((ComparatorOrdering) obj).comparator);
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
