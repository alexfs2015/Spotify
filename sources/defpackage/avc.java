package defpackage;

/* renamed from: avc reason: default package */
public final class avc implements auy {
    private final bdj a = new bdj(10);
    private atd b;
    private boolean c;
    private long d;
    private int e;
    private int f;

    public final void a() {
        this.c = false;
    }

    public final void a(asv asv, d dVar) {
        dVar.a();
        this.b = asv.a(dVar.b(), 4);
        this.b.a(aqe.a(dVar.c(), "application/id3", (String) null, -1, (asc) null));
    }

    public final void a(long j, boolean z) {
        if (z) {
            this.c = true;
            this.d = j;
            this.e = 0;
            this.f = 0;
        }
    }

    public final void a(bdj bdj) {
        if (this.c) {
            int b2 = bdj.b();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(b2, 10 - i);
                System.arraycopy(bdj.a, bdj.b, this.a.a, this.f, min);
                if (this.f + min == 10) {
                    this.a.c(0);
                    if (73 == this.a.c() && 68 == this.a.c() && 51 == this.a.c()) {
                        this.a.d(3);
                        this.e = this.a.m() + 10;
                    } else {
                        bdd.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(b2, this.e - this.f);
            this.b.a(bdj, min2);
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
