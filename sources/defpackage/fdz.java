package defpackage;

import java.util.Iterator;

/* renamed from: fdz reason: default package */
public abstract class fdz<E> implements Iterator<E> {
    protected fdz() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
