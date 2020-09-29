package defpackage;

import java.util.Map.Entry;

/* renamed from: ddf reason: default package */
final class ddf<K> implements Entry<K, Object> {
    Entry<K, dde> a;

    private ddf(Entry<K, dde> entry) {
        this.a = entry;
    }

    /* synthetic */ ddf(Entry entry, byte b) {
        this(entry);
    }

    public final K getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((dde) this.a.getValue()) == null) {
            return null;
        }
        return dde.a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof ddz) {
            dde dde = (dde) this.a.getValue();
            ddz ddz = (ddz) obj;
            ddz ddz2 = dde.b;
            dde.a = null;
            dde.c = null;
            dde.b = ddz;
            return ddz2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
