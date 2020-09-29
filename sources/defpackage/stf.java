package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: stf reason: default package */
public final class stf implements vua<ste> {
    private final wlc<tai> a;
    private final wlc<Flowable<OverlayDisplayMode>> b;
    private final wlc<a> c;

    private stf(wlc<tai> wlc, wlc<Flowable<OverlayDisplayMode>> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static stf a(wlc<tai> wlc, wlc<Flowable<OverlayDisplayMode>> wlc2, wlc<a> wlc3) {
        return new stf(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ste(this.a, this.b, this.c);
    }
}
