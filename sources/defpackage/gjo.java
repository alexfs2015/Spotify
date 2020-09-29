package defpackage;

/* renamed from: gjo reason: default package */
public final class gjo implements xae {
    private final int a;

    public gjo() {
        this(500);
    }

    private gjo(int i) {
        this.a = 500;
    }

    public final xal a(a aVar) {
        xaj a2 = aVar.a();
        if (a2.d != null) {
            String str = "Content-Encoding";
            if (a2.a(str) == null && a2.d.b() >= ((long) this.a)) {
                a a3 = a2.a().a(str, "gzip");
                String str2 = a2.b;
                final xak xak = a2.d;
                final AnonymousClass2 r3 = new xak() {
                    public final xaf a() {
                        return xak.a();
                    }

                    public final void a(xcr xcr) {
                        xcr a2 = xda.a((xdf) new xcx(xcr));
                        xak.a(a2);
                        a2.close();
                    }

                    public final long b() {
                        return -1;
                    }
                };
                final xcq xcq = new xcq();
                r3.a(xcq);
                return aVar.a(a3.a(str2, (xak) new xak() {
                    public final xaf a() {
                        return r3.a();
                    }

                    public final void a(xcr xcr) {
                        xcr.b(xcq.t());
                    }

                    public final long b() {
                        return xcq.b;
                    }
                }).a());
            }
        }
        return aVar.a(a2);
    }
}
