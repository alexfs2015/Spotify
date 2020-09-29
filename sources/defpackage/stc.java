package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;

/* renamed from: stc reason: default package */
public final class stc {
    public static FlowableTransformer<OverlayDisplayMode, OverlayDisplayMode> a(Flowable<Boolean> flowable) {
        return new $$Lambda$stc$ou9PnNz9CvDo0ZUdjnrr5TtHag4(flowable);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ OverlayDisplayMode a(OverlayDisplayMode overlayDisplayMode, Boolean bool) {
        return bool.booleanValue() ? OverlayDisplayMode.HIDE_DISABLED : overlayDisplayMode;
    }
}
