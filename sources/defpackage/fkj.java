package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: fkj reason: default package */
public final class fkj extends fkk {
    private final fko a;

    /* renamed from: fkj$a */
    static class a<K> implements Entry<K, Object> {
        private Entry<K, fkj> a;

        /* synthetic */ a(Entry entry, byte b) {
            this(entry);
        }

        private a(Entry<K, fkj> entry) {
            this.a = entry;
        }

        public final K getKey() {
            return this.a.getKey();
        }

        public final Object getValue() {
            fkj fkj = (fkj) this.a.getValue();
            if (fkj == null) {
                return null;
            }
            return fkj.a();
        }

        public final Object setValue(Object obj) {
            if (obj instanceof fko) {
                return ((fkj) this.a.getValue()).b((fko) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: fkj$b */
    static class b<K> implements Iterator<Entry<K, Object>> {
        private Iterator<Entry<K, Object>> a;

        public b(Iterator<Entry<K, Object>> it) {
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
            return entry.getValue() instanceof fkj ? new a(entry, 0) : entry;
        }
    }

    public final fko a() {
        return a(this.a);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final String toString() {
        return a().toString();
    }
}
