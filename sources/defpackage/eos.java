package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: eos reason: default package */
final class eos implements Iterator<Entry<K, V>> {
    private int a;
    private Iterator<Entry<K, V>> b;
    private final /* synthetic */ eoq c;

    private eos(eoq eoq) {
        this.c = eoq;
        this.a = this.c.c.size();
    }

    public final boolean hasNext() {
        int i = this.a;
        return (i > 0 && i <= this.c.c.size()) || a().hasNext();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.b == null) {
            this.b = this.c.f.entrySet().iterator();
        }
        return this.b;
    }

    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Entry) a().next();
        }
        List b2 = this.c.c;
        int i = this.a - 1;
        this.a = i;
        return (Entry) b2.get(i);
    }

    /* synthetic */ eos(eoq eoq, byte b2) {
        this(eoq);
    }
}
