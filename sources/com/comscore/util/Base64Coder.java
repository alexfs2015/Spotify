package com.comscore.util;

public class Base64Coder {
    private static char[] a = new char[64];
    private static byte[] b = new byte[128];

    static {
        char c = 'A';
        int i = 0;
        while (c <= 'Z') {
            int i2 = i + 1;
            a[i] = c;
            c = (char) (c + 1);
            i = i2;
        }
        char c2 = 'a';
        while (c2 <= 'z') {
            int i3 = i + 1;
            a[i] = c2;
            c2 = (char) (c2 + 1);
            i = i3;
        }
        char c3 = '0';
        while (c3 <= '9') {
            int i4 = i + 1;
            a[i] = c3;
            c3 = (char) (c3 + 1);
            i = i4;
        }
        char[] cArr = a;
        int i5 = i + 1;
        cArr[i] = '+';
        cArr[i5] = '/';
        int i6 = 0;
        while (true) {
            byte[] bArr = b;
            if (i6 >= bArr.length) {
                break;
            }
            bArr[i6] = -1;
            i6++;
        }
        for (int i7 = 0; i7 < 64; i7++) {
            b[a[i7]] = (byte) i7;
        }
    }

    private Base64Coder() {
    }

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static byte[] decode(char[] cArr) {
        int i;
        char c;
        int i2;
        int length = cArr.length;
        if (length % 4 == 0) {
            while (length > 0 && cArr[length - 1] == '=') {
                length--;
            }
            int i3 = (length * 3) / 4;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 1;
                char c2 = cArr[i4];
                int i7 = i6 + 1;
                char c3 = cArr[i6];
                char c4 = 'A';
                if (i7 < length) {
                    i = i7 + 1;
                    c = cArr[i7];
                } else {
                    i = i7;
                    c = 'A';
                }
                if (i < length) {
                    int i8 = i + 1;
                    char c5 = cArr[i];
                    i = i8;
                    c4 = c5;
                }
                String str = "Illegal character in Base64 encoded data.";
                if (c2 > 127 || c3 > 127 || c > 127 || c4 > 127) {
                    throw new IllegalArgumentException(str);
                }
                byte[] bArr2 = b;
                byte b2 = bArr2[c2];
                byte b3 = bArr2[c3];
                byte b4 = bArr2[c];
                byte b5 = bArr2[c4];
                if (b2 < 0 || b3 < 0 || b4 < 0 || b5 < 0) {
                    throw new IllegalArgumentException(str);
                }
                int i9 = (b2 << 2) | (b3 >>> 4);
                int i10 = ((b3 & 15) << 4) | (b4 >>> 2);
                byte b6 = ((b4 & 3) << 6) | b5;
                int i11 = i5 + 1;
                bArr[i5] = (byte) i9;
                if (i11 < i3) {
                    i2 = i11 + 1;
                    bArr[i11] = (byte) i10;
                } else {
                    i2 = i11;
                }
                if (i2 < i3) {
                    i5 = i2 + 1;
                    bArr[i2] = (byte) b6;
                } else {
                    i5 = i2;
                }
                i4 = i;
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
    }

    public static String decodeString(String str) {
        return new String(decode(str));
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, bArr.length);
    }

    public static char[] encode(byte[] bArr, int i) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int i4 = ((i << 2) + 2) / 3;
        char[] cArr = new char[(((i + 2) / 3) << 2)];
        int i5 = 0;
        int i6 = 0;
        while (i5 < i) {
            int i7 = i5 + 1;
            byte b4 = bArr[i5] & 255;
            if (i7 < i) {
                i2 = i7 + 1;
                b2 = bArr[i7] & 255;
            } else {
                i2 = i7;
                b2 = 0;
            }
            if (i2 < i) {
                i3 = i2 + 1;
                b3 = bArr[i2] & 255;
            } else {
                i3 = i2;
                b3 = 0;
            }
            int i8 = b4 >>> 2;
            int i9 = ((b4 & 3) << 4) | (b2 >>> 4);
            int i10 = ((b2 & 15) << 2) | (b3 >>> 6);
            byte b5 = b3 & 63;
            int i11 = i6 + 1;
            char[] cArr2 = a;
            cArr[i6] = cArr2[i8];
            int i12 = i11 + 1;
            cArr[i11] = cArr2[i9];
            char c = '=';
            cArr[i12] = i12 < i4 ? cArr2[i10] : '=';
            int i13 = i12 + 1;
            if (i13 < i4) {
                c = a[b5];
            }
            cArr[i13] = c;
            i6 = i13 + 1;
            i5 = i3;
        }
        return cArr;
    }

    public static String encodeString(String str) {
        return new String(encode(str.getBytes()));
    }
}
