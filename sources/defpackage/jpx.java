package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.playlist.models.Show;

/* renamed from: jpx reason: default package */
public final class jpx {

    /* renamed from: jpx$a */
    static class a implements b, c, d {
        private final jpl a;
        private jqo<Show> b;
        private sso c;
        private boolean d = true;
        private Optional<jqg> e = Optional.e();
        private Optional<uqm> f = Optional.e();

        public a(jpl jpl) {
            this.a = jpl;
        }

        public final jpe a() {
            return jpe.a(this.b, jpp.c, this.a.a((uqm) this.f.a(uqo.ba), (sso) fbp.a(this.c), this.d, (jqg) this.e.a(jqg.a)));
        }

        public final b a(sso sso) {
            this.c = sso;
            return this;
        }

        public final b a(uqm uqm) {
            this.f = Optional.b(uqm);
            return this;
        }

        public final b a(boolean z) {
            this.d = false;
            return this;
        }

        public final d a(String str, String str2) {
            this.b = jqo.a(PageIdentifiers.CONTEXTMENU_SHOW, str, str2);
            return this;
        }
    }

    /* renamed from: jpx$b */
    public interface b {
        jpe a();

        b a(uqm uqm);

        b a(boolean z);
    }

    /* renamed from: jpx$c */
    public interface c {
        d a(String str, String str2);
    }

    /* renamed from: jpx$d */
    public interface d {
        b a(sso sso);
    }
}
