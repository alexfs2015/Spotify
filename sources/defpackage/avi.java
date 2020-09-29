package defpackage;

/* renamed from: avi reason: default package */
final class avi {
    final bdt a = new bdt(0);
    final bdj b = new bdj(20000);
    boolean c;
    boolean d;
    boolean e;
    long f = -9223372036854775807L;
    long g = -9223372036854775807L;
    long h = -9223372036854775807L;

    avi() {
    }

    /* access modifiers changed from: 0000 */
    public int a(asu asu) {
        this.c = true;
        asu.a();
        return 0;
    }

    static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean a(byte[] bArr) {
        if ((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
            return true;
        }
        return false;
    }

    private static long b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public static long a(bdj bdj) {
        int i = bdj.b;
        if (bdj.b() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        bdj.a(bArr, 0, 9);
        bdj.c(i);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return b(bArr);
    }
}
