package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: jpf reason: default package */
public final class jpf {

    /* renamed from: jpf$a */
    static class a implements b, c, d, e, f, g, h, i, j, k, l {
        private final jpl a;
        private jqo<vkv> b;
        private sso c;
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
        private Optional<jqg> s = Optional.e();
        private Optional<jpj> t = Optional.e();
        private Optional<uqm> u = Optional.e();

        public a(jpl jpl) {
            this.a = jpl;
        }

        public final jpe a() {
            jpl jpl = this.a;
            jpl jpl2 = jpl;
            return jpe.a(this.b, jpp.d, jpl2.a((uqm) this.u.a(uqo.ba), (sso) fbp.a(this.c), this.e, this.f, this.g, this.h, this.i, this.j, this.d, (jqg) this.s.a(jqg.a), (jpj) this.t.a(jpj.a), this.m, this.k, this.l, this.n, this.o, this.p, this.q, this.r));
        }

        public final g a(sso sso) {
            this.c = sso;
            return this;
        }

        public final i a(Optional<String> optional, Optional<String> optional2) {
            this.q = optional;
            this.r = optional2;
            return this;
        }

        public final i a(uqm uqm) {
            this.u = Optional.b(uqm);
            return this;
        }

        public final j a(String str, String str2, String str3, boolean z, Map<String, String> map) {
            this.b = jqo.a((gkq) PageIdentifiers.CONTEXTMENU_EPISODE, str, str2, str3, z, map);
            return this;
        }

        public final k a(jpj jpj) {
            this.t = Optional.b(jpj);
            return this;
        }

        public final l a(boolean z) {
            this.d = z;
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

        public final i l(boolean z) {
            this.p = z;
            return this;
        }

        public final i m(boolean z) {
            this.n = z;
            return this;
        }
    }

    /* renamed from: jpf$b */
    public interface b {
        b e(boolean z);

        e f(boolean z);
    }

    /* renamed from: jpf$c */
    public interface c {
        d c(boolean z);

        b d(boolean z);
    }

    /* renamed from: jpf$d */
    public interface d {
        b d(boolean z);
    }

    /* renamed from: jpf$e */
    public interface e {
        f g(boolean z);
    }

    /* renamed from: jpf$f */
    public interface f {
        k h(boolean z);
    }

    /* renamed from: jpf$g */
    public interface g {
        c b(boolean z);
    }

    /* renamed from: jpf$h */
    public interface h {
        j a(String str, String str2, String str3, boolean z, Map<String, String> map);
    }

    /* renamed from: jpf$i */
    public interface i {
        jpe a();

        i a(Optional<String> optional, Optional<String> optional2);

        i a(uqm uqm);

        i j(boolean z);

        i k(boolean z);

        i l(boolean z);

        i m(boolean z);
    }

    /* renamed from: jpf$j */
    public interface j {
        l a(boolean z);
    }

    /* renamed from: jpf$k */
    public interface k {
        k a(jpj jpj);

        i i(boolean z);
    }

    /* renamed from: jpf$l */
    public interface l {
        g a(sso sso);
    }

    public static h a(jpl jpl) {
        return new a(jpl);
    }
}
