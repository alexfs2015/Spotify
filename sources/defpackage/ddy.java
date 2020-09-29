package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: ddy reason: default package */
final class ddy<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public ddy(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof ddv ? new ddw(entry, 0) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
