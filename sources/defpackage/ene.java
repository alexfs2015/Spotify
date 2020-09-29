package defpackage;

import java.util.Map.Entry;

/* renamed from: ene reason: default package */
final class ene<K> implements Entry<K, Object> {
    Entry<K, end> a;

    private ene(Entry<K, end> entry) {
        this.a = entry;
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((end) this.a.getValue()) == null) {
            return null;
        }
        return end.a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof enx) {
            end end = (end) this.a.getValue();
            enx enx = (enx) obj;
            enx enx2 = end.b;
            end.a = null;
            end.c = null;
            end.b = enx;
            return enx2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    /* synthetic */ ene(Entry entry, byte b) {
        this(entry);
    }
}
