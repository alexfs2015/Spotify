package defpackage;

/* renamed from: bdp reason: default package */
public final class bdp implements bdf {
    public final bcw a;
    public boolean b;
    public long c;
    public aql d = aql.a;
    private long e;

    public bdp(bcw bcw) {
        this.a = bcw;
    }

    public final void a(long j) {
        this.e = j;
        if (this.b) {
            this.c = this.a.a();
        }
    }

    public final long d() {
        long j;
        long j2 = this.e;
        if (!this.b) {
            return j2;
        }
        long a2 = this.a.a() - this.c;
        if (this.d.b == 1.0f) {
            j = apv.b(a2);
        } else {
            j = a2 * ((long) this.d.e);
        }
        return j2 + j;
    }

    public final aql a(aql aql) {
        if (this.b) {
            a(d());
        }
        this.d = aql;
        return aql;
    }

    public final aql e() {
        return this.d;
    }
}
