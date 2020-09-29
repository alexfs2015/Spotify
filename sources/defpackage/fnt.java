package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: fnt reason: default package */
public final class fnt implements fly {
    private static fmi a(byte[][] bArr, int i) {
        int i2 = i * 2;
        fmi fmi = new fmi(bArr[0].length + i2, bArr.length + i2);
        fmi.a();
        int i3 = (fmi.b - i) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr[i4][i5] == 1) {
                    fmi.b(i5 + i, i3);
                }
            }
            i4++;
            i3--;
        }
        return fmi;
    }

    private static byte[][] a(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(byte.class, new int[]{bArr[0].length, bArr.length});
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        boolean z;
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            fnx fnx = new fnx();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                    fnx.b = Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue();
                }
                if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                    fnx.c = Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString());
                }
                if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                    fnw fnw = (fnw) map.get(EncodeHintType.PDF417_DIMENSIONS);
                    int i5 = fnw.b;
                    int i6 = fnw.a;
                    int i7 = fnw.d;
                    int i8 = fnw.c;
                    fnx.f = i5;
                    fnx.e = i6;
                    fnx.g = i7;
                    fnx.h = i8;
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    i4 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                    fnx.d = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
                }
            }
            fnx.a(str, i4);
            byte[][] a = fnx.a.a(1, 4);
            if ((i2 > i) ^ (a[0].length < a.length)) {
                a = a(a);
                z = true;
            } else {
                z = false;
            }
            int length = i / a[0].length;
            int length2 = i2 / a.length;
            if (length >= length2) {
                length = length2;
            }
            if (length <= 1) {
                return a(a, i3);
            }
            byte[][] a2 = fnx.a.a(length, length << 2);
            if (z) {
                a2 = a(a2);
            }
            return a(a2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
