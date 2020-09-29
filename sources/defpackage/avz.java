package defpackage;

/* renamed from: avz reason: default package */
final class avz {
    final bek a = new bek(0);
    final bea b = new bea(20000);
    boolean c;
    boolean d;
    boolean e;
    long f = -9223372036854775807L;
    long g = -9223372036854775807L;
    long h = -9223372036854775807L;

    avz() {
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long a(bea bea) {
        int i = bea.b;
        if (bea.b() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        bea.a(bArr, 0, 9);
        bea.c(i);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return b(bArr);
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private static long b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    /* access modifiers changed from: 0000 */
    public int a(atl atl) {
        this.c = true;
        atl.a();
        return 0;
    }
}
