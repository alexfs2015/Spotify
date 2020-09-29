package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: epq reason: default package */
class epq extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ eph a;

    private epq(eph eph) {
        this.a = eph;
    }

    /* synthetic */ epq(eph eph, byte b) {
        this(eph);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new epp(this.a, 0);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.a.size();
    }
}
