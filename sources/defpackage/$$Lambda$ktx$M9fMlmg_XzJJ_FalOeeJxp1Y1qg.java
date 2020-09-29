package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ktx$M9fMlmg_XzJJ_FalOeeJxp1Y1qg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktx$M9fMlmg_XzJJ_FalOeeJxp1Y1qg implements Predicate {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$ktx$M9fMlmg_XzJJ_FalOeeJxp1Y1qg(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final boolean test(Object obj) {
        return ktx.a(this.f$0, (PlayerState) obj);
    }
}
