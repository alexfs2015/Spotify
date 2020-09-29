package defpackage;

import io.netty.util.Recycler.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: vzk reason: default package */
public abstract class vzk<T> extends vyq {
    private static /* synthetic */ boolean o = (!vzk.class.desiredAssertionStatus());
    public vzf<T> e;
    public long g;
    public T h;
    public int i;
    public int j;
    public int k;
    public vzj l;
    private final b<vzk<T>> m;
    private ByteBuffer n;

    public final vyv K() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract ByteBuffer c(T t);

    protected vzk(b<? extends vzk<T>> bVar, int i2) {
        super(i2);
        this.m = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(vzf<T> vzf, long j2, int i2, int i3, int i4, vzj vzj) {
        if (!o && j2 < 0) {
            throw new AssertionError();
        } else if (o || vzf != null) {
            this.e = vzf;
            this.g = j2;
            this.h = vzf.b;
            this.i = i2;
            this.j = i3;
            this.k = i4;
            this.n = null;
            this.l = vzj;
        } else {
            throw new AssertionError();
        }
    }

    public void a(vzf<T> vzf, int i2) {
        if (o || vzf != null) {
            this.e = vzf;
            this.g = 0;
            this.h = vzf.b;
            this.i = 0;
            this.k = i2;
            this.j = i2;
            this.n = null;
            this.l = null;
            return;
        }
        throw new AssertionError();
    }

    public final int P() {
        return this.j;
    }

    public final vyv C(int i2) {
        x();
        if (!this.e.c) {
            int i3 = this.j;
            if (i2 <= i3) {
                if (i2 < i3) {
                    int i4 = this.k;
                    if (i2 > (i4 >>> 1)) {
                        if (i4 > 512) {
                            this.j = i2;
                            a(Math.min(c(), i2), Math.min(d(), i2));
                            return this;
                        } else if (i2 > i4 - 16) {
                            this.j = i2;
                            a(Math.min(c(), i2), Math.min(d(), i2));
                            return this;
                        }
                    }
                }
                return this;
            } else if (i2 <= this.k) {
                this.j = i2;
                return this;
            }
        } else if (i2 == this.j) {
            return this;
        }
        this.e.a.a(this, i2, true);
        return this;
    }

    public final vyw D() {
        return this.e.a.b;
    }

    public final ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final vyv u() {
        int c = c();
        return vzo.a((vym) this, (vyv) this, c, d() - c);
    }

    public final vyv j(int i2, int i3) {
        return vzo.a((vym) this, (vyv) this, i2, i3);
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer M() {
        ByteBuffer byteBuffer = this.n;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer c = c(this.h);
        this.n = c;
        return c;
    }

    /* access modifiers changed from: protected */
    public final void aZ_() {
        long j2 = this.g;
        if (j2 >= 0) {
            this.g = -1;
            this.h = null;
            this.e.a.a(this.e, j2, this.k, this.l);
            this.m.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public final int E(int i2) {
        return this.i + i2;
    }

    /* access modifiers changed from: 0000 */
    public final void D(int i2) {
        this.d = i2;
        this.f = 1;
        m(0, 0);
        y();
    }
}
