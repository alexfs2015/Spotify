package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: fne reason: default package */
public final class fne extends fnn {
    private static void a(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public final boolean[] a(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int i = length + 25;
            int i2 = 0;
            while (true) {
                String str2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. *$/+%";
                if (i2 < length) {
                    int indexOf = str2.indexOf(str.charAt(i2));
                    if (indexOf >= 0) {
                        a(fnd.a[indexOf], iArr);
                        int i3 = i;
                        for (int i4 = 0; i4 < 9; i4++) {
                            i3 += iArr[i4];
                        }
                        i2++;
                        i = i3;
                    } else {
                        throw new IllegalArgumentException("Bad contents: ".concat(String.valueOf(str)));
                    }
                } else {
                    boolean[] zArr = new boolean[i];
                    a(fnd.b, iArr);
                    int a = a(zArr, 0, iArr, true);
                    int[] iArr2 = {1};
                    int a2 = a + a(zArr, a, iArr2, false);
                    for (int i5 = 0; i5 < length; i5++) {
                        a(fnd.a[str2.indexOf(str.charAt(i5))], iArr);
                        int a3 = a2 + a(zArr, a2, iArr, true);
                        a2 = a3 + a(zArr, a3, iArr2, false);
                    }
                    a(fnd.b, iArr);
                    a(zArr, a2, iArr, true);
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
    }
}
