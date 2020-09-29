package defpackage;

/* renamed from: hgy reason: default package */
public final class hgy implements defpackage.hup.a, jzx {
    private final hgw a;
    private final a b = new a(0);
    private hgv c;

    /* renamed from: hgy$a */
    static class a implements hgu {
        boolean a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a(boolean z) {
            this.a = z;
        }
    }

    public final String c() {
        return "PrivateSessionLoader";
    }

    public hgy(hgw hgw) {
        this.a = hgw;
    }

    public final void a() {
        this.c = new hgv((jug) hgw.a(this.a.a.get(), 1), (hgu) hgw.a(this.b, 2));
        this.c.a();
    }

    public final void b() {
        hgv hgv = this.c;
        if (hgv != null) {
            hgv.a.c();
        }
    }

    public final boolean d() {
        return this.b.a;
    }
}
