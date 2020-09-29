package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* renamed from: wny reason: default package */
final class wny extends wnx {
    private final long e;

    wny(wnc wnc, ByteBuffer byteBuffer) {
        super(wnc, byteBuffer);
        this.e = PlatformDependent.b(byteBuffer);
    }

    public final wnb a(int i, ByteBuffer byteBuffer) {
        A(i);
        if (byteBuffer != null) {
            int min = Math.min(P() - i, byteBuffer.remaining());
            ByteBuffer M = M();
            M.clear().position(i).limit(i + min);
            byteBuffer.put(M);
            return this;
        }
        throw new NullPointerException("dst");
    }

    public final wnb a(int i, wnb wnb, int i2, int i3) {
        k(i, i3);
        if (wnb == null) {
            throw new NullPointerException("dst");
        } else if (i2 < 0 || i2 > wnb.P() - i3) {
            StringBuilder sb = new StringBuilder("dstIndex: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            if (wnb.I()) {
                PlatformDependent.a(this.e + ((long) i), wnb.L() + ((long) i2), (long) i3);
            } else if (wnb.G()) {
                PlatformDependent.a(this.e + ((long) i), wnb.H(), wnb.C() + i2, (long) i3);
            } else {
                wnb.b(i2, (wnb) this, i, i3);
            }
            return this;
        }
    }

    public final wnb a(int i, byte[] bArr, int i2, int i3) {
        k(i, i3);
        if (bArr == null) {
            throw new NullPointerException("dst");
        } else if (i2 < 0 || i2 > bArr.length - i3) {
            throw new IndexOutOfBoundsException(String.format("dstIndex: %d, length: %d (expected: range(0, %d))", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(bArr.length)}));
        } else {
            if (i3 != 0) {
                PlatformDependent.a(this.e + ((long) i), bArr, i2, (long) i3);
            }
            return this;
        }
    }

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wom.a(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wom.b(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wom.d(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wom.f(this.e + ((long) i));
    }
}
