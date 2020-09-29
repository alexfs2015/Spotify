package defpackage;

import com.spotify.playlist.models.Show.MediaType;

/* renamed from: tuk reason: default package */
public interface tuk {

    /* renamed from: tuk$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static jmf<ttu> a(jmq jmq, sih sih, twu twu, rgz rgz, fpt fpt, udr udr, boolean z, boolean z2, ttp ttp, tvw tvw) {
            $$Lambda$tuk$ABopMInz5k79CBvX0sOziTcECI r0 = new $$Lambda$tuk$ABopMInz5k79CBvX0sOziTcECI(twu, fpt, rgz, jmq, sih, z, z2, ttp, udr, tvw);
            return r0;
        }

        public static /* synthetic */ void a(ttp ttp, uys uys, boolean z) {
            if (z) {
                ttp.a(uys.getUri());
            }
        }

        public static /* synthetic */ jms a(twu twu, fpt fpt, rgz rgz, jmq jmq, sih sih, boolean z, boolean z2, ttp ttp, udr udr, tvw tvw, ttu ttu) {
            uys uys = ttu.a;
            String str = ttu.b;
            int i = ttu.c;
            boolean z3 = twu.a(fpt) || rgz.a(fpt);
            i k = jmq.b(uys.getUri(), uys.a()).a(uys.w() == MediaType.VIDEO).a(sih).b(true).c(z3).d(z).e(true).f(!z3).g(false).h(z2).a(new $$Lambda$tuk$yoVNmPCfKvHRaAeL5LIeEHUMorA(ttp, uys)).i(false).m(true).a(udr).k(z3);
            tvw.f(uys.getUri(), str, i);
            return k.a();
        }
    }
}
