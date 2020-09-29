package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* renamed from: foa reason: default package */
public final class foa implements fly {
    private static fmi a(foh foh, int i, int i2, int i3) {
        fod fod = foh.e;
        if (fod != null) {
            int i4 = fod.b;
            int i5 = fod.c;
            int i6 = i3 << 1;
            int i7 = i4 + i6;
            int i8 = i6 + i5;
            int max = Math.max(i, i7);
            int max2 = Math.max(i2, i8);
            int min = Math.min(max / i7, max2 / i8);
            int i9 = (max - (i4 * min)) / 2;
            int i10 = (max2 - (i5 * min)) / 2;
            fmi fmi = new fmi(max, max2);
            int i11 = 0;
            while (i11 < i5) {
                int i12 = i9;
                int i13 = 0;
                while (i13 < i4) {
                    if (fod.a(i13, i11) == 1) {
                        fmi.a(i12, i10, min, min);
                    }
                    i13++;
                    i12 += min;
                }
                i11++;
                i10 += min;
            }
            return fmi;
        }
        throw new IllegalStateException();
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            ErrorCorrectionLevel errorCorrectionLevel = ErrorCorrectionLevel.L;
            int i3 = 4;
            if (map != null) {
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    errorCorrectionLevel = ErrorCorrectionLevel.valueOf(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
            }
            return a(foe.a(str, errorCorrectionLevel, map), i, i2, i3);
        }
    }
}
