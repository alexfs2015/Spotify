package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: gta reason: default package */
public final class gta implements gst {
    private final String a;
    private final Map<String, String> b;

    public gta(jst jst, Map<String, String> map) {
        this.a = jst.h();
        this.b = map;
    }

    public final wud<PlayerContext> resolve() {
        PlayerContext playerContext;
        PlayerTrack[] playerTrackArr = {PlayerTrack.create(this.a)};
        Map<String, String> map = this.b;
        if (map == null) {
            playerContext = PlayerContext.create(this.a, playerTrackArr);
        } else {
            playerContext = PlayerContext.create(this.a, playerTrackArr, map);
        }
        return ScalarSynchronousObservable.d(playerContext);
    }
}
