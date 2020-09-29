package defpackage;

/* renamed from: fcc reason: default package */
public abstract class fcc<K, V> extends fce implements fcn<K, V> {
    /* access modifiers changed from: protected */
    public abstract fcn<K, V> a();

    protected fcc() {
    }

    public boolean equals(Object obj) {
        return obj == this || a().equals(obj);
    }

    public int hashCode() {
        return a().hashCode();
    }
}
