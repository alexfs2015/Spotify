package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.oned.Code128Writer;
import java.util.Map;

/* renamed from: flx reason: default package */
public final class flx implements fly {
    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        fly fly;
        switch (barcodeFormat) {
            case EAN_8:
                fly = new fnj();
                break;
            case UPC_E:
                fly = new fns();
                break;
            case EAN_13:
                fly = new fni();
                break;
            case UPC_A:
                fly = new fno();
                break;
            case QR_CODE:
                fly = new foa();
                break;
            case CODE_39:
                fly = new fne();
                break;
            case CODE_93:
                fly = new fng();
                break;
            case CODE_128:
                fly = new Code128Writer();
                break;
            case ITF:
                fly = new fnl();
                break;
            case PDF_417:
                fly = new fnt();
                break;
            case CODABAR:
                fly = new fnb();
                break;
            case DATA_MATRIX:
                fly = new fmm();
                break;
            case AZTEC:
                fly = new flz();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return fly.a(str, barcodeFormat, i, i2, map);
    }
}
