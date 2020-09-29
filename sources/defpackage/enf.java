package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: enf reason: default package */
final class enf<K> implements Iterator<Entry<K, Object>> {
    private Iterator<Entry<K, Object>> a;

    public enf(Iterator<Entry<K, Object>> it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final void remove() {
        this.a.remove();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        return entry.getValue() instanceof end ? new ene(entry, 0) : entry;
    }
}
