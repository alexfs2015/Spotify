package defpackage;

import java.io.UnsupportedEncodingException;

@cey
/* renamed from: dmi reason: default package */
public final class dmi {
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007f, code lost:
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c4, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00d1, code lost:
        if (r4 == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] a(java.lang.String r11, boolean r12) {
        /*
            if (r11 != 0) goto L_0x0004
            r11 = 0
            return r11
        L_0x0004:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            char[] r1 = r11.toCharArray()
            int r11 = r11.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0015:
            if (r3 >= r11) goto L_0x00d8
            int r6 = java.lang.Character.codePointAt(r1, r3)
            int r7 = java.lang.Character.charCount(r6)
            boolean r8 = java.lang.Character.isLetter(r6)
            r9 = 1
            if (r8 == 0) goto L_0x0083
            java.lang.Character$UnicodeBlock r8 = java.lang.Character.UnicodeBlock.of(r6)
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.BOPOMOFO_EXTENDED
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_JAMO
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HANGUL_SYLLABLES
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.HIRAGANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA
            if (r8 == r10) goto L_0x0065
            java.lang.Character$UnicodeBlock r10 = java.lang.Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS
            if (r8 != r10) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r8 = 0
            goto L_0x0066
        L_0x0065:
            r8 = 1
        L_0x0066:
            if (r8 != 0) goto L_0x0081
            r8 = 65382(0xff66, float:9.162E-41)
            if (r6 < r8) goto L_0x0072
            r8 = 65437(0xff9d, float:9.1697E-41)
            if (r6 <= r8) goto L_0x007c
        L_0x0072:
            r8 = 65441(0xffa1, float:9.1702E-41)
            if (r6 < r8) goto L_0x007e
            r8 = 65500(0xffdc, float:9.1785E-41)
            if (r6 > r8) goto L_0x007e
        L_0x007c:
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            if (r8 == 0) goto L_0x0083
        L_0x0081:
            r8 = 1
            goto L_0x0084
        L_0x0083:
            r8 = 0
        L_0x0084:
            if (r8 == 0) goto L_0x009c
            if (r4 == 0) goto L_0x0092
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            r0.add(r4)
        L_0x0092:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1, r3, r7)
        L_0x0097:
            r0.add(r4)
            r4 = 0
            goto L_0x00d5
        L_0x009c:
            boolean r8 = java.lang.Character.isLetterOrDigit(r6)
            if (r8 != 0) goto L_0x00d1
            int r8 = java.lang.Character.getType(r6)
            r10 = 6
            if (r8 == r10) goto L_0x00d1
            int r8 = java.lang.Character.getType(r6)
            r10 = 8
            if (r8 != r10) goto L_0x00b2
            goto L_0x00d1
        L_0x00b2:
            if (r12 == 0) goto L_0x00c7
            int r8 = java.lang.Character.charCount(r6)
            if (r8 != r9) goto L_0x00c7
            char[] r6 = java.lang.Character.toChars(r6)
            char r6 = r6[r2]
            r8 = 39
            if (r6 != r8) goto L_0x00c7
            if (r4 != 0) goto L_0x00d4
            goto L_0x00d3
        L_0x00c7:
            if (r4 == 0) goto L_0x00d5
            java.lang.String r4 = new java.lang.String
            int r6 = r3 - r5
            r4.<init>(r1, r5, r6)
            goto L_0x0097
        L_0x00d1:
            if (r4 != 0) goto L_0x00d4
        L_0x00d3:
            r5 = r3
        L_0x00d4:
            r4 = 1
        L_0x00d5:
            int r3 = r3 + r7
            goto L_0x0015
        L_0x00d8:
            if (r4 == 0) goto L_0x00e3
            java.lang.String r11 = new java.lang.String
            int r3 = r3 - r5
            r11.<init>(r1, r5, r3)
            r0.add(r11)
        L_0x00e3:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmi.a(java.lang.String, boolean):java.lang.String[]");
    }

    public static int a(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        int length = bArr.length;
        int i = 0;
        int i2 = (length & -4) + 0;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4 += 4) {
            int i5 = ((bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | (bArr[i4 + 3] << 24)) * -862048943;
            int i6 = i3 ^ (((i5 << 15) | (i5 >>> 17)) * 461845907);
            i3 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
        }
        int i7 = length & 3;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i = (bArr[i2 + 2] & 255) << 16;
                }
                int i8 = i3 ^ length;
                int i9 = (i8 ^ (i8 >>> 16)) * -2048144789;
                int i10 = (i9 ^ (i9 >>> 13)) * -1028477387;
                return i10 ^ (i10 >>> 16);
            }
            i |= (bArr[i2 + 1] & 255) << 8;
        }
        int i11 = ((bArr[i2] & 255) | i) * -862048943;
        i3 ^= ((i11 >>> 17) | (i11 << 15)) * 461845907;
        int i82 = i3 ^ length;
        int i92 = (i82 ^ (i82 >>> 16)) * -2048144789;
        int i102 = (i92 ^ (i92 >>> 13)) * -1028477387;
        return i102 ^ (i102 >>> 16);
    }
}
