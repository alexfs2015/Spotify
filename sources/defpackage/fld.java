package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: fld reason: default package */
public final class fld extends fle {
    private final fli a;

    /* renamed from: fld$a */
    static class a<K> implements Entry<K, Object> {
        private Entry<K, fld> a;

        private a(Entry<K, fld> entry) {
            this.a = entry;
        }

        /* synthetic */ a(Entry entry, byte b) {
            this(entry);
        }

        public final K getKey() {
            return this.a.getKey();
        }

        public final Object getValue() {
            fld fld = (fld) this.a.getValue();
            if (fld == null) {
                return null;
            }
            return fld.a();
        }

        public final Object setValue(Object obj) {
            if (obj instanceof fli) {
                return ((fld) this.a.getValue()).b((fli) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: fld$b */
    static class b<K> implements Iterator<Entry<K, Object>> {
        private Iterator<Entry<K, Object>> a;

        public b(Iterator<Entry<K, Object>> it) {
            this.a = it;
        }

        public final boolean hasNext() {
            return this.a.hasNext();
        }

        public final /* synthetic */ Object next() {
            Entry entry = (Entry) this.a.next();
            return entry.getValue() instanceof fld ? new a(entry, 0) : entry;
        }

        public final void remove() {
            this.a.remove();
        }
    }

    public final fli a() {
        return a(this.a);
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
