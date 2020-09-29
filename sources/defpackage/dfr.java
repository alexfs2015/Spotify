package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dfr reason: default package */
final class dfr implements Iterator<Object> {
    dfr() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
