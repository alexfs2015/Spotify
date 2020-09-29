package defpackage;

import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: -$$Lambda$krd$cDWk5kkUV7myjOuT4XnDYcHetPA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$krd$cDWk5kkUV7myjOuT4XnDYcHetPA implements gee {
    private final /* synthetic */ krf f$0;

    public /* synthetic */ $$Lambda$krd$cDWk5kkUV7myjOuT4XnDYcHetPA(krf krf) {
        this.f$0 = krf;
    }

    public final Object apply(Object obj) {
        return kng.a(this.f$0.a((krg) new a()), kmt.a(krb.a(SpeechRecognitionCommandType.STOP, this.f$0.b().h(), Intent.NO_INTENT), krb.a(this.f$0.b().g()), krb.a("mic_stopped", this.f$0.b())));
    }
}
