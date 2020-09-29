package defpackage;

/* renamed from: fas reason: default package */
public abstract class fas<T> {
    /* access modifiers changed from: protected */
    public abstract boolean a();

    /* access modifiers changed from: protected */
    public abstract int b();

    public final boolean a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a();
    }

    public final int a(T t) {
        if (t == null) {
            return 0;
        }
        return b();
    }
}
