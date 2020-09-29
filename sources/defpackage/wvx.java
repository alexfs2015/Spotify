package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: wvx reason: default package */
public abstract class wvx<V> extends wvv<V> {
    private final wwc a;

    protected wvx(wwc wwc) {
        this.a = wwc;
    }

    /* access modifiers changed from: protected */
    public wwc a() {
        return this.a;
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        if (!Thread.interrupted()) {
            return true;
        }
        throw new InterruptedException();
    }

    public wwi<V> aV_() {
        return this;
    }

    public wwi<V> b(wwk<? extends wwi<? super V>> wwk) {
        if (wwk != null) {
            wwa.a(a(), this, wwk);
            return this;
        }
        throw new NullPointerException("listener");
    }

    public wwi<V> c() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
