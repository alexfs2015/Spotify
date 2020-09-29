package defpackage;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

/* renamed from: bdo reason: default package */
public final class bdo {
    private static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    private static int a(bdz bdz) {
        int c2 = bdz.c(5);
        return c2 == 31 ? bdz.c(6) + 32 : c2;
    }

    public static Pair<Integer, Integer> a(bdz bdz, boolean z) {
        int a2 = a(bdz);
        int b2 = b(bdz);
        int c2 = bdz.c(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(bdz);
            a2 = a(bdz);
            if (a2 == 22) {
                c2 = bdz.c(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4 || a2 == 6 || a2 == 7 || a2 == 17)) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unsupported audio object type: ");
                        sb.append(a2);
                        throw new ParserException(sb.toString());
                }
            }
            a(bdz, a2, c2);
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int c3 = bdz.c(2);
                    if (c3 == 2 || c3 == 3) {
                        StringBuilder sb2 = new StringBuilder("Unsupported epConfig: ");
                        sb2.append(c3);
                        throw new ParserException(sb2.toString());
                    }
            }
        }
        int i = c[c2];
        if (i == -1) {
            z2 = false;
        }
        bdl.a(z2);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    public static Pair<Integer, Integer> a(byte[] bArr) {
        return a(new bdz(bArr), false);
    }

    private static void a(bdz bdz, int i, int i2) {
        bdz.b(1);
        if (bdz.e()) {
            bdz.b(14);
        }
        boolean e = bdz.e();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                bdz.b(3);
            }
            if (e) {
                if (i == 22) {
                    bdz.b(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    bdz.b(3);
                }
                bdz.b(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[(i2 + 4)];
        System.arraycopy(a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static int b(bdz bdz) {
        int c2 = bdz.c(4);
        if (c2 == 15) {
            return bdz.c(24);
        }
        bdl.a(c2 < 13);
        return b[c2];
    }

    public static String b(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }
}
