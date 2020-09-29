package defpackage;

import io.netty.util.Recycler;
import io.netty.util.Recycler.b;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: wnt reason: default package */
public class wnt extends wnq<byte[]> {
    private static final Recycler<wnt> m = new Recycler<wnt>() {
        public final /* synthetic */ Object a(b bVar) {
            return new wnt(bVar, 0);
        }
    };

    wnt(b<? extends wnt> bVar, int i) {
        super(bVar, i);
    }

    public static wnt F(int i) {
        wnt wnt = (wnt) m.a();
        wnt.D(i);
        return wnt;
    }

    private int a(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        k(i, i2);
        int E = E(i);
        return gatheringByteChannel.write((ByteBuffer) (z ? M() : ByteBuffer.wrap((byte[]) this.h)).clear().position(E).limit(E + i2));
    }

    public final int C() {
        return this.i;
    }

    public final boolean F() {
        return false;
    }

    public final boolean G() {
        return true;
    }

    public final byte[] H() {
        x();
        return (byte[]) this.h;
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
        int E = E(i);
        try {
            return scatteringByteChannel.read((ByteBuffer) M().clear().position(E).limit(E + i2));
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
        k(i, byteBuffer.remaining());
        byteBuffer.put((byte[]) this.h, E(i), byteBuffer.remaining());
        return this;
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        b(i, i3, i2, wnb.P());
        if (wnb.I()) {
            PlatformDependent.a((byte[]) this.h, E(i), ((long) i2) + wnb.L(), (long) i3);
        } else if (wnb.G()) {
            a(i, wnb.H(), wnb.C() + i2, i3);
        } else {
            wnb.b(i2, (byte[]) this.h, E(i), i3);
        }
        return this;
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        b(i, i3, i2, bArr.length);
        System.arraycopy(this.h, E(i), bArr, i2, i3);
        return this;
    }

    public final wnb b(int i, ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        k(i, remaining);
        byteBuffer.get((byte[]) this.h, E(i), remaining);
        return this;
    }

    public final wnb b(int i, wnb wnb, int i2, int i3) {
        a(i, i3, i2, wnb.P());
        if (wnb.I()) {
            PlatformDependent.a(wnb.L() + ((long) i2), (byte[]) this.h, E(i), (long) i3);
        } else if (wnb.G()) {
            b(i, wnb.H(), wnb.C() + i2, i3);
        } else {
            wnb.a(i2, (byte[]) this.h, E(i), i3);
        }
        return this;
    }

    public final wnb b(int i, byte[] bArr, int i2, int i3) {
        a(i, i3, i2, bArr.length);
        System.arraycopy(bArr, i2, this.h, E(i), i3);
        return this;
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        wnk.a((byte[]) this.h, E(i), j);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ByteBuffer c(Object obj) {
        return ByteBuffer.wrap((byte[]) obj);
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        ((byte[]) this.h)[E(i)] = (byte) i2;
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        wnk.a((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return ((byte[]) this.h)[E(i)];
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        wnk.b((byte[]) this.h, E(i), i2);
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return wnk.a((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public short k(int i) {
        return wnk.b((byte[]) this.h, E(i));
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return wnk.c((byte[]) this.h, E(i));
    }

    public final ByteBuffer n(int i, int i2) {
        k(i, i2);
        int E = E(i);
        return (ByteBuffer) M().clear().position(E).limit(E + i2);
    }

    public final ByteBuffer o(int i, int i2) {
        k(i, i2);
        return ByteBuffer.wrap((byte[]) this.h, E(i), i2).slice();
    }

    /* access modifiers changed from: protected */
    public int p(int i) {
        return wnk.d((byte[]) this.h, E(i));
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return wnk.e((byte[]) this.h, E(i));
    }
}
