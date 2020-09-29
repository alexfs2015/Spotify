package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import java.util.Map;

/* renamed from: fmm reason: default package */
public final class fmm implements fly {
    private static fmi a(fmr fmr, fmx fmx) {
        int b = fmx.b();
        int c = fmx.c();
        fod fod = new fod(fmx.d(), fmx.e());
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            if (i2 % fmx.d == 0) {
                int i3 = 0;
                for (int i4 = 0; i4 < fmx.d(); i4++) {
                    fod.a(i3, i, i4 % 2 == 0);
                    i3++;
                }
                i++;
            }
            int i5 = 0;
            for (int i6 = 0; i6 < b; i6++) {
                if (i6 % fmx.c == 0) {
                    fod.a(i5, i, true);
                    i5++;
                }
                fod.a(i5, i, fmr.b[(fmr.a * i2) + i6] == 1);
                i5++;
                if (i6 % fmx.c == fmx.c - 1) {
                    fod.a(i5, i, i2 % 2 == 0);
                    i5++;
                }
            }
            i++;
            if (i2 % fmx.d == fmx.d - 1) {
                int i7 = 0;
                for (int i8 = 0; i8 < fmx.d(); i8++) {
                    fod.a(i7, i, true);
                    i7++;
                }
                i++;
            }
        }
        int i9 = fod.b;
        int i10 = fod.c;
        fmi fmi = new fmi(i9, i10);
        fmi.a();
        for (int i11 = 0; i11 < i9; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (fod.a(i11, i12) == 1) {
                    fmi.b(i11, i12);
                }
            }
        }
        return fmi;
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        flw flw;
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
            flw flw2 = null;
            if (map != null) {
                SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
                if (symbolShapeHint2 != null) {
                    symbolShapeHint = symbolShapeHint2;
                }
                flw = (flw) map.get(EncodeHintType.MIN_SIZE);
                if (flw == null) {
                    flw = null;
                }
                flw flw3 = (flw) map.get(EncodeHintType.MAX_SIZE);
                if (flw3 != null) {
                    flw2 = flw3;
                }
            } else {
                flw = null;
            }
            String a = fmw.a(str, symbolShapeHint, flw, flw2);
            fmx a2 = fmx.a(a.length(), symbolShapeHint, flw, flw2, true);
            fmr fmr = new fmr(fmv.a(a, a2), a2.b(), a2.c());
            fmr.a();
            return a(fmr, a2);
        }
    }
}
