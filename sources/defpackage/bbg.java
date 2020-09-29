package defpackage;

import java.util.regex.Pattern;

/* renamed from: bbg reason: default package */
final class bbg {
    private static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private final bea b = new bea();
    private final StringBuilder c = new StringBuilder();

    private static String a(bea bea, StringBuilder sb) {
        b(bea);
        if (bea.b() == 0) {
            return null;
        }
        String b2 = b(bea, sb);
        if (!"".equals(b2)) {
            return b2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) bea.c());
        return sb2.toString();
    }

    private static String b(bea bea, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = bea.b;
        int i2 = bea.c;
        while (i < i2 && !z) {
            char c2 = (char) bea.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        bea.d(i - bea.b);
        return sb.toString();
    }

    private static void b(bea bea) {
        while (true) {
            boolean z = true;
            while (bea.b() > 0 && z) {
                if (!c(bea) && !d(bea)) {
                    z = false;
                }
            }
            return;
        }
    }

    private static boolean c(bea bea) {
        char c2 = (char) bea.a[bea.b];
        if (c2 != 9 && c2 != 10 && c2 != 12 && c2 != 13 && c2 != ' ') {
            return false;
        }
        bea.d(1);
        return true;
    }

    private static boolean d(bea bea) {
        int i = bea.b;
        int i2 = bea.c;
        byte[] bArr = bea.a;
        if (i + 2 <= i2) {
            int i3 = i + 1;
            if (bArr[i] == 47) {
                int i4 = i3 + 1;
                if (bArr[i3] == 42) {
                    while (true) {
                        int i5 = i4 + 1;
                        if (i5 >= i2) {
                            bea.d(i2 - bea.b);
                            return true;
                        } else if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                            i4 = i5 + 1;
                            i2 = i4;
                        } else {
                            i4 = i5;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r1 != null) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0210 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x020a A[EDGE_INSN: B:115:0x020a->B:106:0x020a ?: BREAK  
    EDGE_INSN: B:115:0x020a->B:106:0x020a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bbj a(defpackage.bea r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.StringBuilder r2 = r0.c
            r3 = 0
            r2.setLength(r3)
            int r2 = r1.b
        L_0x000c:
            java.lang.String r4 = r18.r()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x000c
            bea r4 = r0.b
            byte[] r5 = r1.a
            int r1 = r1.b
            r4.a(r5, r1)
            bea r1 = r0.b
            r1.c(r2)
            bea r1 = r0.b
            java.lang.StringBuilder r2 = r0.c
            b(r1)
            int r4 = r1.b()
            java.lang.String r5 = "{"
            r6 = 5
            r7 = -1
            java.lang.String r8 = ""
            r9 = 0
            r10 = 1
            if (r4 >= r6) goto L_0x003b
        L_0x0039:
            r4 = r9
            goto L_0x009a
        L_0x003b:
            java.lang.String r4 = r1.e(r6)
            java.lang.String r6 = "::cue"
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L_0x0048
            goto L_0x0039
        L_0x0048:
            int r4 = r1.b
            java.lang.String r6 = a(r1, r2)
            if (r6 != 0) goto L_0x0051
            goto L_0x0039
        L_0x0051:
            boolean r11 = r5.equals(r6)
            if (r11 == 0) goto L_0x005c
            r1.c(r4)
            r4 = r8
            goto L_0x009a
        L_0x005c:
            java.lang.String r4 = "("
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x008a
            int r4 = r1.b
            int r6 = r1.c
            r11 = 0
        L_0x0069:
            if (r4 >= r6) goto L_0x007d
            if (r11 != 0) goto L_0x007d
            byte[] r11 = r1.a
            int r12 = r4 + 1
            byte r4 = r11[r4]
            char r4 = (char) r4
            r11 = 41
            if (r4 != r11) goto L_0x007a
            r11 = 1
            goto L_0x007b
        L_0x007a:
            r11 = 0
        L_0x007b:
            r4 = r12
            goto L_0x0069
        L_0x007d:
            int r4 = r4 + r7
            int r6 = r1.b
            int r4 = r4 - r6
            java.lang.String r4 = r1.e(r4)
            java.lang.String r4 = r4.trim()
            goto L_0x008b
        L_0x008a:
            r4 = r9
        L_0x008b:
            java.lang.String r1 = a(r1, r2)
            java.lang.String r2 = ")"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0039
            if (r1 != 0) goto L_0x009a
            goto L_0x0039
        L_0x009a:
            if (r4 == 0) goto L_0x0211
            bea r1 = r0.b
            java.lang.StringBuilder r2 = r0.c
            java.lang.String r1 = a(r1, r2)
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x00ac
            goto L_0x0211
        L_0x00ac:
            bbj r1 = new bbj
            r1.<init>()
            boolean r2 = r8.equals(r4)
            if (r2 != 0) goto L_0x0109
            r2 = 91
            int r2 = r4.indexOf(r2)
            if (r2 == r7) goto L_0x00d9
            java.util.regex.Pattern r5 = a
            java.lang.String r6 = r4.substring(r2)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.matches()
            if (r6 == 0) goto L_0x00d5
            java.lang.String r5 = r5.group(r10)
            r1.d = r5
        L_0x00d5:
            java.lang.String r4 = r4.substring(r3, r2)
        L_0x00d9:
            java.lang.String r2 = "\\."
            java.lang.String[] r2 = defpackage.ben.a(r4, r2)
            r4 = r2[r3]
            r5 = 35
            int r5 = r4.indexOf(r5)
            if (r5 == r7) goto L_0x00f7
            java.lang.String r6 = r4.substring(r3, r5)
            r1.b = r6
            int r5 = r5 + r10
            java.lang.String r4 = r4.substring(r5)
            r1.a = r4
            goto L_0x00f9
        L_0x00f7:
            r1.b = r4
        L_0x00f9:
            int r4 = r2.length
            if (r4 <= r10) goto L_0x0109
            int r4 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r2, r10, r4)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            r1.c = r2
        L_0x0109:
            r4 = r9
            r2 = 0
        L_0x010b:
            java.lang.String r5 = "}"
            if (r2 != 0) goto L_0x020a
            bea r2 = r0.b
            int r2 = r2.b
            bea r4 = r0.b
            java.lang.StringBuilder r6 = r0.c
            java.lang.String r4 = a(r4, r6)
            if (r4 == 0) goto L_0x0126
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L_0x0124
            goto L_0x0126
        L_0x0124:
            r6 = 0
            goto L_0x0127
        L_0x0126:
            r6 = 1
        L_0x0127:
            if (r6 != 0) goto L_0x0206
            bea r7 = r0.b
            r7.c(r2)
            bea r2 = r0.b
            java.lang.StringBuilder r7 = r0.c
            b(r2)
            java.lang.String r11 = b(r2, r7)
            boolean r12 = r8.equals(r11)
            if (r12 != 0) goto L_0x0206
            java.lang.String r12 = a(r2, r7)
            java.lang.String r13 = ":"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x0206
            b(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r13 = 0
        L_0x0154:
            java.lang.String r14 = ";"
            if (r13 != 0) goto L_0x017a
            int r15 = r2.b
            java.lang.String r3 = a(r2, r7)
            if (r3 != 0) goto L_0x0162
            r3 = r9
            goto L_0x017e
        L_0x0162:
            boolean r16 = r5.equals(r3)
            if (r16 != 0) goto L_0x0174
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x016f
            goto L_0x0174
        L_0x016f:
            r12.append(r3)
            r3 = 0
            goto L_0x0154
        L_0x0174:
            r2.c(r15)
            r3 = 0
            r13 = 1
            goto L_0x0154
        L_0x017a:
            java.lang.String r3 = r12.toString()
        L_0x017e:
            if (r3 == 0) goto L_0x0206
            boolean r12 = r8.equals(r3)
            if (r12 == 0) goto L_0x0188
            goto L_0x0206
        L_0x0188:
            int r12 = r2.b
            java.lang.String r7 = a(r2, r7)
            boolean r13 = r14.equals(r7)
            if (r13 != 0) goto L_0x019d
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0206
            r2.c(r12)
        L_0x019d:
            java.lang.String r2 = "color"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01ae
            int r2 = defpackage.bdp.b(r3)
            r1.f = r2
            r1.g = r10
            goto L_0x0206
        L_0x01ae:
            java.lang.String r2 = "background-color"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01bf
            int r2 = defpackage.bdp.b(r3)
            r1.h = r2
            r1.i = r10
            goto L_0x0206
        L_0x01bf:
            java.lang.String r2 = "text-decoration"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01d2
            java.lang.String r2 = "underline"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0206
            r1.k = r10
            goto L_0x0206
        L_0x01d2:
            java.lang.String r2 = "font-family"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01e1
            java.lang.String r2 = defpackage.ben.d(r3)
            r1.e = r2
            goto L_0x0206
        L_0x01e1:
            java.lang.String r2 = "font-weight"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x01f4
            java.lang.String r2 = "bold"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0206
            r1.l = r10
            goto L_0x0206
        L_0x01f4:
            java.lang.String r2 = "font-style"
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0206
            java.lang.String r2 = "italic"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0206
            r1.m = r10
        L_0x0206:
            r2 = r6
            r3 = 0
            goto L_0x010b
        L_0x020a:
            boolean r2 = r5.equals(r4)
            if (r2 == 0) goto L_0x0211
            return r1
        L_0x0211:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbg.a(bea):bbj");
    }
}
