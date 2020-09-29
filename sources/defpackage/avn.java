package defpackage;

/* renamed from: avn reason: default package */
public final class avn implements avk {
    private bdt a;
    private atd b;
    private boolean c;

    public final void a(bdt bdt, asv asv, d dVar) {
        this.a = bdt;
        dVar.a();
        this.b = asv.a(dVar.b(), 4);
        this.b.a(aqe.a(dVar.c(), "application/x-scte35", (String) null, -1, (asc) null));
    }

    public final void a(bdj bdj) {
        long j;
        long j2 = -9223372036854775807L;
        if (!this.c) {
            if (this.a.a() != -9223372036854775807L) {
                this.b.a(aqe.a(null, "application/x-scte35", this.a.a()));
                this.c = true;
            } else {
                return;
            }
        }
        int b2 = bdj.b();
        this.b.a(bdj, b2);
        atd atd = this.b;
        bdt bdt = this.a;
        if (bdt.c != -9223372036854775807L) {
            j = bdt.c + bdt.b;
        } else {
            if (bdt.a != Long.MAX_VALUE) {
                j2 = bdt.a;
            }
            j = j2;
        }
        atd.a(j, 1, b2, 0, null);
    }
}
