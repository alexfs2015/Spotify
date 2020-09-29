package defpackage;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: fnk reason: default package */
public final class fnk {
    private static final int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: fnk$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.fnk.AnonymousClass1.<clinit>():void");
        }
    }

    public static fnn a(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) {
        Mode mode;
        fnh fnh;
        int i;
        String str2 = "ISO-8859-1";
        String obj = (map == null || !map.containsKey(EncodeHintType.CHARACTER_SET)) ? str2 : map.get(EncodeHintType.CHARACTER_SET).toString();
        int i2 = 0;
        if (!"Shift_JIS".equals(obj) || !a(str)) {
            int i3 = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (i3 < str.length()) {
                    char charAt = str.charAt(i3);
                    if (charAt < '0' || charAt > '9') {
                        if (a((int) charAt) == -1) {
                            mode = Mode.BYTE;
                            break;
                        }
                        z = true;
                    } else {
                        z2 = true;
                    }
                    i3++;
                } else if (z) {
                    mode = Mode.ALPHANUMERIC;
                } else if (z2) {
                    mode = Mode.NUMERIC;
                } else {
                    mode = Mode.BYTE;
                }
            }
        } else {
            mode = Mode.KANJI;
        }
        fln fln = new fln();
        if (mode == Mode.BYTE && !str2.equals(obj)) {
            CharacterSetECI a2 = CharacterSetECI.a(obj);
            if (a2 != null) {
                fln.a(Mode.ECI.bits, 4);
                fln.a(a2.values[0], 8);
            }
        }
        fln.a(mode.bits, 4);
        fln fln2 = new fln();
        int i4 = AnonymousClass1.a[mode.ordinal()];
        if (i4 == 1) {
            int length = str.length();
            while (i2 < length) {
                int charAt2 = str.charAt(i2) - '0';
                int i5 = i2 + 2;
                if (i5 < length) {
                    fln2.a((charAt2 * 100) + ((str.charAt(i2 + 1) - '0') * 10) + (str.charAt(i5) - '0'), 10);
                    i = i2 + 3;
                } else {
                    i = i2 + 1;
                    if (i < length) {
                        fln2.a((charAt2 * 10) + (str.charAt(i) - '0'), 7);
                        i = i5;
                    } else {
                        fln2.a(charAt2, 4);
                    }
                }
            }
        } else if (i4 == 2) {
            int length2 = str.length();
            while (i2 < length2) {
                int a3 = a((int) str.charAt(i2));
                if (a3 != -1) {
                    int i6 = i2 + 1;
                    if (i6 < length2) {
                        int a4 = a((int) str.charAt(i6));
                        if (a4 != -1) {
                            fln2.a((a3 * 45) + a4, 11);
                            i2 += 2;
                        } else {
                            throw new WriterException();
                        }
                    } else {
                        fln2.a(a3, 6);
                        i2 = i6;
                    }
                } else {
                    throw new WriterException();
                }
            }
        } else if (i4 == 3) {
            a(str, fln2, obj);
        } else if (i4 == 4) {
            a(str, fln2);
        } else {
            throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
        }
        if (map == null || !map.containsKey(EncodeHintType.QR_VERSION)) {
            fnh = a(a(mode, fln, fln2, a(a(mode, fln, fln2, fnh.a(1)), errorCorrectionLevel)), errorCorrectionLevel);
        } else {
            fnh = fnh.a(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!a(a(mode, fln, fln2, fnh), fnh, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        fln fln3 = new fln();
        fln3.a(fln);
        int a5 = mode == Mode.BYTE ? fln2.a() : str.length();
        int a6 = mode.a(fnh);
        int i7 = 1 << a6;
        if (a5 < i7) {
            fln3.a(a5, a6);
            fln3.a(fln2);
            b a7 = fnh.a(errorCorrectionLevel);
            int b = fnh.b - a7.b();
            a(b, fln3);
            fln a8 = a(fln3, fnh.b, b, a7.a());
            fnn fnn = new fnn();
            fnn.b = errorCorrectionLevel;
            fnn.a = mode;
            fnn.c = fnh;
            int i8 = (fnh.a * 4) + 17;
            fnj fnj = new fnj(i8, i8);
            int a9 = a(a8, errorCorrectionLevel, fnh, fnj);
            fnn.d = a9;
            fnm.a(a8, errorCorrectionLevel, fnh, a9, fnj);
            fnn.e = fnj;
            return fnn;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a5);
        sb.append(" is bigger than ");
        sb.append(i7 - 1);
        throw new WriterException(sb.toString());
    }

    private static int a(int i) {
        if (i < 96) {
            return a[i];
        }
        return -1;
    }

    private static boolean a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                byte b = bytes[i] & 255;
                if ((b < 129 || b > 159) && (b < 224 || b > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static int a(fln fln, ErrorCorrectionLevel errorCorrectionLevel, fnh fnh, fnj fnj) {
        fnj fnj2 = fnj;
        boolean z = false;
        int i = -1;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        while (i2 < 8) {
            fnm.a(fln, errorCorrectionLevel, fnh, i2, fnj2);
            int a2 = fnl.a(fnj2, true) + fnl.a(fnj2, z);
            byte[][] bArr = fnj2.a;
            int i4 = fnj2.b;
            int i5 = fnj2.c;
            int i6 = 0;
            int i7 = 0;
            while (i6 < i5 - 1) {
                int i8 = i7;
                int i9 = 0;
                while (i9 < i4 - 1) {
                    byte b = bArr[i6][i9];
                    int i10 = i9 + 1;
                    if (b == bArr[i6][i10]) {
                        int i11 = i6 + 1;
                        if (b == bArr[i11][i9] && b == bArr[i11][i10]) {
                            i8++;
                        }
                    }
                    i9 = i10;
                }
                i6++;
                i7 = i8;
            }
            int i12 = a2 + (i7 * 3);
            byte[][] bArr2 = fnj2.a;
            int i13 = fnj2.b;
            int i14 = fnj2.c;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i14) {
                int i17 = i16;
                int i18 = 0;
                while (i18 < i13) {
                    byte[] bArr3 = bArr2[i15];
                    int i19 = i18 + 6;
                    if (i19 < i13 && bArr3[i18] == 1 && bArr3[i18 + 1] == 0 && bArr3[i18 + 2] == 1 && bArr3[i18 + 3] == 1 && bArr3[i18 + 4] == 1 && bArr3[i18 + 5] == 0 && bArr3[i19] == 1 && (fnl.a(bArr3, i18 - 4, i18) || fnl.a(bArr3, i18 + 7, i18 + 11))) {
                        i17++;
                    }
                    int i20 = i15 + 6;
                    if (i20 < i14 && bArr2[i15][i18] == 1 && bArr2[i15 + 1][i18] == 0 && bArr2[i15 + 2][i18] == 1 && bArr2[i15 + 3][i18] == 1 && bArr2[i15 + 4][i18] == 1 && bArr2[i15 + 5][i18] == 0 && bArr2[i20][i18] == 1 && (fnl.a(bArr2, i18, i15 - 4, i15) || fnl.a(bArr2, i18, i15 + 7, i15 + 11))) {
                        i17++;
                    }
                    i18++;
                    fln fln2 = fln;
                    ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevel;
                }
                i15++;
                fln fln3 = fln;
                ErrorCorrectionLevel errorCorrectionLevel3 = errorCorrectionLevel;
                i16 = i17;
            }
            int i21 = i12 + (i16 * 40);
            byte[][] bArr4 = fnj2.a;
            int i22 = fnj2.b;
            int i23 = fnj2.c;
            int i24 = 0;
            int i25 = 0;
            while (i24 < i23) {
                byte[] bArr5 = bArr4[i24];
                int i26 = i25;
                for (int i27 = 0; i27 < i22; i27++) {
                    if (bArr5[i27] == 1) {
                        i26++;
                    }
                }
                i24++;
                i25 = i26;
            }
            int i28 = fnj2.c * fnj2.b;
            int abs = i21 + (((Math.abs((i25 << 1) - i28) * 10) / i28) * 10);
            if (abs < i3) {
                i = i2;
                i3 = abs;
            }
            i2++;
            z = false;
        }
        return i;
    }

    private static fnh a(int i, ErrorCorrectionLevel errorCorrectionLevel) {
        for (int i2 = 1; i2 <= 40; i2++) {
            fnh a2 = fnh.a(i2);
            if (a(i, a2, errorCorrectionLevel)) {
                return a2;
            }
        }
        throw new WriterException("Data too big");
    }

    private static fln a(fln fln, int i, int i2, int i3) {
        int i4;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (fln.a() == i6) {
            ArrayList<fni> arrayList = new ArrayList<>(i7);
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i8 < i7) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                if (i8 < i7) {
                    int i12 = i5 % i7;
                    int i13 = i7 - i12;
                    int i14 = i5 / i7;
                    int i15 = i14 + 1;
                    int i16 = i6 / i7;
                    int i17 = i16 + 1;
                    int i18 = i14 - i16;
                    int i19 = i15 - i17;
                    if (i18 != i19) {
                        throw new WriterException("EC bytes mismatch");
                    } else if (i7 != i13 + i12) {
                        throw new WriterException("RS blocks mismatch");
                    } else if (i5 == ((i16 + i18) * i13) + ((i17 + i19) * i12)) {
                        if (i8 < i13) {
                            i4 = 0;
                            iArr[0] = i16;
                            iArr2[0] = i18;
                        } else {
                            i4 = 0;
                            iArr[0] = i17;
                            iArr2[0] = i19;
                        }
                        int i20 = iArr[i4];
                        byte[] bArr = new byte[i20];
                        fln.a(i9 << 3, bArr, i4, i20);
                        byte[] a2 = a(bArr, iArr2[i4]);
                        arrayList.add(new fni(bArr, a2));
                        i10 = Math.max(i10, i20);
                        i11 = Math.max(i11, a2.length);
                        i9 += iArr[i4];
                        i8++;
                    } else {
                        throw new WriterException("Total bytes mismatch");
                    }
                } else {
                    throw new WriterException("Block ID too large");
                }
            }
            if (i6 == i9) {
                fln fln2 = new fln();
                for (int i21 = 0; i21 < i10; i21++) {
                    for (fni fni : arrayList) {
                        byte[] bArr2 = fni.a;
                        if (i21 < bArr2.length) {
                            fln2.a(bArr2[i21], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i11; i22++) {
                    for (fni fni2 : arrayList) {
                        byte[] bArr3 = fni2.b;
                        if (i22 < bArr3.length) {
                            fln2.a(bArr3[i22], 8);
                        }
                    }
                }
                if (i5 == fln2.a()) {
                    return fln2;
                }
                StringBuilder sb = new StringBuilder("Interleaving error: ");
                sb.append(i5);
                sb.append(" and ");
                sb.append(fln2.a());
                sb.append(" differ.");
                throw new WriterException(sb.toString());
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }

    private static byte[] a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new flr(flp.e).a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    private static void a(String str, fln fln, String str2) {
        try {
            for (byte a2 : str.getBytes(str2)) {
                fln.a(a2, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException((Throwable) e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r6, defpackage.fln r7) {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            goto L_0x0055
        L_0x0054:
            throw r7
        L_0x0055:
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fnk.a(java.lang.String, fln):void");
    }

    private static int a(Mode mode, fln fln, fln fln2, fnh fnh) {
        return fln.b + mode.a(fnh) + fln2.b;
    }

    private static boolean a(int i, fnh fnh, ErrorCorrectionLevel errorCorrectionLevel) {
        return fnh.b - fnh.a(errorCorrectionLevel).b() >= (i + 7) / 8;
    }

    private static void a(int i, fln fln) {
        int i2 = i << 3;
        if (fln.b <= i2) {
            for (int i3 = 0; i3 < 4 && fln.b < i2; i3++) {
                fln.a(false);
            }
            int i4 = fln.b & 7;
            if (i4 > 0) {
                while (i4 < 8) {
                    fln.a(false);
                    i4++;
                }
            }
            int a2 = i - fln.a();
            for (int i5 = 0; i5 < a2; i5++) {
                fln.a((i5 & 1) == 0 ? 236 : 17, 8);
            }
            if (fln.b != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        StringBuilder sb = new StringBuilder("data bits cannot fit in the QR Code");
        sb.append(fln.b);
        sb.append(" > ");
        sb.append(i2);
        throw new WriterException(sb.toString());
    }
}
