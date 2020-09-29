package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;

/* renamed from: vys reason: default package */
abstract class vys extends vzv {
    private static /* synthetic */ boolean c = (!vys.class.desiredAssertionStatus());
    private final boolean a;
    private final vym b;

    /* access modifiers changed from: protected */
    public abstract short a(vym vym, int i);

    /* access modifiers changed from: protected */
    public abstract void a(vym vym, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void a(vym vym, int i, long j);

    /* access modifiers changed from: protected */
    public abstract void a(vym vym, int i, short s);

    /* access modifiers changed from: protected */
    public abstract int b(vym vym, int i);

    /* access modifiers changed from: protected */
    public abstract long c(vym vym, int i);

    vys(vym vym) {
        super(vym);
        if (c || PlatformDependent.f()) {
            this.b = vym;
            boolean z = true;
            if (PlatformDependent.a != (E() == ByteOrder.BIG_ENDIAN)) {
                z = false;
            }
            this.a = z;
            return;
        }
        throw new AssertionError();
    }

    public final long s(int i) {
        this.b.k(i, 8);
        long c2 = c(this.b, i);
        return this.a ? c2 : Long.reverseBytes(c2);
    }

    public final long q(int i) {
        return ((long) m(i)) & 4294967295L;
    }

    public final int m(int i) {
        this.b.l(i, 4);
        int b2 = b(this.b, i);
        return this.a ? b2 : Integer.reverseBytes(b2);
    }

    public final int l(int i) {
        return h(i) & 65535;
    }

    public final short h(int i) {
        this.b.l(i, 2);
        short a2 = a(this.b, i);
        return this.a ? a2 : Short.reverseBytes(a2);
    }

    public final vyv d(int i, int i2) {
        this.b.l(i, 2);
        vym vym = this.b;
        short s = (short) i2;
        if (!this.a) {
            s = Short.reverseBytes(s);
        }
        a(vym, i, s);
        return this;
    }

    public final vyv f(int i, int i2) {
        this.b.l(i, 4);
        vym vym = this.b;
        if (!this.a) {
            i2 = Integer.reverseBytes(i2);
        }
        a(vym, i, i2);
        return this;
    }

    public final vyv a(int i, long j) {
        this.b.k(i, 8);
        vym vym = this.b;
        if (!this.a) {
            j = Long.reverseBytes(j);
        }
        a(vym, i, j);
        return this;
    }

    public final vyv y(int i) {
        this.b.d(2);
        vym vym = this.b;
        int i2 = vym.c;
        short s = (short) i;
        if (!this.a) {
            s = Short.reverseBytes(s);
        }
        a(vym, i2, s);
        this.b.c += 2;
        return this;
    }

    public final vyv z(int i) {
        this.b.d(4);
        vym vym = this.b;
        int i2 = vym.c;
        if (!this.a) {
            i = Integer.reverseBytes(i);
        }
        a(vym, i2, i);
        this.b.c += 4;
        return this;
    }

    public final vyv a(long j) {
        this.b.d(8);
        vym vym = this.b;
        int i = vym.c;
        if (!this.a) {
            j = Long.reverseBytes(j);
        }
        a(vym, i, j);
        this.b.c += 8;
        return this;
    }
}
