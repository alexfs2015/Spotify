package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: jmt reason: default package */
public final class jmt {

    /* renamed from: jmt$a */
    static class a implements b, c, d, e, f, g, h, i, j, k, l {
        private final jmz a;
        private joc<uys> b;
        private sih c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;
        private boolean n = true;
        private boolean o;
        private boolean p;
        private Optional<String> q = Optional.e();
        private Optional<String> r = Optional.e();
        private Optional<jnu> s = Optional.e();
        private Optional<jmx> t = Optional.e();
        private Optional<udr> u = Optional.e();

        public a(jmz jmz) {
            this.a = jmz;
        }

        public final j a(String str, String str2, String str3, boolean z, Map<String, String> map) {
            this.b = joc.a((gjf) PageIdentifiers.CONTEXTMENU_EPISODE, str, str2, str3, z, map);
            return this;
        }

        public final l a(boolean z) {
            this.d = z;
            return this;
        }

        public final g a(sih sih) {
            this.c = sih;
            return this;
        }

        public final c b(boolean z) {
            this.e = z;
            return this;
        }

        public final d c(boolean z) {
            this.m = z;
            return this;
        }

        public final b d(boolean z) {
            this.f = z;
            return this;
        }

        public final b e(boolean z) {
            this.g = z;
            return this;
        }

        public final e f(boolean z) {
            this.h = z;
            return this;
        }

        public final f g(boolean z) {
            this.i = z;
            return this;
        }

        public final k h(boolean z) {
            this.j = z;
            return this;
        }

        public final i i(boolean z) {
            this.o = z;
            return this;
        }

        public final i j(boolean z) {
            this.k = z;
            return this;
        }

        public final i k(boolean z) {
            this.l = z;
            return this;
        }

        public final i a(Optional<String> optional, Optional<String> optional2) {
            this.q = optional;
            this.r = optional2;
            return this;
        }

        public final i l(boolean z) {
            this.p = z;
            return this;
        }

        public final k a(jmx jmx) {
            this.t = Optional.b(jmx);
            return this;
        }

        public final i a(udr udr) {
            this.u = Optional.b(udr);
            return this;
        }

        public final i m(boolean z) {
            this.n = z;
            return this;
        }

        public final jms a() {
            jmz jmz = this.a;
            jmz jmz2 = jmz;
            return jms.a(this.b, jnd.d, jmz2.a((udr) this.u.a(udt.ba), (sih) fay.a(this.c), this.e, this.f, this.g, this.h, this.i, this.j, this.d, (jnu) this.s.a(jnu.a), (jmx) this.t.a(jmx.a), this.m, this.k, this.l, this.n, this.o, this.p, this.q, this.r));
        }
    }

    /* renamed from: jmt$b */
    public interface b {
        b e(boolean z);

        e f(boolean z);
    }

    /* renamed from: jmt$c */
    public interface c {
        d c(boolean z);

        b d(boolean z);
    }

    /* renamed from: jmt$d */
    public interface d {
        b d(boolean z);
    }

    /* renamed from: jmt$e */
    public interface e {
        f g(boolean z);
    }

    /* renamed from: jmt$f */
    public interface f {
        k h(boolean z);
    }

    /* renamed from: jmt$g */
    public interface g {
        c b(boolean z);
    }

    /* renamed from: jmt$h */
    public interface h {
        j a(String str, String str2, String str3, boolean z, Map<String, String> map);
    }

    /* renamed from: jmt$i */
    public interface i {
        jms a();

        i a(Optional<String> optional, Optional<String> optional2);

        i a(udr udr);

        i j(boolean z);

        i k(boolean z);

        i l(boolean z);

        i m(boolean z);
    }

    /* renamed from: jmt$j */
    public interface j {
        l a(boolean z);
    }

    /* renamed from: jmt$k */
    public interface k {
        k a(jmx jmx);

        i i(boolean z);
    }

    /* renamed from: jmt$l */
    public interface l {
        g a(sih sih);
    }

    public static h a(jmz jmz) {
        return new a(jmz);
    }
}
