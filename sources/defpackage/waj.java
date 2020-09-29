package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.nio.charset.Charset;

/* renamed from: waj reason: default package */
class waj extends vyv {
    protected final vyv a;

    protected waj(vyv vyv) {
        if (vyv != null) {
            this.a = vyv;
            return;
        }
        throw new NullPointerException("buf");
    }

    public final boolean I() {
        return this.a.I();
    }

    public final long L() {
        return this.a.L();
    }

    public final int P() {
        return this.a.P();
    }

    public vyv C(int i) {
        this.a.C(i);
        return this;
    }

    public final int b() {
        return this.a.b();
    }

    public final vyw D() {
        return this.a.D();
    }

    public final ByteOrder E() {
        return this.a.E();
    }

    public vyv a(ByteOrder byteOrder) {
        return this.a.a(byteOrder);
    }

    public final vyv K() {
        return this.a;
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

    public vyv l() {
        this.a.l();
        return this;
    }

    public vyv d(int i) {
        this.a.d(i);
        return this;
    }

    public byte e(int i) {
        return this.a.e(i);
    }

    public short g(int i) {
        return this.a.g(i);
    }

    public short h(int i) {
        return this.a.h(i);
    }

    public short j(int i) {
        return this.a.j(i);
    }

    public int l(int i) {
        return this.a.l(i);
    }

    public int m(int i) {
        return this.a.m(i);
    }

    public int o(int i) {
        return this.a.o(i);
    }

    public long q(int i) {
        return this.a.q(i);
    }

    public long r(int i) {
        return this.a.r(i);
    }

    public long s(int i) {
        return this.a.s(i);
    }

    public vyv a(int i, vyv vyv, int i2, int i3) {
        this.a.a(i, vyv, i2, i3);
        return this;
    }

    public vyv a(int i, byte[] bArr, int i2, int i3) {
        this.a.a(i, bArr, i2, i3);
        return this;
    }

    public vyv a(int i, ByteBuffer byteBuffer) {
        this.a.a(i, byteBuffer);
        return this;
    }

    public int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return this.a.a(i, gatheringByteChannel, i2);
    }

    public vyv b(int i, int i2) {
        this.a.b(i, i2);
        return this;
    }

    public vyv d(int i, int i2) {
        this.a.d(i, i2);
        return this;
    }

    public vyv f(int i, int i2) {
        this.a.f(i, i2);
        return this;
    }

    public vyv a(int i, long j) {
        this.a.a(i, j);
        return this;
    }

    public vyv b(int i, vyv vyv, int i2, int i3) {
        this.a.b(i, vyv, i2, i3);
        return this;
    }

    public vyv b(int i, byte[] bArr, int i2, int i3) {
        this.a.b(i, bArr, i2, i3);
        return this;
    }

    public vyv b(int i, ByteBuffer byteBuffer) {
        this.a.b(i, byteBuffer);
        return this;
    }

    public int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        return this.a.a(i, scatteringByteChannel, i2);
    }

    public vyv h(int i, int i2) {
        this.a.h(i, i2);
        return this;
    }

    public byte n() {
        return this.a.n();
    }

    public short o() {
        return this.a.o();
    }

    public short p() {
        return this.a.p();
    }

    public int q() {
        return this.a.q();
    }

    public long r() {
        return this.a.r();
    }

    public vyv u(int i) {
        return this.a.u(i);
    }

    public vyv v(int i) {
        return this.a.v(i);
    }

    public vyv a(byte[] bArr) {
        this.a.a(bArr);
        return this;
    }

    public vyv a(byte[] bArr, int i, int i2) {
        this.a.a(bArr, i, i2);
        return this;
    }

    public int a(GatheringByteChannel gatheringByteChannel, int i) {
        return this.a.a(gatheringByteChannel, i);
    }

    public vyv w(int i) {
        this.a.w(i);
        return this;
    }

    public vyv x(int i) {
        this.a.x(i);
        return this;
    }

    public vyv y(int i) {
        this.a.y(i);
        return this;
    }

    public vyv z(int i) {
        this.a.z(i);
        return this;
    }

    public vyv a(long j) {
        this.a.a(j);
        return this;
    }

    public vyv a(vyv vyv) {
        this.a.a(vyv);
        return this;
    }

    public vyv a(vyv vyv, int i, int i2) {
        this.a.a(vyv, i, i2);
        return this;
    }

    public vyv b(byte[] bArr) {
        this.a.b(bArr);
        return this;
    }

    public vyv b(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
        return this;
    }

    public int a(ScatteringByteChannel scatteringByteChannel, int i) {
        return this.a.a(scatteringByteChannel, i);
    }

    public int a(wha wha) {
        return this.a.a(wha);
    }

    public vyv t() {
        return this.a.t();
    }

    public vyv u() {
        return this.a.u();
    }

    public vyv i(int i, int i2) {
        return this.a.i(i, i2);
    }

    public vyv j(int i, int i2) {
        return this.a.j(i, i2);
    }

    public vyv s() {
        return this.a.s();
    }

    public int J() {
        return this.a.J();
    }

    public ByteBuffer v() {
        return this.a.v();
    }

    public ByteBuffer o(int i, int i2) {
        return this.a.o(i, i2);
    }

    public ByteBuffer[] w() {
        return this.a.w();
    }

    public ByteBuffer[] p(int i, int i2) {
        return this.a.p(i, i2);
    }

    public ByteBuffer n(int i, int i2) {
        return this.a.n(i, i2);
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

    public String a(Charset charset) {
        return this.a.a(charset);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(Object obj) {
        return this.a.equals(obj);
    }

    /* renamed from: b */
    public final int compareTo(vyv vyv) {
        return this.a.compareTo(vyv);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append('(');
        sb.append(this.a.toString());
        sb.append(')');
        return sb.toString();
    }

    public vyv A() {
        this.a.A();
        return this;
    }

    /* renamed from: a */
    public vyv b(Object obj) {
        this.a.b(obj);
        return this;
    }

    public final int z() {
        return this.a.z();
    }

    public boolean B() {
        return this.a.B();
    }
}
