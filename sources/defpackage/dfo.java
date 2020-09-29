package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: dfo reason: default package */
final class dfo implements Iterator<Entry<K, V>> {
    private int a;
    private Iterator<Entry<K, V>> b;
    private final /* synthetic */ dfm c;

    private dfo(dfm dfm) {
        this.c = dfm;
        this.a = this.c.c.size();
    }

    /* synthetic */ dfo(dfm dfm, byte b2) {
        this(dfm);
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.c.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List b2 = this.c.c;
            int i = this.a - 1;
            this.a = i;
            obj = b2.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
