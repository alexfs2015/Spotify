package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: wns reason: default package */
public final class wns extends wnq<ByteBuffer> {
    private static final Recycler<wns> m = new Recycler<wns>() {
        public final /* synthetic */ Object a(b bVar) {
            return new wns(bVar, 0, 0);
        }
    };

    private wns(b<wns> bVar, int i) {
        super(bVar, i);
    }

    /* synthetic */ wns(b bVar, int i, byte b) {
        this(bVar, 0);
    }

    public static wns F(int i) {
        wns wns = (wns) m.a();
        wns.D(i);
        return wns;
    }

    private int a(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        k(i, i2);
        if (i2 == 0) {
            return 0;
        }
        ByteBuffer M = z ? M() : ((ByteBuffer) this.h).duplicate();
        int E = E(i);
        M.clear().position(E).limit(E + i2);
        return gatheringByteChannel.write(M);
    }

    private void a(int i, ByteBuffer byteBuffer, boolean z) {
        k(i, byteBuffer.remaining());
        ByteBuffer duplicate = ((ByteBuffer) this.h).duplicate();
        int E = E(i);
        duplicate.clear().position(E).limit(E + byteBuffer.remaining());
        byteBuffer.put(duplicate);
    }

    private void a(int i, byte[] bArr, int i2, int i3, boolean z) {
        b(i, i3, i2, bArr.length);
        ByteBuffer M = z ? M() : ((ByteBuffer) this.h).duplicate();
        int E = E(i);
        M.clear().position(E).limit(E + i3);
        M.get(bArr, i2, i3);
    }

    public final int C() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return false;
    }

    public final byte[] H() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final boolean I() {
        return false;
    }

    public final int J() {
        return 1;
    }

    public final long L() {
        throw new UnsupportedOperationException();
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return a(i, gatheringByteChannel, i2, false);
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        k(i, i2);
        ByteBuffer M = M();
        int E = E(i);
        M.clear().position(E).limit(E + i2);
        try {
            return scatteringByteChannel.read(M);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        B(i);
        int a = a(this.b, gatheringByteChannel, i, true);
        this.b += a;
        return a;
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        a(i, byteBuffer, false);
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        ByteBuffer[] p;
        b(i, i3, i2, wnb.P());
        if (wnb.G()) {
            a(i, wnb.H(), wnb.C() + i2, i3);
        } else if (wnb.J() > 0) {
            for (ByteBuffer byteBuffer : wnb.p(i2, i3)) {
                int remaining = byteBuffer.remaining();
                a(i, byteBuffer);
                i += remaining;
            }
        } else {
            wnb.b(i2, (wnb) this, i, i3);
        }
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        a(i, bArr, i2, i3, false);
        return this;
    }

    public final wnb a(byte[] bArr, int i, int i2) {
        B(i2);
        a(this.b, bArr, i, i2, true);
        this.b += i2;
        return this;
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        k(i, byteBuffer.remaining());
        ByteBuffer M = M();
        if (byteBuffer == M) {
            byteBuffer = byteBuffer.duplicate();
        }
        int E = E(i);
        M.clear().position(E).limit(E + byteBuffer.remaining());
        M.put(byteBuffer);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        ByteBuffer[] p;
        a(i, i3, i2, wnb.P());
        if (wnb.G()) {
            b(i, wnb.H(), wnb.C() + i2, i3);
        } else if (wnb.J() > 0) {
            for (ByteBuffer byteBuffer : wnb.p(i2, i3)) {
                int remaining = byteBuffer.remaining();
                b(i, byteBuffer);
                i += remaining;
            }
        } else {
            wnb.a(i2, (wnb) this, i, i3);
        }
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        a(i, i3, i2, bArr.length);
        ByteBuffer M = M();
        int E = E(i);
        M.clear().position(E).limit(E + i3);
        M.put(bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        ((ByteBuffer) this.h).putLong(E(i), j);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ByteBuffer c(Object obj) {
        return ((ByteBuffer) obj).duplicate();
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        ((ByteBuffer) this.h).put(E(i), (byte) i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        ((ByteBuffer) this.h).putShort(E(i), (short) i2);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return ((ByteBuffer) this.h).get(E(i));
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        ((ByteBuffer) this.h).putInt(E(i), i2);
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return ((ByteBuffer) this.h).getShort(E(i));
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wng.a(i(i));
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return ((ByteBuffer) this.h).getInt(E(i));
    }

    public final ByteBuffer n(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return (ByteBuffer) M().clear().position(E).limit(E + i2);
    }

    public final ByteBuffer o(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return ((ByteBuffer) ((ByteBuffer) this.h).duplicate().position(E).limit(E + i2)).slice();
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wng.a(n(i));
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return ((ByteBuffer) this.h).getLong(E(i));
    }
}
