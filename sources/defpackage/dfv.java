package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: dfv reason: default package */
class dfv extends AbstractSet<Entry<K, V>> {
    private final /* synthetic */ dfm a;

    private dfv(dfm dfm) {
        this.a = dfm;
    }

    /* synthetic */ dfv(dfm dfm, byte b) {
        this(dfm);
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
        return new dfu(this.a, 0);
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
