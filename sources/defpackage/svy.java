package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: svy reason: default package */
public final class svy implements vua<Flowable<OverlayDisplayMode>> {
    private final wlc<Integer> a;

    public static Flowable<OverlayDisplayMode> a(int i) {
        return (Flowable) vuf.a(CC.a(i), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Integer) this.a.get()).intValue());
    }
}
