package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: fnj reason: default package */
public final class fnj extends fnq {
    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public final boolean[] a(String str) {
        if (str.length() == 8) {
            boolean[] zArr = new boolean[67];
            int a = a(zArr, 0, fnp.b, true) + 0;
            int i = 0;
            while (i <= 3) {
                int i2 = i + 1;
                a += a(zArr, a, fnp.e[Integer.parseInt(str.substring(i, i2))], false);
                i = i2;
            }
            int a2 = a + a(zArr, a, fnp.c, false);
            int i3 = 4;
            while (i3 <= 7) {
                int i4 = i3 + 1;
                a2 += a(zArr, a2, fnp.e[Integer.parseInt(str.substring(i3, i4))], true);
                i3 = i4;
            }
            a(zArr, a2, fnp.b, true);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
