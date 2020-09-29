package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: wwf reason: default package */
public final class wwf<V> extends wvx<V> {
    private final Throwable a;

    public wwf(wwc wwc, Throwable th) {
        super(wwc);
        if (th != null) {
            this.a = th;
            return;
        }
        throw new NullPointerException("cause");
    }

    public final wwi<V> aV_() {
        PlatformDependent.a(this.a);
        return this;
    }

    public final V d() {
        return null;
    }

    public final Throwable f() {
        return this.a;
    }

    public final boolean g() {
        return false;
    }
}
