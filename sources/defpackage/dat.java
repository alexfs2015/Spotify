package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: dat reason: default package */
final class dat extends dbu {
    dat(byte[] bArr, int i) {
        super(bArr, i);
    }

    private static void a(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = a(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = a(iArr[i2] ^ iArr[i3], 7);
    }

    /* access modifiers changed from: 0000 */
    public final ByteBuffer a(byte[] bArr, int i) {
        int[] iArr = new int[16];
        System.arraycopy(dbu.a, 0, iArr, 0, a.length);
        int[] a = a(ByteBuffer.wrap(this.b.a()));
        int i2 = 4;
        System.arraycopy(a, 0, iArr, 4, a.length);
        iArr[12] = i;
        System.arraycopy(a(ByteBuffer.wrap(bArr)), 0, iArr, 13, 3);
        int[] iArr2 = (int[]) iArr.clone();
        int i3 = 0;
        while (i3 < 10) {
            a(iArr2, 0, i2, 8, 12);
            a(iArr2, 1, 5, 9, 13);
            a(iArr2, 2, 6, 10, 14);
            a(iArr2, 3, 7, 11, 15);
            a(iArr2, 0, 5, 10, 15);
            a(iArr2, 1, 6, 11, 12);
            a(iArr2, 2, 7, 8, 13);
            a(iArr2, 3, 4, 9, 14);
            i3++;
            i2 = 4;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            iArr[i4] = iArr[i4] + iArr2[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(iArr, 0, 16);
        return order;
    }
}
