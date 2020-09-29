package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: whz reason: default package */
public final class whz<V> extends whr<V> {
    private final Throwable a;

    public final V d() {
        return null;
    }

    public final boolean g() {
        return false;
    }

    public whz(whw whw, Throwable th) {
        super(whw);
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public final Throwable f() {
        return this.a;
    }

    public final wic<V> aX_() {
        PlatformDependent.a(this.a);
        return this;
    }
}
