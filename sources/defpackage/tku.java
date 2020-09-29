package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;

/* renamed from: tku reason: default package */
public interface tku {

    /* renamed from: tku$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static /* synthetic */ OverlayDisplayMode a(kxp kxp, Boolean bool, PlayerTrack playerTrack) {
            if (bool.booleanValue()) {
                if (PlayerTrackUtil.isVideo(playerTrack) || kxp.a(playerTrack)) {
                    return OverlayDisplayMode.HIDE_ENABLED;
                }
            }
            return OverlayDisplayMode.HIDE_DISABLED;
        }

        public static Flowable<OverlayDisplayMode> a(Flowable<PlayerTrack> flowable, Flowable<Boolean> flowable2, kxp kxp) {
            return Flowable.a((xfk<? extends T1>) flowable2, (xfk<? extends T2>) flowable, (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$tku$07gJLXnlsKwxwfPxFQDl1RGHfc<Object,Object,Object>(kxp));
        }
    }
}
