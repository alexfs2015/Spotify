package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: jou reason: default package */
public final class jou {
    final ipb a;

    /* renamed from: jou$a */
    class a implements b, c, d, e, f, g {
        private final jpl a;
        private jqo<ire> b;
        private sso c;
        private boolean d;
        private boolean e;
        private boolean f;
        private Optional<jqg> g = Optional.e();
        private Optional<uqm> h = Optional.e();

        a(jpl jpl) {
            this.a = jpl;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ jwc a(RxResolver rxResolver, xil xil, xil xil2) {
            return jou.this.a;
        }

        public final c a(sso sso) {
            this.c = sso;
            return this;
        }

        public final e a(boolean z) {
            this.d = z;
            return this;
        }

        public final f a(uqm uqm) {
            this.h = Optional.b(uqm);
            return this;
        }

        public final g a(String str, String str2) {
            this.b = jqo.a(PageIdentifiers.CONTEXTMENU_ALBUM, str, str2);
            return this;
        }

        public final jpe a() {
            return jpe.a(this.b, jpp.a(new $$Lambda$jou$a$4VsC16vLIGTfDSV9Hmp4lb2q6O8(this)), this.a.a((uqm) this.h.a(uqo.ba), (sso) fbp.a(this.c), this.d, this.e, this.f, (jqg) this.g.a(jqg.a)));
        }

        public final d b(boolean z) {
            this.e = true;
            return this;
        }

        public final f c(boolean z) {
            this.f = z;
            return this;
        }
    }

    /* renamed from: jou$b */
    public interface b {
        g a(String str, String str2);
    }

    /* renamed from: jou$c */
    public interface c {
        e a(boolean z);
    }

    /* renamed from: jou$d */
    public interface d {
        f c(boolean z);
    }

    /* renamed from: jou$e */
    public interface e {
        d b(boolean z);
    }

    /* renamed from: jou$f */
    public interface f {
        f a(uqm uqm);

        jpe a();
    }

    /* renamed from: jou$g */
    public interface g {
        c a(sso sso);
    }

    public jou(ipb ipb) {
        this.a = ipb;
    }

    public final b a(jpl jpl) {
        return new a(jpl);
    }
}
