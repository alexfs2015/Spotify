package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: eot reason: default package */
final class eot extends eoz {
    private final /* synthetic */ eoq a;

    private eot(eoq eoq) {
        this.a = eoq;
        super(eoq, 0);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new eos(this.a, 0);
    }

    /* synthetic */ eot(eoq eoq, byte b) {
        this(eoq);
    }
}
