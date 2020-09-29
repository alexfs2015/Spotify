package defpackage;

/* renamed from: ayj reason: default package */
public final class ayj extends ayc {
    private static final ata a = new ata();
    private final ayd b;
    private long c;
    private volatile boolean d;

    public ayj(bbn bbn, bbp bbp, aqe aqe, int i, Object obj, ayd ayd) {
        super(bbn, bbp, 2, aqe, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.b = ayd;
    }

    public final void a() {
        this.d = true;
    }

    public final void b() {
        asq asq;
        bbp a2 = this.e.a(this.c);
        try {
            asq = new asq(this.l, a2.d, this.l.a(a2));
            if (this.c == 0) {
                this.b.a(null, -9223372036854775807L, -9223372036854775807L);
            }
            ast ast = this.b.a;
            int i = 0;
            while (i == 0 && !this.d) {
                i = ast.a((asu) asq, a);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            bcu.b(z);
            this.c = asq.c() - this.e.d;
            bdw.a((bbn) this.l);
        } catch (Throwable th) {
            bdw.a((bbn) this.l);
            throw th;
        }
    }
}
