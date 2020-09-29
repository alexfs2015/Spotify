package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: vzd reason: default package */
public final class vzd extends vyv {
    private static final ByteBuffer a = ByteBuffer.allocateDirect(0);
    private static final long b;
    private final vyw c;
    private final ByteOrder d;
    private final String e;
    private vzd f;

    public final vyv A() {
        return this;
    }

    public final boolean B() {
        return false;
    }

    public final int C() {
        return 0;
    }

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return true;
    }

    public final int J() {
        return 1;
    }

    public final vyv K() {
        return null;
    }

    public final int P() {
        return 0;
    }

    public final int a(wha wha) {
        return -1;
    }

    public final String a(Charset charset) {
        return "";
    }

    public final vyv a(Object obj) {
        return this;
    }

    public final boolean a() {
        return false;
    }

    public final int b() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ whi b(Object obj) {
        return this;
    }

    public final int c() {
        return 0;
    }

    public final int d() {
        return 0;
    }

    public final boolean f() {
        return false;
    }

    public final int g() {
        return 0;
    }

    public final int h() {
        return 0;
    }

    public final int hashCode() {
        return 0;
    }

    public final vyv i() {
        return this;
    }

    public final vyv j() {
        return this;
    }

    public final vyv l() {
        return this;
    }

    public final vyv s() {
        return this;
    }

    public final vyv t() {
        return this;
    }

    public final vyv u() {
        return this;
    }

    public final int z() {
        return 1;
    }

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

    public vzd(vyw vyw) {
        this(vyw, ByteOrder.BIG_ENDIAN);
    }

    private vzd(vyw vyw, ByteOrder byteOrder) {
        if (vyw != null) {
            this.c = vyw;
            this.d = byteOrder;
            StringBuilder sb = new StringBuilder();
            sb.append(wjn.a((Object) this));
            sb.append(byteOrder == ByteOrder.BIG_ENDIAN ? "BE" : "LE");
            this.e = sb.toString();
            return;
        }
        throw new NullPointerException("alloc");
    }

    public final vyv C(int i) {
        throw new ReadOnlyBufferException();
    }

    public final vyw D() {
        return this.c;
    }

    public final ByteOrder E() {
        return this.d;
    }

    public final vyv a(int i) {
        return c(i);
    }

    public final vyv b(int i) {
        return c(i);
    }

    public final vyv a(int i, int i2) {
        c(i);
        c(i2);
        return this;
    }

    public final vyv d(int i) {
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

    public final byte e(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final short g(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final short h(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final short j(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int l(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int m(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final int o(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long q(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long r(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final long s(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        return c(i, i3);
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        return c(i, i3);
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        return c(i, byteBuffer.remaining());
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        c(i, i2);
        return 0;
    }

    public final vyv b(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv d(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv f(int i, int i2) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv a(int i, long j) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        return c(i, i3);
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        return c(i, i3);
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        return c(i, byteBuffer.remaining());
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        c(i, i2);
        return 0;
    }

    public final vyv h(int i, int i2) {
        return c(i, i2);
    }

    public final byte n() {
        throw new IndexOutOfBoundsException();
    }

    public final short o() {
        throw new IndexOutOfBoundsException();
    }

    public final short p() {
        throw new IndexOutOfBoundsException();
    }

    public final int q() {
        throw new IndexOutOfBoundsException();
    }

    public final long r() {
        throw new IndexOutOfBoundsException();
    }

    public final vyv u(int i) {
        return f(i);
    }

    public final vyv v(int i) {
        return f(i);
    }

    public final vyv a(byte[] bArr) {
        return f(bArr.length);
    }

    public final vyv a(byte[] bArr, int i, int i2) {
        return f(i2);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        f(i);
        return 0;
    }

    public final vyv w(int i) {
        return f(i);
    }

    public final vyv x(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv y(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv z(int i) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv a(long j) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv a(vyv vyv) {
        throw new IndexOutOfBoundsException();
    }

    public final vyv a(vyv vyv, int i, int i2) {
        return f(i2);
    }

    public final vyv b(byte[] bArr) {
        return f(bArr.length);
    }

    public final vyv b(byte[] bArr, int i, int i2) {
        return f(i2);
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        f(i);
        return 0;
    }

    public final vyv i(int i, int i2) {
        return c(i, i2);
    }

    public final vyv j(int i, int i2) {
        return c(i, i2);
    }

    public final ByteBuffer v() {
        return a;
    }

    public final ByteBuffer o(int i, int i2) {
        c(i, i2);
        return a;
    }

    public final ByteBuffer[] w() {
        return new ByteBuffer[]{a};
    }

    public final ByteBuffer[] p(int i, int i2) {
        c(i, i2);
        return w();
    }

    public final ByteBuffer n(int i, int i2) {
        return a;
    }

    public final byte[] H() {
        return wja.a;
    }

    public final boolean I() {
        return b != 0;
    }

    public final long L() {
        if (I()) {
            return b;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vyv) && !((vyv) obj).f();
    }

    /* renamed from: b */
    public final int compareTo(vyv vyv) {
        return vyv.f() ? -1 : 0;
    }

    public final String toString() {
        return this.e;
    }

    private vyv c(int i) {
        if (i == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    private vyv c(int i, int i2) {
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

    private vyv f(int i) {
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

    public final vyv a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == this.d) {
            return this;
        } else {
            vzd vzd = this.f;
            if (vzd != null) {
                return vzd;
            }
            vzd vzd2 = new vzd(this.c, byteOrder);
            this.f = vzd2;
            return vzd2;
        }
    }
}
