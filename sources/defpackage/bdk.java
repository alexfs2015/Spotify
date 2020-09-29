package defpackage;

import java.io.File;
import java.util.regex.Pattern;

/* renamed from: bdk reason: default package */
final class bdk extends bda {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    bdk(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0063, code lost:
        if (r16.renameTo(r1) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (r1 == null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.bdk a(java.io.File r16, defpackage.bdd r17) {
        /*
            r0 = r17
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L_0x0070
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L_0x002d
            java.lang.String r1 = r2.group(r5)
            java.lang.String r1 = defpackage.ben.j(r1)
            if (r1 != 0) goto L_0x003f
            goto L_0x0039
        L_0x002d:
            java.util.regex.Pattern r2 = g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 != 0) goto L_0x003b
        L_0x0039:
            r1 = r6
            goto L_0x0066
        L_0x003b:
            java.lang.String r1 = r2.group(r5)
        L_0x003f:
            java.io.File r7 = r16.getParentFile()
            bdc r1 = r0.a(r1)
            int r8 = r1.a
            java.lang.String r1 = r2.group(r4)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = a(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L_0x0066
            goto L_0x0039
        L_0x0066:
            if (r1 != 0) goto L_0x0069
            return r6
        L_0x0069:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L_0x0073
        L_0x0070:
            r2 = r16
            r15 = r2
        L_0x0073:
            java.util.regex.Pattern r2 = i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L_0x0080
            return r6
        L_0x0080:
            long r11 = r15.length()
            java.lang.String r2 = r1.group(r5)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray<java.lang.String> r0 = r0.b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x0098
            return r6
        L_0x0098:
            bdk r0 = new bdk
            java.lang.String r2 = r1.group(r4)
            long r9 = java.lang.Long.parseLong(r2)
            java.lang.String r1 = r1.group(r3)
            long r13 = java.lang.Long.parseLong(r1)
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdk.a(java.io.File, bdd):bdk");
    }

    public static bdk a(String str, long j) {
        bdk bdk = new bdk(str, j, -1, -9223372036854775807L, null);
        return bdk;
    }

    public static bdk a(String str, long j, long j2) {
        bdk bdk = new bdk(str, j, j2, -9223372036854775807L, null);
        return bdk;
    }

    public static File a(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        String str = ".";
        sb.append(str);
        sb.append(j);
        sb.append(str);
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }

    public static bdk b(String str, long j) {
        bdk bdk = new bdk(str, j, -1, -9223372036854775807L, null);
        return bdk;
    }
}
