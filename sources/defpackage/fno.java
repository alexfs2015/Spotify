package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import java.util.Map;

/* renamed from: fno reason: default package */
public final class fno implements fly {
    private final fni a = new fni();

    private static String a(String str) {
        int length = str.length();
        if (length == 11) {
            int i = 0;
            for (int i2 = 0; i2 < 11; i2++) {
                i += (str.charAt(i2) - '0') * (i2 % 2 == 0 ? 3 : 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append((1000 - i) % 10);
            str = sb.toString();
        } else if (length != 12) {
            StringBuilder sb2 = new StringBuilder("Requested contents should be 11 or 12 digits long, but got ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString());
        }
        return Ad.DEFAULT_SKIPPABLE_AD_DELAY.concat(String.valueOf(str));
    }

    public final fmi a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.UPC_A) {
            return this.a.a(a(str), BarcodeFormat.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
    }
}
