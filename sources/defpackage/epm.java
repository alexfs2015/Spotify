package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: epm reason: default package */
final class epm implements Iterator<Object> {
    epm() {
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
