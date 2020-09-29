package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: vzo reason: default package */
final class vzo extends vyp {
    private static final Recycler<vzo> g = new Recycler<vzo>() {
        public final /* synthetic */ Object a(b bVar) {
            return new vzo(bVar, 0);
        }
    };
    private int h;

    /* synthetic */ vzo(b bVar, byte b) {
        this(bVar);
    }

    static vzo a(vym vym, vyv vyv, int i, int i2) {
        vyr.a(i, i2, (vyv) vym);
        return b(vym, vyv, i, i2);
    }

    private static vzo b(vym vym, vyv vyv, int i, int i2) {
        vzo vzo = (vzo) g.a();
        vzo.a(vym, vyv, 0, i2, i2);
        vzo.y();
        vzo.h = i;
        return vzo;
    }

    private vzo(b<vzo> bVar) {
        super(bVar);
    }

    public final int P() {
        return b();
    }

    public final vyv C(int i) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    public final ByteBuffer o(int i, int i2) {
        l(i, i2);
        return this.e.o(i + this.h, i2);
    }

    public final ByteBuffer[] p(int i, int i2) {
        l(i, i2);
        return this.e.p(i + this.h, i2);
    }

    public final vyv i(int i, int i2) {
        l(i, i2);
        return this.e.i(i + this.h, i2);
    }

    public final vyv j(int i, int i2) {
        l(i, i2);
        return b(this.e, (vyv) this, i + this.h, i2);
    }

    public final byte e(int i) {
        l(i, 1);
        return this.e.e(i + this.h);
    }

    public final short h(int i) {
        l(i, 2);
        return this.e.h(i + this.h);
    }

    public final short j(int i) {
        l(i, 2);
        return this.e.j(i + this.h);
    }

    public final int m(int i) {
        l(i, 4);
        return this.e.m(i + this.h);
    }

    public final int o(int i) {
        l(i, 4);
        return this.e.o(i + this.h);
    }

    public final long s(int i) {
        l(i, 8);
        return this.e.s(i + this.h);
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        l(i, i3);
        this.e.a(i + this.h, vyv, i2, i3);
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        l(i, i3);
        this.e.a(i + this.h, bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        l(i, byteBuffer.remaining());
        this.e.a(i + this.h, byteBuffer);
        return this;
    }

    public final vyv b(int i, int i2) {
        l(i, 1);
        this.e.b(i + this.h, i2);
        return this;
    }

    public final vyv d(int i, int i2) {
        l(i, 2);
        this.e.d(i + this.h, i2);
        return this;
    }

    public final vyv f(int i, int i2) {
        l(i, 4);
        this.e.f(i + this.h, i2);
        return this;
    }

    public final vyv a(int i, long j) {
        l(i, 8);
        this.e.a(i + this.h, j);
        return this;
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        l(i, i3);
        this.e.b(i + this.h, bArr, i2, i3);
        return this;
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        l(i, i3);
        this.e.b(i + this.h, vyv, i2, i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        l(i, byteBuffer.remaining());
        this.e.b(i + this.h, byteBuffer);
        return this;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        l(i, i2);
        return this.e.a(i + this.h, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        l(i, i2);
        return this.e.a(i + this.h, scatteringByteChannel, i2);
    }

    public final int C() {
        return this.e.C() + this.h;
    }

    public final long L() {
        return this.e.L() + ((long) this.h);
    }

    public final vyv s() {
        vyv i = this.e.i(this.h, b());
        i.a(c(), d());
        return i;
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return this.e.f(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return this.e.i(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return this.e.k(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return this.e.n(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return this.e.p(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return this.e.t(i + this.h);
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        this.e.c(i + this.h, i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        this.e.e(i + this.h, i2);
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        this.e.g(i + this.h, i2);
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        this.e.b(i + this.h, j);
    }
}
