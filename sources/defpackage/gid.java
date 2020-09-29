package defpackage;

/* renamed from: gid reason: default package */
public final class gid implements wly {
    private final int a;

    public gid() {
        this(500);
    }

    private gid(int i) {
        this.a = 500;
    }

    public final wmf a(a aVar) {
        wmd a2 = aVar.a();
        if (a2.d != null) {
            String str = "Content-Encoding";
            if (a2.a(str) == null && a2.d.b() >= ((long) this.a)) {
                a a3 = a2.a().a(str, "gzip");
                String str2 = a2.b;
                final wme wme = a2.d;
                final AnonymousClass2 r3 = new wme() {
                    public final long b() {
                        return -1;
                    }

                    public final wlz a() {
                        return wme.a();
                    }

                    public final void a(wol wol) {
                        wol a2 = wou.a((woz) new wor(wol));
                        wme.a(a2);
                        a2.close();
                    }
                };
                final wok wok = new wok();
                r3.a(wok);
                return aVar.a(a3.a(str2, (wme) new wme() {
                    public final wlz a() {
                        return r3.a();
                    }

                    public final long b() {
                        return wok.b;
                    }

                    public final void a(wol wol) {
                        wol.b(wok.t());
                    }
                }).a());
            }
        }
        return aVar.a(a2);
    }
}
