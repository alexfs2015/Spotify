package defpackage;

/* renamed from: lks reason: default package */
public final class lks {
    public final lku a;
    public final a b = new a() {
        public final void a() {
            lks.a(lks.this);
        }

        public final void b() {
            lks.this.d.a("hit", "not-now");
        }

        public final void c() {
            lks.c(lks.this);
        }

        public final void d() {
            lks.d(lks.this);
        }
    };
    public final lkq c;
    public lkp d;
    private final spi e;

    public lks(spi spi, lku lku, lkq lkq) {
        this.e = spi;
        this.a = lku;
        this.c = lkq;
    }

    static /* synthetic */ void a(lks lks) {
        lks.e.a("spotify:internal:preferences");
        lks.d.a("hit", "go-to-settings");
    }

    static /* synthetic */ void c(lks lks) {
        String str = "cancel";
        lks.d.a(str, str);
    }

    static /* synthetic */ void d(lks lks) {
        String str = "close";
        lks.d.a(str, str);
    }
}
