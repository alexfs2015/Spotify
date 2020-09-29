package com.fasterxml.jackson.databind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

@Deprecated
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", new Object[]{Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))}));
        if (z) {
            sb.append(String.format(".%03d", new Object[]{Integer.valueOf(gregorianCalendar.get(14))}));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? '-' : '+');
            objArr[1] = Integer.valueOf(abs);
            objArr[2] = Integer.valueOf(abs2);
            sb.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[Catch:{ Exception -> 0x0195 }] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018d A[Catch:{ Exception -> 0x0195 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Date parse(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            r1 = r17
            r2 = r18
            int r0 = r18.getIndex()     // Catch:{ Exception -> 0x0195 }
            int r3 = r0 + 4
            int r0 = parseInt(r1, r0, r3)     // Catch:{ Exception -> 0x0195 }
            r4 = 45
            boolean r5 = checkOffset(r1, r3, r4)     // Catch:{ Exception -> 0x0195 }
            if (r5 == 0) goto L_0x0018
            int r3 = r3 + 1
        L_0x0018:
            int r5 = r3 + 2
            int r3 = parseInt(r1, r3, r5)     // Catch:{ Exception -> 0x0195 }
            boolean r6 = checkOffset(r1, r5, r4)     // Catch:{ Exception -> 0x0195 }
            if (r6 == 0) goto L_0x0026
            int r5 = r5 + 1
        L_0x0026:
            int r6 = r5 + 2
            int r5 = parseInt(r1, r5, r6)     // Catch:{ Exception -> 0x0195 }
            r7 = 84
            boolean r7 = checkOffset(r1, r6, r7)     // Catch:{ Exception -> 0x0195 }
            r8 = 1
            if (r7 != 0) goto L_0x0049
            int r9 = r17.length()     // Catch:{ Exception -> 0x0195 }
            if (r9 > r6) goto L_0x0049
            java.util.GregorianCalendar r4 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x0195 }
            int r3 = r3 - r8
            r4.<init>(r0, r3, r5)     // Catch:{ Exception -> 0x0195 }
            r2.setIndex(r6)     // Catch:{ Exception -> 0x0195 }
            java.util.Date r0 = r4.getTime()     // Catch:{ Exception -> 0x0195 }
            return r0
        L_0x0049:
            r9 = 43
            r10 = 90
            r12 = 2
            if (r7 == 0) goto L_0x00bf
            int r6 = r6 + 1
            int r7 = r6 + 2
            int r6 = parseInt(r1, r6, r7)     // Catch:{ Exception -> 0x0195 }
            r13 = 58
            boolean r14 = checkOffset(r1, r7, r13)     // Catch:{ Exception -> 0x0195 }
            if (r14 == 0) goto L_0x0062
            int r7 = r7 + 1
        L_0x0062:
            int r14 = r7 + 2
            int r7 = parseInt(r1, r7, r14)     // Catch:{ Exception -> 0x0195 }
            boolean r13 = checkOffset(r1, r14, r13)     // Catch:{ Exception -> 0x0195 }
            if (r13 == 0) goto L_0x0070
            int r14 = r14 + 1
        L_0x0070:
            int r13 = r17.length()     // Catch:{ Exception -> 0x0195 }
            if (r13 <= r14) goto L_0x00c2
            char r13 = r1.charAt(r14)     // Catch:{ Exception -> 0x0195 }
            if (r13 == r10) goto L_0x00c2
            if (r13 == r9) goto L_0x00c2
            if (r13 == r4) goto L_0x00c2
            int r13 = r14 + 2
            int r14 = parseInt(r1, r14, r13)     // Catch:{ Exception -> 0x0195 }
            r15 = 59
            if (r14 <= r15) goto L_0x0090
            r15 = 63
            if (r14 >= r15) goto L_0x0090
            r14 = 59
        L_0x0090:
            r15 = 46
            boolean r15 = checkOffset(r1, r13, r15)     // Catch:{ Exception -> 0x0195 }
            if (r15 == 0) goto L_0x00bc
            int r13 = r13 + 1
            int r15 = r13 + 1
            int r15 = indexOfNonDigit(r1, r15)     // Catch:{ Exception -> 0x0195 }
            int r11 = r13 + 3
            int r11 = java.lang.Math.min(r15, r11)     // Catch:{ Exception -> 0x0195 }
            int r16 = parseInt(r1, r13, r11)     // Catch:{ Exception -> 0x0195 }
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
            int r15 = r17.length()     // Catch:{ Exception -> 0x0195 }
            if (r15 <= r14) goto L_0x018d
            char r15 = r1.charAt(r14)     // Catch:{ Exception -> 0x0195 }
            if (r15 != r10) goto L_0x00d5
            java.util.TimeZone r4 = TIMEZONE_Z     // Catch:{ Exception -> 0x0195 }
            int r14 = r14 + r8
            goto L_0x015c
        L_0x00d5:
            if (r15 == r9) goto L_0x00f3
            if (r15 != r4) goto L_0x00da
            goto L_0x00f3
        L_0x00da:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x0195 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = "Invalid time zone indicator '"
            r3.<init>(r4)     // Catch:{ Exception -> 0x0195 }
            r3.append(r15)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = "'"
            r3.append(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0195 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0195 }
            throw r0     // Catch:{ Exception -> 0x0195 }
        L_0x00f3:
            java.lang.String r4 = r1.substring(r14)     // Catch:{ Exception -> 0x0195 }
            int r9 = r4.length()     // Catch:{ Exception -> 0x0195 }
            int r14 = r14 + r9
            java.lang.String r9 = "+0000"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x0195 }
            if (r9 != 0) goto L_0x015a
            java.lang.String r9 = "+00:00"
            boolean r9 = r9.equals(r4)     // Catch:{ Exception -> 0x0195 }
            if (r9 == 0) goto L_0x010d
            goto L_0x015a
        L_0x010d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            java.lang.String r10 = "GMT"
            r9.<init>(r10)     // Catch:{ Exception -> 0x0195 }
            r9.append(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = r9.toString()     // Catch:{ Exception -> 0x0195 }
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r10 = r9.getID()     // Catch:{ Exception -> 0x0195 }
            boolean r15 = r10.equals(r4)     // Catch:{ Exception -> 0x0195 }
            if (r15 != 0) goto L_0x0158
            java.lang.String r15 = ":"
            java.lang.String r12 = ""
            java.lang.String r10 = r10.replace(r15, r12)     // Catch:{ Exception -> 0x0195 }
            boolean r10 = r10.equals(r4)     // Catch:{ Exception -> 0x0195 }
            if (r10 == 0) goto L_0x0138
            goto L_0x0158
        L_0x0138:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch:{ Exception -> 0x0195 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0195 }
            java.lang.String r5 = "Mismatching time zone indicator: "
            r3.<init>(r5)     // Catch:{ Exception -> 0x0195 }
            r3.append(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = " given, resolves to "
            r3.append(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r4 = r9.getID()     // Catch:{ Exception -> 0x0195 }
            r3.append(r4)     // Catch:{ Exception -> 0x0195 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0195 }
            r0.<init>(r3)     // Catch:{ Exception -> 0x0195 }
            throw r0     // Catch:{ Exception -> 0x0195 }
        L_0x0158:
            r4 = r9
            goto L_0x015c
        L_0x015a:
            java.util.TimeZone r4 = TIMEZONE_Z     // Catch:{ Exception -> 0x0195 }
        L_0x015c:
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar     // Catch:{ Exception -> 0x0195 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0195 }
            r4 = 0
            r9.setLenient(r4)     // Catch:{ Exception -> 0x0195 }
            r9.set(r8, r0)     // Catch:{ Exception -> 0x0195 }
            int r3 = r3 - r8
            r0 = 2
            r9.set(r0, r3)     // Catch:{ Exception -> 0x0195 }
            r0 = 5
            r9.set(r0, r5)     // Catch:{ Exception -> 0x0195 }
            r0 = 11
            r9.set(r0, r6)     // Catch:{ Exception -> 0x0195 }
            r0 = 12
            r9.set(r0, r7)     // Catch:{ Exception -> 0x0195 }
            r0 = 13
            r9.set(r0, r11)     // Catch:{ Exception -> 0x0195 }
            r0 = 14
            r9.set(r0, r13)     // Catch:{ Exception -> 0x0195 }
            r2.setIndex(r14)     // Catch:{ Exception -> 0x0195 }
            java.util.Date r0 = r9.getTime()     // Catch:{ Exception -> 0x0195 }
            return r0
        L_0x018d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0195 }
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch:{ Exception -> 0x0195 }
            throw r0     // Catch:{ Exception -> 0x0195 }
        L_0x0195:
            r0 = move-exception
            if (r1 != 0) goto L_0x019a
            r1 = 0
            goto L_0x01ad
        L_0x019a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            r3.append(r1)
            r1 = 34
            r3.append(r1)
            java.lang.String r1 = r3.toString()
        L_0x01ad:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L_0x01b9
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x01d4
        L_0x01b9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = ")"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x01d4:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r1 = ": "
            r5.append(r1)
            r5.append(r3)
            java.lang.String r1 = r5.toString()
            int r2 = r18.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            goto L_0x01f8
        L_0x01f7:
            throw r4
        L_0x01f8:
            goto L_0x01f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int parseInt(String str, int i, int i2) {
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
}
