package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: vzp reason: default package */
public final class vzp extends vzk<ByteBuffer> {
    private static final Recycler<vzp> m = new Recycler<vzp>() {
        public final /* synthetic */ Object a(b bVar) {
            return new vzp(bVar, 0, 0);
        }
    };
    private long n;

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return false;
    }

    public final boolean I() {
        return true;
    }

    public final int J() {
        return 1;
    }

    /* synthetic */ vzp(b bVar, int i, byte b) {
        this(bVar, 0);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ByteBuffer c(Object obj) {
        return ((ByteBuffer) obj).duplicate();
    }

    public static vzp F(int i) {
        vzp vzp = (vzp) m.a();
        vzp.D(i);
        return vzp;
    }

    private vzp(b<vzp> bVar, int i) {
        super(bVar, i);
    }

    /* access modifiers changed from: 0000 */
    public final void a(vzf<ByteBuffer> vzf, long j, int i, int i2, int i3, vzj vzj) {
        super.a(vzf, j, i, i2, i3, vzj);
        N();
    }

    /* access modifiers changed from: 0000 */
    public final void a(vzf<ByteBuffer> vzf, int i) {
        super.a(vzf, i);
        N();
    }

    private void N() {
        this.n = PlatformDependent.b((ByteBuffer) this.h) + ((long) this.i);
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return a(i, gatheringByteChannel, i2, false);
    }

    private int a(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        k(i, i2);
        if (i2 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = M();
        } else {
            byteBuffer = ((ByteBuffer) this.h).duplicate();
        }
        int E = E(i);
        byteBuffer.clear().position(E).limit(E + i2);
        return gatheringByteChannel.write(byteBuffer);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        B(i);
        int a = a(this.b, gatheringByteChannel, i, true);
        this.b += a;
        return a;
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

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    public final ByteBuffer o(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return ((ByteBuffer) ((ByteBuffer) this.h).duplicate().position(E).limit(E + i2)).slice();
    }

    public final ByteBuffer n(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return (ByteBuffer) M().clear().position(E).limit(E + i2);
    }

    public final byte[] H() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final int C() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final long L() {
        x();
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final vzv m() {
        if (PlatformDependent.f()) {
            return new wah(this);
        }
        return super.m();
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wag.a(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wag.b(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wag.c(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wag.d(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final int p(int i) {
        return wag.e(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wag.f(this.n + ((long) i));
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        wag.a((vym) this, this.n + ((long) i), i, vyv, i2, i3);
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        wag.a((vym) this, this.n + ((long) i), i, bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        wag.a((vym) this, this.n + ((long) i), i, byteBuffer);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wag.a(this.n + ((long) i), (int) (byte) i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wag.b(this.n + ((long) i), i2);
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wag.c(this.n + ((long) i), i2);
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wag.a(this.n + ((long) i), j);
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        wag.b((vym) this, this.n + ((long) i), i, vyv, i2, i3);
        return this;
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        wag.b((vym) this, this.n + ((long) i), i, bArr, i2, i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        wag.b(this, this.n + ((long) i), i, byteBuffer);
        return this;
    }

    public final vyv h(int i, int i2) {
        wag.a((vym) this, this.n + ((long) i), i, i2);
        return this;
    }
}
