package defpackage;

/* renamed from: fcu reason: default package */
public abstract class fcu<K, V> extends fcw implements fdf<K, V> {
    protected fcu() {
    }

    /* access modifiers changed from: protected */
    public abstract fdf<K, V> a();

    public boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }
}
