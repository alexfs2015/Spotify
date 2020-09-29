package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: eov reason: default package */
final class eov implements Iterator<Object> {
    eov() {
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
