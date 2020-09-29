package defpackage;

import com.google.common.base.Optional;
import com.spotify.voice.qualifiers.VoiceConsumer;
import io.reactivex.Single;

/* renamed from: vow reason: default package */
public final class vow implements vua<vrh> {
    private final wlc<vrf> a;
    private final wlc<VoiceConsumer> b;
    private final wlc<Optional<String>> c;
    private final wlc<Single<Boolean>> d;
    private final wlc<Optional<String>> e;

    private vow(wlc<vrf> wlc, wlc<VoiceConsumer> wlc2, wlc<Optional<String>> wlc3, wlc<Single<Boolean>> wlc4, wlc<Optional<String>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static vow a(wlc<vrf> wlc, wlc<VoiceConsumer> wlc2, wlc<Optional<String>> wlc3, wlc<Single<Boolean>> wlc4, wlc<Optional<String>> wlc5) {
        vow vow = new vow(wlc, wlc2, wlc3, wlc4, wlc5);
        return vow;
    }

    public static vrh a(vrf vrf, VoiceConsumer voiceConsumer, Optional<String> optional, Single<Boolean> single, Optional<String> optional2) {
        return (vrh) vuf.a(CC.a(vrf, voiceConsumer, optional, single, optional2), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((vrf) this.a.get(), (VoiceConsumer) this.b.get(), (Optional) this.c.get(), (Single) this.d.get(), (Optional) this.e.get());
    }
}
