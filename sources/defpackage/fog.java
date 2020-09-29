package defpackage;

import com.comscore.streaming.ContentType;
import com.google.zxing.WriterException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.PlaybackSpeed;

/* renamed from: fog reason: default package */
final class fog {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, a.aB, -1, -1}, new int[]{6, 34, 62, 90, a.aF, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, ContentType.LONG_FORM_ON_DEMAND, 138, -1}, new int[]{6, 30, 58, 86, a.aB, 142, -1}, new int[]{6, 34, 62, 90, a.aF, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, PlaybackSpeed.PLAYBACK_SPEED_150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, a.aB, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    private static int a(int i, int i2) {
        if (i2 != 0) {
            int numberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(i2);
            int i3 = i << (numberOfLeadingZeros - 1);
            while (32 - Integer.numberOfLeadingZeros(i3) >= numberOfLeadingZeros) {
                i3 ^= i2 << ((32 - Integer.numberOfLeadingZeros(i3)) - numberOfLeadingZeros);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    private static void a(int i, int i2, fod fod) {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (a(fod.a(i4, i2))) {
                fod.a(i4, i2, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        r10 = r10 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        r10 = r10 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        if (r10 != 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r10 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        r9 = !r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(defpackage.fmh r12, int r13, defpackage.fod r14) {
        /*
            int r0 = r14.b
            r1 = 1
            int r0 = r0 - r1
            int r2 = r14.c
            int r2 = r2 - r1
            r3 = -1
            r4 = 0
            r6 = r2
            r2 = 0
            r5 = -1
        L_0x000c:
            if (r0 <= 0) goto L_0x0091
            r7 = 6
            if (r0 != r7) goto L_0x0013
            int r0 = r0 + -1
        L_0x0013:
            if (r6 < 0) goto L_0x008b
            int r7 = r14.c
            if (r6 >= r7) goto L_0x008b
            r7 = r2
            r2 = 0
        L_0x001b:
            r8 = 2
            if (r2 >= r8) goto L_0x0088
            int r8 = r0 - r2
            byte r9 = r14.a(r8, r6)
            boolean r9 = a(r9)
            if (r9 == 0) goto L_0x0085
            int r9 = r12.b
            if (r7 >= r9) goto L_0x0035
            boolean r9 = r12.a(r7)
            int r7 = r7 + 1
            goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            if (r13 == r3) goto L_0x0082
            switch(r13) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0073;
                case 2: goto L_0x0070;
                case 3: goto L_0x006b;
                case 4: goto L_0x0065;
                case 5: goto L_0x005d;
                case 6: goto L_0x0053;
                case 7: goto L_0x004b;
                default: goto L_0x003b;
            }
        L_0x003b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.String r14 = "Invalid mask pattern: "
            java.lang.String r13 = r14.concat(r13)
            r12.<init>(r13)
            throw r12
        L_0x004b:
            int r10 = r6 * r8
            int r10 = r10 % 3
            int r11 = r6 + r8
            r11 = r11 & r1
            goto L_0x0069
        L_0x0053:
            int r10 = r6 * r8
            r11 = r10 & 1
            int r10 = r10 % 3
            int r11 = r11 + r10
            r10 = r11 & 1
            goto L_0x0079
        L_0x005d:
            int r10 = r6 * r8
            r11 = r10 & 1
            int r10 = r10 % 3
            int r10 = r10 + r11
            goto L_0x0079
        L_0x0065:
            int r10 = r6 / 2
            int r11 = r8 / 3
        L_0x0069:
            int r10 = r10 + r11
            goto L_0x0078
        L_0x006b:
            int r10 = r6 + r8
            int r10 = r10 % 3
            goto L_0x0079
        L_0x0070:
            int r10 = r8 % 3
            goto L_0x0079
        L_0x0073:
            r10 = r6 & 1
            goto L_0x0079
        L_0x0076:
            int r10 = r6 + r8
        L_0x0078:
            r10 = r10 & r1
        L_0x0079:
            if (r10 != 0) goto L_0x007d
            r10 = 1
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r10 == 0) goto L_0x0082
            r9 = r9 ^ 1
        L_0x0082:
            r14.a(r8, r6, r9)
        L_0x0085:
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0088:
            int r6 = r6 + r5
            r2 = r7
            goto L_0x0013
        L_0x008b:
            int r5 = -r5
            int r6 = r6 + r5
            int r0 = r0 + -2
            goto L_0x000c
        L_0x0091:
            int r13 = r12.b
            if (r2 != r13) goto L_0x0096
            return
        L_0x0096:
            com.google.zxing.WriterException r13 = new com.google.zxing.WriterException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Not all bits consumed: "
            r14.<init>(r0)
            r14.append(r2)
            r0 = 47
            r14.append(r0)
            int r12 = r12.b
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            goto L_0x00b5
        L_0x00b4:
            throw r13
        L_0x00b5:
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fog.a(fmh, int, fod):void");
    }

    static void a(fmh fmh, ErrorCorrectionLevel errorCorrectionLevel, fob fob, int i, fod fod) {
        int i2;
        fob fob2 = fob;
        int i3 = i;
        fod fod2 = fod;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (i4 >= fod2.c) {
                break;
            }
            for (int i5 = 0; i5 < fod2.b; i5++) {
                fod2.a[i4][i5] = -1;
            }
            i4++;
        }
        int length = a[0].length;
        c(0, 0, fod2);
        c(fod2.b - length, 0, fod2);
        c(0, fod2.b - length, fod2);
        a(0, 7, fod2);
        a(fod2.b - 8, 7, fod2);
        a(0, fod2.b - 8, fod2);
        b(7, 0, fod2);
        b((fod2.c - 7) - 1, 0, fod2);
        b(7, fod2.c - 7, fod2);
        if (fod2.a(8, fod2.c - 8) != 0) {
            fod2.a(8, fod2.c - 8, 1);
            if (fob2.a >= 2) {
                int i6 = fob2.a - 1;
                int[][] iArr = c;
                int[] iArr2 = iArr[i6];
                int length2 = iArr[i6].length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = 0;
                    while (i8 < length2) {
                        int i9 = iArr2[i7];
                        int i10 = iArr2[i8];
                        if (!(i10 == i2 || i9 == i2 || !a(fod2.a(i10, i9)))) {
                            int i11 = i10 - 2;
                            int i12 = i9 - 2;
                            for (int i13 = 0; i13 < 5; i13++) {
                                for (int i14 = 0; i14 < 5; i14++) {
                                    fod2.a(i11 + i14, i12 + i13, b[i13][i14]);
                                }
                            }
                        }
                        i8++;
                        i2 = -1;
                    }
                    i7++;
                    i2 = -1;
                }
            }
            int i15 = 8;
            while (i15 < fod2.b - 8) {
                int i16 = i15 + 1;
                int i17 = i16 % 2;
                if (a(fod2.a(i15, 6))) {
                    fod2.a(i15, 6, i17);
                }
                if (a(fod2.a(6, i15))) {
                    fod2.a(6, i15, i17);
                }
                i15 = i16;
            }
            fmh fmh2 = new fmh();
            if (i3 >= 0 && i3 < 8) {
                int i18 = (errorCorrectionLevel.bits << 3) | i3;
                fmh2.a(i18, 5);
                fmh2.a(a(i18, 1335), 10);
                fmh fmh3 = new fmh();
                fmh3.a(21522, 15);
                if (fmh2.b == fmh3.b) {
                    for (int i19 = 0; i19 < fmh2.a.length; i19++) {
                        int[] iArr3 = fmh2.a;
                        iArr3[i19] = iArr3[i19] ^ fmh3.a[i19];
                    }
                    if (fmh2.b == 15) {
                        for (int i20 = 0; i20 < fmh2.b; i20++) {
                            boolean a2 = fmh2.a((fmh2.b - 1) - i20);
                            int[][] iArr4 = d;
                            fod2.a(iArr4[i20][0], iArr4[i20][1], a2);
                            if (i20 < 8) {
                                fod2.a((fod2.b - i20) - 1, 8, a2);
                            } else {
                                fod2.a(8, (fod2.c - 7) + (i20 - 8), a2);
                            }
                        }
                        a(fob2, fod2);
                        a(fmh, i3, fod2);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("should not happen but we got: ");
                    sb.append(fmh2.b);
                    throw new WriterException(sb.toString());
                }
                throw new IllegalArgumentException("Sizes don't match");
            }
            throw new WriterException("Invalid mask pattern");
        }
        throw new WriterException();
    }

    private static void a(fob fob, fod fod) {
        if (fob.a >= 7) {
            fmh fmh = new fmh();
            fmh.a(fob.a, 6);
            fmh.a(a(fob.a, 7973), 12);
            if (fmh.b == 18) {
                int i = 0;
                int i2 = 17;
                while (i < 6) {
                    int i3 = i2;
                    for (int i4 = 0; i4 < 3; i4++) {
                        boolean a2 = fmh.a(i3);
                        i3--;
                        fod.a(i, (fod.c - 11) + i4, a2);
                        fod.a((fod.c - 11) + i4, i, a2);
                    }
                    i++;
                    i2 = i3;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(fmh.b);
            throw new WriterException(sb.toString());
        }
    }

    private static boolean a(int i) {
        return i == -1;
    }

    private static void b(int i, int i2, fod fod) {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (a(fod.a(i, i4))) {
                fod.a(i, i4, 0);
                i3++;
            } else {
                throw new WriterException();
            }
        }
    }

    private static void c(int i, int i2, fod fod) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                fod.a(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }
}
