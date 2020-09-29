package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: vzn reason: default package */
public class vzn extends vzk<byte[]> {
    private static final Recycler<vzn> m = new Recycler<vzn>() {
        public final /* synthetic */ Object a(b bVar) {
            return new vzn(bVar, 0);
        }
    };

    public final boolean F() {
        return false;
    }

    public final boolean G() {
        return true;
    }

    public final boolean I() {
        return false;
    }

    public final int J() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ByteBuffer c(Object obj) {
        return ByteBuffer.wrap((byte[]) obj);
    }

    public static vzn F(int i) {
        vzn vzn = (vzn) m.a();
        vzn.D(i);
        return vzn;
    }

    vzn(b<? extends vzn> bVar, int i) {
        super(bVar, i);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return ((byte[]) this.h)[E(i)];
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return vze.a((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public short k(int i) {
        return vze.b((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return vze.c((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public int p(int i) {
        return vze.d((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return vze.e((byte[]) this.h, E(i));
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        b(i, i3, i2, vyv.P());
        if (vyv.I()) {
            PlatformDependent.a((byte[]) this.h, E(i), ((long) i2) + vyv.L(), (long) i3);
        } else if (vyv.G()) {
            a(i, vyv.H(), vyv.C() + i2, i3);
        } else {
            vyv.b(i2, (byte[]) this.h, E(i), i3);
        }
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        b(i, i3, i2, bArr.length);
        System.arraycopy(this.h, E(i), bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        k(i, byteBuffer.remaining());
        byteBuffer.put((byte[]) this.h, E(i), byteBuffer.remaining());
        return this;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        return a(i, gatheringByteChannel, i2, false);
    }

    private int a(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        k(i, i2);
        int E = E(i);
        if (z) {
            byteBuffer = M();
        } else {
            byteBuffer = ByteBuffer.wrap((byte[]) this.h);
        }
        return gatheringByteChannel.write((ByteBuffer) byteBuffer.clear().position(E).limit(E + i2));
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        B(i);
        int a = a(this.b, gatheringByteChannel, i, true);
        this.b += a;
        return a;
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        ((byte[]) this.h)[E(i)] = (byte) i2;
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        vze.a((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        vze.b((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        vze.a((byte[]) this.h, E(i), j);
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        a(i, i3, i2, vyv.P());
        if (vyv.I()) {
            PlatformDependent.a(vyv.L() + ((long) i2), (byte[]) this.h, E(i), (long) i3);
        } else if (vyv.G()) {
            b(i, vyv.H(), vyv.C() + i2, i3);
        } else {
            vyv.a(i2, (byte[]) this.h, E(i), i3);
        }
        return this;
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        a(i, i3, i2, bArr.length);
        System.arraycopy(bArr, i2, this.h, E(i), i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        k(i, remaining);
        byteBuffer.get((byte[]) this.h, E(i), remaining);
        return this;
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        k(i, i2);
        int E = E(i);
        try {
            return scatteringByteChannel.read((ByteBuffer) M().clear().position(E).limit(E + i2));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    public final ByteBuffer o(int i, int i2) {
        k(i, i2);
        return ByteBuffer.wrap((byte[]) this.h, E(i), i2).slice();
    }

    public final ByteBuffer n(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return (ByteBuffer) M().clear().position(E).limit(E + i2);
    }

    public final byte[] H() {
        x();
        return (byte[]) this.h;
    }

    public final int C() {
        return this.i;
    }

    public final long L() {
        throw new UnsupportedOperationException();
    }
}
