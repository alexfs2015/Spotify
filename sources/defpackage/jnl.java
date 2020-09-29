package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.playlist.models.Show;

/* renamed from: jnl reason: default package */
public final class jnl {

    /* renamed from: jnl$a */
    static class a implements b, c, d {
        private final jmz a;
        private joc<Show> b;
        private sih c;
        private boolean d = true;
        private Optional<jnu> e = Optional.e();
        private Optional<udr> f = Optional.e();

        public a(jmz jmz) {
            this.a = jmz;
        }

        public final d a(String str, String str2) {
            this.b = joc.a(PageIdentifiers.CONTEXTMENU_SHOW, str, str2);
            return this;
        }

        public final b a(sih sih) {
            this.c = sih;
            return this;
        }

        public final b a(boolean z) {
            this.d = false;
            return this;
        }

        public final b a(udr udr) {
            this.f = Optional.b(udr);
            return this;
        }

        public final jms a() {
            return jms.a(this.b, jnd.c, this.a.a((udr) this.f.a(udt.ba), (sih) fay.a(this.c), this.d, (jnu) this.e.a(jnu.a)));
        }
    }

    /* renamed from: jnl$b */
    public interface b {
        jms a();

        b a(udr udr);

        b a(boolean z);
    }

    /* renamed from: jnl$c */
    public interface c {
        d a(String str, String str2);
    }

    /* renamed from: jnl$d */
    public interface d {
        b a(sih sih);
    }
}
