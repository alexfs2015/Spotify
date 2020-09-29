package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: wlp reason: default package */
public final class wlp {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private wlp(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.g = j2;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x025d, code lost:
        if (r0 > 253402300799999L) goto L_0x0265;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.wlp a(long r30, defpackage.wlx r32, java.lang.String r33) {
        /*
            r0 = r33
            java.lang.String r1 = "."
            int r2 = r33.length()
            r3 = 59
            r4 = 0
            int r5 = defpackage.wmk.a(r0, r4, r2, r3)
            r6 = 61
            int r7 = defpackage.wmk.a(r0, r4, r5, r6)
            r8 = 0
            if (r7 != r5) goto L_0x0019
            return r8
        L_0x0019:
            java.lang.String r10 = defpackage.wmk.c(r0, r4, r7)
            boolean r9 = r10.isEmpty()
            if (r9 != 0) goto L_0x02ea
            int r9 = defpackage.wmk.b(r10)
            r11 = -1
            if (r9 == r11) goto L_0x002c
            goto L_0x02ea
        L_0x002c:
            r9 = 1
            int r7 = r7 + r9
            java.lang.String r7 = defpackage.wmk.c(r0, r7, r5)
            int r12 = defpackage.wmk.b(r7)
            if (r12 == r11) goto L_0x0039
            return r8
        L_0x0039:
            int r5 = r5 + r9
            r20 = r8
            r16 = -1
            r19 = 0
            r21 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r23 = 0
            r24 = 1
            r25 = 0
        L_0x004b:
            if (r5 >= r2) goto L_0x022d
            int r14 = defpackage.wmk.a(r0, r5, r2, r3)
            int r15 = defpackage.wmk.a(r0, r5, r14, r6)
            java.lang.String r5 = defpackage.wmk.c(r0, r5, r15)
            if (r15 >= r14) goto L_0x0062
            int r15 = r15 + 1
            java.lang.String r15 = defpackage.wmk.c(r0, r15, r14)
            goto L_0x0064
        L_0x0062:
            java.lang.String r15 = ""
        L_0x0064:
            java.lang.String r6 = "expires"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x01c0
            int r5 = r15.length()     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r6 = a(r15, r4, r5, r4)     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Pattern r12 = f     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Matcher r12 = r12.matcher(r15)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r3 = -1
            r4 = -1
            r13 = -1
            r26 = -1
            r27 = -1
            r28 = -1
        L_0x0083:
            if (r6 >= r5) goto L_0x0127
            int r11 = r6 + 1
            int r11 = a(r15, r11, r5, r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r12.region(r6, r11)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r6 = -1
            if (r3 != r6) goto L_0x00bc
            java.util.regex.Pattern r6 = f     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Matcher r6 = r12.usePattern(r6)     // Catch:{ IllegalArgumentException -> 0x01bd }
            boolean r6 = r6.matches()     // Catch:{ IllegalArgumentException -> 0x01bd }
            if (r6 == 0) goto L_0x00bc
            java.lang.String r3 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r6 = 2
            java.lang.String r6 = r12.group(r6)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r9 = 3
            java.lang.String r9 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r27 = r6
            r28 = r9
            goto L_0x011c
        L_0x00bc:
            r6 = r26
            r9 = -1
            if (r6 != r9) goto L_0x00d8
            java.util.regex.Pattern r9 = e     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01bd }
            if (r9 == 0) goto L_0x00d7
            r9 = 1
            java.lang.String r6 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ IllegalArgumentException -> 0x01bd }
            goto L_0x011a
        L_0x00d7:
            r9 = -1
        L_0x00d8:
            if (r4 != r9) goto L_0x00ff
            java.util.regex.Pattern r9 = d     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01bd }
            if (r9 == 0) goto L_0x00fe
            r9 = 1
            java.lang.String r4 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.lang.String r4 = r4.toLowerCase(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Pattern r9 = d     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.lang.String r9 = r9.pattern()     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r4 = r9.indexOf(r4)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r4 = r4 / 4
            goto L_0x011a
        L_0x00fe:
            r9 = -1
        L_0x00ff:
            if (r13 != r9) goto L_0x011a
            java.util.regex.Pattern r9 = c     // Catch:{ IllegalArgumentException -> 0x01bd }
            java.util.regex.Matcher r9 = r12.usePattern(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            boolean r9 = r9.matches()     // Catch:{ IllegalArgumentException -> 0x01bd }
            if (r9 == 0) goto L_0x011a
            r9 = 1
            java.lang.String r13 = r12.group(r9)     // Catch:{ IllegalArgumentException -> 0x01bd }
            int r9 = java.lang.Integer.parseInt(r13)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r26 = r6
            r13 = r9
            goto L_0x011c
        L_0x011a:
            r26 = r6
        L_0x011c:
            int r11 = r11 + 1
            r6 = 0
            int r9 = a(r15, r11, r5, r6)     // Catch:{ IllegalArgumentException -> 0x01bd }
            r6 = r9
            r9 = 1
            goto L_0x0083
        L_0x0127:
            r6 = r26
            r5 = 70
            if (r13 < r5) goto L_0x0133
            r5 = 99
            if (r13 > r5) goto L_0x0133
            int r13 = r13 + 1900
        L_0x0133:
            if (r13 < 0) goto L_0x013b
            r5 = 69
            if (r13 > r5) goto L_0x013b
            int r13 = r13 + 2000
        L_0x013b:
            r5 = 1601(0x641, float:2.243E-42)
            if (r13 < r5) goto L_0x01b5
            r9 = -1
            if (r4 == r9) goto L_0x01ad
            if (r6 <= 0) goto L_0x01a5
            r5 = 31
            if (r6 > r5) goto L_0x01a5
            if (r3 < 0) goto L_0x019d
            r5 = 23
            if (r3 > r5) goto L_0x019d
            r11 = r27
            r12 = 59
            if (r11 < 0) goto L_0x0197
            if (r11 > r12) goto L_0x0197
            r5 = r28
            if (r5 < 0) goto L_0x0191
            if (r5 > r12) goto L_0x0191
            java.util.GregorianCalendar r15 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x0222 }
            java.util.TimeZone r9 = defpackage.wmk.f     // Catch:{ IllegalArgumentException -> 0x0222 }
            r15.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r9 = 0
            r15.setLenient(r9)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r9 = 1
            r15.set(r9, r13)     // Catch:{ IllegalArgumentException -> 0x0222 }
            int r4 = r4 + -1
            r9 = 2
            r15.set(r9, r4)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r4 = 5
            r15.set(r4, r6)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r4 = 11
            r15.set(r4, r3)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3 = 12
            r15.set(r3, r11)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3 = 13
            r15.set(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3 = 14
            r4 = 0
            r15.set(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0222 }
            long r3 = r15.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x0222 }
            r21 = r3
            goto L_0x01d0
        L_0x0191:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x0197:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x019d:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01a5:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01ad:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01b5:
            r12 = 59
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01bd:
            r12 = 59
            goto L_0x0222
        L_0x01c0:
            r12 = 59
            java.lang.String r3 = "max-age"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x01d3
            long r3 = a(r15)     // Catch:{  }
            r16 = r3
        L_0x01d0:
            r25 = 1
            goto L_0x0222
        L_0x01d3:
            java.lang.String r3 = "domain"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0202
            boolean r3 = r15.endsWith(r1)     // Catch:{ IllegalArgumentException -> 0x0222 }
            if (r3 != 0) goto L_0x01fc
            boolean r3 = r15.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x0222 }
            if (r3 == 0) goto L_0x01ec
            r3 = 1
            java.lang.String r15 = r15.substring(r3)     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01ec:
            java.lang.String r3 = defpackage.wmk.a(r15)     // Catch:{ IllegalArgumentException -> 0x0222 }
            if (r3 == 0) goto L_0x01f6
            r8 = r3
            r24 = 0
            goto L_0x0222
        L_0x01f6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x01fc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0222 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x0222 }
            throw r3     // Catch:{ IllegalArgumentException -> 0x0222 }
        L_0x0202:
            java.lang.String r3 = "path"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x020d
            r20 = r15
            goto L_0x0222
        L_0x020d:
            java.lang.String r3 = "secure"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0218
            r19 = 1
            goto L_0x0222
        L_0x0218:
            java.lang.String r3 = "httponly"
            boolean r3 = r5.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0222
            r23 = 1
        L_0x0222:
            int r5 = r14 + 1
            r3 = 59
            r4 = 0
            r6 = 61
            r9 = 1
            r11 = -1
            goto L_0x004b
        L_0x022d:
            r0 = -9223372036854775808
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0237
        L_0x0233:
            r12 = r0
            r0 = r32
            goto L_0x026d
        L_0x0237:
            r0 = -1
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0269
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r2 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x024b
            r0 = 1000(0x3e8, double:4.94E-321)
            long r16 = r16 * r0
            goto L_0x0250
        L_0x024b:
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0250:
            long r0 = r30 + r16
            int r2 = (r0 > r30 ? 1 : (r0 == r30 ? 0 : -1))
            if (r2 < 0) goto L_0x0260
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0233
            goto L_0x0265
        L_0x0260:
            r2 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0265:
            r0 = r32
            r12 = r2
            goto L_0x026d
        L_0x0269:
            r0 = r32
            r12 = r21
        L_0x026d:
            java.lang.String r1 = r0.b
            if (r8 != 0) goto L_0x0274
            r14 = r1
            r2 = 0
            goto L_0x02a4
        L_0x0274:
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L_0x027d
        L_0x027a:
            r29 = 1
            goto L_0x029f
        L_0x027d:
            boolean r2 = r1.endsWith(r8)
            if (r2 == 0) goto L_0x029d
            int r2 = r1.length()
            int r3 = r8.length()
            int r2 = r2 - r3
            r9 = 1
            int r2 = r2 - r9
            char r2 = r1.charAt(r2)
            r3 = 46
            if (r2 != r3) goto L_0x029d
            boolean r2 = defpackage.wmk.c(r1)
            if (r2 != 0) goto L_0x029d
            goto L_0x027a
        L_0x029d:
            r29 = 0
        L_0x029f:
            r2 = 0
            if (r29 != 0) goto L_0x02a3
            return r2
        L_0x02a3:
            r14 = r8
        L_0x02a4:
            int r1 = r1.length()
            int r3 = r14.length()
            if (r1 == r3) goto L_0x02b9
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a()
            java.lang.String r1 = r1.a(r14)
            if (r1 != 0) goto L_0x02b9
            return r2
        L_0x02b9:
            java.lang.String r1 = "/"
            r8 = r20
            if (r8 == 0) goto L_0x02c8
            boolean r2 = r8.startsWith(r1)
            if (r2 != 0) goto L_0x02c6
            goto L_0x02c8
        L_0x02c6:
            r15 = r8
            goto L_0x02da
        L_0x02c8:
            java.lang.String r0 = r32.f()
            r2 = 47
            int r2 = r0.lastIndexOf(r2)
            if (r2 == 0) goto L_0x02d9
            r3 = 0
            java.lang.String r1 = r0.substring(r3, r2)
        L_0x02d9:
            r15 = r1
        L_0x02da:
            wlp r0 = new wlp
            r9 = r0
            r11 = r7
            r16 = r19
            r17 = r23
            r18 = r24
            r19 = r25
            r9.<init>(r10, r11, r12, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x02ea:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlp.a(long, wlx, java.lang.String):wlp");
    }

    private static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e2) {
            if (!str.matches("-?\\d+")) {
                throw e2;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    public static List<wlp> a(wlx wlx, wlw wlw) {
        List b2 = wlw.b("Set-Cookie");
        int size = b2.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            wlp a2 = a(System.currentTimeMillis(), wlx, (String) b2.get(i2));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wlp)) {
            return false;
        }
        wlp wlp = (wlp) obj;
        if (wlp.a.equals(this.a) && wlp.b.equals(this.b) && wlp.h.equals(this.h) && wlp.i.equals(this.i) && wlp.g == this.g && wlp.j == this.j && wlp.k == this.k && wlp.l == this.l && wlp.m == this.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        long j2 = this.g;
        return ((((((((hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.j ^ true ? 1 : 0)) * 31) + (this.k ^ true ? 1 : 0)) * 31) + (this.l ^ true ? 1 : 0)) * 31) + (this.m ^ true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(wna.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
