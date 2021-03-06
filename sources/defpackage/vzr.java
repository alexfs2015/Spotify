package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: vzr reason: default package */
class vzr extends vyq {
    private ByteBuffer e;
    private final vyw g;
    private ByteBuffer h;

    public final boolean I() {
        return false;
    }

    public final int J() {
        return 1;
    }

    public final vyv K() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void aZ_() {
    }

    vzr(vyw vyw, ByteBuffer byteBuffer) {
        super(byteBuffer.remaining());
        if (byteBuffer.isReadOnly()) {
            this.g = vyw;
            this.e = byteBuffer.slice().order(ByteOrder.BIG_ENDIAN);
            b(this.e.limit());
            return;
        }
        StringBuilder sb = new StringBuilder("must be a readonly buffer: ");
        sb.append(wjn.a((Object) byteBuffer));
        throw new IllegalArgumentException(sb.toString());
    }

    public final byte e(int i) {
        x();
        return f(i);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return this.e.get(i);
    }

    public final short h(int i) {
        x();
        return i(i);
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return this.e.getShort(i);
    }

    public final short j(int i) {
        x();
        return k(i);
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return vza.a(this.e.getShort(i));
    }

    public final int m(int i) {
        x();
        return n(i);
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return this.e.getInt(i);
    }

    public final int o(int i) {
        x();
        return p(i);
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return vza.a(this.e.getInt(i));
    }

    public final long s(int i) {
        x();
        return t(i);
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return this.e.getLong(i);
    }

    public vyv a(int i, vyv vyv, int i2, int i3) {
        ByteBuffer[] p;
        b(i, i3, i2, vyv.P());
        if (vyv.G()) {
            a(i, vyv.H(), vyv.C() + i2, i3);
        } else if (vyv.J() > 0) {
            for (ByteBuffer byteBuffer : vyv.p(i2, i3)) {
                int remaining = byteBuffer.remaining();
                a(i, byteBuffer);
                i += remaining;
            }
        } else {
            vyv.b(i2, (vyv) this, i, i3);
        }
        return this;
    }

    public vyv a(int i, byte[] bArr, int i2, int i3) {
        b(i, i3, i2, bArr.length);
        if (i2 < 0 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)}));
        }
        ByteBuffer M = M();
        M.clear().position(i).limit(i + i3);
        M.get(bArr, i2, i3);
        return this;
    }

    public vyv a(int i, ByteBuffer byteBuffer) {
        A(i);
        if (byteBuffer != null) {
            int min = Math.min(b() - i, byteBuffer.remaining());
            ByteBuffer M = M();
            M.clear().position(i).limit(i + min);
            byteBuffer.put(M);
            return this;
        }
        throw new NullPointerException("dst");
    }

    public final vyv b(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    public final vyv d(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    public final vyv f(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        throw new ReadOnlyBufferException();
    }

    public final vyv a(int i, long j) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        throw new ReadOnlyBufferException();
    }

    public final int P() {
        return b();
    }

    public final vyv C(int i) {
        throw new ReadOnlyBufferException();
    }

    public final vyw D() {
        return this.g;
    }

    public final ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final boolean a() {
        return this.e.isReadOnly();
    }

    public final boolean F() {
        return this.e.isDirect();
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        x();
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer M = M();
        M.clear().position(i).limit(i + i2);
        return gatheringByteChannel.write(M);
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        throw new ReadOnlyBufferException();
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        throw new ReadOnlyBufferException();
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        throw new ReadOnlyBufferException();
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        throw new ReadOnlyBufferException();
    }

    /* access modifiers changed from: protected */
    public final ByteBuffer M() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.e.duplicate();
        this.h = duplicate;
        return duplicate;
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    public final ByteBuffer o(int i, int i2) {
        return (ByteBuffer) this.e.duplicate().position(i).limit(i + i2);
    }

    public final ByteBuffer n(int i, int i2) {
        x();
        return (ByteBuffer) M().clear().position(i).limit(i + i2);
    }

    public final boolean G() {
        return this.e.hasArray();
    }

    public final byte[] H() {
        return this.e.array();
    }

    public final int C() {
        return this.e.arrayOffset();
    }

    public final long L() {
        throw new UnsupportedOperationException();
    }
}
