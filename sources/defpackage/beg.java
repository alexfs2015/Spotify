package defpackage;

/* renamed from: beg reason: default package */
public final class beg implements bdw {
    public final bdn a;
    public boolean b;
    public long c;
    public arc d = arc.a;
    private long e;

    public beg(bdn bdn) {
        this.a = bdn;
    }

    public final arc a(arc arc) {
        if (this.b) {
            a(d());
        }
        this.d = arc;
        return arc;
    }

    public final void a(long j) {
        this.e = j;
        if (this.b) {
            this.c = this.a.a();
        }
    }

    public final long d() {
        long j = this.e;
        if (!this.b) {
            return j;
        }
        long a2 = this.a.a() - this.c;
        return j + (this.d.b == 1.0f ? aqm.b(a2) : a2 * ((long) this.d.e));
    }

    public final arc e() {
        return this.d;
    }
}
