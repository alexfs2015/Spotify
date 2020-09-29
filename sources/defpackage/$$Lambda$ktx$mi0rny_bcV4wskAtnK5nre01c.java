package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktx$mi0rny_bcV4wsk-At-nK5nre01c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktx$mi0rny_bcV4wskAtnK5nre01c implements Function {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$ktx$mi0rny_bcV4wskAtnK5nre01c(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final Object apply(Object obj) {
        return ho.a((PlayerState) obj, this.f$0);
    }
}
