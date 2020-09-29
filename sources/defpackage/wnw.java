package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;

/* renamed from: wnw reason: default package */
public final class wnw extends wnt {
    private static final Recycler<wnw> m = new Recycler<wnw>() {
        public final /* synthetic */ Object a(b bVar) {
            return new wnw(bVar, 0, 0);
        }
    };

    private wnw(b<wnw> bVar, int i) {
        super(bVar, i);
    }

    /* synthetic */ wnw(b bVar, int i, byte b) {
        this(bVar, 0);
    }

    public static wnw G(int i) {
        wnw wnw = (wnw) m.a();
        wnw.D(i);
        return wnw;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wom.a((byte[]) this.h, E(i), j);
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wom.a((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wom.b((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wom.a((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wom.c((byte[]) this.h, E(i), i2);
    }

    public final wnb h(int i, int i2) {
        if (PlatformDependent.c() < 7) {
            return super.h(i, i2);
        }
        k(i, i2);
        wom.d((byte[]) this.h, E(i), i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wom.b((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wom.c((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final wob m() {
        return PlatformDependent.f() ? new woo(this) : super.m();
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wom.d((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wom.e((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wom.f((byte[]) this.h, E(i));
    }
}
