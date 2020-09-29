package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;

/* renamed from: waa reason: default package */
public class waa extends vyq {
    byte[] e;
    private final vyw g;
    private ByteBuffer h;

    public final int C() {
        return 0;
    }

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

    public final vyv K() {
        return null;
    }

    protected waa(vyw vyw, int i, int i2) {
        this(vyw, new byte[i], 0, 0, i2);
    }

    protected waa(vyw vyw, byte[] bArr, int i) {
        this(vyw, bArr, 0, bArr.length, i);
    }

    private waa(vyw vyw, byte[] bArr, int i, int i2, int i3) {
        super(i3);
        if (vyw == null) {
            throw new NullPointerException("alloc");
        } else if (bArr == null) {
            throw new NullPointerException("initialArray");
        } else if (bArr.length <= i3) {
            this.g = vyw;
            c(bArr);
            a(0, i2);
        } else {
            throw new IllegalArgumentException(String.format("initialCapacity(%d) > maxCapacity(%d)", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i3)}));
        }
    }

    private void c(byte[] bArr) {
        this.e = bArr;
        this.h = null;
    }

    public final vyw D() {
        return this.g;
    }

    public final ByteOrder E() {
        return ByteOrder.BIG_ENDIAN;
    }

    public final int P() {
        x();
        return this.e.length;
    }

    public final vyv C(int i) {
        byte[] bArr;
        x();
        if (i < 0 || i > b()) {
            StringBuilder sb = new StringBuilder("newCapacity: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        if (i > length) {
            bArr = new byte[i];
            System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        } else {
            if (i < length) {
                byte[] bArr3 = new byte[i];
                int c = c();
                if (c < i) {
                    int d = d();
                    if (d > i) {
                        b(i);
                    } else {
                        i = d;
                    }
                    System.arraycopy(this.e, c, bArr3, c, i - c);
                } else {
                    a(i, i);
                }
                bArr = bArr3;
            }
            return this;
        }
        c(bArr);
        return this;
    }

    public final byte[] H() {
        x();
        return this.e;
    }

    public final long L() {
        throw new UnsupportedOperationException();
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        b(i, i3, i2, vyv.P());
        if (vyv.I()) {
            byte[] bArr = this.e;
            long L = ((long) i2) + vyv.L();
            PlatformDependent.a(bArr, i, L, (long) i3);
        } else if (vyv.G()) {
            a(i, vyv.H(), vyv.C() + i2, i3);
        } else {
            vyv.b(i2, this.e, i, i3);
        }
        return this;
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
        b(i, i3, i2, bArr.length);
        System.arraycopy(this.e, i, bArr, i2, i3);
        return this;
    }

    public final vyv a(int i, ByteBuffer byteBuffer) {
        k(i, byteBuffer.remaining());
        byteBuffer.put(this.e, i, byteBuffer.remaining());
        return this;
    }

    public final int a(int i, GatheringByteChannel gatheringByteChannel, int i2) {
        x();
        return a(i, gatheringByteChannel, i2, false);
    }

    private int a(int i, GatheringByteChannel gatheringByteChannel, int i2, boolean z) {
        ByteBuffer byteBuffer;
        x();
        if (z) {
            byteBuffer = M();
        } else {
            byteBuffer = ByteBuffer.wrap(this.e);
        }
        return gatheringByteChannel.write((ByteBuffer) byteBuffer.clear().position(i).limit(i + i2));
    }

    public final int a(GatheringByteChannel gatheringByteChannel, int i) {
        B(i);
        int a = a(this.b, gatheringByteChannel, i, true);
        this.b += a;
        return a;
    }

    public final vyv b(int i, vyv vyv, int i2, int i3) {
        a(i, i3, i2, vyv.P());
        if (vyv.I()) {
            PlatformDependent.a(vyv.L() + ((long) i2), this.e, i, (long) i3);
        } else if (vyv.G()) {
            b(i, vyv.H(), vyv.C() + i2, i3);
        } else {
            vyv.a(i2, this.e, i, i3);
        }
        return this;
    }

    public final vyv b(int i, byte[] bArr, int i2, int i3) {
        a(i, i3, i2, bArr.length);
        System.arraycopy(bArr, i2, this.e, i, i3);
        return this;
    }

    public final vyv b(int i, ByteBuffer byteBuffer) {
        x();
        byteBuffer.get(this.e, i, byteBuffer.remaining());
        return this;
    }

    public final int a(int i, ScatteringByteChannel scatteringByteChannel, int i2) {
        x();
        try {
            return scatteringByteChannel.read((ByteBuffer) M().clear().position(i).limit(i + i2));
        } catch (ClosedChannelException unused) {
            return -1;
        }
    }

    public final ByteBuffer o(int i, int i2) {
        x();
        return ByteBuffer.wrap(this.e, i, i2).slice();
    }

    public final ByteBuffer[] p(int i, int i2) {
        return new ByteBuffer[]{o(i, i2)};
    }

    public final ByteBuffer n(int i, int i2) {
        k(i, i2);
        return (ByteBuffer) M().clear().position(i).limit(i + i2);
    }

    public byte e(int i) {
        x();
        return f(i);
    }

    /* access modifiers changed from: protected */
    public byte f(int i) {
        return this.e[i];
    }

    public short h(int i) {
        x();
        return i(i);
    }

    /* access modifiers changed from: protected */
    public short i(int i) {
        return vze.a(this.e, i);
    }

    public short j(int i) {
        x();
        return k(i);
    }

    /* access modifiers changed from: protected */
    public short k(int i) {
        return vze.b(this.e, i);
    }

    public int m(int i) {
        x();
        return n(i);
    }

    /* access modifiers changed from: protected */
    public int n(int i) {
        return vze.c(this.e, i);
    }

    public int o(int i) {
        x();
        return p(i);
    }

    /* access modifiers changed from: protected */
    public int p(int i) {
        return vze.d(this.e, i);
    }

    public long s(int i) {
        x();
        return t(i);
    }

    /* access modifiers changed from: protected */
    public long t(int i) {
        return vze.e(this.e, i);
    }

    public vyv b(int i, int i2) {
        x();
        c(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void c(int i, int i2) {
        this.e[i] = (byte) i2;
    }

    public vyv d(int i, int i2) {
        x();
        e(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void e(int i, int i2) {
        vze.a(this.e, i, i2);
    }

    public vyv f(int i, int i2) {
        x();
        g(i, i2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void g(int i, int i2) {
        vze.b(this.e, i, i2);
    }

    public vyv a(int i, long j) {
        x();
        b(i, j);
        return this;
    }

    /* access modifiers changed from: protected */
    public void b(int i, long j) {
        vze.a(this.e, i, j);
    }

    private ByteBuffer M() {
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer wrap = ByteBuffer.wrap(this.e);
        this.h = wrap;
        return wrap;
    }

    /* access modifiers changed from: protected */
    public final void aZ_() {
        this.e = null;
    }
}
