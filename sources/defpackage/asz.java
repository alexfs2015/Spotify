package defpackage;

import com.comscore.streaming.ContentType;

/* renamed from: asz reason: default package */
public final class asz {
    private static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = {44100, 48000, 32000};
    private static final int[] j = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] k = {32, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] l = {32, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] m = {32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 160, 192, 224, 256, 320};
    private static final int[] n = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, ContentType.LONG_FORM_ON_DEMAND, 128, 144, 160};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        if ((i2 & -2097152) != -2097152) {
            return -1;
        }
        int i3 = (i2 >>> 19) & 3;
        if (i3 == 1) {
            return -1;
        }
        int i4 = (i2 >>> 17) & 3;
        if (i4 == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        if (i5 == 0 || i5 == 15) {
            return -1;
        }
        int i6 = (i2 >>> 10) & 3;
        if (i6 == 3) {
            return -1;
        }
        int i7 = i[i6];
        if (i3 == 2) {
            i7 /= 2;
        } else if (i3 == 0) {
            i7 /= 4;
        }
        int i8 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? j[i5 - 1] : k[i5 - 1]) * 12000) / i7) + i8) << 2;
        }
        int i9 = i3 == 3 ? i4 == 2 ? l[i5 - 1] : m[i5 - 1] : n[i5 - 1];
        int i10 = 144000;
        if (i3 == 3) {
            return ((i9 * 144000) / i7) + i8;
        }
        if (i4 == 1) {
            i10 = 72000;
        }
        return ((i10 * i9) / i7) + i8;
    }

    public static boolean a(int i2, asz asz) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & -2097152) != -2097152) {
            return false;
        }
        int i8 = (i2 >>> 19) & 3;
        if (i8 == 1) {
            return false;
        }
        int i9 = (i2 >>> 17) & 3;
        if (i9 == 0) {
            return false;
        }
        int i10 = (i2 >>> 12) & 15;
        if (i10 == 0 || i10 == 15) {
            return false;
        }
        int i11 = (i2 >>> 10) & 3;
        if (i11 == 3) {
            return false;
        }
        int i12 = i[i11];
        int i13 = 2;
        if (i8 == 2) {
            i12 /= 2;
        } else if (i8 == 0) {
            i12 /= 4;
        }
        int i14 = (i2 >>> 9) & 1;
        if (i9 == 3) {
            i5 = i8 == 3 ? j[i10 - 1] : k[i10 - 1];
            i4 = (((i5 * 12000) / i12) + i14) << 2;
            i3 = 384;
        } else {
            i3 = 1152;
            if (i8 == 3) {
                i7 = i9 == 2 ? l[i10 - 1] : m[i10 - 1];
            } else {
                i7 = n[i10 - 1];
                if (i9 == 1) {
                    i3 = 576;
                }
                if (i9 == 1) {
                    i6 = 72000;
                    i4 = i14 + ((i6 * i5) / i12);
                }
            }
            i6 = 144000;
            i4 = i14 + ((i6 * i5) / i12);
        }
        String str = h[3 - i9];
        if (((i2 >> 6) & 3) == 3) {
            i13 = 1;
        }
        int i15 = i5 * 1000;
        asz.a = i8;
        asz.b = str;
        asz.c = i4;
        asz.d = i12;
        asz.e = i13;
        asz.f = i15;
        asz.g = i3;
        return true;
    }
}
