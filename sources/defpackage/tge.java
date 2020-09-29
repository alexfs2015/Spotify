package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tge reason: default package */
public interface tge {

    /* renamed from: tge$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<OverlayDisplayMode> a(int i) {
            return i == 1 ? Flowable.b(OverlayDisplayMode.HIDE_DISABLED) : Flowable.b(OverlayDisplayMode.AUTO_HIDE);
        }
    }
}
