package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$tco$xjGCS-FRBRuI9H5hCyR6xn2KHuI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tco$xjGCSFRBRuI9H5hCyR6xn2KHuI implements Predicate {
    private final /* synthetic */ tco f$0;
    private final /* synthetic */ PlayerState f$1;

    public /* synthetic */ $$Lambda$tco$xjGCSFRBRuI9H5hCyR6xn2KHuI(tco tco, PlayerState playerState) {
        this.f$0 = tco;
        this.f$1 = playerState;
    }

    public final boolean test(Object obj) {
        return this.f$0.a(this.f$1, (Type) obj);
    }
}
