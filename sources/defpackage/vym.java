package defpackage;

import io.netty.util.IllegalReferenceCountException;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: vym reason: default package */
public abstract class vym extends vyv {
    static final ResourceLeakDetector<vyv> a = whk.a().a(vyv.class);
    private static final wjw e = wjx.a(vym.class);
    private static final boolean f;
    int b;
    int c;
    int d;
    private int g;
    private int h;

    public boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void b(int i, long j);

    /* access modifiers changed from: protected */
    public abstract void c(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract void e(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract byte f(int i);

    /* access modifiers changed from: protected */
    public abstract void g(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract short i(int i);

    /* access modifiers changed from: protected */
    public abstract short k(int i);

    /* access modifiers changed from: protected */
    public abstract int n(int i);

    /* access modifiers changed from: protected */
    public abstract int p(int i);

    /* access modifiers changed from: protected */
    public abstract long t(int i);

    static {
        String str = "io.netty.buffer.bytebuf.checkAccessible";
        f = wjo.a(str, true);
        if (e.b()) {
            e.b("-D{}: {}", str, Boolean.valueOf(f));
        }
    }

    protected vym(int i) {
        if (i >= 0) {
            this.d = i;
            return;
        }
        StringBuilder sb = new StringBuilder("maxCapacity: ");
        sb.append(i);
        sb.append(" (expected: >= 0)");
        throw new IllegalArgumentException(sb.toString());
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.b;
    }

    public vyv a(int i) {
        if (i < 0 || i > this.c) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d (expected: 0 <= readerIndex <= writerIndex(%d))", new Object[]{Integer.valueOf(i), Integer.valueOf(this.c)}));
        }
        this.b = i;
        return this;
    }

    public int d() {
        return this.c;
    }

    public vyv b(int i) {
        if (i < this.b || i > P()) {
            throw new IndexOutOfBoundsException(String.format("writerIndex: %d (expected: readerIndex(%d) <= writerIndex <= capacity(%d))", new Object[]{Integer.valueOf(i), Integer.valueOf(this.b), Integer.valueOf(P())}));
        }
        this.c = i;
        return this;
    }

    public vyv a(int i, int i2) {
        if (i < 0 || i > i2 || i2 > P()) {
            throw new IndexOutOfBoundsException(String.format("readerIndex: %d, writerIndex: %d (expected: 0 <= readerIndex <= writerIndex <= capacity(%d))", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(P())}));
        }
        m(i, i2);
        return this;
    }

    public vyv e() {
        this.c = 0;
        this.b = 0;
        return this;
    }

    public boolean f() {
        return this.c > this.b;
    }

    public int g() {
        return this.c - this.b;
    }

    public int h() {
        return P() - this.c;
    }

    public vyv i() {
        this.g = this.b;
        return this;
    }

    public vyv j() {
        a(this.g);
        return this;
    }

    public vyv k() {
        this.h = this.c;
        return this;
    }

    public vyv l() {
        x();
        int i = this.b;
        if (i == 0) {
            return this;
        }
        if (i == this.c) {
            c(i);
            this.b = 0;
            this.c = 0;
            return this;
        }
        if (i >= (P() >>> 1)) {
            int i2 = this.b;
            b(0, (vyv) this, i2, this.c - i2);
            int i3 = this.c;
            int i4 = this.b;
            this.c = i3 - i4;
            c(i4);
            this.b = 0;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        int i2 = this.g;
        if (i2 <= i) {
            this.g = 0;
            int i3 = this.h;
            if (i3 <= i) {
                this.h = 0;
            } else {
                this.h = i3 - i;
            }
        } else {
            this.g = i2 - i;
            this.h -= i;
        }
    }

    public vyv d(int i) {
        if (i >= 0) {
            D(i);
            return this;
        }
        throw new IllegalArgumentException(String.format("minWritableBytes: %d (expected: >= 0)", new Object[]{Integer.valueOf(i)}));
    }

    private void D(int i) {
        if (i > h()) {
            int i2 = this.d;
            int i3 = this.c;
            if (i <= i2 - i3) {
                C(D().d(this.c + i, this.d));
            } else {
                throw new IndexOutOfBoundsException(String.format("writerIndex(%d) + minWritableBytes(%d) exceeds maxCapacity(%d): %s", new Object[]{Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(this.d), this}));
            }
        }
    }

    public vyv a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == E()) {
            return this;
        } else {
            return m();
        }
    }

    /* access modifiers changed from: protected */
    public vzv m() {
        return new vzv(this);
    }

    public short g(int i) {
        return (short) (e(i) & 255);
    }

    public short h(int i) {
        k(i, 2);
        return i(i);
    }

    public short j(int i) {
        k(i, 2);
        return k(i);
    }

    public int l(int i) {
        return h(i) & 65535;
    }

    public int m(int i) {
        k(i, 4);
        return n(i);
    }

    public int o(int i) {
        k(i, 4);
        return p(i);
    }

    public long q(int i) {
        return ((long) m(i)) & 4294967295L;
    }

    public long r(int i) {
        return ((long) o(i)) & 4294967295L;
    }

    public long s(int i) {
        k(i, 8);
        return t(i);
    }

    public vyv d(int i, int i2) {
        k(i, 2);
        e(i, i2);
        return this;
    }

    public vyv f(int i, int i2) {
        k(i, 4);
        g(i, i2);
        return this;
    }

    public vyv a(int i, long j) {
        k(i, 8);
        b(i, j);
        return this;
    }

    public vyv h(int i, int i2) {
        if (i2 == 0) {
            return this;
        }
        k(i, i2);
        int i3 = i2 & 7;
        for (int i4 = i2 >>> 3; i4 > 0; i4--) {
            b(i, 0);
            i += 8;
        }
        if (i3 == 4) {
            g(i, 0);
        } else if (i3 < 4) {
            while (i3 > 0) {
                c(i, 0);
                i++;
                i3--;
            }
        } else {
            g(i, 0);
            int i5 = i + 4;
            for (int i6 = i3 - 4; i6 > 0; i6--) {
                c(i5, 0);
                i5++;
            }
        }
        return this;
    }

    public byte n() {
        E(1);
        int i = this.b;
        byte f2 = f(i);
        this.b = i + 1;
        return f2;
    }

    public short o() {
        return (short) (n() & 255);
    }

    public short p() {
        E(2);
        short i = i(this.b);
        this.b += 2;
        return i;
    }

    public int q() {
        E(4);
        int n = n(this.b);
        this.b += 4;
        return n;
    }

    public long r() {
        E(8);
        long t = t(this.b);
        this.b += 8;
        return t;
    }

    public vyv u(int i) {
        B(i);
        if (i == 0) {
            return vzw.a;
        }
        vyv a2 = D().a(i, this.d);
        a2.a((vyv) this, this.b, i);
        this.b += i;
        return a2;
    }

    public vyv v(int i) {
        vyv j = j(this.b, i);
        this.b += i;
        return j;
    }

    public vyv a(byte[] bArr, int i, int i2) {
        B(i2);
        a(this.b, bArr, i, i2);
        this.b += i2;
        return this;
    }

    public vyv a(byte[] bArr) {
        a(bArr, 0, bArr.length);
        return this;
    }

    public int a(GatheringByteChannel gatheringByteChannel, int i) {
        B(i);
        int a2 = a(this.b, gatheringByteChannel, i);
        this.b += a2;
        return a2;
    }

    public vyv w(int i) {
        B(i);
        this.b += i;
        return this;
    }

    public vyv x(int i) {
        x();
        D(1);
        int i2 = this.c;
        this.c = i2 + 1;
        c(i2, i);
        return this;
    }

    public vyv y(int i) {
        x();
        D(2);
        e(this.c, i);
        this.c += 2;
        return this;
    }

    public vyv z(int i) {
        x();
        D(4);
        g(this.c, i);
        this.c += 4;
        return this;
    }

    public vyv a(long j) {
        x();
        D(8);
        b(this.c, j);
        this.c += 8;
        return this;
    }

    public vyv b(byte[] bArr, int i, int i2) {
        x();
        d(i2);
        b(this.c, bArr, i, i2);
        this.c += i2;
        return this;
    }

    public vyv b(byte[] bArr) {
        b(bArr, 0, bArr.length);
        return this;
    }

    public vyv a(vyv vyv) {
        a(vyv, vyv.g());
        return this;
    }

    public vyv a(vyv vyv, int i) {
        if (i <= vyv.g()) {
            a(vyv, vyv.c(), i);
            vyv.a(vyv.c() + i);
            return this;
        }
        throw new IndexOutOfBoundsException(String.format("length(%d) exceeds src.readableBytes(%d) where src is: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(vyv.g()), vyv}));
    }

    public vyv a(vyv vyv, int i, int i2) {
        x();
        d(i2);
        b(this.c, vyv, i, i2);
        this.c += i2;
        return this;
    }

    public int a(ScatteringByteChannel scatteringByteChannel, int i) {
        x();
        d(i);
        int a2 = a(this.c, scatteringByteChannel, i);
        if (a2 > 0) {
            this.c += a2;
        }
        return a2;
    }

    public vyv s() {
        return new vzz(this);
    }

    public vyv t() {
        return i(this.b, g());
    }

    public vyv u() {
        return t().A();
    }

    public vyv i(int i, int i2) {
        return new wab(this, i, i2);
    }

    public vyv j(int i, int i2) {
        return i(i, i2).A();
    }

    public ByteBuffer v() {
        return o(this.b, g());
    }

    public ByteBuffer[] w() {
        return p(this.b, g());
    }

    public String a(Charset charset) {
        return a(this.b, g(), charset);
    }

    public String a(int i, int i2, Charset charset) {
        return vza.a((vyv) this, i, i2, charset);
    }

    public int a(wha wha) {
        x();
        try {
            int i = this.c;
            for (int i2 = this.b; i2 < i; i2++) {
                if (!wha.a(f(i2))) {
                    return i2;
                }
            }
            return -1;
        } catch (Exception e2) {
            PlatformDependent.a((Throwable) e2);
            return -1;
        }
    }

    public int hashCode() {
        return vza.b(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vyv) {
            return vza.a((vyv) this, (vyv) obj);
        }
        return false;
    }

    /* renamed from: b */
    public int compareTo(vyv vyv) {
        return vza.b(this, vyv);
    }

    public String toString() {
        if (z() == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(wjn.a((Object) this));
            sb.append("(freed)");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(wjn.a((Object) this));
        sb2.append("(ridx: ");
        sb2.append(this.b);
        sb2.append(", widx: ");
        sb2.append(this.c);
        sb2.append(", cap: ");
        sb2.append(P());
        if (this.d != Integer.MAX_VALUE) {
            sb2.append('/');
            sb2.append(this.d);
        }
        vyv K = K();
        if (K != null) {
            sb2.append(", unwrapped: ");
            sb2.append(K);
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final void A(int i) {
        k(i, 1);
    }

    /* access modifiers changed from: protected */
    public final void k(int i, int i2) {
        x();
        l(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public final void l(int i, int i2) {
        if (wjg.a(i, i2, P())) {
            throw new IndexOutOfBoundsException(String.format("index: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(P())}));
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i, int i2, int i3, int i4) {
        k(i, i2);
        if (wjg.a(i3, i2, i4)) {
            throw new IndexOutOfBoundsException(String.format("srcIndex: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)}));
        }
    }

    /* access modifiers changed from: protected */
    public final void b(int i, int i2, int i3, int i4) {
        k(i, i2);
        if (wjg.a(i3, i2, i4)) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i4)}));
        }
    }

    /* access modifiers changed from: protected */
    public final void B(int i) {
        if (i >= 0) {
            E(i);
            return;
        }
        StringBuilder sb = new StringBuilder("minimumReadableBytes: ");
        sb.append(i);
        sb.append(" (expected: >= 0)");
        throw new IllegalArgumentException(sb.toString());
    }

    private void E(int i) {
        x();
        int i2 = this.b;
        if (i2 > this.c - i) {
            throw new IndexOutOfBoundsException(String.format("readerIndex(%d) + length(%d) exceeds writerIndex(%d): %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.c), this}));
        }
    }

    /* access modifiers changed from: protected */
    public final void x() {
        if (f && z() == 0) {
            throw new IllegalReferenceCountException(0);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void m(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    /* access modifiers changed from: 0000 */
    public final void y() {
        this.h = 0;
        this.g = 0;
    }

    public byte e(int i) {
        k(i, 1);
        return f(i);
    }

    public vyv b(int i, int i2) {
        k(i, 1);
        c(i, i2);
        return this;
    }
}
