package defpackage;

/* renamed from: awe reason: default package */
public final class awe implements awb {
    private bek a;
    private atu b;
    private boolean c;

    public final void a(bea bea) {
        long j;
        long j2 = -9223372036854775807L;
        if (!this.c) {
            if (this.a.a() != -9223372036854775807L) {
                this.b.a(aqv.a(null, "application/x-scte35", this.a.a()));
                this.c = true;
            } else {
                return;
            }
        }
        int b2 = bea.b();
        this.b.a(bea, b2);
        atu atu = this.b;
        bek bek = this.a;
        if (bek.c != -9223372036854775807L) {
            j = bek.c + bek.b;
        } else {
            if (bek.a != Long.MAX_VALUE) {
                j2 = bek.a;
            }
            j = j2;
        }
        atu.a(j, 1, b2, 0, null);
    }

    public final void a(bek bek, atm atm, d dVar) {
        this.a = bek;
        dVar.a();
        this.b = atm.a(dVar.b(), 4);
        this.b.a(aqv.a(dVar.c(), "application/x-scte35", (String) null, -1, (ast) null));
    }
}
