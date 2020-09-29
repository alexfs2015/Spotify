package defpackage;

/* renamed from: aza reason: default package */
public final class aza extends ayt {
    private static final atr a = new atr();
    private final ayu b;
    private long c;
    private volatile boolean d;

    public aza(bce bce, bcg bcg, aqv aqv, int i, Object obj, ayu ayu) {
        super(bce, bcg, 2, aqv, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.b = ayu;
    }

    public final void a() {
        this.d = true;
    }

    public final void b() {
        ath ath;
        bcg a2 = this.e.a(this.c);
        try {
            ath = new ath(this.l, a2.d, this.l.a(a2));
            if (this.c == 0) {
                this.b.a(null, -9223372036854775807L, -9223372036854775807L);
            }
            atk atk = this.b.a;
            int i = 0;
            while (i == 0 && !this.d) {
                i = atk.a((atl) ath, a);
            }
            boolean z = true;
            if (i == 1) {
                z = false;
            }
            bdl.b(z);
            this.c = ath.c() - this.e.d;
            ben.a((bce) this.l);
        } catch (Throwable th) {
            ben.a((bce) this.l);
            throw th;
        }
    }
}
