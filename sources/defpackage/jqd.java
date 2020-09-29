package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: jqd reason: default package */
public final class jqd {

    /* renamed from: jqd$a */
    static class a implements b, c, d, e, f, g, h {
        private final jpl a;
        private jqo<vlf> b;
        private sso c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private Optional<String> h = Optional.e();
        private Optional<jqg> i = Optional.e();
        private Optional<uqm> j = Optional.e();
        private boolean k;
        private boolean l;
        private boolean m;
        private Optional<String> n = Optional.e();
        private boolean o;
        private boolean p;
        private boolean q;
        private boolean r;
        private boolean s;
        private boolean t;
        private Optional<jqm> u = Optional.e();
        private Optional<jqm> v = Optional.e();
        private boolean w;

        public a(jpl jpl) {
            this.a = jpl;
        }

        public final jpe a() {
            jpl jpl = this.a;
            jpl jpl2 = jpl;
            return jpe.a(this.b, jpp.b, jpl2.a((uqm) this.j.a(uqo.ba), (sso) fbp.a(this.c), this.d, this.e, this.f, this.g, this.o, this.h, this.k, (jqg) this.i.a(jqg.a), this.n, this.l, this.m, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.t));
        }

        public final b a(sso sso) {
            this.c = sso;
            return this;
        }

        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        public final f a(String str) {
            this.h = Optional.b(str);
            return this;
        }

        public final f a(jqm jqm) {
            this.u = Optional.b(jqm);
            return this;
        }

        public final f a(uqm uqm) {
            this.j = Optional.b(uqm);
            return this;
        }

        public final f a(boolean z, String str) {
            this.g = z;
            this.n = str == null ? Optional.e() : Optional.b(str);
            return this;
        }

        public final h a(String str, String str2, String str3, boolean z, Map<String, String> map) {
            this.b = jqo.a((gkq) PageIdentifiers.CONTEXTMENU_TRACK, str, str2, str3, z, map);
            return this;
        }

        public final e b(boolean z) {
            this.e = z;
            return this;
        }

        public final f b(jqm jqm) {
            this.v = Optional.b(jqm);
            return this;
        }

        public final d c(boolean z) {
            this.f = z;
            return this;
        }

        public final f d(boolean z) {
            return a(z, null);
        }

        public final f e(boolean z) {
            this.o = false;
            return this;
        }

        public final f f(boolean z) {
            this.k = z;
            return this;
        }

        public final f g(boolean z) {
            this.l = z;
            return this;
        }

        public final f h(boolean z) {
            this.m = z;
            return this;
        }

        public final f i(boolean z) {
            this.p = z;
            return this;
        }

        public final f j(boolean z) {
            this.q = z;
            return this;
        }

        public final f k(boolean z) {
            this.r = true;
            return this;
        }

        public final f l(boolean z) {
            this.s = z;
            return this;
        }

        public final f m(boolean z) {
            this.w = z;
            return this;
        }

        public final f n(boolean z) {
            this.t = z;
            return this;
        }
    }

    /* renamed from: jqd$b */
    public interface b {
        c a(boolean z);
    }

    /* renamed from: jqd$c */
    public interface c {
        e b(boolean z);
    }

    /* renamed from: jqd$d */
    public interface d {
        f a(boolean z, String str);

        f d(boolean z);
    }

    /* renamed from: jqd$e */
    public interface e {
        d c(boolean z);
    }

    /* renamed from: jqd$f */
    public interface f {
        jpe a();

        f a(String str);

        f a(jqm jqm);

        f a(uqm uqm);

        f b(jqm jqm);

        f e(boolean z);

        f f(boolean z);

        f g(boolean z);

        f h(boolean z);

        f i(boolean z);

        f j(boolean z);

        f k(boolean z);

        f l(boolean z);

        f m(boolean z);

        f n(boolean z);
    }

    /* renamed from: jqd$g */
    public interface g {
        h a(String str, String str2, String str3, boolean z, Map<String, String> map);
    }

    /* renamed from: jqd$h */
    public interface h {
        b a(sso sso);
    }

    static g a(jpl jpl) {
        return new a(jpl);
    }
}
