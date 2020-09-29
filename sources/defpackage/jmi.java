package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: jmi reason: default package */
public final class jmi {
    final imo a;

    /* renamed from: jmi$a */
    class a implements b, c, d, e, f, g {
        private final jmz a;
        private joc<ior> b;
        private sih c;
        private boolean d;
        private boolean e;
        private boolean f;
        private Optional<jnu> g = Optional.e();
        private Optional<udr> h = Optional.e();

        a(jmz jmz) {
            this.a = jmz;
        }

        public final g a(String str, String str2) {
            this.b = joc.a(PageIdentifiers.CONTEXTMENU_ALBUM, str, str2);
            return this;
        }

        public final c a(sih sih) {
            this.c = sih;
            return this;
        }

        public final e a(boolean z) {
            this.d = z;
            return this;
        }

        public final d b(boolean z) {
            this.e = true;
            return this;
        }

        public final f c(boolean z) {
            this.f = z;
            return this;
        }

        public final f a(udr udr) {
            this.h = Optional.b(udr);
            return this;
        }

        public final jms a() {
            return jms.a(this.b, jnd.a(new $$Lambda$jmi$a$6e1nO7OZ9sMSql9Tew0Qw2Ua_34(this)), this.a.a((udr) this.h.a(udt.ba), (sih) fay.a(this.c), this.d, this.e, this.f, (jnu) this.g.a(jnu.a)));
        }

        /* access modifiers changed from: private */
        public /* synthetic */ jtu a(RxResolver rxResolver, wug wug, wug wug2) {
            return jmi.this.a;
        }
    }

    /* renamed from: jmi$b */
    public interface b {
        g a(String str, String str2);
    }

    /* renamed from: jmi$c */
    public interface c {
        e a(boolean z);
    }

    /* renamed from: jmi$d */
    public interface d {
        f c(boolean z);
    }

    /* renamed from: jmi$e */
    public interface e {
        d b(boolean z);
    }

    /* renamed from: jmi$f */
    public interface f {
        f a(udr udr);

        jms a();
    }

    /* renamed from: jmi$g */
    public interface g {
        c a(sih sih);
    }

    public jmi(imo imo) {
        this.a = imo;
    }

    public final b a(jmz jmz) {
        return new a(jmz);
    }
}
