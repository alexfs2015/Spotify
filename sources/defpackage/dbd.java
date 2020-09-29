package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: dbd reason: default package */
public final class dbd implements cwi {
    private final dbp a;
    private final cwu b;
    private final int c;

    public dbd(dbp dbp, cwu cwu, int i) {
        this.a = dbp;
        this.b = cwu;
        this.c = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a2 = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        return das.a(a2, this.b.a(das.a(bArr2, a2, copyOf)));
    }
}
