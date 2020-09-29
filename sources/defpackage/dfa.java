package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dfa reason: default package */
final class dfa implements Iterator<Object> {
    dfa() {
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
