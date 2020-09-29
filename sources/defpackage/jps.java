package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import io.reactivex.SingleSource;

/* renamed from: jps reason: default package */
public final class jps {
    final hdt a;
    final jpo<vlc> b = new jpo<vlc>() {
        public final xii<jqo<vlc>> load(RxResolver rxResolver, jqo<vlc> jqo) {
            return xim.a(wit.a((SingleSource<T>) jps.this.a.a(jqo.c()).f(new $$Lambda$jps$1$QmyY0dMcRndcmHyv_r6OMt8wuDw(jqo))));
        }
    };

    /* renamed from: jps$a */
    class a implements b, c, d, e, f {
        private final jpl a;
        private jqo<vlc> b;
        private sso c;
        private boolean d;
        private boolean e;
        private Optional<jqg> f = Optional.e();
        private Optional<uqm> g = Optional.e();

        a(jpl jpl) {
            this.a = jpl;
        }

        public final jpe a() {
            return jpe.a(this.b, jps.this.b, this.a.a((uqm) this.g.a(uqo.ba), (sso) fbp.a(this.c), this.d, this.e, (jqg) this.f.a(jqg.a)));
        }

        public final b a(sso sso) {
            this.c = sso;
            return this;
        }

        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        public final f a(String str, String str2) {
            this.b = jqo.a(PageIdentifiers.CONTEXTMENU_PLAYLIST, str, str2);
            return this;
        }

        public final d b(boolean z) {
            this.e = true;
            return this;
        }
    }

    /* renamed from: jps$b */
    public interface b {
        c a(boolean z);
    }

    /* renamed from: jps$c */
    public interface c {
        d b(boolean z);
    }

    /* renamed from: jps$d */
    public interface d {
        jpe a();
    }

    /* renamed from: jps$e */
    public interface e {
        f a(String str, String str2);
    }

    /* renamed from: jps$f */
    public interface f {
        b a(sso sso);
    }

    public jps(hdt hdt) {
        this.a = hdt;
    }
}
