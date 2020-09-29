package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: dfu reason: default package */
final class dfu implements Iterator<Entry<K, V>> {
    private int a;
    private boolean b;
    private Iterator<Entry<K, V>> c;
    private final /* synthetic */ dfm d;

    private dfu(dfm dfm) {
        this.d = dfm;
        this.a = -1;
    }

    /* synthetic */ dfu(dfm dfm, byte b2) {
        this(dfm);
    }

    private final Iterator<Entry<K, V>> a() {
        if (this.c == null) {
            this.c = this.d.d.entrySet().iterator();
        }
        return this.c;
    }

    public final boolean hasNext() {
        return this.a + 1 < this.d.c.size() || (!this.d.d.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.b = true;
        int i = this.a + 1;
        this.a = i;
        return (Entry) (i < this.d.c.size() ? this.d.c.get(this.a) : a().next());
    }

    public final void remove() {
        if (this.b) {
            this.b = false;
            this.d.e();
            if (this.a < this.d.c.size()) {
                dfm dfm = this.d;
                int i = this.a;
                this.a = i - 1;
                dfm.c(i);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
