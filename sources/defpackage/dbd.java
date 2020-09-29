package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: dbd reason: default package */
abstract class dbd implements day {
    static final int[] a = a(ByteBuffer.wrap(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107}));
    final dax b;
    private final int c;

    dbd(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.b = dax.a(bArr);
            this.c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    static int[] a(ByteBuffer byteBuffer) {
        IntBuffer asIntBuffer = byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    public abstract ByteBuffer a(byte[] bArr, int i);

    /* access modifiers changed from: 0000 */
    public final void a(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - 12 >= bArr.length) {
            byte[] a2 = dbb.a(12);
            byteBuffer.put(a2);
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int remaining = wrap.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer a3 = a(a2, this.c + i2);
                if (i2 == i - 1) {
                    dab.a(byteBuffer, wrap, a3, remaining % 64);
                } else {
                    dab.a(byteBuffer, wrap, a3, 64);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] a(byte[] bArr) {
        if (bArr.length <= 2147483635) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12);
            a(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
