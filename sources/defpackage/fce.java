package defpackage;

/* renamed from: fce reason: default package */
public abstract class fce {
    /* access modifiers changed from: protected */
    public abstract Object delegate();

    protected fce() {
    }

    public String toString() {
        return delegate().toString();
    }
}
