package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: fng reason: default package */
public final class fng extends fnn {
    private static int a(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    private static int a(boolean[] zArr, int i, int[] iArr) {
        int i2 = i;
        int i3 = 0;
        while (i3 < 9) {
            int i4 = i2 + 1;
            zArr[i2] = iArr[i3] != 0;
            i3++;
            i2 = i4;
        }
        return 9;
    }

    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public final boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            boolean[] zArr = new boolean[(((str.length() + 2 + 2) * 9) + 1)];
            a(fnf.a[47], iArr);
            int i = 0;
            int a = a(zArr, 0, iArr);
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (i < length) {
                    a(fnf.a[str2.indexOf(str.charAt(i))], iArr);
                    a += a(zArr, a, iArr);
                    i++;
                } else {
                    int a2 = a(str, 20);
                    a(fnf.a[a2], iArr);
                    int a3 = a + a(zArr, a, iArr);
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(str2.charAt(a2));
                    a(fnf.a[a(sb.toString(), 15)], iArr);
                    int a4 = a3 + a(zArr, a3, iArr);
                    a(fnf.a[47], iArr);
                    zArr[a4 + a(zArr, a4, iArr)] = true;
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
