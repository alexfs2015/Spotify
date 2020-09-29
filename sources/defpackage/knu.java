package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.domain.CueType;
import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;
import java.util.Locale;

/* renamed from: knu reason: default package */
public final class knu {
    public static kjx<knw, kns> a(knw knw, knt knt) {
        knw knw2 = knw;
        return (kjx) knt.a(new $$Lambda$knu$jn3J0hxVNoNegp7nBfjR3wVasBU(knw), new $$Lambda$knu$IDGhQ9LC9aiue2Zfk9qDP1ZuyA(knw), new $$Lambda$knu$qh1wnuDOe9rNJ82TJKSZVjVSFg(knw), new $$Lambda$knu$Azg1lFWkVnoX6VjGQZ6OIDgyqk(knw), new $$Lambda$knu$BgYtdIHSKPrWKO2ZIZvOYncOcY(knw), new $$Lambda$knu$grXfOexYwQGrDNnIrLAHvkguXQo(knw), new $$Lambda$knu$0W1iY8GcIOjPYZ4imriBJxBmbE(knw), new $$Lambda$knu$I2RMtLGgY6JCH4Q54OFnqdjHP_8(knw), new $$Lambda$knu$iLHobPLEt6Y6Hpir2d8gmvPJEvM(knw), new $$Lambda$knu$F35lHMTpHFL0ODsS2y7wS6wsaOY(knw), new $$Lambda$knu$kTK2X66IxbrTajVRL1lTT6908T0(knw), new $$Lambda$knu$XN8zqot6o2vAdGJ5v9il01jZA_M(knw), $$Lambda$knu$i9psSp5xatODponIzYQ879WKF2g.INSTANCE, $$Lambda$knu$3t4LHNeaYEDZEoxpQqExpl1pXsg.INSTANCE);
    }

    public static kjn<knw, kns> a(knw knw) {
        knw a = knw.a((knx) new c()).a(knw.c() + 1);
        return kjn.a(a, kjk.a(kns.a(a.b().e(), a.c())));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, e eVar) {
        CueType cueType = eVar.a;
        if (cueType == CueType.NEXT || cueType == CueType.ERROR) {
            return kjx.a(kjk.a(new g()));
        } else if (cueType != CueType.PLAY) {
            return kjx.e();
        } else {
            return kjx.a(kjk.a(kns.a(knw.b().g())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, i iVar) {
        if (knw.a() instanceof c) {
            knw a = knw.a(knw.c() + 1);
            return kjx.a(a, kjk.a(kns.a(a.b().e() - iVar.a, a.c())));
        } else if (!(knw.a() instanceof b)) {
            return kjx.e();
        } else {
            knw a2 = knw.a(knw.c() + 1);
            return kjx.a(a2, kjk.a(kns.a((a2.b().e() + a2.b().h()) - iVar.a, a2.c())));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, g gVar) {
        if ((knw.a() instanceof c) || (knw.a() instanceof b)) {
            return kjx.b(knw.a(knw.c() + 1));
        }
        return kjx.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, h hVar) {
        if ((knw.a() instanceof c) || (knw.a() instanceof b)) {
            return kjx.b(knw.a(knw.c() + 1));
        }
        return kjx.e();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, k kVar) {
        if ((knw.a() instanceof b) || (knw.a() instanceof a)) {
            knw a = knw.a((knx) new a());
            Logger.b("[VoiceAd] onSpeechRecognitionError: %s", kVar.a.mMessage);
            return kjx.a(a, kjk.a(kns.a(SpeechRecognitionCommandType.STOP, knw.b().h(), Intent.NO_INTENT), kns.a(CueType.ERROR), kns.a("mic_stopped", knw.b()), new d(knw.d(), knw.b().a(), kVar.a.mMessage)));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, j jVar) {
        if ((knw.a() instanceof b) || (knw.a() instanceof a)) {
            return kjx.a(knw.a((knx) new a()), kjk.a(kns.a(SpeechRecognitionCommandType.STOP, knw.b().h(), Intent.NO_INTENT), kns.a(jVar.a ? CueType.PLAY : CueType.NEXT), kns.a("mic_stopped", knw.b())));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, l lVar) {
        if (!(knw.a() instanceof b) && !(knw.a() instanceof a)) {
            throw new IllegalStateException();
        } else if (knw.e()) {
            return kjx.e();
        } else {
            return kjx.a(knw.g().a(true).a(), kjk.a(new e(knw.d(), knw.b().a(), lVar.a)));
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, m mVar) {
        if (knw.a() instanceof b) {
            knw a = knw.a(knw.c() + 1);
            knw a2 = a.g().a(mVar.a).a();
            return kjx.a(a2, kjk.a(kns.a(CueType.LISTEN), kns.a(knw.b().h(), a2.c())));
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ kjx a(knw knw, n nVar) {
        if ((knw.a() instanceof c) && nVar.a == knw.c()) {
            knw a = knw.a((knx) new b());
            knv b = knw.b();
            return kjx.a(a, kjk.a(kns.a(SpeechRecognitionCommandType.START, b.h(), Intent.valueOf(b.f().toUpperCase(Locale.US))), kns.a("mic_started", b)));
        } else if (!(knw.a() instanceof b) || nVar.a != knw.c()) {
            return kjx.e();
        } else {
            knw a2 = knw.a((knx) new a());
            knv b2 = knw.b();
            return kjx.a(a2, kjk.a(kns.a(SpeechRecognitionCommandType.STOP, b2.h(), Intent.NO_INTENT), kns.a(CueType.ERROR), kns.a("mic_stopped", b2)));
        }
    }
}
