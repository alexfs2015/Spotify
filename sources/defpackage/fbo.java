package defpackage;

import java.util.Map.Entry;

/* renamed from: fbo reason: default package */
public abstract class fbo<K, V> implements Entry<K, V> {
    public abstract K getKey();

    public abstract V getValue();

    protected fbo() {
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (faw.a(getKey(), entry.getKey()) && faw.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append("=");
        sb.append(getValue());
        return sb.toString();
    }
}
