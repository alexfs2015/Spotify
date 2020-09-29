package defpackage;

import java.util.Date;

/* renamed from: wmn reason: default package */
public final class wmn {
    public final wmd a;
    public final wmf b;

    /* renamed from: wmn$a */
    public static class a {
        final long a;
        final wmd b;
        final wmf c;
        Date d;
        String e;
        Date f;
        String g;
        Date h;
        long i;
        long j;
        String k;
        int l = -1;

        public a(long j2, wmd wmd, wmf wmf) {
            this.a = j2;
            this.b = wmd;
            this.c = wmf;
            if (wmf != null) {
                this.i = wmf.k;
                this.j = wmf.l;
                wlw wlw = wmf.f;
                int length = wlw.a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String a2 = wlw.a(i2);
                    String b2 = wlw.b(i2);
                    if ("Date".equalsIgnoreCase(a2)) {
                        this.d = wna.a(b2);
                        this.e = b2;
                    } else if ("Expires".equalsIgnoreCase(a2)) {
                        this.h = wna.a(b2);
                    } else if ("Last-Modified".equalsIgnoreCase(a2)) {
                        this.f = wna.a(b2);
                        this.g = b2;
                    } else if ("ETag".equalsIgnoreCase(a2)) {
                        this.k = b2;
                    } else if ("Age".equalsIgnoreCase(a2)) {
                        this.l = wnb.b(b2, -1);
                    }
                }
            }
        }
    }

    wmn(wmd wmd, wmf wmf) {
        this.a = wmd;
        this.b = wmf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        if (r3.d().e == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0051, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.wmf r3, defpackage.wmd r4) {
        /*
            int r0 = r3.c
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x0052
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x002f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x0052
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x0052
            switch(r0) {
                case 300: goto L_0x0052;
                case 301: goto L_0x0052;
                case 302: goto L_0x002f;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x0051
        L_0x002f:
            r0 = 0
            java.lang.String r1 = "Expires"
            java.lang.String r0 = r3.a(r1, r0)
            if (r0 != 0) goto L_0x0052
            wli r0 = r3.d()
            int r0 = r0.d
            r1 = -1
            if (r0 != r1) goto L_0x0052
            wli r0 = r3.d()
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0052
            wli r0 = r3.d()
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            return r2
        L_0x0052:
            wli r3 = r3.d()
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x0064
            wli r3 = r4.b()
            boolean r3 = r3.c
            if (r3 != 0) goto L_0x0064
            r3 = 1
            return r3
        L_0x0064:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmn.a(wmf, wmd):boolean");
    }
}
