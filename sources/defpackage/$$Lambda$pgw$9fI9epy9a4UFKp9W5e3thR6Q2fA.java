package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pgw$9fI9epy9a4UFKp9W5e3thR6Q2fA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pgw$9fI9epy9a4UFKp9W5e3thR6Q2fA implements Function {
    private final /* synthetic */ pgw f$0;
    private final /* synthetic */ PlayerTrack f$1;
    private final /* synthetic */ Optional f$2;

    public /* synthetic */ $$Lambda$pgw$9fI9epy9a4UFKp9W5e3thR6Q2fA(pgw pgw, PlayerTrack playerTrack, Optional optional) {
        this.f$0 = pgw;
        this.f$1 = playerTrack;
        this.f$2 = optional;
    }

    public final Object apply(Object obj) {
        return this.f$0.a(this.f$1, this.f$2, (PlayerQueue) obj);
    }
}
