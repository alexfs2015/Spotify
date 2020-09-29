package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;

/* renamed from: apx reason: default package */
final class apx implements bdf {
    private final bdp a;
    private final a b;
    private aqo c;
    private bdf d;

    /* renamed from: apx$a */
    public interface a {
        void a(aql aql);
    }

    public apx(a aVar, bcw bcw) {
        this.b = aVar;
        this.a = new bdp(bcw);
    }

    public final void a() {
        bdp bdp = this.a;
        if (!bdp.b) {
            bdp.c = bdp.a.a();
            bdp.b = true;
        }
    }

    public final void b() {
        bdp bdp = this.a;
        if (bdp.b) {
            bdp.a(bdp.d());
            bdp.b = false;
        }
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void a(aqo aqo) {
        bdf c2 = aqo.c();
        if (c2 != null) {
            bdf bdf = this.d;
            if (c2 == bdf) {
                return;
            }
            if (bdf == null) {
                this.d = c2;
                this.c = aqo;
                this.d.a(this.a.d);
                f();
                return;
            }
            throw ExoPlaybackException.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public final void b(aqo aqo) {
        if (aqo == this.c) {
            this.d = null;
            this.c = null;
        }
    }

    public final long c() {
        if (!g()) {
            return this.a.d();
        }
        f();
        return this.d.d();
    }

    public final long d() {
        if (g()) {
            return this.d.d();
        }
        return this.a.d();
    }

    public final aql a(aql aql) {
        bdf bdf = this.d;
        if (bdf != null) {
            aql = bdf.a(aql);
        }
        this.a.a(aql);
        this.b.a(aql);
        return aql;
    }

    public final aql e() {
        bdf bdf = this.d;
        return bdf != null ? bdf.e() : this.a.d;
    }

    private void f() {
        this.a.a(this.d.d());
        aql e = this.d.e();
        if (!e.equals(this.a.d)) {
            this.a.a(e);
            this.b.a(e);
        }
    }

    private boolean g() {
        aqo aqo = this.c;
        return aqo != null && !aqo.r() && (this.c.q() || !this.c.g());
    }
}
