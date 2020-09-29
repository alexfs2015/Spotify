package defpackage;

/* renamed from: fcw reason: default package */
public abstract class fcw {
    protected fcw() {
    }

    /* access modifiers changed from: protected */
    public abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
