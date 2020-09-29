package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: woj reason: default package */
final class woj extends wog {
    woj(wnc wnc, int i, int i2) {
        super(wnc, i, i2);
    }

    public final wnb a(int i, long j) {
        k(i, 8);
        b(i, j);
        return this;
    }

    public final wnb b(int i, int i2) {
        A(i);
        c(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wom.a(this.e, i, j);
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wom.a(this.e, i, i2);
    }

    public final wnb d(int i, int i2) {
        k(i, 2);
        e(i, i2);
        return this;
    }

    public final byte e(int i) {
        A(i);
        return f(i);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wom.b(this.e, i, i2);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wom.a(this.e, i);
    }

    public final wnb f(int i, int i2) {
        k(i, 4);
        g(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wom.c(this.e, i, i2);
    }

    public final wnb h(int i, int i2) {
        if (PlatformDependent.c() < 7) {
            return super.h(i, i2);
        }
        k(i, i2);
        wom.d(this.e, i, i2);
        return this;
    }

    public final short h(int i) {
        k(i, 2);
        return i(i);
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wom.b(this.e, i);
    }

    public final short j(int i) {
        k(i, 2);
        return k(i);
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wom.c(this.e, i);
    }

    public final int m(int i) {
        k(i, 4);
        return n(i);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public final wob m() {
        return PlatformDependent.f() ? new woo(this) : super.m();
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wom.d(this.e, i);
    }

    public final int o(int i) {
        k(i, 4);
        return p(i);
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wom.e(this.e, i);
    }

    public final long s(int i) {
        k(i, 8);
        return t(i);
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wom.f(this.e, i);
    }
}
