package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: ugn reason: default package */
public interface ugn {

    /* renamed from: ugn$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static jor<ufx> a(jpc jpc, sso sso, uix uix, rqb rqb, fqn fqn, uqm uqm, boolean z, boolean z2, ufs ufs, uhz uhz) {
            $$Lambda$ugn$f9Wv4eqd1B1yCzBu3S7nzjKBPA r0 = new $$Lambda$ugn$f9Wv4eqd1B1yCzBu3S7nzjKBPA(uix, fqn, rqb, jpc, sso, z, z2, ufs, uqm, uhz);
            return r0;
        }

        public static /* synthetic */ jpe a(uix uix, fqn fqn, rqb rqb, jpc jpc, sso sso, boolean z, boolean z2, ufs ufs, uqm uqm, uhz uhz, ufx ufx) {
            vkv vkv = ufx.a;
            String str = ufx.b;
            int i = ufx.c;
            boolean z3 = uix.a(fqn) || rqb.a(fqn);
            i k = jpc.b(vkv.getUri(), vkv.a()).a(vkv.w() == MediaType.VIDEO).a(sso).b(true).c(z3).d(z).e(true).f(!z3).g(false).h(z2).a(new $$Lambda$ugn$QNunw9RXZRjmfXrGFE8DuaUzjY(ufs, vkv)).i(false).m(true).a(uqm).k(z3);
            uhz.f(vkv.getUri(), str, i);
            return k.a();
        }

        public static /* synthetic */ void a(ufs ufs, vkv vkv, boolean z) {
            if (z) {
                ufs.a(vkv.getUri());
            }
        }
    }
}
