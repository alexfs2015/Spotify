package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: fns reason: default package */
public final class fns extends fnq {
    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_E) {
            return super.a(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(barcodeFormat)));
    }

    public final boolean[] a(String str) {
        if (str.length() == 8) {
            int i = fnr.a[Integer.parseInt(str.substring(7, 8))];
            boolean[] zArr = new boolean[51];
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
            a(zArr, a, fnp.d, false);
            return zArr;
        }
        StringBuilder sb = new StringBuilder("Requested contents should be 8 digits long, but got ");
        sb.append(str.length());
        throw new IllegalArgumentException(sb.toString());
    }
}
