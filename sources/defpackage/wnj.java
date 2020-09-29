package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: wnj reason: default package */
public final class wnj extends wnb {
    private static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    private static final long b;
    private final wnc c;
    private final ByteOrder d;
    private final String e;
    private wnj f;

    static {
        long j = 0;
        try {
            if (PlatformDependent.e()) {
                j = PlatformDependent.b(a);
            }
        } catch (Throwable unused) {
        }
        b = j;
    }

    public wnj(wnc wnc) {
        this(wnc, ByteOrder.BIG_ENDIAN);
    }

    private wnj(wnc wnc, ByteOrder byteOrder) {
        if (wnc != null) {
            this.c = wnc;
            this.d = byteOrder;
            StringBuilder sb = new StringBuilder();
            sb.append(wxt.a((Object) this));
            sb.append(byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
            this.e = sb.toString();
            return;
        }
        throw new NullPointerException("alloc");
    }

    private wnb c(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    private wnb c(int i, int i2) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder("length: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0 && i2 == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private wnb f(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("length: ");
            sb.append(i);
            sb.append(" (expected: >= 0)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final wnb A() {
        return this;
    }

    public final boolean B() {
        return false;
    }

    public final int C() {
        return 0;
    }

    public final wnb C(int i) {
        throw new ReadOnlyBufferException();
    }

    public final wnc D() {
        return this.c;
    }

    public final ByteOrder E() {
        return this.d;
    }

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return true;
    }

    public final byte[] H() {
        return wxg.a;
    }

    public final boolean I() {
        return b != 0;
    }

    public final int J() {
        return 1;
    }

    public final wnb K() {
        return null;
    }

    public final long L() {
        if (I()) {
            return b;
        }
        throw new UnsupportedOperationException();
    }

    public final int P() {
        return 0;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        c(i, i2);
        return 0;
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        c(i, i2);
        return 0;
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        f(i);
        return 0;
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        f(i);
        return 0;
    }

    public final int a(wvg wvg) {
        return -1;
    }

    public final String a(Charset charset) {
        return "";
    }

    public final wnb a(int i) {
        return c(i);
    }

    public final wnb a(int i, int i2) {
        c(i);
        c(i2);
        return this;
    }

    public final wnb a(int i, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        return c(i, byteBuffer.remaining());
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        return c(i, i3);
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        return c(i, i3);
    }

    public final wnb a(long j) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb a(Object obj) {
        return this;
    }

    public final wnb a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == this.d) {
            return this;
        } else {
            wnj wnj = this.f;
            if (wnj != null) {
                return wnj;
            }
            wnj wnj2 = new wnj(this.c, byteOrder);
            this.f = wnj2;
            return wnj2;
        }
    }

    public final wnb a(wnb wnb) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb a(wnb wnb, int i, int i2) {
        return f(i2);
    }

    public final wnb a(byte[] bArr) {
        return f(bArr.length);
    }

    public final wnb a(byte[] bArr, int i, int i2) {
        return f(i2);
    }

    public final boolean a() {
        return false;
    }

    public final int b() {
        return 0;
    }

    /* renamed from: b */
    public final int compareTo(wnb wnb) {
        return wnb.f() ? -1 : 0;
    }

    public final wnb b(int i) {
        return c(i);
    }

    public final wnb b(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        return c(i, byteBuffer.remaining());
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        return c(i, i3);
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        return c(i, i3);
    }

    public final wnb b(byte[] bArr) {
        return f(bArr.length);
    }

    public final wnb b(byte[] bArr, int i, int i2) {
        return f(i2);
    }

    public final /* bridge */ /* synthetic */ wvo b(Object obj) {
        return this;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return 0;
    }

    public final wnb d(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder("minWritableBytes: ");
            sb.append(i);
            sb.append(" (expected: >= 0)");
            throw new IllegalArgumentException(sb.toString());
        } else if (i == 0) {
            return this;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final wnb d(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final byte e(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wnb) && !((wnb) obj).f();
    }

    public final wnb f(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final boolean f() {
        return false;
    }

    public final int g() {
        return 0;
    }

    public final short g(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int h() {
        return 0;
    }

    public final wnb h(int i, int i2) {
        return c(i, i2);
    }

    public final short h(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int hashCode() {
        return 0;
    }

    public final wnb i() {
        return this;
    }

    public final wnb i(int i, int i2) {
        return c(i, i2);
    }

    public final wnb j() {
        return this;
    }

    public final wnb j(int i, int i2) {
        return c(i, i2);
    }

    public final short j(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int l(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb l() {
        return this;
    }

    public final int m(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final byte n() {
        throw new IndexOutOfBoundsException();
    }

    public final ByteBuffer n(int i, int i2) {
        return a;
    }

    public final int o(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final ByteBuffer o(int i, int i2) {
        c(i, i2);
        return a;
    }

    public final short o() {
        throw new IndexOutOfBoundsException();
    }

    public final short p() {
        throw new IndexOutOfBoundsException();
    }

    public final ByteBuffer[] p(int i, int i2) {
        c(i, i2);
        return w();
    }

    public final int q() {
        throw new IndexOutOfBoundsException();
    }

    public final long q(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long r() {
        throw new IndexOutOfBoundsException();
    }

    public final long r(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long s(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb s() {
        return this;
    }

    public final wnb t() {
        return this;
    }

    public final String toString() {
        return this.e;
    }

    public final wnb u() {
        return this;
    }

    public final wnb u(int i) {
        return f(i);
    }

    public final ByteBuffer v() {
        return a;
    }

    public final wnb v(int i) {
        return f(i);
    }

    public final wnb w(int i) {
        return f(i);
    }

    public final ByteBuffer[] w() {
        return new ByteBuffer[]{a};
    }

    public final wnb x(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final wnb y(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int z() {
        return 1;
    }

    public final wnb z(int i) {
        throw new IndexOutOfBoundsException();
    }
}
