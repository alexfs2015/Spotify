package defpackage;

/* renamed from: azd reason: default package */
public final class azd extends ayq {
    private final int n = 3;
    private final aqv o;
    private long p;
    private boolean q;

    public azd(bce bce, bcg bcg, aqv aqv, int i, Object obj, long j, long j2, long j3, int i2, aqv aqv2) {
        super(bce, bcg, aqv, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = aqv2;
    }

    public final void a() {
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        try {
            long a = this.l.a(this.e.a(this.p));
            if (a != -1) {
                a += this.p;
            }
            ath ath = new ath(this.l, this.p, a);
            ays ays = this.c;
            ays.a(0);
            atu a2 = ays.a(this.n);
            a2.a(this.o);
            for (int i = 0; i != -1; i = a2.a(ath, Integer.MAX_VALUE, true)) {
                this.p += (long) i;
            }
            a2.a(this.j, 1, (int) this.p, 0, null);
            ben.a((bce) this.l);
            this.q = true;
        } catch (Throwable th) {
            ben.a((bce) this.l);
            throw th;
        }
    }

    public final boolean g() {
        return this.q;
    }
}
