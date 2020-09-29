package defpackage;

import java.util.Iterator;

/* renamed from: eqz reason: default package */
final class eqz implements Iterator<String> {
    private Iterator<String> a = this.b.a.keySet().iterator();
    private final /* synthetic */ eqy b;

    eqz(eqy eqy) {
        this.b = eqy;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
