package defpackage;

/* renamed from: avt reason: default package */
public final class avt implements avp {
    private final bea a = new bea(10);
    private atu b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public final void a() {
        this.c = false;
    }

    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(atm atm, d dVar) {
        dVar.a();
        this.b = atm.a(dVar.b(), 4);
        this.b.a(aqv.a(dVar.c(), "application/id3", (String) null, -1, (ast) null));
    }

    public final void a(bea bea) {
        if (this.c) {
            int b2 = bea.b();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(b2, 10 - i);
                System.arraycopy(bea.a, bea.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.c(0);
                    if (73 == this.a.c() && 68 == this.a.c() && 51 == this.a.c()) {
                        this.a.d(3);
                        this.e = this.a.m() + 10;
                    } else {
                        bdu.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b2, this.e - this.f);
            this.b.a(bea, min2);
            this.f += min2;
        }
    }

    public final void b() {
        if (this.c) {
            int i = this.e;
            if (i != 0 && this.f == i) {
                this.b.a(this.d, 1, i, 0, null);
                this.c = false;
            }
        }
    }
}
