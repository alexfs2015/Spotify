package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: joz reason: default package */
public final class joz {

    /* renamed from: joz$a */
    static class a implements b, c, d, e {
        private final jpl a;
        private jqo<vku> b;
        private sso c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private Optional<jqg> i = Optional.e();
        private Optional<uqm> j = Optional.e();

        public a(jpl jpl) {
            this.a = jpl;
        }

        public final c a(sso sso) {
            this.c = sso;
            return this;
        }

        public final d a(uqm uqm) {
            this.j = Optional.b(uqm);
            return this;
        }

        public final d a(boolean z) {
            this.d = z;
            return this;
        }

        public final e a(String str, String str2) {
            this.b = jqo.a(PageIdentifiers.CONTEXTMENU_ARTIST, str, str2);
            return this;
        }

        public final jpe a() {
            return jpe.a(this.b, jpp.a, this.a.a((uqm) this.j.a(uqo.ba), (sso) fbp.a(this.c), this.d, this.e, this.f, this.g, this.h, (jqg) this.i.a(jqg.a)));
        }

        public final d b(boolean z) {
            this.e = z;
            return this;
        }

        public final d c(boolean z) {
            this.f = true;
            return this;
        }

        public final d d(boolean z) {
            this.g = z;
            return this;
        }

        public final d e(boolean z) {
            this.h = true;
            return this;
        }
    }

    /* renamed from: joz$b */
    public interface b {
        e a(String str, String str2);
    }

    /* renamed from: joz$c */
    public interface c {
        d a(boolean z);
    }

    /* renamed from: joz$d */
    public interface d {
        d a(uqm uqm);

        jpe a();

        d b(boolean z);

        d c(boolean z);

        d d(boolean z);

        d e(boolean z);
    }

    /* renamed from: joz$e */
    public interface e {
        c a(sso sso);
    }

    public static b a(jpl jpl) {
        return new a(jpl);
    }
}
