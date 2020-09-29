package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import java.util.Map;

/* renamed from: jnr reason: default package */
public final class jnr {

    /* renamed from: jnr$a */
    static class a implements b, c, d, e, f, g, h {
        private final jmz a;
        private joc<uzc> b;
        private sih c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private Optional<String> h = Optional.e();
        private Optional<jnu> i = Optional.e();
        private Optional<udr> j = Optional.e();
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
        private Optional<joa> u = Optional.e();
        private Optional<joa> v = Optional.e();
        private boolean w;

        public a(jmz jmz) {
            this.a = jmz;
        }

        public final b a(sih sih) {
            this.c = sih;
            return this;
        }

        public final h a(String str, String str2, String str3, boolean z, Map<String, String> map) {
            this.b = joc.a((gjf) PageIdentifiers.CONTEXTMENU_TRACK, str, str2, str3, z, map);
            return this;
        }

        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        public final e b(boolean z) {
            this.e = z;
            return this;
        }

        public final d c(boolean z) {
            this.f = z;
            return this;
        }

        public final f a(boolean z, String str) {
            this.g = z;
            this.n = str == null ? Optional.e() : Optional.b(str);
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

        public final f a(String str) {
            this.h = Optional.b(str);
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

        public final f a(udr udr) {
            this.j = Optional.b(udr);
            return this;
        }

        public final f a(joa joa) {
            this.u = Optional.b(joa);
            return this;
        }

        public final f b(joa joa) {
            this.v = Optional.b(joa);
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

        public final jms a() {
            jmz jmz = this.a;
            jmz jmz2 = jmz;
            return jms.a(this.b, jnd.b, jmz2.a((udr) this.j.a(udt.ba), (sih) fay.a(this.c), this.d, this.e, this.f, this.g, this.o, this.h, this.k, (jnu) this.i.a(jnu.a), this.n, this.l, this.m, this.p, this.q, this.r, this.s, this.u, this.v, this.w, this.t));
        }
    }

    /* renamed from: jnr$b */
    public interface b {
        c a(boolean z);
    }

    /* renamed from: jnr$c */
    public interface c {
        e b(boolean z);
    }

    /* renamed from: jnr$d */
    public interface d {
        f a(boolean z, String str);

        f d(boolean z);
    }

    /* renamed from: jnr$e */
    public interface e {
        d c(boolean z);
    }

    /* renamed from: jnr$f */
    public interface f {
        jms a();

        f a(String str);

        f a(joa joa);

        f a(udr udr);

        f b(joa joa);

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

    /* renamed from: jnr$g */
    public interface g {
        h a(String str, String str2, String str3, boolean z, Map<String, String> map);
    }

    /* renamed from: jnr$h */
    public interface h {
        b a(sih sih);
    }

    static g a(jmz jmz) {
        return new a(jmz);
    }
}
