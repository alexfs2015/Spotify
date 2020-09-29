package defpackage;

import com.google.common.base.Optional;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: jmn reason: default package */
public final class jmn {

    /* renamed from: jmn$a */
    static class a implements b, c, d, e {
        private final jmz a;
        private joc<uyr> b;
        private sih c;
        private boolean d;
        private boolean e;
        private boolean f;
        private boolean g;
        private boolean h;
        private Optional<jnu> i = Optional.e();
        private Optional<udr> j = Optional.e();

        public a(jmz jmz) {
            this.a = jmz;
        }

        public final e a(String str, String str2) {
            this.b = joc.a(PageIdentifiers.CONTEXTMENU_ARTIST, str, str2);
            return this;
        }

        public final c a(sih sih) {
            this.c = sih;
            return this;
        }

        public final d a(boolean z) {
            this.d = z;
            return this;
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

        public final d a(udr udr) {
            this.j = Optional.b(udr);
            return this;
        }

        public final jms a() {
            return jms.a(this.b, jnd.a, this.a.a((udr) this.j.a(udt.ba), (sih) fay.a(this.c), this.d, this.e, this.f, this.g, this.h, (jnu) this.i.a(jnu.a)));
        }
    }

    /* renamed from: jmn$b */
    public interface b {
        e a(String str, String str2);
    }

    /* renamed from: jmn$c */
    public interface c {
        d a(boolean z);
    }

    /* renamed from: jmn$d */
    public interface d {
        d a(udr udr);

        jms a();

        d b(boolean z);

        d c(boolean z);

        d d(boolean z);

        d e(boolean z);
    }

    /* renamed from: jmn$e */
    public interface e {
        c a(sih sih);
    }

    public static b a(jmz jmz) {
        return new a(jmz);
    }
}
