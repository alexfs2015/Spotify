package defpackage;

import java.util.List;

/* renamed from: azp reason: default package */
public abstract class azp extends arw implements azl {
    private azl d;
    private long e;

    public abstract void e();

    public final void a(long j, azl azl, long j2) {
        this.b = j;
        this.d = azl;
        if (j2 == Long.MAX_VALUE) {
            j2 = this.b;
        }
        this.e = j2;
    }

    public final int b() {
        return this.d.b();
    }

    public final long b_(int i) {
        return this.d.b_(i) + this.e;
    }

    public final int a(long j) {
        return this.d.a(j - this.e);
    }

    public final List<azi> b(long j) {
        return this.d.b(j - this.e);
    }

    public final void a() {
        super.a();
        this.d = null;
    }
}
