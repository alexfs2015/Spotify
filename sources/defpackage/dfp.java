package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: dfp reason: default package */
final class dfp extends dfv {
    private final /* synthetic */ dfm a;

    private dfp(dfm dfm) {
        this.a = dfm;
        super(dfm, 0);
    }

    /* synthetic */ dfp(dfm dfm, byte b) {
        this(dfm);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new dfo(this.a, 0);
    }
}
