package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: ddh reason: default package */
final class ddh<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public ddh(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof dde ? new ddf(entry, 0) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
