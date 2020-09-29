package defpackage;

/* renamed from: avs reason: default package */
public final class avs {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long a(bdj bdj, int i, int i2) {
        bdj.c(i);
        if (bdj.b() < 5) {
            return -9223372036854775807L;
        }
        int i3 = bdj.i();
        if ((8388608 & i3) != 0 || ((2096896 & i3) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((i3 & 32) != 0) && bdj.c() >= 7 && bdj.b() >= 7) {
            if ((bdj.c() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                bdj.a(bArr, 0, 6);
                return a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
