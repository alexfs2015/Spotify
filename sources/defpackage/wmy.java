package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteOrder;

/* renamed from: wmy reason: default package */
abstract class wmy extends wob {
    private static /* synthetic */ boolean c = (!wmy.class.desiredAssertionStatus());
    private final boolean a;
    private final wms b;

    wmy(wms wms) {
        super(wms);
        if (c || PlatformDependent.f()) {
            this.b = wms;
            boolean z = true;
            if (PlatformDependent.a != (E() == ByteOrder.BIG_ENDIAN)) {
                z = false;
            }
            this.a = z;
            return;
        }
        throw new AssertionError();
    }

    public final wnb a(int i, long j) {
        this.b.k(i, 8);
        wms wms = this.b;
        if (!this.a) {
            j = Long.reverseBytes(j);
        }
        a(wms, i, j);
        return this;
    }

    public final wnb a(long j) {
        this.b.d(8);
        wms wms = this.b;
        int i = wms.c;
        if (!this.a) {
            j = Long.reverseBytes(j);
        }
        a(wms, i, j);
        this.b.c += 8;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract short a(wms wms, int i);

    /* access modifiers changed from: protected */
    public abstract void a(wms wms, int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void a(wms wms, int i, long j);

    /* access modifiers changed from: protected */
    public abstract void a(wms wms, int i, short s);

    /* access modifiers changed from: protected */
    public abstract int b(wms wms, int i);

    /* access modifiers changed from: protected */
    public abstract long c(wms wms, int i);

    public final wnb d(int i, int i2) {
        this.b.l(i, 2);
        wms wms = this.b;
        short s = (short) i2;
        if (!this.a) {
            s = Short.reverseBytes(s);
        }
        a(wms, i, s);
        return this;
    }

    public final wnb f(int i, int i2) {
        this.b.l(i, 4);
        wms wms = this.b;
        if (!this.a) {
            i2 = Integer.reverseBytes(i2);
        }
        a(wms, i, i2);
        return this;
    }

    public final short h(int i) {
        this.b.l(i, 2);
        short a2 = a(this.b, i);
        return this.a ? a2 : Short.reverseBytes(a2);
    }

    public final int l(int i) {
        return h(i) & 65535;
    }

    public final int m(int i) {
        this.b.l(i, 4);
        int b2 = b(this.b, i);
        return this.a ? b2 : Integer.reverseBytes(b2);
    }

    public final long q(int i) {
        return ((long) m(i)) & 4294967295L;
    }

    public final long s(int i) {
        this.b.k(i, 8);
        long c2 = c(this.b, i);
        return this.a ? c2 : Long.reverseBytes(c2);
    }

    public final wnb y(int i) {
        this.b.d(2);
        wms wms = this.b;
        int i2 = wms.c;
        short s = (short) i;
        if (!this.a) {
            s = Short.reverseBytes(s);
        }
        a(wms, i2, s);
        this.b.c += 2;
        return this;
    }

    public final wnb z(int i) {
        this.b.d(4);
        wms wms = this.b;
        int i2 = wms.c;
        if (!this.a) {
            i = Integer.reverseBytes(i);
        }
        a(wms, i2, i);
        this.b.c += 4;
        return this;
    }
}
