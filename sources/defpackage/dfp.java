package defpackage;

import java.util.Iterator;

/* renamed from: dfp reason: default package */
final class dfp implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ dfn b;

    dfp(dfn dfn) {
        this.b = dfn;
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
