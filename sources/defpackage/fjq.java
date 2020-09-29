package defpackage;

import java.util.TimeZone;

/* renamed from: fjq reason: default package */
public final class fjq {
    private static final TimeZone a = TimeZone.getTimeZone("UTC");

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a6 A[Catch:{ IllegalArgumentException | IndexOutOfBoundsException | NumberFormatException -> 0x01ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r3 = r0 + 4
            int r0 = a(r1, r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r4 = 45
            boolean r5 = a(r1, r3, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = a(r1, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            boolean r6 = a(r1, r5, r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = a(r1, r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r7 = 84
            boolean r7 = a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r2.setIndex(r6)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.util.Date r0 = r4.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00bf
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = a(r1, r6, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r13 = 58
            boolean r14 = a(r1, r7, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = a(r1, r7, r14)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            boolean r13 = a(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r13 <= r14) goto L_0x00c2
            char r13 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r13 == r10) goto L_0x00c2
            if (r13 == r9) goto L_0x00c2
            if (r13 == r4) goto L_0x00c2
            int r13 = r14 + 2
            int r14 = a(r1, r14, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = a(r1, r13, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r15 == 0) goto L_0x00bc
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = a(r1, r15)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r16 = a(r1, r13, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r11 = r11 - r13
            if (r11 == r8) goto L_0x00b5
            if (r11 == r12) goto L_0x00b2
        L_0x00af:
            r11 = r16
            goto L_0x00b8
        L_0x00b2:
            int r16 = r16 * 10
            goto L_0x00af
        L_0x00b5:
            int r16 = r16 * 100
            goto L_0x00af
        L_0x00b8:
            r13 = r11
            r11 = r14
            r14 = r15
            goto L_0x00c4
        L_0x00bc:
            r11 = r14
            r14 = r13
            goto L_0x00c3
        L_0x00bf:
            r14 = r6
            r6 = 0
            r7 = 0
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            int r15 = r17.length()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r15 <= r14) goto L_0x01a6
            char r15 = r1.charAt(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r12 = 5
            if (r15 != r10) goto L_0x00d6
            java.util.TimeZone r4 = a     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r14 = r14 + r8
            goto L_0x0175
        L_0x00d6:
            if (r15 == r9) goto L_0x00f4
            if (r15 != r4) goto L_0x00db
            goto L_0x00f4
        L_0x00db:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r3.append(r15)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
        L_0x00f4:
            java.lang.String r4 = r1.substring(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r9 < r12) goto L_0x00ff
            goto L_0x0110
        L_0x00ff:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r9.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = "00"
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
        L_0x0110:
            int r9 = r4.length()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r14 = r14 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r9 != 0) goto L_0x0173
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r9 == 0) goto L_0x0126
            goto L_0x0173
        L_0x0126:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r10 = "GMT"
            r9.<init>(r10)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r9.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = r9.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r10 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            boolean r15 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r15 != 0) goto L_0x0171
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            boolean r10 = r10.equals(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            if (r10 == 0) goto L_0x0151
            goto L_0x0171
        L_0x0151:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.<init>(r5)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r4 = r9.getID()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r3.append(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r3 = r3.toString()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
        L_0x0171:
            r4 = r9
            goto L_0x0175
        L_0x0173:
            java.util.TimeZone r4 = a     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
        L_0x0175:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r9.<init>(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r9.set(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0 = 13
            r9.set(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r0 = 14
            r9.set(r0, r13)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            r2.setIndex(r14)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.util.Date r0 = r9.getTime()     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            return r0
        L_0x01a6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
            throw r0     // Catch:{ IndexOutOfBoundsException -> 0x01b2, NumberFormatException -> 0x01b0, IllegalArgumentException -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            goto L_0x01b3
        L_0x01b0:
            r0 = move-exception
            goto L_0x01b3
        L_0x01b2:
            r0 = move-exception
        L_0x01b3:
            if (r1 != 0) goto L_0x01b7
            r1 = 0
            goto L_0x01ca
        L_0x01b7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01ca:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01d6
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01f1
        L_0x01d6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01f1:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = "]: "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            goto L_0x0215
        L_0x0214:
            throw r4
        L_0x0215:
            goto L_0x0214
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjq.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean a(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int a(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        String str2 = "Invalid number: ";
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit >= 0) {
                i3 = -digit;
            } else {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(str.substring(i, i2));
                throw new NumberFormatException(sb.toString());
            }
        } else {
            i4 = i;
            i3 = 0;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 >= 0) {
                i3 = (i3 * 10) - digit2;
                i4 = i5;
            } else {
                StringBuilder sb2 = new StringBuilder(str2);
                sb2.append(str.substring(i, i2));
                throw new NumberFormatException(sb2.toString());
            }
        }
        return -i3;
    }

    private static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
