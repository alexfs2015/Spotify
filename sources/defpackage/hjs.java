package defpackage;

/* renamed from: hjs reason: default package */
public final class hjs implements defpackage.hxb.a, kbx {
    private final hjq a;
    private final a b = new a(0);
    private hjp c;

    /* renamed from: hjs$a */
    static class a implements hjo {
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

    public hjs(hjq hjq) {
        this.a = hjq;
    }

    public final void a() {
        this.c = new hjp((jwo) hjq.a(this.a.a.get(), 1), (hjo) hjq.a(this.b, 2));
        this.c.a();
    }

    public final void b() {
        hjp hjp = this.c;
        if (hjp != null) {
            hjp.a.c();
        }
    }

    public final String c() {
        return "PrivateSessionLoader";
    }

    public final boolean d() {
        return this.b.a;
    }
}
