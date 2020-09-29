package defpackage;

/* renamed from: ayh reason: default package */
public final class ayh extends axz {
    private static final ata n = new ata();
    private final int o;
    private final long p = 0;
    private final ayd q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public ayh(bbn bbn, bbp bbp, aqe aqe, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ayd ayd) {
        super(bbn, bbp, aqe, i, obj, j, j2, j3, -9223372036854775807L, j5);
        this.o = i2;
        this.q = ayd;
    }

    public final long f() {
        return this.m + ((long) this.o);
    }

    public final boolean g() {
        return this.t;
    }

    public final void a() {
        this.s = true;
    }

    public final void b() {
        asq asq;
        bbp a = this.e.a(this.r);
        try {
            asq = new asq(this.l, a.d, this.l.a(a));
            if (this.r == 0) {
                ayb ayb = this.c;
                ayb.a(this.p);
                this.q.a(ayb, this.a == -9223372036854775807L ? -9223372036854775807L : this.a - this.p, this.b == -9223372036854775807L ? -9223372036854775807L : this.b - this.p);
            }
            ast ast = this.q.a;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.s) {
                i = ast.a((asu) asq, n);
            }
            if (i != 1) {
                z = true;
            }
            bcu.b(z);
            this.r = asq.c() - this.e.d;
            bdw.a((bbn) this.l);
            this.t = true;
        } catch (Throwable th) {
            bdw.a((bbn) this.l);
            throw th;
        }
    }
}
