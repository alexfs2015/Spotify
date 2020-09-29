package com.google.common.collect;

import java.io.Serializable;

public final class ReverseOrdering<T> extends fct<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final fct<? super T> forwardOrder;

    public ReverseOrdering(fct<? super T> fct) {
        this.forwardOrder = (fct) fay.a(fct);
    }

    public final int compare(T t, T t2) {
        return this.forwardOrder.compare(t2, t);
    }

    public final <S extends T> fct<S> a() {
        return this.forwardOrder;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReverseOrdering)) {
            return false;
        }
        return this.forwardOrder.equals(((ReverseOrdering) obj).forwardOrder);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.forwardOrder);
        sb.append(".reverse()");
        return sb.toString();
    }
}
