package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.proto.Identity.DecorationData;
import com.spotify.music.features.profile.proto.ProfileProfilesResponse.GetProfilesResponse;

/* renamed from: psf reason: default package */
public final class psf {
    public static kmw<psg, psd> a(psg psg) {
        if (psg.k()) {
            return kmw.a(psg, kmt.a(psd.a(psg.a())));
        }
        return kmw.a(psg, kmt.a(psd.a(psg.a()), new e()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(psg psg, d dVar) {
        a j = ImmutableSet.j();
        if (dVar.a) {
            if (psg.m() == LoadingState.NOT_LOADED) {
                j.b(new a(psg.a()));
                psg = psg.a(LoadingState.LOADING);
            }
            if (psg.n().a() == LoadingState.NOT_LOADED) {
                j.b(new d(psg.a()));
                psg = psg.a(prg.c.a(LoadingState.LOADING));
            }
            if (psg.o().a() == LoadingState.NOT_LOADED) {
                j.b(new c(psg.a()));
                psg = psg.b(prg.c.a(LoadingState.LOADING));
            }
        }
        return kng.a(psg.p().e(dVar.a).a(), j.a());
    }

    /* access modifiers changed from: private */
    public static kng<psg, psd> a(psg psg, e eVar) {
        if (eVar.a.getStatus() != 200) {
            Logger.e("profile: core-profile responded with %d", Integer.valueOf(eVar.a.getStatus()));
            return psg.m() != LoadingState.LOADED ? kng.b(psg.a(LoadingState.FAILED)) : kng.e();
        }
        try {
            GetProfilesResponse a = GetProfilesResponse.a(eVar.a.getBody());
            if (a.d.size() == 0) {
                return kng.e();
            }
            DecorationData decorationData = (DecorationData) a.d.get(0);
            return kng.b(psg.p().b(decorationData.d).c(decorationData.e).a(LoadingState.LOADED).a());
        } catch (InvalidProtocolBufferException unused) {
            Logger.e("profile: failed to parse protobuf", new Object[0]);
            return kng.e();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(psg psg, g gVar) {
        boolean z = !psg.g();
        return kng.a(psg.p().c(z).a(), kmt.a(new m(psg.q(), z)));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(psg psg, o oVar) {
        Uri uri = oVar.a;
        return uri.equals(Uri.EMPTY) ? kng.e() : kng.b(psg.a(uri.toString()));
    }

    public static kng<psg, psd> a(psg psg, pse pse) {
        psg psg2 = psg;
        pse pse2 = pse;
        $$Lambda$psf$boQ32kCIJnPMiUdV_JT7rbxc_Y r2 = r3;
        $$Lambda$psf$boQ32kCIJnPMiUdV_JT7rbxc_Y r3 = new $$Lambda$psf$boQ32kCIJnPMiUdV_JT7rbxc_Y(psg2);
        $$Lambda$psf$iyTVJp3cxzCXTYL1DQEX8GTLf4 r32 = r4;
        $$Lambda$psf$iyTVJp3cxzCXTYL1DQEX8GTLf4 r4 = new $$Lambda$psf$iyTVJp3cxzCXTYL1DQEX8GTLf4(psg2);
        $$Lambda$psf$JeX8th1ygL26dEaniPl2M5WlE0 r42 = r5;
        $$Lambda$psf$JeX8th1ygL26dEaniPl2M5WlE0 r5 = new $$Lambda$psf$JeX8th1ygL26dEaniPl2M5WlE0(psg2);
        $$Lambda$psf$S1GuC3QGAcnovVOgKliHht86fcw r52 = r6;
        $$Lambda$psf$S1GuC3QGAcnovVOgKliHht86fcw r6 = new $$Lambda$psf$S1GuC3QGAcnovVOgKliHht86fcw(psg2);
        $$Lambda$psf$lm2HJ7ROrK8Ma36C61mxrVbhF3I r62 = r7;
        $$Lambda$psf$lm2HJ7ROrK8Ma36C61mxrVbhF3I r7 = new $$Lambda$psf$lm2HJ7ROrK8Ma36C61mxrVbhF3I(psg2);
        $$Lambda$psf$TYjvyCqlxaNdCVS4Z6xew9zpvs r72 = r8;
        $$Lambda$psf$TYjvyCqlxaNdCVS4Z6xew9zpvs r8 = new $$Lambda$psf$TYjvyCqlxaNdCVS4Z6xew9zpvs(psg2);
        $$Lambda$psf$tQsyGS1t4L5RQWqmrMgj38EHbow r82 = r9;
        $$Lambda$psf$tQsyGS1t4L5RQWqmrMgj38EHbow r9 = new $$Lambda$psf$tQsyGS1t4L5RQWqmrMgj38EHbow(psg2);
        $$Lambda$psf$rN0KFobtzUCeLrBpVuL1mO20Hko r92 = r10;
        $$Lambda$psf$rN0KFobtzUCeLrBpVuL1mO20Hko r10 = new $$Lambda$psf$rN0KFobtzUCeLrBpVuL1mO20Hko(psg2);
        $$Lambda$psf$4siIx9r_Tamv7vUehUzsPlRJo r102 = r11;
        $$Lambda$psf$4siIx9r_Tamv7vUehUzsPlRJo r11 = new $$Lambda$psf$4siIx9r_Tamv7vUehUzsPlRJo(psg2);
        $$Lambda$psf$Kj5hfziCLGIFngUnyRce5AR7U r112 = r12;
        $$Lambda$psf$Kj5hfziCLGIFngUnyRce5AR7U r12 = new $$Lambda$psf$Kj5hfziCLGIFngUnyRce5AR7U(psg2);
        $$Lambda$psf$txCrvYoQiJWEkffgf_bBcFQZQzc r122 = r13;
        $$Lambda$psf$txCrvYoQiJWEkffgf_bBcFQZQzc r13 = new $$Lambda$psf$txCrvYoQiJWEkffgf_bBcFQZQzc(psg2);
        $$Lambda$psf$hDDkT8He1U8wazkXPS5uAFcw9TA r132 = r14;
        $$Lambda$psf$hDDkT8He1U8wazkXPS5uAFcw9TA r14 = new $$Lambda$psf$hDDkT8He1U8wazkXPS5uAFcw9TA(psg2);
        $$Lambda$psf$jgMc4oXPUnaBmStywFnnkW1Krsw r142 = r15;
        $$Lambda$psf$jgMc4oXPUnaBmStywFnnkW1Krsw r15 = new $$Lambda$psf$jgMc4oXPUnaBmStywFnnkW1Krsw(psg2);
        $$Lambda$psf$rALrXr4NPbkpjpJ86fIEIsdaFo r152 = $$Lambda$psf$rALrXr4NPbkpjpJ86fIEIsdaFo.INSTANCE;
        $$Lambda$psf$3Moe_dtKJq0IyzNTbhzVojlr79o r16 = $$Lambda$psf$3Moe_dtKJq0IyzNTbhzVojlr79o.INSTANCE;
        $$Lambda$psf$BQjXZMa0lcE7gsdQ0Dh7NM6t1jc r17 = r1;
        $$Lambda$psf$BQjXZMa0lcE7gsdQ0Dh7NM6t1jc r1 = new $$Lambda$psf$BQjXZMa0lcE7gsdQ0Dh7NM6t1jc(psg2);
        $$Lambda$psf$D7ulI0eAhH5P9zU7Cf8SiEhUxGE r18 = r1;
        $$Lambda$psf$D7ulI0eAhH5P9zU7Cf8SiEhUxGE r19 = new $$Lambda$psf$D7ulI0eAhH5P9zU7Cf8SiEhUxGE(psg2);
        return (kng) pse.a(r2, r32, r42, r52, r62, r72, r82, r92, r102, r112, r122, r132, r142, r152, r16, r17, r18);
    }
}
