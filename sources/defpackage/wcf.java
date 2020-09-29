package defpackage;

import com.google.common.base.Optional;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.Single;

/* renamed from: wcf reason: default package */
public final class wcf implements wig<wep> {
    private final wzi<wen> a;
    private final wzi<VoiceConsumer> b;
    private final wzi<Optional<String>> c;
    private final wzi<Single<Boolean>> d;
    private final wzi<Optional<String>> e;

    private wcf(wzi<wen> wzi, wzi<VoiceConsumer> wzi2, wzi<Optional<String>> wzi3, wzi<Single<Boolean>> wzi4, wzi<Optional<String>> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static wcf a(wzi<wen> wzi, wzi<VoiceConsumer> wzi2, wzi<Optional<String>> wzi3, wzi<Single<Boolean>> wzi4, wzi<Optional<String>> wzi5) {
        wcf wcf = new wcf(wzi, wzi2, wzi3, wzi4, wzi5);
        return wcf;
    }

    public static wep a(wen wen, VoiceConsumer voiceConsumer, Optional<String> optional, Single<Boolean> single, Optional<String> optional2) {
        return (wep) wil.a(CC.a(wen, voiceConsumer, optional, single, optional2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((wen) this.a.get(), (VoiceConsumer) this.b.get(), (Optional) this.c.get(), (Single) this.d.get(), (Optional) this.e.get());
    }
}
