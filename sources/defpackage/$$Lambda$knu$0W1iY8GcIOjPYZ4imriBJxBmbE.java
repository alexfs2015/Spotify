package defpackage;

import com.spotify.music.ads.voice.domain.SpeechRecognitionCommandType;
import com.spotify.nlu.slimo.proto.SlimoProto.ParsedQuery.Intent;

/* renamed from: -$$Lambda$knu$0W1i-Y8GcIOjPYZ4imriBJxBmbE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$knu$0W1iY8GcIOjPYZ4imriBJxBmbE implements gct {
    private final /* synthetic */ knw f$0;

    public /* synthetic */ $$Lambda$knu$0W1iY8GcIOjPYZ4imriBJxBmbE(knw knw) {
        this.f$0 = knw;
    }

    public final Object apply(Object obj) {
        return kjx.a(this.f$0.a((knx) new a()), kjk.a(kns.a(SpeechRecognitionCommandType.STOP, this.f$0.b().h(), Intent.NO_INTENT), kns.a(this.f$0.b().g()), kns.a("mic_stopped", this.f$0.b())));
    }
}
