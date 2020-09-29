package defpackage;

/* renamed from: fbj reason: default package */
public abstract class fbj<T> {
    public final int a(T t) {
        if (t == null) {
            return 0;
        }
        return b();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public final boolean a(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return a();
    }

    /* access modifiers changed from: protected */
    public abstract int b();
}
