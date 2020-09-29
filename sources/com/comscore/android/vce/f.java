package com.comscore.android.vce;

class f {
    static final String a = "CookieNation";
    final p b;
    final j c;
    final e d;

    f(p pVar, e eVar, j jVar) {
        this.b = pVar;
        this.d = eVar;
        this.c = jVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        d();
        a("afx", "1");
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        this.d.deleteCookie("https://sb.voicefive.com/rs/sdk/b.html", str);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, String str2) {
        this.d.setCookie("https://sb.voicefive.com/rs/sdk/b.html", str, str2);
    }

    /* access modifiers changed from: 0000 */
    public Runnable b() {
        return new Runnable() {
            public void run() {
                try {
                    if (f.this.c.g()) {
                        f.this.e();
                    }
                } catch (Exception unused) {
                }
            }
        };
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(2:19|20)|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            com.comscore.android.vce.j r0 = r5.c
            com.comscore.android.vce.z r6 = r0.a(r6)
            if (r6 == 0) goto L_0x0059
            java.lang.String r0 = "-1"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x001a
            boolean r7 = r6.e()
            if (r7 == 0) goto L_0x0059
            r6.q()
            return
        L_0x001a:
            java.lang.String r0 = "-2"
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0059
            boolean r0 = r6.e()
            if (r0 != 0) goto L_0x0059
            r0 = 0
            r1 = 1
            java.lang.String r0 = r7.substring(r0, r1)     // Catch:{ NumberFormatException -> 0x0059 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0059 }
            r2 = 50
            int r3 = r7.length()     // Catch:{ NumberFormatException -> 0x0059 }
            r4 = 2
            if (r3 <= r4) goto L_0x0053
            char r1 = r7.charAt(r1)     // Catch:{ NumberFormatException -> 0x0059 }
            r3 = 45
            if (r1 != r3) goto L_0x0053
            java.lang.String r7 = r7.substring(r4)     // Catch:{ Exception -> 0x0053 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x0053 }
            float r7 = r7.floatValue()     // Catch:{ Exception -> 0x0053 }
            int r2 = java.lang.Math.round(r7)     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            r6.a(r2)     // Catch:{ NumberFormatException -> 0x0059 }
            r6.d(r0)     // Catch:{ NumberFormatException -> 0x0059 }
        L_0x0059:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.comscore.android.vce.f.b(java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    public boolean b(String str) {
        String cookie = this.d.getCookie("https://sb.voicefive.com/rs/sdk/b.html");
        if (cookie != null && cookie.length() > 0) {
            String[] split = cookie.split(";");
            if (split.length > 0) {
                for (String trim : split) {
                    if (trim.trim().startsWith(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        a("afx");
    }

    /* access modifiers changed from: 0000 */
    public void c(String str) {
        try {
            a("meta", ad.b(str.replace("'", "\\'")));
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        String str = "https://sb.voicefive.com/rs/sdk/b.html";
        String cookie = this.d.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                String trim = split2[0].trim();
                if (trim.length() > 0 && (trim.startsWith("cs_") || trim.equals("afx") || trim.equals("meta"))) {
                    this.d.deleteCookie(str, split2[0]);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        String[] split = this.d.getCookie("https://sb.voicefive.com/rs/sdk/b.html").split(";");
        if (split.length > 0) {
            for (String str : split) {
                int indexOf = str.indexOf("=");
                if (indexOf > 0 && indexOf < str.length() - 1) {
                    String trim = str.substring(0, indexOf).trim();
                    String substring = str.substring(indexOf + 1, str.length());
                    if (trim.regionMatches(0, "cs_", 0, 3)) {
                        b(trim, substring);
                    }
                }
            }
        }
    }
}
