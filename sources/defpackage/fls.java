package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* renamed from: fls reason: default package */
public final class fls implements fle {
    public final flo a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        flc flc;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Requested dimensions are too small: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
            flc flc2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                flc = (flc) map.get(EncodeHintType.MIN_SIZE);
                if (flc == null) {
                    flc = null;
                }
                flc flc3 = (flc) map.get(EncodeHintType.MAX_SIZE);
                if (flc3 != null) {
                    flc2 = flc3;
                }
            } else {
                flc = null;
            }
            String a = fmc.a(str, symbolShapeHint, flc, flc2);
            fmd a2 = fmd.a(a.length(), symbolShapeHint, flc, flc2, true);
            flx flx = new flx(fmb.a(a, a2), a2.b(), a2.c());
            flx.a();
            return a(flx, a2);
        }
    }

    private static flo a(flx flx, fmd fmd) {
        int b = fmd.b();
        int c = fmd.c();
        fnj fnj = new fnj(fmd.d(), fmd.e());
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 % fmd.d == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < fmd.d(); i4++) {
                    fnj.a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < b; i6++) {
                if (i6 % fmd.c == 0) {
                    fnj.a(i5, i, true);
                    i5++;
                }
                fnj.a(i5, i, flx.b[(flx.a * i2) + i6] == 1);
                i5++;
                if (i6 % fmd.c == fmd.c - 1) {
                    fnj.a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            if (i2 % fmd.d == fmd.d - 1) {
                int i7 = 0;
                for (int i8 = 0; i8 < fmd.d(); i8++) {
                    fnj.a(i7, i, true);
                    i7++;
                }
                i++;
            }
        }
        int i9 = fnj.b;
        int i10 = fnj.c;
        flo flo = new flo(i9, i10);
        flo.a();
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (fnj.a(i11, i12) == 1) {
                    flo.b(i11, i12);
                }
            }
        }
        return flo;
    }
}
