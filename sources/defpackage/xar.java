package defpackage;

/* renamed from: xar reason: default package */
public final class xar implements xae {
    private xaw a;

    public xar(xaw xaw) {
        this.a = xaw;
    }

    private static xac a(xac xac, xac xac2) {
        a aVar = new a();
        int length = xac.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = xac.a(i);
            String b = xac.b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) && (b(a2) || !a(a2) || xac2.a(a2) == null)) {
                xao.a.a(aVar, a2, b);
            }
        }
        int length2 = xac2.a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a3 = xac2.a(i2);
            if (!b(a3) && a(a3)) {
                xao.a.a(aVar, a3, xac2.b(i2));
            }
        }
        return aVar.a();
    }

    private static xal a(xal xal) {
        if (xal == null || xal.g == null) {
            return xal;
        }
        a b = xal.b();
        b.g = null;
        return b.a();
    }

    private static boolean a(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [xaj, xal] */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v36 */
    /* JADX WARNING: type inference failed for: r3v38 */
    /* JADX WARNING: type inference failed for: r3v42 */
    /* JADX WARNING: type inference failed for: r3v46 */
    /* JADX WARNING: type inference failed for: r3v47 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [xaj, xal]
      assigns: []
      uses: [xaj, xal]
      mth insns count: 328
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0237 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01c1  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.xal a(defpackage.xae.a r21) {
        /*
            r20 = this;
            r1 = r20
            xaw r0 = r1.a
            r2 = 0
            if (r0 == 0) goto L_0x0011
            xaj r3 = r21.a()
            xal r0 = r0.a(r3)
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = r2
        L_0x0012:
            long r4 = java.lang.System.currentTimeMillis()
            xat$a r0 = new xat$a
            xaj r6 = r21.a()
            r0.<init>(r4, r6, r3)
            xal r4 = r0.c
            if (r4 != 0) goto L_0x002f
            xat r4 = new xat
            xaj r5 = r0.b
            r4.<init>(r5, r2)
        L_0x002a:
            r17 = r3
            r3 = r2
            goto L_0x0209
        L_0x002f:
            xaj r4 = r0.b
            xad r4 = r4.a
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0047
            xal r4 = r0.c
            xab r4 = r4.e
            if (r4 != 0) goto L_0x0047
            xat r4 = new xat
            xaj r5 = r0.b
            r4.<init>(r5, r2)
            goto L_0x002a
        L_0x0047:
            xal r4 = r0.c
            xaj r5 = r0.b
            boolean r4 = defpackage.xat.a(r4, r5)
            if (r4 != 0) goto L_0x0059
            xat r4 = new xat
            xaj r5 = r0.b
            r4.<init>(r5, r2)
            goto L_0x002a
        L_0x0059:
            xaj r4 = r0.b
            wzo r4 = r4.b()
            boolean r5 = r4.b
            if (r5 != 0) goto L_0x01ff
            xaj r5 = r0.b
            java.lang.String r6 = "If-Modified-Since"
            java.lang.String r7 = r5.a(r6)
            java.lang.String r9 = "If-None-Match"
            if (r7 != 0) goto L_0x0078
            java.lang.String r5 = r5.a(r9)
            if (r5 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r5 = 0
            goto L_0x0079
        L_0x0078:
            r5 = 1
        L_0x0079:
            if (r5 == 0) goto L_0x007d
            goto L_0x01ff
        L_0x007d:
            xal r5 = r0.c
            wzo r5 = r5.d()
            java.util.Date r7 = r0.d
            r11 = 0
            if (r7 == 0) goto L_0x0097
            long r13 = r0.j
            java.util.Date r7 = r0.d
            long r15 = r7.getTime()
            long r13 = r13 - r15
            long r13 = java.lang.Math.max(r11, r13)
            goto L_0x0098
        L_0x0097:
            r13 = r11
        L_0x0098:
            int r7 = r0.l
            r15 = -1
            if (r7 == r15) goto L_0x00ad
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r0.l
            r17 = r3
            long r2 = (long) r8
            long r2 = r7.toMillis(r2)
            long r13 = java.lang.Math.max(r13, r2)
            goto L_0x00af
        L_0x00ad:
            r17 = r3
        L_0x00af:
            long r2 = r0.j
            long r7 = r0.i
            long r2 = r2 - r7
            long r7 = r0.a
            long r10 = r0.j
            long r7 = r7 - r10
            long r13 = r13 + r2
            long r13 = r13 + r7
            xal r2 = r0.c
            wzo r2 = r2.d()
            int r3 = r2.d
            if (r3 == r15) goto L_0x00d2
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            int r2 = r2.d
            long r7 = (long) r2
            long r11 = r3.toMillis(r7)
        L_0x00ce:
            r2 = r11
        L_0x00cf:
            r11 = 0
            goto L_0x0136
        L_0x00d2:
            java.util.Date r2 = r0.h
            if (r2 == 0) goto L_0x00f5
            java.util.Date r2 = r0.d
            if (r2 == 0) goto L_0x00e1
            java.util.Date r2 = r0.d
            long r2 = r2.getTime()
            goto L_0x00e3
        L_0x00e1:
            long r2 = r0.j
        L_0x00e3:
            java.util.Date r7 = r0.h
            long r7 = r7.getTime()
            long r11 = r7 - r2
            r2 = 0
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f2
            goto L_0x00ce
        L_0x00f2:
            r2 = 0
            goto L_0x00cf
        L_0x00f5:
            java.util.Date r2 = r0.f
            if (r2 == 0) goto L_0x0133
            xal r2 = r0.c
            xaj r2 = r2.a
            xad r2 = r2.a
            java.util.List<java.lang.String> r3 = r2.e
            if (r3 != 0) goto L_0x0105
            r2 = 0
            goto L_0x0113
        L_0x0105:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r2 = r2.e
            defpackage.xad.b(r3, r2)
            java.lang.String r2 = r3.toString()
        L_0x0113:
            if (r2 != 0) goto L_0x0133
            java.util.Date r2 = r0.d
            if (r2 == 0) goto L_0x0120
            java.util.Date r2 = r0.d
            long r2 = r2.getTime()
            goto L_0x0122
        L_0x0120:
            long r2 = r0.i
        L_0x0122:
            java.util.Date r7 = r0.f
            long r7 = r7.getTime()
            long r2 = r2 - r7
            r11 = 0
            int r7 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0135
            r7 = 10
            long r2 = r2 / r7
            goto L_0x0136
        L_0x0133:
            r11 = 0
        L_0x0135:
            r2 = r11
        L_0x0136:
            int r7 = r4.d
            if (r7 == r15) goto L_0x0147
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r4.d
            long r11 = (long) r8
            long r7 = r7.toMillis(r11)
            long r2 = java.lang.Math.min(r2, r7)
        L_0x0147:
            int r7 = r4.i
            if (r7 == r15) goto L_0x0155
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r8 = r4.i
            long r10 = (long) r8
            long r11 = r7.toMillis(r10)
            goto L_0x0157
        L_0x0155:
            r11 = 0
        L_0x0157:
            boolean r7 = r5.g
            if (r7 != 0) goto L_0x016c
            int r7 = r4.h
            if (r7 == r15) goto L_0x016c
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r4.h
            r10 = r9
            long r8 = (long) r4
            long r7 = r7.toMillis(r8)
            r18 = r7
            goto L_0x016f
        L_0x016c:
            r10 = r9
            r18 = 0
        L_0x016f:
            boolean r4 = r5.b
            if (r4 != 0) goto L_0x01b9
            long r11 = r11 + r13
            long r18 = r2 + r18
            int r4 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r4 >= 0) goto L_0x01b9
            xal r4 = r0.c
            xal$a r4 = r4.b()
            java.lang.String r5 = "Warning"
            int r6 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r6 < 0) goto L_0x018b
            java.lang.String r2 = "110 HttpURLConnection \"Response is stale\""
            r4.a(r5, r2)
        L_0x018b:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r6 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x01ac
            xal r2 = r0.c
            wzo r2 = r2.d()
            int r2 = r2.d
            if (r2 != r15) goto L_0x01a3
            java.util.Date r2 = r0.h
            if (r2 != 0) goto L_0x01a3
            r16 = 1
            goto L_0x01a5
        L_0x01a3:
            r16 = 0
        L_0x01a5:
            if (r16 == 0) goto L_0x01ac
            java.lang.String r2 = "113 HttpURLConnection \"Heuristic expiration\""
            r4.a(r5, r2)
        L_0x01ac:
            xat r2 = new xat
            xal r3 = r4.a()
            r4 = 0
            r2.<init>(r4, r3)
            r3 = r4
            r4 = r2
            goto L_0x0209
        L_0x01b9:
            java.lang.String r2 = r0.k
            if (r2 == 0) goto L_0x01c1
            java.lang.String r2 = r0.k
            r6 = r10
            goto L_0x01ce
        L_0x01c1:
            java.util.Date r2 = r0.f
            if (r2 == 0) goto L_0x01c8
            java.lang.String r2 = r0.g
            goto L_0x01ce
        L_0x01c8:
            java.util.Date r2 = r0.d
            if (r2 == 0) goto L_0x01f6
            java.lang.String r2 = r0.e
        L_0x01ce:
            xaj r3 = r0.b
            xac r3 = r3.c
            xac$a r3 = r3.b()
            xao r4 = defpackage.xao.a
            r4.a(r3, r6, r2)
            xaj r2 = r0.b
            xaj$a r2 = r2.a()
            xac r3 = r3.a()
            xaj$a r2 = r2.a(r3)
            xaj r2 = r2.a()
            xat r4 = new xat
            xal r3 = r0.c
            r4.<init>(r2, r3)
            r3 = 0
            goto L_0x0209
        L_0x01f6:
            xat r4 = new xat
            xaj r2 = r0.b
            r3 = 0
            r4.<init>(r2, r3)
            goto L_0x0209
        L_0x01ff:
            r17 = r3
            r3 = r2
            xat r4 = new xat
            xaj r2 = r0.b
            r4.<init>(r2, r3)
        L_0x0209:
            xaj r2 = r4.a
            if (r2 == 0) goto L_0x021c
            xaj r0 = r0.b
            wzo r0 = r0.b()
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x021c
            xat r4 = new xat
            r4.<init>(r3, r3)
        L_0x021c:
            xaj r0 = r4.a
            xal r2 = r4.b
            xaw r3 = r1.a
            if (r3 == 0) goto L_0x0227
            r3.a(r4)
        L_0x0227:
            if (r17 == 0) goto L_0x0233
            if (r2 != 0) goto L_0x0233
            r3 = r17
            xam r4 = r3.g
            defpackage.xaq.a(r4)
            goto L_0x0235
        L_0x0233:
            r3 = r17
        L_0x0235:
            if (r0 != 0) goto L_0x0263
            if (r2 != 0) goto L_0x0263
            xal$a r0 = new xal$a
            r0.<init>()
            xaj r2 = r21.a()
            r0.a = r2
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_1
            r0.b = r2
            r2 = 504(0x1f8, float:7.06E-43)
            r0.c = r2
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            r0.d = r2
            xam r2 = defpackage.xaq.c
            r0.g = r2
            r2 = -1
            r0.k = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0.l = r2
            xal r0 = r0.a()
            return r0
        L_0x0263:
            if (r0 != 0) goto L_0x0276
            xal$a r0 = r2.b()
            xal r2 = a(r2)
            xal$a r0 = r0.b(r2)
            xal r0 = r0.a()
            return r0
        L_0x0276:
            r4 = r21
            xal r4 = r4.a(r0)     // Catch:{ all -> 0x0343 }
            if (r4 != 0) goto L_0x0285
            if (r3 == 0) goto L_0x0285
            xam r3 = r3.g
            defpackage.xaq.a(r3)
        L_0x0285:
            if (r2 == 0) goto L_0x02ce
            int r3 = r4.c
            r5 = 304(0x130, float:4.26E-43)
            if (r3 != r5) goto L_0x02c9
            xal$a r0 = r2.b()
            xac r3 = r2.f
            xac r5 = r4.f
            xac r3 = a(r3, r5)
            xal$a r0 = r0.a(r3)
            long r5 = r4.k
            r0.k = r5
            long r5 = r4.l
            r0.l = r5
            xal r3 = a(r2)
            xal$a r0 = r0.b(r3)
            xal r3 = a(r4)
            xal$a r0 = r0.a(r3)
            xal r0 = r0.a()
            xam r3 = r4.g
            r3.close()
            xaw r3 = r1.a
            r3.a()
            xaw r3 = r1.a
            r3.a(r2, r0)
            return r0
        L_0x02c9:
            xam r3 = r2.g
            defpackage.xaq.a(r3)
        L_0x02ce:
            xal$a r3 = r4.b()
            xal r2 = a(r2)
            xal$a r2 = r3.b(r2)
            xal r3 = a(r4)
            xal$a r2 = r2.a(r3)
            xal r2 = r2.a()
            xaw r3 = r1.a
            if (r3 == 0) goto L_0x0342
            boolean r3 = defpackage.xbh.d(r2)
            if (r3 == 0) goto L_0x0335
            boolean r3 = defpackage.xat.a(r2, r0)
            if (r3 == 0) goto L_0x0335
            xaw r0 = r1.a
            xas r0 = r0.a(r2)
            if (r0 != 0) goto L_0x02ff
            return r2
        L_0x02ff:
            xdf r3 = r0.b()
            if (r3 != 0) goto L_0x0306
            return r2
        L_0x0306:
            xam r4 = r2.g
            xcs r4 = r4.c()
            xcr r3 = defpackage.xda.a(r3)
            xar$1 r5 = new xar$1
            r5.<init>(r4, r0, r3)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.a(r0)
            xam r3 = r2.g
            long r3 = r3.b()
            xal$a r2 = r2.b()
            xbk r6 = new xbk
            xcs r5 = defpackage.xda.a(r5)
            r6.<init>(r0, r3, r5)
            r2.g = r6
            xal r0 = r2.a()
            return r0
        L_0x0335:
            java.lang.String r3 = r0.b
            boolean r3 = defpackage.xbi.a(r3)
            if (r3 == 0) goto L_0x0342
            xaw r3 = r1.a     // Catch:{ IOException -> 0x0342 }
            r3.b(r0)     // Catch:{ IOException -> 0x0342 }
        L_0x0342:
            return r2
        L_0x0343:
            r0 = move-exception
            r2 = r0
            if (r3 == 0) goto L_0x034c
            xam r0 = r3.g
            defpackage.xaq.a(r0)
        L_0x034c:
            goto L_0x034e
        L_0x034d:
            throw r2
        L_0x034e:
            goto L_0x034d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xar.a(xae$a):xal");
    }
}
