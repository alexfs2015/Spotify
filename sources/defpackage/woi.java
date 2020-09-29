package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: woi reason: default package */
public class woi extends wmw {
    ByteBuffer e;
    private final wnc g;
    private ByteBuffer h;
    private int i;
    private boolean j;
    private long k;

    protected woi(wnc wnc, int i2, int i3) {
        super(i3);
        if (wnc == null) {
            throw new NullPointerException("alloc");
        } else if (i2 < 0) {
            StringBuilder sb = new StringBuilder("initialCapacity: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder("maxCapacity: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= i3) {
            this.g = wnc;
            a(D(i2), false);
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    protected woi(wnc wnc, ByteBuffer byteBuffer, int i2) {
        this(wnc, byteBuffer, i2, true);
    }

    private woi(wnc wnc, ByteBuffer byteBuffer, int i2, boolean z) {
        super(i2);
        if (wnc == null) {
            throw new NullPointerException("alloc");
        } else if (byteBuffer == null) {
            throw new NullPointerException("initialBuffer");
        } else if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        } else if (!byteBuffer.isReadOnly()) {
            int remaining = byteBuffer.remaining();
            if (remaining <= i2) {
                this.g = wnc;
                this.j = false;
                a(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN), false);
                b(remaining);
                return;
            }
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(remaining), Integer.valueOf(i2)}));
        } else {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
    }

    private ByteBuffer M() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.e.duplicate();
        this.h = duplicate;
        return duplicate;
    }

    private int a(int i2, GatheringByteChannel gatheringByteChannel, int i3, boolean z) {
        x();
        if (i3 == 0) {
            return 0;
        }
        ByteBuffer M = z ? M() : this.e.duplicate();
        M.clear().position(i2).limit(i2 + i3);
        return gatheringByteChannel.write(M);
    }

    public final int C() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public wnb C(int i2) {
        ByteBuffer byteBuffer;
        x();
        if (i2 < 0 || i2 > b()) {
            StringBuilder sb = new StringBuilder("newCapacity: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        int c = c();
        int d = d();
        int i3 = this.i;
        if (i2 > i3) {
            ByteBuffer byteBuffer2 = this.e;
            byteBuffer = D(i2);
            byteBuffer2.position(0).limit(byteBuffer2.capacity());
            byteBuffer.position(0).limit(byteBuffer2.capacity());
            byteBuffer.put(byteBuffer2);
            byteBuffer.clear();
        } else {
            if (i2 < i3) {
                ByteBuffer byteBuffer3 = this.e;
                ByteBuffer D = D(i2);
                if (c < i2) {
                    if (d > i2) {
                        b(i2);
                    } else {
                        i2 = d;
                    }
                    byteBuffer3.position(c).limit(i2);
                    D.position(c).limit(i2);
                    D.put(byteBuffer3);
                    D.clear();
                } else {
                    a(i2, i2);
                }
                byteBuffer = D;
            }
            return this;
        }
        a(byteBuffer, true);
        return this;
    }

    /* access modifiers changed from: protected */
    public ByteBuffer D(int i2) {
        return ByteBuffer.allocateDirect(i2);
    }

    public final wnc D() {
        return this.g;
    }

    public final ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
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

    public final wnb K() {
        return null;
    }

    public final long L() {
        x();
        return this.k;
    }

    public final int P() {
        return this.i;
    }

    public final int a(int i2, GatheringByteChannel gatheringByteChannel, int i3) {
        return a(i2, gatheringByteChannel, i3, false);
    }

    public final int a(int i2, ScatteringByteChannel scatteringByteChannel, int i3) {
        x();
        ByteBuffer M = M();
        M.clear().position(i2).limit(i2 + i3);
        try {
            return scatteringByteChannel.read(M);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i2) {
        B(i2);
        int a = a(this.b, gatheringByteChannel, i2, true);
        this.b += a;
        return a;
    }

    public final wnb a(int i2, ByteBuffer byteBuffer) {
        wom.a((wms) this, this.k + ((long) i2), i2, byteBuffer);
        return this;
    }

    public final wnb a(int i2, wnb wnb, int i3, int i4) {
        wom.a((wms) this, this.k + ((long) i2), i2, wnb, i3, i4);
        return this;
    }

    public final wnb a(int i2, byte[] bArr, int i3, int i4) {
        wom.a((wms) this, this.k + ((long) i2), i2, bArr, i3, i4);
        return this;
    }

    /* access modifiers changed from: protected */
    public void a(ByteBuffer byteBuffer) {
        PlatformDependent.a(byteBuffer);
    }

    /* access modifiers changed from: 0000 */
    public final void a(ByteBuffer byteBuffer, boolean z) {
        if (z) {
            ByteBuffer byteBuffer2 = this.e;
            if (byteBuffer2 != null) {
                if (this.j) {
                    this.j = false;
                } else {
                    a(byteBuffer2);
                }
            }
        }
        this.e = byteBuffer;
        this.k = PlatformDependent.b(byteBuffer);
        this.h = null;
        this.i = byteBuffer.remaining();
    }

    /* access modifiers changed from: protected */
    public void aX_() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            this.e = null;
            if (!this.j) {
                a(byteBuffer);
            }
        }
    }

    public final wnb b(int i2, ByteBuffer byteBuffer) {
        wom.b(this, this.k + ((long) i2), i2, byteBuffer);
        return this;
    }

    public final wnb b(int i2, wnb wnb, int i3, int i4) {
        wom.b((wms) this, this.k + ((long) i2), i2, wnb, i3, i4);
        return this;
    }

    public final wnb b(int i2, byte[] bArr, int i3, int i4) {
        wom.b((wms) this, this.k + ((long) i2), i2, bArr, i3, i4);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i2, long j2) {
        wom.a(this.k + ((long) i2), j2);
    }

    /* access modifiers changed from: protected */
    public final void c(int i2, int i3) {
        wom.a(this.k + ((long) i2), i3);
    }

    /* access modifiers changed from: protected */
    public final void e(int i2, int i3) {
        wom.b(this.k + ((long) i2), i3);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i2) {
        return wom.a(this.k + ((long) i2));
    }

    /* access modifiers changed from: protected */
    public final void g(int i2, int i3) {
        wom.c(this.k + ((long) i2), i3);
    }

    public final wnb h(int i2, int i3) {
        wom.a((wms) this, this.k + ((long) i2), i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final short i(int i2) {
        return wom.b(this.k + ((long) i2));
    }

    /* access modifiers changed from: protected */
    public final short k(int i2) {
        return wom.c(this.k + ((long) i2));
    }

    /* access modifiers changed from: protected */
    public final wob m() {
        return PlatformDependent.f() ? new won(this) : super.m();
    }

    /* access modifiers changed from: protected */
    public final int n(int i2) {
        return wom.d(this.k + ((long) i2));
    }

    public final ByteBuffer n(int i2, int i3) {
        k(i2, i3);
        return (ByteBuffer) M().clear().position(i2).limit(i2 + i3);
    }

    public final ByteBuffer o(int i2, int i3) {
        k(i2, i3);
        return ((ByteBuffer) this.e.duplicate().position(i2).limit(i2 + i3)).slice();
    }

    /* access modifiers changed from: protected */
    public final int p(int i2) {
        return wom.e(this.k + ((long) i2));
    }

    public final ByteBuffer[] p(int i2, int i3) {
        return new ByteBuffer[]{o(i2, i3)};
    }

    /* access modifiers changed from: protected */
    public final long t(int i2) {
        return wom.f(this.k + ((long) i2));
    }
}
