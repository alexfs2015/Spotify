package defpackage;

/* renamed from: ayy reason: default package */
public final class ayy extends ayq {
    private static final atr n = new atr();
    private final int o;
    private final long p = 0;
    private final ayu q;
    private long r;
    private volatile boolean s;
    private boolean t;

    public ayy(bce bce, bcg bcg, aqv aqv, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, ayu ayu) {
        super(bce, bcg, aqv, i, obj, j, j2, j3, -9223372036854775807L, j5);
        this.o = i2;
        this.q = ayu;
    }

    public final void a() {
        this.s = true;
    }

    public final void b() {
        ath ath;
        bcg a = this.e.a(this.r);
        try {
            ath = new ath(this.l, a.d, this.l.a(a));
            if (this.r == 0) {
                ays ays = this.c;
                ays.a(this.p);
                this.q.a(ays, this.a == -9223372036854775807L ? -9223372036854775807L : this.a - this.p, this.b == -9223372036854775807L ? -9223372036854775807L : this.b - this.p);
            }
            atk atk = this.q.a;
            boolean z = false;
            int i = 0;
            while (i == 0 && !this.s) {
                i = atk.a((atl) ath, n);
            }
            if (i != 1) {
                z = true;
            }
            bdl.b(z);
            this.r = ath.c() - this.e.d;
            ben.a((bce) this.l);
            this.t = true;
        } catch (Throwable th) {
            ben.a((bce) this.l);
            throw th;
        }
    }

    public final long f() {
        return this.m + ((long) this.o);
    }

    public final boolean g() {
        return this.t;
    }
}
