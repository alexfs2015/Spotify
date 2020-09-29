package defpackage;

/* renamed from: jtv reason: default package */
public final class jtv {
    private static byte[] a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};

    private static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        byte[] bArr2 = bArr;
        if (bArr2.length == 16) {
            int i4 = 0;
            int a2 = a(bArr2, 0);
            int a3 = a(bArr2, 4);
            int a4 = a(bArr2, 8);
            int a5 = a(bArr2, 12);
            byte[] bArr3 = new byte[22];
            while (true) {
                i = 6;
                if (i4 >= 6) {
                    break;
                }
                long j = ((long) a2) & 4294967295L;
                byte[] bArr4 = bArr3;
                int i5 = (int) (j / 62);
                long j2 = (((long) a3) & 4294967295L) | ((j % 62) << 32);
                a3 = (int) (j2 / 62);
                long j3 = (((long) a4) & 4294967295L) | ((j2 % 62) << 32);
                int i6 = (int) (j3 / 62);
                long j4 = ((j3 % 62) << 32) | (((long) a5) & 4294967295L);
                a5 = (int) (j4 / 62);
                bArr4[21 - i4] = a[(int) (j4 % 62)];
                i4++;
                a4 = i6;
                int i7 = i5;
                bArr3 = bArr4;
                a2 = i7;
            }
            byte[] bArr5 = bArr3;
            while (true) {
                i2 = 11;
                if (i >= 11) {
                    break;
                }
                long j5 = ((long) a3) & 4294967295L;
                a3 = (int) (j5 / 62);
                long j6 = ((j5 % 62) << 32) | (((long) a4) & 4294967295L);
                a4 = (int) (j6 / 62);
                long j7 = (((long) a5) & 4294967295L) | ((j6 % 62) << 32);
                int i8 = (int) (j7 / 62);
                bArr5[21 - i] = a[(int) (j7 % 62)];
                i++;
                a5 = i8;
            }
            while (true) {
                if (i2 >= 17) {
                    break;
                }
                long j8 = ((long) a4) & 4294967295L;
                int i9 = (int) (j8 / 62);
                long j9 = ((j8 % 62) << 32) | (((long) a5) & 4294967295L);
                a5 = (int) (j9 / 62);
                bArr5[21 - i2] = a[(int) (j9 % 62)];
                i2++;
                a4 = i9;
            }
            for (i3 = 17; i3 < 22; i3++) {
                bArr5[21 - i3] = a[a5 % 62];
                a5 /= 62;
            }
            return new String(bArr5, fbi.c);
        }
        throw new IllegalArgumentException("Not a 16 byte value");
    }

    private static void a(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) i;
        int i3 = i >>> 8;
        bArr[i2 + 2] = (byte) i3;
        int i4 = i3 >>> 8;
        bArr[i2 + 1] = (byte) i4;
        bArr[i2] = (byte) (i4 >>> 8);
    }

    public static byte[] a(String str) {
        int i;
        String str2 = str;
        if (str.length() == 22) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 22; i2 < i7; i7 = 22) {
                char charAt = str.charAt(i2);
                if (charAt >= '0' && charAt <= '9') {
                    i = charAt - '0';
                } else if (charAt >= 'a' && charAt <= 'z') {
                    i = charAt - 'W';
                } else if (charAt < 'A' || charAt > 'Z') {
                    StringBuilder sb = new StringBuilder("Non base-62 character ");
                    sb.append(charAt);
                    throw new IllegalArgumentException(sb.toString());
                } else {
                    i = charAt - 29;
                }
                long j = ((((long) i3) & 4294967295L) * 62) + ((long) i);
                i3 = (int) j;
                long j2 = ((((long) i4) & 4294967295L) * 62) + (j >>> 32);
                long j3 = ((((long) i5) & 4294967295L) * 62) + (j2 >>> 32);
                i5 = (int) j3;
                i6 = (int) (((((long) i6) & 4294967295L) * 62) + (j3 >>> 32));
                i2++;
                i4 = (int) j2;
            }
            byte[] bArr = new byte[16];
            a(i3, bArr, 12);
            a(i4, bArr, 8);
            a(i5, bArr, 4);
            a(i6, bArr, 0);
            return bArr;
        }
        StringBuilder sb2 = new StringBuilder("base62 id ");
        sb2.append(str);
        sb2.append(" does not have length 22");
        throw new IllegalArgumentException(sb2.toString());
    }
}
