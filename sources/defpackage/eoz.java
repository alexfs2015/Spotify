package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: eoz reason: default package */
class eoz extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ eoq a;

    private eoz(eoq eoq) {
        this.a = eoq;
    }

    public Iterator<Entry<K, V>> iterator() {
        return new eoy(this.a, 0);
    }

    public int size() {
        return this.a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ eoz(eoq eoq, byte b) {
        this(eoq);
    }
}
