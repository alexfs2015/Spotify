package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.functions.Function;

/* renamed from: kqq reason: default package */
public final class kqq implements Function<PlayerState, Boolean> {
    private final wlc<Boolean> a;

    public kqq(wlc<Boolean> wlc) {
        this.a = wlc;
    }

    /* renamed from: a */
    public final Boolean apply(PlayerState playerState) {
        if (ViewUris.n.b(playerState.contextUri()) || ViewUris.bQ.b(playerState.contextUri()) || ViewUris.aj.b(playerState.contextUri())) {
            return Boolean.FALSE;
        }
        String str = (String) playerState.contextMetadata().get("autoplay_candidate");
        if (str == null || Boolean.valueOf(str).booleanValue()) {
            return (Boolean) this.a.get();
        }
        Logger.b("%s marked as NOT eligible for autoplay", playerState.contextUri());
        return Boolean.FALSE;
    }
}
