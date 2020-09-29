package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.functions.BiFunction;

/* renamed from: tan reason: default package */
public interface tan {

    /* renamed from: tan$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<OverlayDisplayMode> a(Flowable<PlayerTrack> flowable, Flowable<Boolean> flowable2, kug kug) {
            return Flowable.a((wrf<? extends T1>) flowable2, (wrf<? extends T2>) flowable, (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$tan$N2oWNLEknOpNkMtM3ZCE5K5LPw<Object,Object,Object>(kug));
        }

        public static /* synthetic */ OverlayDisplayMode a(kug kug, Boolean bool, PlayerTrack playerTrack) {
            if (bool.booleanValue()) {
                if (PlayerTrackUtil.isVideo(playerTrack) || kug.a(playerTrack)) {
                    return OverlayDisplayMode.HIDE_ENABLED;
                }
            }
            return OverlayDisplayMode.HIDE_DISABLED;
        }
    }
}
