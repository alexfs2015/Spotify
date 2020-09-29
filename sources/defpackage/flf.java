package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: flf reason: default package */
public final class flf implements fle {
    private static final Charset a = Charset.forName("ISO-8859-1");

    public final flo a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Charset charset = a;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                charset = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
            }
            if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                i3 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(EncodeHintType.AZTEC_LAYERS)) {
                i4 = Integer.parseInt(map.get(EncodeHintType.AZTEC_LAYERS).toString());
            }
        }
        if (barcodeFormat == BarcodeFormat.AZTEC) {
            return a(fli.a(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static flo a(flg flg, int i, int i2) {
        flo flo = flg.e;
        if (flo != null) {
            int i3 = flo.a;
            int i4 = flo.b;
            int max = Math.max(i, i3);
            int max2 = Math.max(i2, i4);
            int min = Math.min(max / i3, max2 / i4);
            int i5 = (max - (i3 * min)) / 2;
            int i6 = (max2 - (i4 * min)) / 2;
            flo flo2 = new flo(max, max2);
            int i7 = 0;
            while (i7 < i4) {
                int i8 = i5;
                int i9 = 0;
                while (i9 < i3) {
                    if (flo.a(i9, i7)) {
                        flo2.a(i8, i6, min, min);
                    }
                    i9++;
                    i8 += min;
                }
                i7++;
                i6 += min;
            }
            return flo2;
        }
        throw new IllegalStateException();
    }
}
