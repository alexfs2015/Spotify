package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: wmx reason: default package */
abstract class wmx extends wmu {
    final int e;
    private final wnb f;

    wmx(wnb wnb, int i, int i2) {
        super(i2);
        a(i, i2, wnb);
        if (wnb instanceof wmx) {
            wmx wmx = (wmx) wnb;
            this.f = wmx.f;
            this.e = wmx.e + i;
        } else if (wnb instanceof wni) {
            this.f = wnb.K();
            this.e = i;
        } else {
            this.f = wnb;
            this.e = i;
        }
        b(i2);
    }

    static void a(int i, int i2, wnb wnb) {
        if (wxm.a(i, i2, wnb.P())) {
            StringBuilder sb = new StringBuilder();
            sb.append(wnb);
            sb.append(".slice(");
            sb.append(i);
            sb.append(", ");
            sb.append(i2);
            sb.append(')');
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public final int C() {
        return K().C() + this.e;
    }

    public final wnb C(int i) {
        throw new UnsupportedOperationException("sliced buffer");
    }

    public final wnc D() {
        return K().D();
    }

    @Deprecated
    public final ByteOrder E() {
        return K().E();
    }

    public final boolean F() {
        return K().F();
    }

    public final boolean G() {
        return K().G();
    }

    public final byte[] H() {
        return K().H();
    }

    public final boolean I() {
        return K().I();
    }

    public final int J() {
        return K().J();
    }

    public wnb K() {
        return this.f;
    }

    public final long L() {
        return K().L() + ((long) this.e);
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        l(i, i2);
        return K().a(i + this.e, gatheringByteChannel, i2);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        l(i, i2);
        return K().a(i + this.e, scatteringByteChannel, i2);
    }

    public final wnb a(int i, long j) {
        l(i, 8);
        K().a(i + this.e, j);
        return this;
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        l(i, byteBuffer.remaining());
        K().a(i + this.e, byteBuffer);
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        l(i, i3);
        K().a(i + this.e, wnb, i2, i3);
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        l(i, i3);
        K().a(i + this.e, bArr, i2, i3);
        return this;
    }

    public final wnb b(int i, int i2) {
        l(i, 1);
        K().b(i + this.e, i2);
        return this;
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        l(i, byteBuffer.remaining());
        K().b(i + this.e, byteBuffer);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        l(i, i3);
        K().b(i + this.e, wnb, i2, i3);
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        l(i, i3);
        K().b(i + this.e, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        K().a(i + this.e, j);
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        K().b(i + this.e, i2);
    }

    public final wnb d(int i, int i2) {
        l(i, 2);
        K().d(i + this.e, i2);
        return this;
    }

    public final byte e(int i) {
        l(i, 1);
        return K().e(i + this.e);
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        K().d(i + this.e, i2);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return K().e(i + this.e);
    }

    public final wnb f(int i, int i2) {
        l(i, 4);
        K().f(i + this.e, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        K().f(i + this.e, i2);
    }

    public final short h(int i) {
        l(i, 2);
        return K().h(i + this.e);
    }

    public final wnb i(int i, int i2) {
        l(i, i2);
        return K().i(i + this.e, i2);
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return K().h(i + this.e);
    }

    public final short j(int i) {
        l(i, 2);
        return K().j(i + this.e);
    }

    /* access modifiers changed from: protected */
    public short k(int i) {
        return K().j(i + this.e);
    }

    public final int m(int i) {
        l(i, 4);
        return K().m(i + this.e);
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return K().m(i + this.e);
    }

    public final int o(int i) {
        l(i, 4);
        return K().o(i + this.e);
    }

    public final ByteBuffer o(int i, int i2) {
        l(i, i2);
        return K().o(i + this.e, i2);
    }

    /* access modifiers changed from: protected */
    public int p(int i) {
        return K().o(i + this.e);
    }

    public final ByteBuffer[] p(int i, int i2) {
        l(i, i2);
        return K().p(i + this.e, i2);
    }

    public final long s(int i) {
        l(i, 8);
        return K().s(i + this.e);
    }

    public final wnb s() {
        wnb i = K().i(this.e, P());
        i.a(c(), d());
        return i;
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return K().s(i + this.e);
    }
}
