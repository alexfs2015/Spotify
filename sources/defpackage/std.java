package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;

/* renamed from: std reason: default package */
public final class std {
    private final tai a;
    private final Flowable<OverlayDisplayMode> b;
    private final a c;
    private final FlowableTransformer<OverlayDisplayMode, OverlayDisplayMode> d;

    public std(tai tai, Flowable<OverlayDisplayMode> flowable, a aVar, Flowable<Boolean> flowable2) {
        this.a = tai;
        this.b = flowable;
        this.c = aVar;
        this.d = stc.a(flowable2);
    }

    public final void a(tal tal) {
        a().a(tal);
    }

    private tah a() {
        return this.a.a(new tak(this.b.a(this.d), this.c));
    }
}
