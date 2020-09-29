package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;

/* renamed from: tdk reason: default package */
public final class tdk {
    private final tkp a;
    private final Flowable<OverlayDisplayMode> b;
    private final a c;
    private final FlowableTransformer<OverlayDisplayMode, OverlayDisplayMode> d;

    public tdk(tkp tkp, Flowable<OverlayDisplayMode> flowable, a aVar, Flowable<Boolean> flowable2) {
        this.a = tkp;
        this.b = flowable;
        this.c = aVar;
        this.d = tdj.a(flowable2);
    }

    private tko a() {
        return this.a.a(new tkr(this.b.a(this.d), this.c));
    }

    public final void a(tks tks) {
        a().a(tks);
    }
}
