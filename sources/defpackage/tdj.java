package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;

/* renamed from: tdj reason: default package */
public final class tdj {
    /* access modifiers changed from: private */
    public static /* synthetic */ OverlayDisplayMode a(OverlayDisplayMode overlayDisplayMode, Boolean bool) {
        return bool.booleanValue() ? OverlayDisplayMode.HIDE_DISABLED : overlayDisplayMode;
    }

    public static FlowableTransformer<OverlayDisplayMode, OverlayDisplayMode> a(Flowable<Boolean> flowable) {
        return new $$Lambda$tdj$603qFLTCvKAhtIsiweNNwDtBLRk(flowable);
    }
}
