package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.pdf417.encoder.Compaction;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: fmz reason: default package */
public final class fmz implements fle {
    public final flo a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        boolean z;
        if (barcodeFormat == BarcodeFormat.PDF_417) {
            fnd fnd = new fnd();
            int i3 = 30;
            int i4 = 2;
            if (map != null) {
                if (map.containsKey(EncodeHintType.PDF417_COMPACT)) {
                    fnd.b = Boolean.valueOf(map.get(EncodeHintType.PDF417_COMPACT).toString()).booleanValue();
                }
                if (map.containsKey(EncodeHintType.PDF417_COMPACTION)) {
                    fnd.c = Compaction.valueOf(map.get(EncodeHintType.PDF417_COMPACTION).toString());
                }
                if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS)) {
                    fnc fnc = (fnc) map.get(EncodeHintType.PDF417_DIMENSIONS);
                    int i5 = fnc.b;
                    int i6 = fnc.a;
                    int i7 = fnc.d;
                    int i8 = fnc.c;
                    fnd.f = i5;
                    fnd.e = i6;
                    fnd.g = i7;
                    fnd.h = i8;
                }
                if (map.containsKey(EncodeHintType.MARGIN)) {
                    i3 = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
                }
                if (map.containsKey(EncodeHintType.ERROR_CORRECTION)) {
                    i4 = Integer.parseInt(map.get(EncodeHintType.ERROR_CORRECTION).toString());
                }
                if (map.containsKey(EncodeHintType.CHARACTER_SET)) {
                    fnd.d = Charset.forName(map.get(EncodeHintType.CHARACTER_SET).toString());
                }
            }
            fnd.a(str, i4);
            byte[][] a = fnd.a.a(1, 4);
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
            byte[][] a2 = fnd.a.a(length, length << 2);
            if (z) {
                a2 = a(a2);
            }
            return a(a2, i3);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static flo a(byte[][] bArr, int i) {
        int i2 = i * 2;
        flo flo = new flo(bArr[0].length + i2, bArr.length + i2);
        flo.a();
        int i3 = (flo.b - i) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr[i4][i5] == 1) {
                    flo.b(i5 + i, i3);
                }
            }
            i4++;
            i3--;
        }
        return flo;
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
}
