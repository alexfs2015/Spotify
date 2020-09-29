package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

@Deprecated
/* renamed from: vzv reason: default package */
public class vzv extends vyv {
    private final vyv a;
    private final ByteOrder b;

    public /* synthetic */ int compareTo(Object obj) {
        return vza.b(this, (vyv) obj);
    }

    public vzv(vyv vyv) {
        if (vyv != null) {
            this.a = vyv;
            if (vyv.E() == ByteOrder.BIG_ENDIAN) {
                this.b = ByteOrder.LITTLE_ENDIAN;
            } else {
                this.b = ByteOrder.BIG_ENDIAN;
            }
        } else {
            throw new NullPointerException("buf");
        }
    }

    public final ByteOrder E() {
        return this.b;
    }

    public final vyv a(ByteOrder byteOrder) {
        if (byteOrder == null) {
            throw new NullPointerException("endianness");
        } else if (byteOrder == this.b) {
            return this;
        } else {
            return this.a;
        }
    }

    public final vyv K() {
        return this.a.K();
    }

    public final vyw D() {
        return this.a.D();
    }

    public final int P() {
        return this.a.P();
    }

    public final vyv C(int i) {
        this.a.C(i);
        return this;
    }

    public final int b() {
        return this.a.b();
    }

    public final boolean a() {
        return this.a.a();
    }

    public final boolean F() {
        return this.a.F();
    }

    public final int c() {
        return this.a.c();
    }

    public final vyv a(int i) {
        this.a.a(i);
        return this;
    }

    public final int d() {
        return this.a.d();
    }

    public final vyv b(int i) {
        this.a.b(i);
        return this;
    }

    public final vyv a(int i, int i2) {
        this.a.a(i, i2);
        return this;
    }

    public final int g() {
        return this.a.g();
    }

    public final int h() {
        return this.a.h();
    }

    public final boolean f() {
        return this.a.f();
    }

    public final vyv i() {
        this.a.i();
        return this;
    }

    public final vyv j() {
        this.a.j();
        return this;
    }

    public final vyv l() {
        this.a.l();
        return this;
    }

    public final vyv d(int i) {
        this.a.d(i);
        return this;
    }

    public final byte e(int i) {
        return this.a.e(i);
    }

    public final short g(int i) {
        return this.a.g(i);
    }

    public short h(int i) {
        return vza.a(this.a.h(i));
    }

    public final short j(int i) {
        return this.a.h(i);
    }

    public int l(int i) {
        return h(i) & 65535;
    }

    public int m(int i) {
        return vza.a(this.a.m(i));
    }

    public final int o(int i) {
        return this.a.m(i);
    }

    public long q(int i) {
        return ((long) m(i)) & 4294967295L;
    }

    public final long r(int i) {
        return ((long) o(i)) & 4294967295L;
    }

    public long s(int i) {
        return vza.a(this.a.s(i));
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        this.a.a(i, vyv, i2, i3);
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        this.a.a(i, bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        this.a.a(i, byteBuffer);
        return this;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return this.a.a(i, gatheringByteChannel, i2);
    }

    public final vyv b(int i, int i2) {
        this.a.b(i, i2);
        return this;
    }

    public vyv d(int i, int i2) {
        this.a.d(i, vza.a((short) i2));
        return this;
    }

    public vyv f(int i, int i2) {
        this.a.f(i, vza.a(i2));
        return this;
    }

    public vyv a(int i, long j) {
        this.a.a(i, vza.a(j));
        return this;
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        this.a.b(i, vyv, i2, i3);
        return this;
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        this.a.b(i, bArr, i2, i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        this.a.b(i, byteBuffer);
        return this;
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return this.a.a(i, scatteringByteChannel, i2);
    }

    public final vyv h(int i, int i2) {
        this.a.h(i, i2);
        return this;
    }

    public final byte n() {
        return this.a.n();
    }

    public final short o() {
        return this.a.o();
    }

    public final short p() {
        return vza.a(this.a.p());
    }

    public final int q() {
        return vza.a(this.a.q());
    }

    public final long r() {
        return vza.a(this.a.r());
    }

    public final vyv u(int i) {
        return this.a.u(i).a(this.b);
    }

    public final vyv v(int i) {
        return this.a.v(i).a(this.b);
    }

    public final vyv a(byte[] bArr) {
        this.a.a(bArr);
        return this;
    }

    public final vyv a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
        return this;
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        return this.a.a(gatheringByteChannel, i);
    }

    public final vyv w(int i) {
        this.a.w(i);
        return this;
    }

    public final vyv x(int i) {
        this.a.x(i);
        return this;
    }

    public vyv y(int i) {
        this.a.y(vza.a((short) i));
        return this;
    }

    public vyv z(int i) {
        this.a.z(vza.a(i));
        return this;
    }

    public vyv a(long j) {
        this.a.a(vza.a(j));
        return this;
    }

    public final vyv a(vyv vyv) {
        this.a.a(vyv);
        return this;
    }

    public final vyv a(vyv vyv, int i, int i2) {
        this.a.a(vyv, i, i2);
        return this;
    }

    public final vyv b(byte[] bArr) {
        this.a.b(bArr);
        return this;
    }

    public final vyv b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        return this;
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.a.a(scatteringByteChannel, i);
    }

    public final int a(wha wha) {
        return this.a.a(wha);
    }

    public final vyv t() {
        return this.a.t().a(this.b);
    }

    public final vyv u() {
        return this.a.u().a(this.b);
    }

    public final vyv i(int i, int i2) {
        return this.a.i(i, i2).a(this.b);
    }

    public final vyv j(int i, int i2) {
        return this.a.j(i, i2).a(this.b);
    }

    public final vyv s() {
        return this.a.s().a(this.b);
    }

    public final int J() {
        return this.a.J();
    }

    public final ByteBuffer v() {
        return this.a.v().order(this.b);
    }

    public final ByteBuffer o(int i, int i2) {
        return this.a.o(i, i2).order(this.b);
    }

    public final ByteBuffer n(int i, int i2) {
        return o(i, i2);
    }

    public final ByteBuffer[] w() {
        ByteBuffer[] w = this.a.w();
        for (int i = 0; i < w.length; i++) {
            w[i] = w[i].order(this.b);
        }
        return w;
    }

    public final ByteBuffer[] p(int i, int i2) {
        ByteBuffer[] p = this.a.p(i, i2);
        for (int i3 = 0; i3 < p.length; i3++) {
            p[i3] = p[i3].order(this.b);
        }
        return p;
    }

    public final boolean G() {
        return this.a.G();
    }

    public final byte[] H() {
        return this.a.H();
    }

    public final int C() {
        return this.a.C();
    }

    public final boolean I() {
        return this.a.I();
    }

    public final long L() {
        return this.a.L();
    }

    public final String a(Charset charset) {
        return this.a.a(charset);
    }

    public final int z() {
        return this.a.z();
    }

    public final vyv A() {
        this.a.A();
        return this;
    }

    /* renamed from: a */
    public final vyv b(Object obj) {
        this.a.b(obj);
        return this;
    }

    public final boolean B() {
        return this.a.B();
    }

    public int hashCode() {
        return this.a.hashCode();
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

    public final int b(vyv vyv) {
        return vza.b(this, vyv);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Swapped(");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
