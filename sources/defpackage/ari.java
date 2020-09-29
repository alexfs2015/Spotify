package defpackage;

import com.comscore.streaming.ContentType;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: ari reason: default package */
public final class ari {
    private static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] c = {64, ContentType.LONG_FORM_ON_DEMAND, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    public static int a(byte[] bArr) {
        int i;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b4 = bArr[7];
            } else if (b5 != 31) {
                i = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b4 = bArr[6];
            }
            b3 = b4 & 60;
            return (((b3 >> 2) | i2) + 1) << 5;
        }
        i = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        b3 = b2 & 252;
        return (((b3 >> 2) | i2) + 1) << 5;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i;
        byte b2;
        byte b3;
        int i2;
        byte b4;
        int position = byteBuffer.position();
        byte b5 = byteBuffer.get(position);
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b4 = byteBuffer.get(position + 7);
            } else if (b5 != 31) {
                i = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b4 = byteBuffer.get(position + 6);
            }
            b3 = b4 & 60;
            return (((b3 >> 2) | i2) + 1) << 5;
        }
        i = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        b3 = b2 & 252;
        return (((b3 >> 2) | i2) + 1) << 5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004f
            r2 = -1
            if (r1 == r2) goto L_0x0037
            r2 = 31
            if (r1 == r2) goto L_0x0026
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0020:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L_0x005e
        L_0x0026:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0047
        L_0x0037:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0047:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005e
        L_0x004f:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0020
        L_0x005e:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 << r6
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ari.b(byte[]):int");
    }

    public static aqe a(byte[] bArr, String str, String str2, asc asc) {
        bdi bdi;
        int i;
        byte[] bArr2 = bArr;
        int i2 = 1;
        if (bArr2[0] == Byte.MAX_VALUE) {
            bdi = new bdi(bArr2);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
            if (copyOf[0] == -2 || copyOf[0] == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            bdi = new bdi(copyOf);
            if (copyOf[0] == 31) {
                bdi bdi2 = new bdi(copyOf);
                while (bdi2.a() >= 16) {
                    bdi2.b(2);
                    int c2 = bdi2.c(14) & 16383;
                    int min = Math.min(8 - bdi.c, 14);
                    int i5 = (8 - bdi.c) - min;
                    bdi.a[bdi.b] = (byte) (bdi.a[bdi.b] & ((65280 >> bdi.c) | ((1 << i5) - 1)));
                    int i6 = 14 - min;
                    bdi.a[bdi.b] = (byte) (((c2 >>> i6) << i5) | bdi.a[bdi.b]);
                    int i7 = bdi.b + 1;
                    while (i6 > 8) {
                        int i8 = i7 + 1;
                        bdi.a[i7] = (byte) (c2 >>> (i6 - 8));
                        i6 -= 8;
                        i7 = i8;
                    }
                    int i9 = 8 - i6;
                    byte[] bArr3 = bdi.a;
                    bArr3[i7] = (byte) (bArr3[i7] & ((1 << i9) - 1));
                    int i10 = ((1 << i6) - 1) & c2;
                    byte[] bArr4 = bdi.a;
                    bArr4[i7] = (byte) ((i10 << i9) | bArr4[i7]);
                    bdi.b(14);
                    bdi.g();
                }
            }
            bdi.a(copyOf, copyOf.length);
        }
        bdi.b(60);
        int i11 = a[bdi.c(6)];
        int i12 = b[bdi.c(4)];
        int c3 = bdi.c(5);
        if (c3 >= 29) {
            i = -1;
        } else {
            i = (c[c3] * 1000) / 2;
        }
        bdi.b(10);
        if (bdi.c(2) <= 0) {
            i2 = 0;
        }
        return aqe.a(str, "audio/vnd.dts", (String) null, i, -1, i11 + i2, i12, null, (asc) null, 0, str2);
    }
}
