package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;

/* renamed from: aqo reason: default package */
final class aqo implements bdw {
    private final beg a;
    private final a b;
    private arf c;
    private bdw d;

    /* renamed from: aqo$a */
    public interface a {
        void a(arc arc);
    }

    public aqo(a aVar, bdn bdn) {
        this.b = aVar;
        this.a = new beg(bdn);
    }

    private void f() {
        this.a.a(this.d.d());
        arc e = this.d.e();
        if (!e.equals(this.a.d)) {
            this.a.a(e);
            this.b.a(e);
        }
    }

    private boolean g() {
        arf arf = this.c;
        return arf != null && !arf.r() && (this.c.q() || !this.c.g());
    }

    public final arc a(arc arc) {
        bdw bdw = this.d;
        if (bdw != null) {
            arc = bdw.a(arc);
        }
        this.a.a(arc);
        this.b.a(arc);
        return arc;
    }

    public final void a() {
        beg beg = this.a;
        if (!beg.b) {
            beg.c = beg.a.a();
            beg.b = true;
        }
    }

    public final void a(long j) {
        this.a.a(j);
    }

    public final void a(arf arf) {
        bdw c2 = arf.c();
        if (c2 != null) {
            bdw bdw = this.d;
            if (c2 == bdw) {
                return;
            }
            if (bdw == null) {
                this.d = c2;
                this.c = arf;
                this.d.a(this.a.d);
                f();
                return;
            }
            throw ExoPlaybackException.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public final void b() {
        beg beg = this.a;
        if (beg.b) {
            beg.a(beg.d());
            beg.b = false;
        }
    }

    public final void b(arf arf) {
        if (arf == this.c) {
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
        return g() ? this.d.d() : this.a.d();
    }

    public final arc e() {
        bdw bdw = this.d;
        return bdw != null ? bdw.e() : this.a.d;
    }
}
