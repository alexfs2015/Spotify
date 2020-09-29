package defpackage;

@cfp
/* renamed from: dng reason: default package */
public final class dng {
    private final dmv a;
    private final int b;
    private String c;
    private String d;
    private final boolean e = false;
    private final int f;
    private final int g;

    public dng(int i, int i2, int i3) {
        this.b = i;
        if (i2 > 64 || i2 < 0) {
            this.f = 64;
        } else {
            this.f = i2;
        }
        if (i3 <= 0) {
            this.g = 1;
        } else {
            this.g = i3;
        }
        this.a = new dne(this.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0106, code lost:
        if (r2.size() < r1.b) goto L_0x010a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0111 A[LOOP:0: B:1:0x0012->B:65:0x0111, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0115 A[EDGE_INSN: B:76:0x0115->B:66:0x0115 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.util.ArrayList<java.lang.String> r17, java.util.ArrayList<defpackage.dmu> r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            dnh r2 = new dnh
            r2.<init>()
            java.util.Collections.sort(r0, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r4 = 0
        L_0x0012:
            int r5 = r18.size()
            java.lang.String r6 = ""
            if (r4 >= r5) goto L_0x0115
            java.lang.Object r5 = r0.get(r4)
            dmu r5 = (defpackage.dmu) r5
            int r5 = r5.e
            r7 = r17
            java.lang.Object r5 = r7.get(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.text.Normalizer$Form r8 = java.text.Normalizer.Form.NFKC
            java.lang.String r5 = java.text.Normalizer.normalize(r5, r8)
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r5 = r5.toLowerCase(r8)
            java.lang.String r8 = "\n"
            java.lang.String[] r5 = r5.split(r8)
            int r8 = r5.length
            if (r8 == 0) goto L_0x010e
            r8 = 0
        L_0x0040:
            int r10 = r5.length
            if (r8 >= r10) goto L_0x010e
            r10 = r5[r8]
            java.lang.String r11 = "'"
            int r11 = r10.indexOf(r11)
            r12 = -1
            if (r11 == r12) goto L_0x00a8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r12 = 1
            r13 = 0
        L_0x0055:
            int r14 = r12 + 2
            int r15 = r11.length()
            if (r14 > r15) goto L_0x009b
            char r15 = r11.charAt(r12)
            r3 = 39
            if (r15 != r3) goto L_0x0098
            int r3 = r12 + -1
            char r3 = r11.charAt(r3)
            r13 = 32
            if (r3 == r13) goto L_0x0092
            int r3 = r12 + 1
            char r15 = r11.charAt(r3)
            r9 = 115(0x73, float:1.61E-43)
            if (r15 == r9) goto L_0x0081
            char r3 = r11.charAt(r3)
            r9 = 83
            if (r3 != r9) goto L_0x0092
        L_0x0081:
            int r3 = r11.length()
            if (r14 == r3) goto L_0x008d
            char r3 = r11.charAt(r14)
            if (r3 != r13) goto L_0x0092
        L_0x008d:
            r11.insert(r12, r13)
            r12 = r14
            goto L_0x0095
        L_0x0092:
            r11.setCharAt(r12, r13)
        L_0x0095:
            r3 = 1
            r13 = 1
            goto L_0x0099
        L_0x0098:
            r3 = 1
        L_0x0099:
            int r12 = r12 + r3
            goto L_0x0055
        L_0x009b:
            if (r13 == 0) goto L_0x00a2
            java.lang.String r3 = r11.toString()
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            if (r3 == 0) goto L_0x00a8
            r1.d = r3
            goto L_0x00a9
        L_0x00a8:
            r3 = r10
        L_0x00a9:
            r9 = 1
            java.lang.String[] r3 = defpackage.dmz.a(r3, r9)
            int r10 = r3.length
            int r11 = r1.g
            if (r10 < r11) goto L_0x010a
            r10 = 0
        L_0x00b4:
            int r11 = r3.length
            if (r10 >= r11) goto L_0x0100
            r12 = r6
            r11 = 0
        L_0x00b9:
            int r13 = r1.g
            if (r11 >= r13) goto L_0x00ee
            int r13 = r10 + r11
            int r14 = r3.length
            if (r13 < r14) goto L_0x00c4
            r11 = 0
            goto L_0x00ef
        L_0x00c4:
            if (r11 <= 0) goto L_0x00d0
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r14 = " "
            java.lang.String r12 = r12.concat(r14)
        L_0x00d0:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r13 = r3[r13]
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r14 = r13.length()
            if (r14 == 0) goto L_0x00e5
            java.lang.String r12 = r12.concat(r13)
            goto L_0x00eb
        L_0x00e5:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r12)
            r12 = r13
        L_0x00eb:
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00ee:
            r11 = 1
        L_0x00ef:
            if (r11 == 0) goto L_0x0100
            r2.add(r12)
            int r11 = r2.size()
            int r12 = r1.b
            if (r11 < r12) goto L_0x00fd
            goto L_0x0108
        L_0x00fd:
            int r10 = r10 + 1
            goto L_0x00b4
        L_0x0100:
            int r3 = r2.size()
            int r10 = r1.b
            if (r3 < r10) goto L_0x010a
        L_0x0108:
            r9 = 0
            goto L_0x010f
        L_0x010a:
            int r8 = r8 + 1
            goto L_0x0040
        L_0x010e:
            r9 = 1
        L_0x010f:
            if (r9 == 0) goto L_0x0115
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0115:
            dmy r3 = new dmy
            r3.<init>()
            r1.c = r6
            java.util.Iterator r0 = r2.iterator()
        L_0x0120:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013c
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            dmv r4 = r1.a     // Catch:{ IOException -> 0x0136 }
            byte[] r2 = r4.a(r2)     // Catch:{ IOException -> 0x0136 }
            r3.a(r2)     // Catch:{ IOException -> 0x0136 }
            goto L_0x0120
        L_0x0136:
            r0 = move-exception
            java.lang.String r2 = "Error while writing hash to byteStream"
            defpackage.cml.a(r2, r0)
        L_0x013c:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dng.a(java.util.ArrayList, java.util.ArrayList):java.lang.String");
    }
}
