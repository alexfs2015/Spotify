package defpackage;

import java.util.regex.Pattern;

/* renamed from: wsh reason: default package */
final class wsh {
    static final Pattern a = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    private static final char[] e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    String b;
    defpackage.wma.a c;
    wme d;
    private final String f;
    private final wlx g;
    private defpackage.wlx.a h;
    private final defpackage.wmd.a i = new defpackage.wmd.a();
    private wlz j;
    private final boolean k;
    private defpackage.wlu.a l;

    /* renamed from: wsh$a */
    static class a extends wme {
        private final wme a;
        private final wlz b;

        a(wme wme, wlz wlz) {
            this.a = wme;
            this.b = wlz;
        }

        public final wlz a() {
            return this.b;
        }

        public final long b() {
            return this.a.b();
        }

        public final void a(wol wol) {
            this.a.a(wol);
        }
    }

    wsh(String str, wlx wlx, String str2, wlw wlw, wlz wlz, boolean z, boolean z2, boolean z3) {
        this.f = str;
        this.g = wlx;
        this.b = str2;
        this.j = wlz;
        this.k = z;
        if (wlw != null) {
            this.i.a(wlw);
        }
        if (z2) {
            this.l = new defpackage.wlu.a();
            return;
        }
        if (z3) {
            this.c = new defpackage.wma.a();
            this.c.a(wma.b);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.j = wlz.a(str2);
            } catch (IllegalArgumentException e2) {
                StringBuilder sb = new StringBuilder("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e2);
            }
        } else {
            this.i.b(str, str2);
        }
    }

    static String a(String str, boolean z) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int codePointAt = str.codePointAt(i2);
            String str2 = " \"<>^`{}|\\?#";
            if (codePointAt < 32 || codePointAt >= 127 || str2.indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                wok wok = new wok();
                wok.a(str, 0, i2);
                wok wok2 = null;
                while (i2 < length) {
                    int codePointAt2 = str.codePointAt(i2);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 < 32 || codePointAt2 >= 127 || str2.indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == 47 || codePointAt2 == 37))) {
                            if (wok2 == null) {
                                wok2 = new wok();
                            }
                            wok2.a(codePointAt2);
                            while (!wok2.c()) {
                                byte f2 = wok2.f() & 255;
                                wok.j(37);
                                wok.j((int) e[(f2 >> 4) & 15]);
                                wok.j((int) e[f2 & 15]);
                            }
                        } else {
                            wok.a(codePointAt2);
                        }
                    }
                    i2 += Character.charCount(codePointAt2);
                }
                return wok.o();
            }
            i2 += Character.charCount(codePointAt);
        }
        return str;
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
    public final void b(String str, String str2, boolean z) {
        if (z) {
            this.l.b(str, str2);
        } else {
            this.l.a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(wlw wlw, wme wme) {
        this.c.a(wlw, wme);
    }

    /* access modifiers changed from: 0000 */
    public final defpackage.wmd.a a() {
        wlx wlx;
        defpackage.wlx.a aVar = this.h;
        if (aVar != null) {
            wlx = aVar.b();
        } else {
            wlx = this.g.c(this.b);
            if (wlx == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(this.g);
                sb.append(", Relative: ");
                sb.append(this.b);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        wme wme = this.d;
        if (wme == null) {
            defpackage.wlu.a aVar2 = this.l;
            if (aVar2 != null) {
                wme = new wlu(aVar2.a, aVar2.b);
            } else {
                defpackage.wma.a aVar3 = this.c;
                if (aVar3 != null) {
                    wme = aVar3.a();
                } else if (this.k) {
                    wme = wme.a((wlz) null, new byte[0]);
                }
            }
        }
        wlz wlz = this.j;
        if (wlz != null) {
            if (wme != null) {
                wme = new a(wme, wlz);
            } else {
                this.i.b("Content-Type", wlz.toString());
            }
        }
        return this.i.a(wlx).a(this.f, wme);
    }
}
