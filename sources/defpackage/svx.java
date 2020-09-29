package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: svx reason: default package */
public interface svx {

    /* renamed from: svx$-CC reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Flowable<OverlayDisplayMode> a(int i) {
            if (i == 1) {
                return Flowable.b(OverlayDisplayMode.HIDE_DISABLED);
            }
            return Flowable.b(OverlayDisplayMode.AUTO_HIDE);
        }
    }
}
