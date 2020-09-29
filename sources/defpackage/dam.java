package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: dam reason: default package */
public final class dam implements cvr {
    private final day a;
    private final cwd b;
    private final int c;

    public dam(day day, cwd cwd, int i) {
        this.a = day;
        this.b = cwd;
        this.c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return dab.a(a2, this.b.a(dab.a(bArr2, a2, copyOf)));
    }
}
