package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

@Deprecated
/* renamed from: wob reason: default package */
public class wob extends wnb {
    private final wnb a;
    private final ByteOrder b;

    public wob(wnb wnb) {
        if (wnb != null) {
            this.a = wnb;
            if (wnb.E() == ByteOrder.BIG_ENDIAN) {
                this.b = ByteOrder.LITTLE_ENDIAN;
            } else {
                this.b = ByteOrder.BIG_ENDIAN;
            }
        } else {
            throw new NullPointerException("buf");
        }
    }

    public final wnb A() {
        this.a.A();
        return this;
    }

    public final boolean B() {
        return this.a.B();
    }

    public final int C() {
        return this.a.C();
    }

    public final wnb C(int i) {
        this.a.C(i);
        return this;
    }

    public final wnc D() {
        return this.a.D();
    }

    public final ByteOrder E() {
        return this.b;
    }

    public final boolean F() {
        return this.a.F();
    }

    public final boolean G() {
        return this.a.G();
    }

    public final byte[] H() {
        return this.a.H();
    }

    public final boolean I() {
        return this.a.I();
    }

    public final int J() {
        return this.a.J();
    }

    public final wnb K() {
        return this.a.K();
    }

    public final long L() {
        return this.a.L();
    }

    public final int P() {
        return this.a.P();
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return this.a.a(i, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return this.a.a(i, scatteringByteChannel, i2);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        return this.a.a(gatheringByteChannel, i);
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.a.a(scatteringByteChannel, i);
    }

    public final int a(wvg wvg) {
        return this.a.a(wvg);
    }

    public final String a(Charset charset) {
        return this.a.a(charset);
    }

    public final wnb a(int i) {
        this.a.a(i);
        return this;
    }

    public final wnb a(int i, int i2) {
        this.a.a(i, i2);
        return this;
    }

    public wnb a(int i, long j) {
        this.a.a(i, wng.a(j));
        return this;
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        this.a.a(i, byteBuffer);
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        this.a.a(i, wnb, i2, i3);
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        this.a.a(i, bArr, i2, i3);
        return this;
    }

    public wnb a(long j) {
        this.a.a(wng.a(j));
        return this;
    }

    /* renamed from: a */
    public final wnb b(Object obj) {
        this.a.b(obj);
        return this;
    }

    public final wnb a(ByteOrder byteOrder) {
        if (byteOrder != null) {
            return byteOrder == this.b ? this : this.a;
        }
        throw new NullPointerException("endianness");
    }

    public final wnb a(wnb wnb) {
        this.a.a(wnb);
        return this;
    }

    public final wnb a(wnb wnb, int i, int i2) {
        this.a.a(wnb, i, i2);
        return this;
    }

    public final wnb a(byte[] bArr) {
        this.a.a(bArr);
        return this;
    }

    public final wnb a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
        return this;
    }

    public final boolean a() {
        return this.a.a();
    }

    public final int b() {
        return this.a.b();
    }

    public final int b(wnb wnb) {
        return wng.b(this, wnb);
    }

    public final wnb b(int i) {
        this.a.b(i);
        return this;
    }

    public final wnb b(int i, int i2) {
        this.a.b(i, i2);
        return this;
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        this.a.b(i, byteBuffer);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        this.a.b(i, wnb, i2, i3);
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        this.a.b(i, bArr, i2, i3);
        return this;
    }

    public final wnb b(byte[] bArr) {
        this.a.b(bArr);
        return this;
    }

    public final wnb b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        return this;
    }

    public final int c() {
        return this.a.c();
    }

    public /* synthetic */ int compareTo(Object obj) {
        return wng.b(this, (wnb) obj);
    }

    public final int d() {
        return this.a.d();
    }

    public final wnb d(int i) {
        this.a.d(i);
        return this;
    }

    public wnb d(int i, int i2) {
        this.a.d(i, wng.a((short) i2));
        return this;
    }

    public final byte e(int i) {
        return this.a.e(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wnb) {
            return wng.a((wnb) this, (wnb) obj);
        }
        return false;
    }

    public wnb f(int i, int i2) {
        this.a.f(i, wng.a(i2));
        return this;
    }

    public final boolean f() {
        return this.a.f();
    }

    public final int g() {
        return this.a.g();
    }

    public final short g(int i) {
        return this.a.g(i);
    }

    public final int h() {
        return this.a.h();
    }

    public final wnb h(int i, int i2) {
        this.a.h(i, i2);
        return this;
    }

    public short h(int i) {
        return wng.a(this.a.h(i));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final wnb i() {
        this.a.i();
        return this;
    }

    public final wnb i(int i, int i2) {
        return this.a.i(i, i2).a(this.b);
    }

    public final wnb j() {
        this.a.j();
        return this;
    }

    public final wnb j(int i, int i2) {
        return this.a.j(i, i2).a(this.b);
    }

    public final short j(int i) {
        return this.a.h(i);
    }

    public int l(int i) {
        return h(i) & 65535;
    }

    public final wnb l() {
        this.a.l();
        return this;
    }

    public int m(int i) {
        return wng.a(this.a.m(i));
    }

    public final byte n() {
        return this.a.n();
    }

    public final ByteBuffer n(int i, int i2) {
        return o(i, i2);
    }

    public final int o(int i) {
        return this.a.m(i);
    }

    public final ByteBuffer o(int i, int i2) {
        return this.a.o(i, i2).order(this.b);
    }

    public final short o() {
        return this.a.o();
    }

    public final short p() {
        return wng.a(this.a.p());
    }

    public final ByteBuffer[] p(int i, int i2) {
        ByteBuffer[] p = this.a.p(i, i2);
        for (int i3 = 0; i3 < p.length; i3++) {
            p[i3] = p[i3].order(this.b);
        }
        return p;
    }

    public final int q() {
        return wng.a(this.a.q());
    }

    public long q(int i) {
        return ((long) m(i)) & 4294967295L;
    }

    public final long r() {
        return wng.a(this.a.r());
    }

    public final long r(int i) {
        return ((long) o(i)) & 4294967295L;
    }

    public long s(int i) {
        return wng.a(this.a.s(i));
    }

    public final wnb s() {
        return this.a.s().a(this.b);
    }

    public final wnb t() {
        return this.a.t().a(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Swapped(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }

    public final wnb u() {
        return this.a.u().a(this.b);
    }

    public final wnb u(int i) {
        return this.a.u(i).a(this.b);
    }

    public final ByteBuffer v() {
        return this.a.v().order(this.b);
    }

    public final wnb v(int i) {
        return this.a.v(i).a(this.b);
    }

    public final wnb w(int i) {
        this.a.w(i);
        return this;
    }

    public final ByteBuffer[] w() {
        ByteBuffer[] w = this.a.w();
        for (int i = 0; i < w.length; i++) {
            w[i] = w[i].order(this.b);
        }
        return w;
    }

    public final wnb x(int i) {
        this.a.x(i);
        return this;
    }

    public wnb y(int i) {
        this.a.y(wng.a((short) i));
        return this;
    }

    public final int z() {
        return this.a.z();
    }

    public wnb z(int i) {
        this.a.z(wng.a(i));
        return this;
    }
}
