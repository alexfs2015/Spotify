package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.libs.viewuri.ViewUris;
import io.reactivex.functions.Function;

/* renamed from: ktz reason: default package */
public final class ktz implements Function<PlayerState, Boolean> {
    private final wzi<Boolean> a;

    public ktz(wzi<Boolean> wzi) {
        this.a = wzi;
    }

    /* renamed from: a */
    public final Boolean apply(PlayerState playerState) {
        if (ViewUris.m.b(playerState.contextUri()) || ViewUris.bP.b(playerState.contextUri()) || ViewUris.ai.b(playerState.contextUri())) {
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
