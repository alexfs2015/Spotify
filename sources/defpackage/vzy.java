package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: vzy reason: default package */
public class vzy extends vyq {
    private final vyw e;
    private ByteBuffer g;
    private ByteBuffer h;
    private int i;
    private boolean j;

    public final boolean F() {
        return true;
    }

    public final boolean G() {
        return false;
    }

    public final boolean I() {
        return false;
    }

    public final int J() {
        return 1;
    }

    public final vyv K() {
        return null;
    }

    protected vzy(vyw vyw, int i2, int i3) {
        super(i3);
        if (vyw == null) {
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
            this.e = vyw;
            a(ByteBuffer.allocateDirect(i2));
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    protected vzy(vyw vyw, ByteBuffer byteBuffer, int i2) {
        super(i2);
        if (vyw == null) {
            throw new NullPointerException("alloc");
        } else if (byteBuffer == null) {
            throw new NullPointerException("initialBuffer");
        } else if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("initialBuffer is not a direct buffer.");
        } else if (!byteBuffer.isReadOnly()) {
            int remaining = byteBuffer.remaining();
            if (remaining <= i2) {
                this.e = vyw;
                this.j = true;
                a(byteBuffer.slice().order(ByteOrder.BIG_ENDIAN));
                b(remaining);
                return;
            }
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(remaining), Integer.valueOf(i2)}));
        } else {
            throw new IllegalArgumentException("initialBuffer is a read-only buffer.");
        }
    }

    private void a(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            if (this.j) {
                this.j = false;
            } else {
                PlatformDependent.a(byteBuffer2);
            }
        }
        this.g = byteBuffer;
        this.h = null;
        this.i = byteBuffer.remaining();
    }

    public final int P() {
        return this.i;
    }

    public final vyv C(int i2) {
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
            ByteBuffer byteBuffer2 = this.g;
            byteBuffer = ByteBuffer.allocateDirect(i2);
            byteBuffer2.position(0).limit(byteBuffer2.capacity());
            byteBuffer.position(0).limit(byteBuffer2.capacity());
            byteBuffer.put(byteBuffer2);
            byteBuffer.clear();
        } else {
            if (i2 < i3) {
                ByteBuffer byteBuffer3 = this.g;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
                if (c < i2) {
                    if (d > i2) {
                        b(i2);
                    } else {
                        i2 = d;
                    }
                    byteBuffer3.position(c).limit(i2);
                    allocateDirect.position(c).limit(i2);
                    allocateDirect.put(byteBuffer3);
                    allocateDirect.clear();
                } else {
                    a(i2, i2);
                }
                byteBuffer = allocateDirect;
            }
            return this;
        }
        a(byteBuffer);
        return this;
    }

    public final vyw D() {
        return this.e;
    }

    public final ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final byte[] H() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final int C() {
        throw new UnsupportedOperationException("direct buffer");
    }

    public final long L() {
        throw new UnsupportedOperationException();
    }

    public final byte e(int i2) {
        x();
        return f(i2);
    }

    /* access modifiers changed from: protected */
    public final byte f(int i2) {
        return this.g.get(i2);
    }

    public final short h(int i2) {
        x();
        return i(i2);
    }

    /* access modifiers changed from: protected */
    public final short i(int i2) {
        return this.g.getShort(i2);
    }

    /* access modifiers changed from: protected */
    public final short k(int i2) {
        return vza.a(this.g.getShort(i2));
    }

    public final int m(int i2) {
        x();
        return n(i2);
    }

    /* access modifiers changed from: protected */
    public final int n(int i2) {
        return this.g.getInt(i2);
    }

    /* access modifiers changed from: protected */
    public final int p(int i2) {
        return vza.a(this.g.getInt(i2));
    }

    public final long s(int i2) {
        x();
        return t(i2);
    }

    /* access modifiers changed from: protected */
    public final long t(int i2) {
        return this.g.getLong(i2);
    }

    public final vyv a(int i2, vyv vyv, int i3, int i4) {
        ByteBuffer[] p;
        b(i2, i4, i3, vyv.P());
        if (vyv.G()) {
            a(i2, vyv.H(), vyv.C() + i3, i4);
        } else if (vyv.J() > 0) {
            for (ByteBuffer byteBuffer : vyv.p(i3, i4)) {
                int remaining = byteBuffer.remaining();
                a(i2, byteBuffer);
                i2 += remaining;
            }
        } else {
            vyv.b(i3, (vyv) this, i2, i4);
        }
        return this;
    }

    public final vyv a(int i2, byte[] bArr, int i3, int i4) {
        a(i2, bArr, i3, i4, false);
        return this;
    }

    private void a(int i2, byte[] bArr, int i3, int i4, boolean z) {
        ByteBuffer byteBuffer;
        b(i2, i4, i3, bArr.length);
        if (z) {
            byteBuffer = M();
        } else {
            byteBuffer = this.g.duplicate();
        }
        byteBuffer.clear().position(i2).limit(i2 + i4);
        byteBuffer.get(bArr, i3, i4);
    }

    public final vyv a(byte[] bArr, int i2, int i3) {
        B(i3);
        a(this.b, bArr, i2, i3, true);
        this.b += i3;
        return this;
    }

    public final vyv a(int i2, ByteBuffer byteBuffer) {
        a(i2, byteBuffer, false);
        return this;
    }

    private void a(int i2, ByteBuffer byteBuffer, boolean z) {
        k(i2, byteBuffer.remaining());
        ByteBuffer duplicate = this.g.duplicate();
        duplicate.clear().position(i2).limit(i2 + byteBuffer.remaining());
        byteBuffer.put(duplicate);
    }

    public final vyv b(int i2, int i3) {
        x();
        c(i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void c(int i2, int i3) {
        this.g.put(i2, (byte) i3);
    }

    public final vyv d(int i2, int i3) {
        x();
        e(i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void e(int i2, int i3) {
        this.g.putShort(i2, (short) i3);
    }

    public final vyv f(int i2, int i3) {
        x();
        g(i2, i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void g(int i2, int i3) {
        this.g.putInt(i2, i3);
    }

    public final vyv a(int i2, long j2) {
        x();
        b(i2, j2);
        return this;
    }

    /* access modifiers changed from: protected */
    public final void b(int i2, long j2) {
        this.g.putLong(i2, j2);
    }

    public final vyv b(int i2, vyv vyv, int i3, int i4) {
        ByteBuffer[] p;
        a(i2, i4, i3, vyv.P());
        if (vyv.J() > 0) {
            for (ByteBuffer byteBuffer : vyv.p(i3, i4)) {
                int remaining = byteBuffer.remaining();
                b(i2, byteBuffer);
                i2 += remaining;
            }
        } else {
            vyv.a(i3, (vyv) this, i2, i4);
        }
        return this;
    }

    public final vyv b(int i2, byte[] bArr, int i3, int i4) {
        a(i2, i4, i3, bArr.length);
        ByteBuffer M = M();
        M.clear().position(i2).limit(i2 + i4);
        M.put(bArr, i3, i4);
        return this;
    }

    public final vyv b(int i2, ByteBuffer byteBuffer) {
        x();
        ByteBuffer M = M();
        if (byteBuffer == M) {
            byteBuffer = byteBuffer.duplicate();
        }
        M.clear().position(i2).limit(i2 + byteBuffer.remaining());
        M.put(byteBuffer);
        return this;
    }

    public final int a(int i2, GatheringByteChannel gatheringByteChannel, int i3) {
        return a(i2, gatheringByteChannel, i3, false);
    }

    private int a(int i2, GatheringByteChannel gatheringByteChannel, int i3, boolean z) {
        ByteBuffer byteBuffer;
        x();
        if (i3 == 0) {
            return 0;
        }
        if (z) {
            byteBuffer = M();
        } else {
            byteBuffer = this.g.duplicate();
        }
        byteBuffer.clear().position(i2).limit(i2 + i3);
        return gatheringByteChannel.write(byteBuffer);
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i2) {
        B(i2);
        int a = a(this.b, gatheringByteChannel, i2, true);
        this.b += a;
        return a;
    }

    public final int a(int i2, ScatteringByteChannel scatteringByteChannel, int i3) {
        x();
        M().clear().position(i2).limit(i2 + i3);
        try {
            return scatteringByteChannel.read(this.h);
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final ByteBuffer[] p(int i2, int i3) {
        return new ByteBuffer[]{o(i2, i3)};
    }

    public final ByteBuffer n(int i2, int i3) {
        k(i2, i3);
        return (ByteBuffer) M().clear().position(i2).limit(i2 + i3);
    }

    private ByteBuffer M() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer duplicate = this.g.duplicate();
        this.h = duplicate;
        return duplicate;
    }

    public final ByteBuffer o(int i2, int i3) {
        k(i2, i3);
        return ((ByteBuffer) this.g.duplicate().position(i2).limit(i2 + i3)).slice();
    }

    /* access modifiers changed from: protected */
    public void aZ_() {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer != null) {
            this.g = null;
            if (!this.j) {
                PlatformDependent.a(byteBuffer);
            }
        }
    }
}
