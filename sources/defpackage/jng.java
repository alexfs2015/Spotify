package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.SingleSource;

/* renamed from: jng reason: default package */
public final class jng {
    final hba a;
    final jnc<uyz> b = new jnc<uyz>() {
        public final wud<joc<uyz>> load(RxResolver rxResolver, joc<uyz> joc) {
            return wuh.a(vun.a((SingleSource<T>) jng.this.a.a(joc.c()).f(new $$Lambda$jng$1$AllQnHAsyZSAdHdKB7TH62bVWm8(joc))));
        }
    };

    /* renamed from: jng$a */
    class a implements b, c, d, e, f {
        private final jmz a;
        private joc<uyz> b;
        private sih c;
        private boolean d;
        private boolean e;
        private Optional<jnu> f = Optional.e();
        private Optional<udr> g = Optional.e();

        a(jmz jmz) {
            this.a = jmz;
        }

        public final f a(String str, String str2) {
            this.b = joc.a(PageIdentifiers.CONTEXTMENU_PLAYLIST, str, str2);
            return this;
        }

        public final b a(sih sih) {
            this.c = sih;
            return this;
        }

        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        public final d b(boolean z) {
            this.e = true;
            return this;
        }

        public final jms a() {
            return jms.a(this.b, jng.this.b, this.a.a((udr) this.g.a(udt.ba), (sih) fay.a(this.c), this.d, this.e, (jnu) this.f.a(jnu.a)));
        }
    }

    /* renamed from: jng$b */
    public interface b {
        c a(boolean z);
    }

    /* renamed from: jng$c */
    public interface c {
        d b(boolean z);
    }

    /* renamed from: jng$d */
    public interface d {
        jms a();
    }

    /* renamed from: jng$e */
    public interface e {
        f a(String str, String str2);
    }

    /* renamed from: jng$f */
    public interface f {
        b a(sih sih);
    }

    public jng(hba hba) {
        this.a = hba;
    }
}
