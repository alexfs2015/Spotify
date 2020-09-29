package defpackage;

/* renamed from: aym reason: default package */
public final class aym extends axz {
    private final int n = 3;
    private final aqe o;
    private long p;
    private boolean q;

    public final void a() {
    }

    public aym(bbn bbn, bbp bbp, aqe aqe, int i, Object obj, long j, long j2, long j3, int i2, aqe aqe2) {
        super(bbn, bbp, aqe, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = aqe2;
    }

    public final boolean g() {
        return this.q;
    }

    /* JADX INFO: finally extract failed */
    public final void b() {
        try {
            long a = this.l.a(this.e.a(this.p));
            if (a != -1) {
                a += this.p;
            }
            asq asq = new asq(this.l, this.p, a);
            ayb ayb = this.c;
            ayb.a(0);
            atd a2 = ayb.a(this.n);
            a2.a(this.o);
            for (int i = 0; i != -1; i = a2.a(asq, Integer.MAX_VALUE, true)) {
                this.p += (long) i;
            }
            a2.a(this.j, 1, (int) this.p, 0, null);
            bdw.a((bbn) this.l);
            this.q = true;
        } catch (Throwable th) {
            bdw.a((bbn) this.l);
            throw th;
        }
    }
}
