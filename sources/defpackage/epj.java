package defpackage;

import java.util.Iterator;

/* renamed from: epj reason: default package */
final class epj implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ eph b;

    epj(eph eph) {
        this.b = eph;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
