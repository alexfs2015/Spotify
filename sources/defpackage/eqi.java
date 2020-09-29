package defpackage;

import java.util.Iterator;

/* renamed from: eqi reason: default package */
final class eqi implements Iterator<String> {
    private Iterator<String> a = this.b.a.keySet().iterator();
    private final /* synthetic */ eqh b;

    eqi(eqh eqh) {
        this.b = eqh;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }
}
