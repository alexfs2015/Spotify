package defpackage;

import java.util.regex.Pattern;

/* renamed from: xgm reason: default package */
final class xgm {
    static final Pattern a = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String b;
    defpackage.xag.a c;
    xak d;
    private final String f;
    private final xad g;
    private defpackage.xad.a h;
    private final defpackage.xaj.a i = new defpackage.xaj.a();
    private xaf j;
    private final boolean k;
    private defpackage.xaa.a l;

    /* renamed from: xgm$a */
    static class a extends xak {
        private final xak a;
        private final xaf b;

        a(xak xak, xaf xaf) {
            this.a = xak;
            this.b = xaf;
        }

        public final xaf a() {
            return this.b;
        }

        public final void a(xcr xcr) {
            this.a.a(xcr);
        }

        public final long b() {
            return this.a.b();
        }
    }

    xgm(String str, xad xad, String str2, xac xac, xaf xaf, boolean z, boolean z2, boolean z3) {
        this.f = str;
        this.g = xad;
        this.b = str2;
        this.j = xaf;
        this.k = z;
        if (xac != null) {
            this.i.a(xac);
        }
        if (z2) {
            this.l = new defpackage.xaa.a();
            return;
        }
        if (z3) {
            this.c = new defpackage.xag.a();
            this.c.a(xag.b);
        }
    }

    static String a(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            String str2 = " \"<>^`{}|\\?#";
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                xcq xcq = new xcq();
                xcq.a(str, 0, i2);
                xcq xcq2 = null;
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || str2.indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (xcq2 == null) {
                                xcq2 = new xcq();
                            }
                            xcq2.a(codePointAt2);
                            while (!xcq2.c()) {
                                byte f2 = xcq2.f() & 255;
                                xcq.j(37);
                                xcq.j((int) e[(f2 >> 4) & 15]);
                                xcq.j((int) e[f2 & 15]);
                            }
                        } else {
                            xcq.a(codePointAt2);
                        }
                    }
                    i2 += Character.charCount(codePointAt2);
                }
                return xcq.o();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.xaj.a a() {
        xad xad;
        defpackage.xad.a aVar = this.h;
        if (aVar != null) {
            xad = aVar.b();
        } else {
            xad = this.g.c(this.b);
            if (xad == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.g);
                sb.append(", Relative: ");
                sb.append(this.b);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        xak xak = this.d;
        if (xak == null) {
            defpackage.xaa.a aVar2 = this.l;
            if (aVar2 != null) {
                xak = new xaa(aVar2.a, aVar2.b);
            } else {
                defpackage.xag.a aVar3 = this.c;
                if (aVar3 != null) {
                    xak = aVar3.a();
                } else if (this.k) {
                    xak = xak.a((xaf) null, new byte[0]);
                }
            }
        }
        xaf xaf = this.j;
        if (xaf != null) {
            if (xak != null) {
                xak = new a(xak, xaf);
            } else {
                this.i.b("Content-Type", xaf.toString());
            }
        }
        return this.i.a(xad).a(this.f, xak);
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.j = xaf.a(str2);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        } else {
            this.i.b(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2, boolean z) {
        String str3 = this.b;
        if (str3 != null) {
            this.h = this.g.d(str3);
            if (this.h != null) {
                this.b = null;
            } else {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.g);
                sb.append(", Relative: ");
                sb.append(this.b);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.h.b(str, str2);
        } else {
            this.h.a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(xac xac, xak xak) {
        this.c.a(xac, xak);
    }

    /* access modifiers changed from: 0000 */
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.l.b(str, str2);
        } else {
            this.l.a(str, str2);
        }
    }
}
