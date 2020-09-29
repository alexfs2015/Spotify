package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;

/* renamed from: vzq reason: default package */
public final class vzq extends vzn {
    private static final Recycler<vzq> m = new Recycler<vzq>() {
        public final /* synthetic */ Object a(b bVar) {
            return new vzq(bVar, 0, 0);
        }
    };

    /* synthetic */ vzq(b bVar, int i, byte b) {
        this(bVar, 0);
    }

    public static vzq G(int i) {
        vzq vzq = (vzq) m.a();
        vzq.D(i);
        return vzq;
    }

    private vzq(b<vzq> bVar, int i) {
        super(bVar, i);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wag.a((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wag.b((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wag.c((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wag.d((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wag.e((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wag.f((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wag.a((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wag.b((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wag.c((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wag.a((byte[]) this.h, E(i), j);
    }

    public final vyv h(int i, int i2) {
        if (PlatformDependent.c() < 7) {
            return super.h(i, i2);
        }
        k(i, i2);
        wag.d((byte[]) this.h, E(i), i2);
        return this;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final vzv m() {
        if (PlatformDependent.f()) {
            return new wai(this);
        }
        return super.m();
    }
}
