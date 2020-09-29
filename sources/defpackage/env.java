package defpackage;

import java.util.Map.Entry;

/* renamed from: env reason: default package */
final class env<K> implements Entry<K, Object> {
    Entry<K, enu> a;

    private env(Entry<K, enu> entry) {
        this.a = entry;
    }

    /* synthetic */ env(Entry entry, byte b) {
        this(entry);
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((enu) this.a.getValue()) == null) {
            return null;
        }
        return enu.a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof eoo) {
            enu enu = (enu) this.a.getValue();
            eoo eoo = (eoo) obj;
            eoo eoo2 = enu.b;
            enu.a = null;
            enu.c = null;
            enu.b = eoo;
            return eoo2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
