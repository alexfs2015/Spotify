package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: whr reason: default package */
public abstract class whr<V> extends whp<V> {
    private final whw a;

    public wic<V> aX_() {
        return this;
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

    protected whr(whw whw) {
        this.a = whw;
    }

    /* access modifiers changed from: protected */
    public whw a() {
        return this.a;
    }

    public wic<V> b(wie<? extends wic<? super V>> wie) {
        if (wie != null) {
            whu.a(a(), this, wie);
            return this;
        }
        throw new NullPointerException("listener");
    }

    public wic<V> c() {
        if (!Thread.interrupted()) {
            return this;
        }
        throw new InterruptedException();
    }

    public final boolean a(long j, TimeUnit timeUnit) {
        if (!Thread.interrupted()) {
            return true;
        }
        throw new InterruptedException();
    }
}
