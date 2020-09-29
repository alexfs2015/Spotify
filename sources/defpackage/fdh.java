package defpackage;

import java.util.Iterator;

/* renamed from: fdh reason: default package */
public abstract class fdh<E> implements Iterator<E> {
    protected fdh() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
