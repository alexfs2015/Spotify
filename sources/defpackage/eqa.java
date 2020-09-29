package defpackage;

import java.util.Iterator;

/* renamed from: eqa reason: default package */
final class eqa implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ epy b;

    eqa(epy epy) {
        this.b = epy;
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
