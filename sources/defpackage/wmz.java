package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: wmz reason: default package */
final class wmz extends wop {
    private static final boolean b;
    private static final wyc c = wyd.a(wmz.class);
    private final wvp d;

    static {
        String str = "io.netty.leakDetection.acquireAndReleaseOnly";
        b = wxu.a(str, false);
        if (c.b()) {
            c.b("-D{}: {}", str, Boolean.valueOf(b));
        }
    }

    wmz(wnb wnb, wvp wvp) {
        super(wnb);
        this.d = wvp;
    }

    static void a(wvp wvp) {
        if (!b) {
            wvp.a();
        }
    }

    public final wnb A() {
        this.d.a();
        return super.A();
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

    public final wnb C(int i) {
        a(this.d);
        return super.C(i);
    }

    public final int J() {
        a(this.d);
        return super.J();
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        a(this.d);
        return super.a(i, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        a(this.d);
        return super.a(i, scatteringByteChannel, i2);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        a(this.d);
        return super.a(gatheringByteChannel, i);
    }

    public final int a(ScatteringByteChannel scatteringByteChannel, int i) {
        a(this.d);
        return super.a(scatteringByteChannel, i);
    }

    public final int a(wvg wvg) {
        a(this.d);
        return super.a(wvg);
    }

    public final String a(Charset charset) {
        a(this.d);
        return super.a(charset);
    }

    public final wnb a(int i, long j) {
        a(this.d);
        return super.a(i, j);
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        a(this.d);
        return super.a(i, byteBuffer);
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        a(this.d);
        return super.a(i, wnb, i2, i3);
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        a(this.d);
        return super.a(i, bArr, i2, i3);
    }

    public final wnb a(long j) {
        a(this.d);
        return super.a(j);
    }

    /* renamed from: a */
    public final wnb b(Object obj) {
        this.d.a(obj);
        return this;
    }

    public final wnb a(ByteOrder byteOrder) {
        a(this.d);
        return E() == byteOrder ? this : new wmz(super.a(byteOrder), this.d);
    }

    public final wnb a(wnb wnb) {
        a(this.d);
        return super.a(wnb);
    }

    public final wnb a(wnb wnb, int i, int i2) {
        a(this.d);
        return super.a(wnb, i, i2);
    }

    public final wnb a(byte[] bArr) {
        a(this.d);
        return super.a(bArr);
    }

    public final wnb a(byte[] bArr, int i, int i2) {
        a(this.d);
        return super.a(bArr, i, i2);
    }

    public final wnb b(int i, int i2) {
        a(this.d);
        return super.b(i, i2);
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        a(this.d);
        return super.b(i, byteBuffer);
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        a(this.d);
        return super.b(i, wnb, i2, i3);
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        a(this.d);
        return super.b(i, bArr, i2, i3);
    }

    public final wnb b(byte[] bArr) {
        a(this.d);
        return super.b(bArr);
    }

    public final wnb b(byte[] bArr, int i, int i2) {
        a(this.d);
        return super.b(bArr, i, i2);
    }

    public final wnb d(int i) {
        a(this.d);
        return super.d(i);
    }

    public final wnb d(int i, int i2) {
        a(this.d);
        return super.d(i, i2);
    }

    public final byte e(int i) {
        a(this.d);
        return super.e(i);
    }

    public final wnb f(int i, int i2) {
        a(this.d);
        return super.f(i, i2);
    }

    public final short g(int i) {
        a(this.d);
        return super.g(i);
    }

    public final wnb h(int i, int i2) {
        a(this.d);
        return super.h(i, i2);
    }

    public final short h(int i) {
        a(this.d);
        return super.h(i);
    }

    public final wnb i(int i, int i2) {
        a(this.d);
        return new wmz(super.i(i, i2), this.d);
    }

    public final wnb j(int i, int i2) {
        a(this.d);
        return new wmz(super.j(i, i2), this.d);
    }

    public final short j(int i) {
        a(this.d);
        return super.j(i);
    }

    public final int l(int i) {
        a(this.d);
        return super.l(i);
    }

    public final wnb l() {
        a(this.d);
        return super.l();
    }

    public final int m(int i) {
        a(this.d);
        return super.m(i);
    }

    public final byte n() {
        a(this.d);
        return super.n();
    }

    public final ByteBuffer n(int i, int i2) {
        a(this.d);
        return super.n(i, i2);
    }

    public final int o(int i) {
        a(this.d);
        return super.o(i);
    }

    public final ByteBuffer o(int i, int i2) {
        a(this.d);
        return super.o(i, i2);
    }

    public final short o() {
        a(this.d);
        return super.o();
    }

    public final short p() {
        a(this.d);
        return super.p();
    }

    public final ByteBuffer[] p(int i, int i2) {
        a(this.d);
        return super.p(i, i2);
    }

    public final int q() {
        a(this.d);
        return super.q();
    }

    public final long q(int i) {
        a(this.d);
        return super.q(i);
    }

    public final long r() {
        a(this.d);
        return super.r();
    }

    public final long r(int i) {
        a(this.d);
        return super.r(i);
    }

    public final long s(int i) {
        a(this.d);
        return super.s(i);
    }

    public final wnb s() {
        a(this.d);
        return new wmz(super.s(), this.d);
    }

    public final wnb t() {
        a(this.d);
        return new wmz(super.t(), this.d);
    }

    public final wnb u() {
        a(this.d);
        return new wmz(super.u(), this.d);
    }

    public final wnb u(int i) {
        a(this.d);
        return super.u(i);
    }

    public final ByteBuffer v() {
        a(this.d);
        return super.v();
    }

    public final wnb v(int i) {
        a(this.d);
        return new wmz(super.v(i), this.d);
    }

    public final wnb w(int i) {
        a(this.d);
        return super.w(i);
    }

    public final ByteBuffer[] w() {
        a(this.d);
        return super.w();
    }

    public final wnb x(int i) {
        a(this.d);
        return super.x(i);
    }

    public final wnb y(int i) {
        a(this.d);
        return super.y(i);
    }

    public final wnb z(int i) {
        a(this.d);
        return super.z(i);
    }
}
