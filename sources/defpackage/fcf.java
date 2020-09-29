package defpackage;

import java.util.Map.Entry;

/* renamed from: fcf reason: default package */
public abstract class fcf<K, V> implements Entry<K, V> {
    protected fcf() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (fbn.a(getKey(), entry.getKey()) && fbn.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key == null ? 0 : key.hashCode();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
