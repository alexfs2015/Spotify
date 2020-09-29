package defpackage;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;

/* renamed from: vzs reason: default package */
final class vzs extends vzr {
    private final long e;

    vzs(vyw vyw, ByteBuffer byteBuffer) {
        super(vyw, byteBuffer);
        this.e = PlatformDependent.b(byteBuffer);
    }

    public final vyv a(int i, vyv vyv, int i2, int i3) {
        k(i, i3);
        if (vyv == null) {
            throw new NullPointerException("dst");
        } else if (i2 < 0 || i2 > vyv.P() - i3) {
            StringBuilder sb = new StringBuilder("dstIndex: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        } else {
            if (vyv.I()) {
                PlatformDependent.a(this.e + ((long) i), vyv.L() + ((long) i2), (long) i3);
            } else if (vyv.G()) {
                PlatformDependent.a(this.e + ((long) i), vyv.H(), vyv.C() + i2, (long) i3);
            } else {
                vyv.b(i2, (vyv) this, i, i3);
            }
            return this;
        }
    }

    public final vyv a(int i, byte[] bArr, int i2, int i3) {
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

    public final vyv a(int i, ByteBuffer byteBuffer) {
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

    /* access modifiers changed from: protected */
    public final byte f(int i) {
        return wag.a(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final short i(int i) {
        return wag.b(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final int n(int i) {
        return wag.d(this.e + ((long) i));
    }

    /* access modifiers changed from: protected */
    public final long t(int i) {
        return wag.f(this.e + ((long) i));
    }
}
