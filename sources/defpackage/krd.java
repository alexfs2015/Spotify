package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import java.util.Locale;

/* renamed from: krd reason: default package */
public final class krd {
    public static kmw<krf, krb> a(krf krf) {
        krf a = krf.a((krg) new c()).a(krf.c() + 1);
        return kmw.a(a, kmt.a(krb.a(a.b().e(), a.c())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, e eVar) {
        CueType cueType = eVar.a;
        if (cueType == CueType.NEXT || cueType == CueType.ERROR) {
            return kng.a(kmt.a(new g()));
        } else if (cueType != CueType.PLAY) {
            return kng.e();
        } else {
            return kng.a(kmt.a(krb.a(krf.b().g())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, g gVar) {
        return ((krf.a() instanceof c) || (krf.a() instanceof b)) ? kng.b(krf.a(krf.c() + 1)) : kng.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, h hVar) {
        return ((krf.a() instanceof c) || (krf.a() instanceof b)) ? kng.b(krf.a(krf.c() + 1)) : kng.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, i iVar) {
        if (krf.a() instanceof c) {
            krf a = krf.a(krf.c() + 1);
            return kng.a(a, kmt.a(krb.a(a.b().e() - iVar.a, a.c())));
        } else if (!(krf.a() instanceof b)) {
            return kng.e();
        } else {
            krf a2 = krf.a(krf.c() + 1);
            return kng.a(a2, kmt.a(krb.a((a2.b().e() + a2.b().h()) - iVar.a, a2.c())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, j jVar) {
        if ((krf.a() instanceof b) || (krf.a() instanceof a)) {
            return kng.a(krf.a((krg) new a()), kmt.a(krb.a(SpeechRecognitionCommandType.STOP, krf.b().h(), Intent.NO_INTENT), krb.a(jVar.a ? CueType.PLAY : CueType.NEXT), krb.a("mic_stopped", krf.b())));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, k kVar) {
        if ((krf.a() instanceof b) || (krf.a() instanceof a)) {
            krf a = krf.a((krg) new a());
            Logger.b("[VoiceAd] onSpeechRecognitionError: %s", kVar.a.mMessage);
            return kng.a(a, kmt.a(krb.a(SpeechRecognitionCommandType.STOP, krf.b().h(), Intent.NO_INTENT), krb.a(CueType.ERROR), krb.a("mic_stopped", krf.b()), new d(krf.d(), krf.b().a(), kVar.a.mMessage)));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, l lVar) {
        if (!(krf.a() instanceof b) && !(krf.a() instanceof a)) {
            throw new IllegalStateException();
        } else if (krf.e()) {
            return kng.e();
        } else {
            return kng.a(krf.g().a(true).a(), kmt.a(new e(krf.d(), krf.b().a(), lVar.a)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, m mVar) {
        if (krf.a() instanceof b) {
            krf a = krf.a(krf.c() + 1);
            krf a2 = a.g().a(mVar.a).a();
            return kng.a(a2, kmt.a(krb.a(CueType.LISTEN), krb.a(krf.b().h(), a2.c())));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kng a(krf krf, n nVar) {
        if ((krf.a() instanceof c) && nVar.a == krf.c()) {
            krf a = krf.a((krg) new b());
            kre b = krf.b();
            return kng.a(a, kmt.a(krb.a(SpeechRecognitionCommandType.START, b.h(), Intent.valueOf(b.f().toUpperCase(Locale.US))), krb.a("mic_started", b)));
        } else if (!(krf.a() instanceof b) || nVar.a != krf.c()) {
            return kng.e();
        } else {
            krf a2 = krf.a((krg) new a());
            kre b2 = krf.b();
            return kng.a(a2, kmt.a(krb.a(SpeechRecognitionCommandType.STOP, b2.h(), Intent.NO_INTENT), krb.a(CueType.ERROR), krb.a("mic_stopped", b2)));
        }
    }

    public static kng<krf, krb> a(krf krf, krc krc) {
        krf krf2 = krf;
        return (kng) krc.a(new $$Lambda$krd$SKWz0vDBn0v_oJyVq3NJRnoL5g8(krf), new $$Lambda$krd$l9c5wE8fJbU3ZipfU60WZh8emM(krf), new $$Lambda$krd$P6D_C_vVCoGwMusHo7X9Z8jbYD8(krf), new $$Lambda$krd$VYSeAk42fAina_VjOwLHiMVWbyg(krf), new $$Lambda$krd$gs9itv4tBLW8ZHo2BQSp3QqcmE(krf), new $$Lambda$krd$SATnalJ56oBUezVwBTOV_fuLpsA(krf), new $$Lambda$krd$cDWk5kkUV7myjOuT4XnDYcHetPA(krf), new $$Lambda$krd$mZo5NRsBC9M9YdYHVXD10A9Igs(krf), new $$Lambda$krd$VGtjhfnmOOwE6O1y3bRMXz8Tw(krf), new $$Lambda$krd$izmNHAqqdsXaOnnlDGe_an1ldKY(krf), new $$Lambda$krd$h0YVPo6jFe512hW9CPWzilqqpYA(krf), new $$Lambda$krd$eRix6OjIVBF5fUBl0kIC2DEFuY0(krf), $$Lambda$krd$YdDgDOQ5Z3SPtxj6esAMt1dEGY.INSTANCE, $$Lambda$krd$E0w73qBBzSA8wzBoRIrUPUxow.INSTANCE);
    }
}
