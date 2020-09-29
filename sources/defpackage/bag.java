package defpackage;

import java.util.List;

/* renamed from: bag reason: default package */
public abstract class bag extends asn implements bac {
    private bac d;
    private long e;

    public final int a(long j) {
        return this.d.a(j - this.e);
    }

    public final void a() {
        super.a();
        this.d = null;
    }

    public final void a(long j, bac bac, long j2) {
        this.b = j;
        this.d = bac;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.b;
        }
        this.e = j2;
    }

    public final int b() {
        return this.d.b();
    }

    public final List<azz> b(long j) {
        return this.d.b(j - this.e);
    }

    public final long b_(int i) {
        return this.d.b_(i) + this.e;
    }

    public abstract void e();
}
