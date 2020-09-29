package defpackage;

/* renamed from: fer reason: default package */
public final class fer extends fed {
    private static final char[] a = {'+'};
    private static final char[] b = "0123456789ABCDEF".toCharArray();
    private final boolean c;
    private final boolean[] d;

    public fer(String str, boolean z) {
        fbp.a(str);
        if (!str.matches(".*[0-9A-Za-z].*")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            String sb2 = sb.toString();
            if (!z || !sb2.contains(" ")) {
                this.c = z;
                this.d = b(sb2);
                return;
            }
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
    }

    private static boolean[] b(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char max : charArray) {
            i = Math.max(max, i);
        }
        boolean[] zArr = new boolean[(i + 1)];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    public final int a(CharSequence charSequence, int i, int i2) {
        fbp.a(charSequence);
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    public final String a(String str) {
        fbp.a(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = this.d;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return a(str, i);
            }
        }
        return str;
    }

    public final char[] a(int i) {
        boolean[] zArr = this.d;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i == 32 && this.c) {
            return a;
        }
        if (i <= 127) {
            char[] cArr = new char[3];
            cArr[0] = '%';
            char[] cArr2 = b;
            cArr[2] = cArr2[i & 15];
            cArr[1] = cArr2[i >>> 4];
            return cArr;
        } else if (i <= 2047) {
            char[] cArr3 = new char[6];
            cArr3[0] = '%';
            cArr3[3] = '%';
            char[] cArr4 = b;
            cArr3[5] = cArr4[i & 15];
            int i2 = i >>> 4;
            cArr3[4] = cArr4[(i2 & 3) | 8];
            int i3 = i2 >>> 2;
            cArr3[2] = cArr4[i3 & 15];
            cArr3[1] = cArr4[(i3 >>> 4) | 12];
            return cArr3;
        } else if (i <= 65535) {
            char[] cArr5 = new char[9];
            cArr5[0] = '%';
            cArr5[1] = 'E';
            cArr5[3] = '%';
            cArr5[6] = '%';
            char[] cArr6 = b;
            cArr5[8] = cArr6[i & 15];
            int i4 = i >>> 4;
            cArr5[7] = cArr6[(i4 & 3) | 8];
            int i5 = i4 >>> 2;
            cArr5[5] = cArr6[i5 & 15];
            int i6 = i5 >>> 4;
            cArr5[4] = cArr6[(i6 & 3) | 8];
            cArr5[2] = cArr6[i6 >>> 2];
            return cArr5;
        } else if (i <= 1114111) {
            char[] cArr7 = new char[12];
            cArr7[0] = '%';
            cArr7[1] = 'F';
            cArr7[3] = '%';
            cArr7[6] = '%';
            cArr7[9] = '%';
            char[] cArr8 = b;
            cArr7[11] = cArr8[i & 15];
            int i7 = i >>> 4;
            cArr7[10] = cArr8[(i7 & 3) | 8];
            int i8 = i7 >>> 2;
            cArr7[8] = cArr8[i8 & 15];
            int i9 = i8 >>> 4;
            cArr7[7] = cArr8[(i9 & 3) | 8];
            int i10 = i9 >>> 2;
            cArr7[5] = cArr8[i10 & 15];
            int i11 = i10 >>> 4;
            cArr7[4] = cArr8[(i11 & 3) | 8];
            cArr7[2] = cArr8[(i11 >>> 2) & 7];
            return cArr7;
        } else {
            StringBuilder sb = new StringBuilder("Invalid unicode character value ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }
}