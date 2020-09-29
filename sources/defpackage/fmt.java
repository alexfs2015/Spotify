package defpackage;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Map;

/* renamed from: fmt reason: default package */
public abstract class fmt implements fle {
    public int a() {
        return 10;
    }

    public abstract boolean[] a(String str);

    public flo a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        } else if (i < 0 || i2 < 0) {
            StringBuilder sb = new StringBuilder("Negative size is not allowed. Input: ");
            sb.append(i);
            sb.append('x');
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else {
            int a = a();
            if (map != null && map.containsKey(EncodeHintType.MARGIN)) {
                a = Integer.parseInt(map.get(EncodeHintType.MARGIN).toString());
            }
            return a(a(str), i, i2, a);
        }
    }

    private static flo a(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int max = Math.max(i, i4);
        int max2 = Math.max(1, i2);
        int i5 = max / i4;
        int i6 = (max - (length * i5)) / 2;
        flo flo = new flo(max, max2);
        int i7 = i6;
        int i8 = 0;
        while (i8 < length) {
            if (zArr[i8]) {
                flo.a(i7, 0, i5, max2);
            }
            i8++;
            i7 += i5;
        }
        return flo;
    }

    protected static int a(boolean[] zArr, int i, int[] iArr, boolean z) {
        int length = iArr.length;
        int i2 = i;
        boolean z2 = z;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            int i6 = i2;
            int i7 = 0;
            while (i7 < i5) {
                int i8 = i6 + 1;
                zArr[i6] = z2;
                i7++;
                i6 = i8;
            }
            i4 += i5;
            z2 = !z2;
            i3++;
            i2 = i6;
        }
        return i4;
    }
}
