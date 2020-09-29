package defpackage;

import java.util.Map.Entry;

/* renamed from: ddw reason: default package */
final class ddw<K> implements Entry<K, Object> {
    Entry<K, ddv> a;

    private ddw(Entry<K, ddv> entry) {
        this.a = entry;
    }

    /* synthetic */ ddw(Entry entry, byte b) {
        this(entry);
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((ddv) this.a.getValue()) == null) {
            return null;
        }
        return ddv.a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof deq) {
            ddv ddv = (ddv) this.a.getValue();
            deq deq = (deq) obj;
            deq deq2 = ddv.b;
            ddv.a = null;
            ddv.c = null;
            ddv.b = deq;
            return deq2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
