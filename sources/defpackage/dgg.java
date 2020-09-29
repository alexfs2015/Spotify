package defpackage;

import java.util.Iterator;

/* renamed from: dgg reason: default package */
final class dgg implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ dge b;

    dgg(dge dge) {
        this.b = dge;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
