package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* renamed from: fld reason: default package */
public final class fld implements fle {
    public final flo a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        fle fle;
        switch (barcodeFormat) {
            case EAN_8:
                fle = new fmp();
                break;
            case UPC_E:
                fle = new fmy();
                break;
            case EAN_13:
                fle = new fmo();
                break;
            case UPC_A:
                fle = new fmu();
                break;
            case QR_CODE:
                fle = new fng();
                break;
            case CODE_39:
                fle = new fmk();
                break;
            case CODE_93:
                fle = new fmm();
                break;
            case CODE_128:
                fle = new Code128Writer();
                break;
            case ITF:
                fle = new fmr();
                break;
            case PDF_417:
                fle = new fmz();
                break;
            case CODABAR:
                fle = new fmh();
                break;
            case DATA_MATRIX:
                fle = new fls();
                break;
            case AZTEC:
                fle = new flf();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return fle.a(str, barcodeFormat, i, i2, map);
    }
}
