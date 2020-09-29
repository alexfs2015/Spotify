package defpackage;

import io.netty.util.internal.PlatformDependent;

/* renamed from: wad reason: default package */
final class wad extends waa {
    wad(vyw vyw, int i, int i2) {
        super(vyw, i, i2);
    }

    public final byte e(int i) {
        A(i);
        return f(i);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wag.a(this.e, i);
    }

    public final short h(int i) {
        k(i, 2);
        return i(i);
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wag.b(this.e, i);
    }

    public final short j(int i) {
        k(i, 2);
        return k(i);
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wag.c(this.e, i);
    }

    public final int m(int i) {
        k(i, 4);
        return n(i);
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wag.d(this.e, i);
    }

    public final int o(int i) {
        k(i, 4);
        return p(i);
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wag.e(this.e, i);
    }

    public final long s(int i) {
        k(i, 8);
        return t(i);
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wag.f(this.e, i);
    }

    public final vyv b(int i, int i2) {
        A(i);
        c(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wag.a(this.e, i, i2);
    }

    public final vyv d(int i, int i2) {
        k(i, 2);
        e(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wag.b(this.e, i, i2);
    }

    public final vyv f(int i, int i2) {
        k(i, 4);
        g(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wag.c(this.e, i, i2);
    }

    public final vyv a(int i, long j) {
        k(i, 8);
        b(i, j);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wag.a(this.e, i, j);
    }

    public final vyv h(int i, int i2) {
        if (PlatformDependent.c() < 7) {
            return super.h(i, i2);
        }
        k(i, i2);
        wag.d(this.e, i, i2);
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
