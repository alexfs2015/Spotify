package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import java.util.Map;

/* renamed from: fni reason: default package */
public final class fni extends fnq {
    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_13) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public final boolean[] a(String str) {
        if (str.length() == 13) {
            try {
                if (fnp.a(str)) {
                    int i = fnh.a[Integer.parseInt(str.substring(0, 1))];
                    boolean[] zArr = new boolean[95];
                    int a = a(zArr, 0, fnp.b, true) + 0;
                    int i2 = 1;
                    while (i2 <= 6) {
                        int i3 = i2 + 1;
                        int parseInt = Integer.parseInt(str.substring(i2, i3));
                        if (((i >> (6 - i2)) & 1) == 1) {
                            parseInt += 10;
                        }
                        a += a(zArr, a, fnp.f[parseInt], false);
                        i2 = i3;
                    }
                    int a2 = a + a(zArr, a, fnp.c, false);
                    int i4 = 7;
                    while (i4 <= 12) {
                        int i5 = i4 + 1;
                        a2 += a(zArr, a2, fnp.e[Integer.parseInt(str.substring(i4, i5))], true);
                        i4 = i5;
                    }
                    a(zArr, a2, fnp.b, true);
                    return zArr;
                }
                throw new IllegalArgumentException("Contents do not pass checksum");
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            StringBuilder sb = new StringBuilder("Requested contents should be 13 digits long, but got ");
            sb.append(str.length());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
