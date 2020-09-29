package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: eoy reason: default package */
final class eoy implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ eoq d;

    private eoy(eoq eoq) {
        this.d = eoq;
        this.a = -1;
    }

    public final boolean hasNext() {
        if (this.a + 1 < this.d.c.size() || (!this.d.d.isEmpty() && a().hasNext())) {
            return true;
        }
        return false;
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.e();
            if (this.a < this.d.c.size()) {
                eoq eoq = this.d;
                int i = this.a;
                this.a = i - 1;
                eoq.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.d.entrySet().iterator();
        }
        return this.c;
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        if (i < this.d.c.size()) {
            return (Entry) this.d.c.get(this.a);
        }
        return (Entry) a().next();
    }

    /* synthetic */ eoy(eoq eoq, byte b2) {
        this(eoq);
    }
}
