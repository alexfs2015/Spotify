package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: vyt reason: default package */
final class vyt extends waj {
    private static final boolean b;
    private static final wjw c = wjx.a(vyt.class);
    private final whj d;

    static {
        String str = "io.netty.leakDetection.acquireAndReleaseOnly";
        b = wjo.a(str, false);
        if (c.b()) {
            c.b("-D{}: {}", str, Boolean.valueOf(b));
        }
    }

    vyt(vyv vyv, whj whj) {
        super(vyv);
        this.d = whj;
    }

    static void a(whj whj) {
        if (!b) {
            whj.a();
        }
    }

    public final vyv a(ByteOrder byteOrder) {
        a(this.d);
        if (E() == byteOrder) {
            return this;
        }
        return new vyt(super.a(byteOrder), this.d);
    }

    public final vyv t() {
        a(this.d);
        return new vyt(super.t(), this.d);
    }

    public final vyv u() {
        a(this.d);
        return new vyt(super.u(), this.d);
    }

    public final vyv i(int i, int i2) {
        a(this.d);
        return new vyt(super.i(i, i2), this.d);
    }

    public final vyv j(int i, int i2) {
        a(this.d);
        return new vyt(super.j(i, i2), this.d);
    }

    public final vyv s() {
        a(this.d);
        return new vyt(super.s(), this.d);
    }

    public final vyv v(int i) {
        a(this.d);
        return new vyt(super.v(i), this.d);
    }

    public final vyv l() {
        a(this.d);
        return super.l();
    }

    public final vyv d(int i) {
        a(this.d);
        return super.d(i);
    }

    public final byte e(int i) {
        a(this.d);
        return super.e(i);
    }

    public final short g(int i) {
        a(this.d);
        return super.g(i);
    }

    public final short h(int i) {
        a(this.d);
        return super.h(i);
    }

    public final int l(int i) {
        a(this.d);
        return super.l(i);
    }

    public final int m(int i) {
        a(this.d);
        return super.m(i);
    }

    public final long q(int i) {
        a(this.d);
        return super.q(i);
    }

    public final long s(int i) {
        a(this.d);
        return super.s(i);
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        a(this.d);
        return super.a(i, vyv, i2, i3);
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        a(this.d);
        return super.a(i, bArr, i2, i3);
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        a(this.d);
        return super.a(i, byteBuffer);
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        a(this.d);
        return super.a(i, gatheringByteChannel, i2);
    }

    public final vyv b(int i, int i2) {
        a(this.d);
        return super.b(i, i2);
    }

    public final vyv d(int i, int i2) {
        a(this.d);
        return super.d(i, i2);
    }

    public final vyv f(int i, int i2) {
        a(this.d);
        return super.f(i, i2);
    }

    public final vyv a(int i, long j) {
        a(this.d);
        return super.a(i, j);
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        a(this.d);
        return super.b(i, vyv, i2, i3);
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        a(this.d);
        return super.b(i, bArr, i2, i3);
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        a(this.d);
        return super.b(i, byteBuffer);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        a(this.d);
        return super.a(i, scatteringByteChannel, i2);
    }

    public final vyv h(int i, int i2) {
        a(this.d);
        return super.h(i, i2);
    }

    public final byte n() {
        a(this.d);
        return super.n();
    }

    public final short o() {
        a(this.d);
        return super.o();
    }

    public final short p() {
        a(this.d);
        return super.p();
    }

    public final int q() {
        a(this.d);
        return super.q();
    }

    public final long r() {
        a(this.d);
        return super.r();
    }

    public final vyv u(int i) {
        a(this.d);
        return super.u(i);
    }

    public final vyv a(byte[] bArr) {
        a(this.d);
        return super.a(bArr);
    }

    public final vyv a(byte[] bArr, int i, int i2) {
        a(this.d);
        return super.a(bArr, i, i2);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        a(this.d);
        return super.a(gatheringByteChannel, i);
    }

    public final vyv w(int i) {
        a(this.d);
        return super.w(i);
    }

    public final vyv x(int i) {
        a(this.d);
        return super.x(i);
    }

    public final vyv y(int i) {
        a(this.d);
        return super.y(i);
    }

    public final vyv z(int i) {
        a(this.d);
        return super.z(i);
    }

    public final vyv a(long j) {
        a(this.d);
        return super.a(j);
    }

    public final vyv a(vyv vyv) {
        a(this.d);
        return super.a(vyv);
    }

    public final vyv a(vyv vyv, int i, int i2) {
        a(this.d);
        return super.a(vyv, i, i2);
    }

    public final vyv b(byte[] bArr) {
        a(this.d);
        return super.b(bArr);
    }

    public final vyv b(byte[] bArr, int i, int i2) {
        a(this.d);
        return super.b(bArr, i, i2);
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        a(this.d);
        return super.a(scatteringByteChannel, i);
    }

    public final int a(wha wha) {
        a(this.d);
        return super.a(wha);
    }

    public final int J() {
        a(this.d);
        return super.J();
    }

    public final ByteBuffer v() {
        a(this.d);
        return super.v();
    }

    public final ByteBuffer o(int i, int i2) {
        a(this.d);
        return super.o(i, i2);
    }

    public final ByteBuffer[] w() {
        a(this.d);
        return super.w();
    }

    public final ByteBuffer[] p(int i, int i2) {
        a(this.d);
        return super.p(i, i2);
    }

    public final ByteBuffer n(int i, int i2) {
        a(this.d);
        return super.n(i, i2);
    }

    public final String a(Charset charset) {
        a(this.d);
        return super.a(charset);
    }

    public final vyv C(int i) {
        a(this.d);
        return super.C(i);
    }

    public final short j(int i) {
        a(this.d);
        return super.j(i);
    }

    public final int o(int i) {
        a(this.d);
        return super.o(i);
    }

    public final long r(int i) {
        a(this.d);
        return super.r(i);
    }

    public final vyv A() {
        this.d.a();
        return super.A();
    }

    /* renamed from: a */
    public final vyv b(Object obj) {
        this.d.a(obj);
        return this;
    }

    public final boolean B() {
        boolean B = super.B();
        if (B) {
            this.d.b();
        } else {
            this.d.a();
        }
        return B;
    }
}
