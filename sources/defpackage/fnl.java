package defpackage;

/* renamed from: fnl reason: default package */
final class fnl {
    static boolean a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    static int a(fnj fnj, boolean z) {
        int i;
        int i2;
        if (z) {
            i = fnj.c;
        } else {
            i = fnj.b;
        }
        if (z) {
            i2 = fnj.b;
        } else {
            i2 = fnj.c;
        }
        byte[][] bArr = fnj.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i4;
            int i6 = 0;
            int i7 = 0;
            byte b = -1;
            while (i6 < i2) {
                byte b2 = z ? bArr[i3][i6] : bArr[i6][i3];
                if (b2 == b) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += (i7 - 5) + 3;
                    }
                    i7 = 1;
                    b = b2;
                }
                i6++;
            }
            if (i7 >= 5) {
                i5 += (i7 - 5) + 3;
            }
            i4 = i5;
            i3++;
        }
        return i4;
    }
}
