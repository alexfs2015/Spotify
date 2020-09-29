package defpackage;

import java.util.Map.Entry;

/* renamed from: dft reason: default package */
final class dft implements Comparable<dft>, Entry<K, V> {
    private final K a;
    private V b;
    private final /* synthetic */ dfm c;

    dft(dfm dfm, K k, V v) {
        this.c = dfm;
        this.a = k;
        this.b = v;
    }

    dft(dfm dfm, Entry<K, V> entry) {
        this(dfm, (Comparable) entry.getKey(), entry.getValue());
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((dft) obj).getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
    }

    public final /* synthetic */ Object getKey() {
        return this.a;
    }

    public final V getValue() {
        return this.b;
    }

    public final int hashCode() {
        K k = this.a;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.b;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public final V setValue(V v) {
        this.c.e();
        V v2 = this.b;
        this.b = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
