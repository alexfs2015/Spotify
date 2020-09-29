package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;
import rx.internal.util.ScalarSynchronousObservable;

/* renamed from: guz reason: default package */
public final class guz implements gus {
    private final String a;
    private final Map<String, String> b;

    public guz(jva jva, Map<String, String> map) {
        this.a = jva.h();
        this.b = map;
    }

    public final xii<PlayerContext> resolve() {
        PlayerTrack[] playerTrackArr = {PlayerTrack.create(this.a)};
        Map<String, String> map = this.b;
        return ScalarSynchronousObservable.d(map == null ? PlayerContext.create(this.a, playerTrackArr) : PlayerContext.create(this.a, playerTrackArr, map));
    }
}
