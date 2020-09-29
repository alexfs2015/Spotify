package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: wnv reason: default package */
public final class wnv extends wnq<ByteBuffer> {
    private static final Recycler<wnv> m = new Recycler<wnv>() {
        public final /* synthetic */ Object a(b bVar) {
            return new wnv(bVar, 0, 0);
        }
    };
    private long n;

    private wnv(b<wnv> bVar, int i) {
        super(bVar, i);
    }

    /* synthetic */ wnv(b bVar, int i, byte b) {
        this(bVar, 0);
    }

    public static wnv F(int i) {
        wnv wnv = (wnv) m.a();
        wnv.D(i);
        return wnv;
    }

    private void N() {
        this.n = PlatformDependent.b((ByteBuffer) this.h) + ((long) this.i);
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
        return true;
    }

    public final int J() {
        return 1;
    }

    public final long L() {
        x();
        return this.n;
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
        wom.a((wms) this, this.n + ((long) i), i, byteBuffer);
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        wom.a((wms) this, this.n + ((long) i), i, wnb, i2, i3);
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        wom.a((wms) this, this.n + ((long) i), i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: 0000 */
    public final void a(wnl<ByteBuffer> wnl, int i) {
        super.a(wnl, i);
        N();
    }

    /* access modifiers changed from: 0000 */
    public final void a(wnl<ByteBuffer> wnl, long j, int i, int i2, int i3, wnp wnp) {
        super.a(wnl, j, i, i2, i3, wnp);
        N();
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        wom.b(this, this.n + ((long) i), i, byteBuffer);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        wom.b((wms) this, this.n + ((long) i), i, wnb, i2, i3);
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        wom.b((wms) this, this.n + ((long) i), i, bArr, i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i, long j) {
        wom.a(this.n + ((long) i), j);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ByteBuffer c(Object obj) {
        return ((ByteBuffer) obj).duplicate();
    }

    /* access modifiers changed from: protected */
    public final void c(int i, int i2) {
        wom.a(this.n + ((long) i), (int) (byte) i2);
    }

    /* access modifiers changed from: protected */
    public final void e(int i, int i2) {
        wom.b(this.n + ((long) i), i2);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wom.a(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final void g(int i, int i2) {
        wom.c(this.n + ((long) i), i2);
    }

    public final wnb h(int i, int i2) {
        wom.a((wms) this, this.n + ((long) i), i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wom.b(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short k(int i) {
        return wom.c(this.n + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final wob m() {
        return PlatformDependent.f() ? new won(this) : super.m();
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wom.d(this.n + ((long) i));
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
        return wom.e(this.n + ((long) i));
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wom.f(this.n + ((long) i));
    }
}
