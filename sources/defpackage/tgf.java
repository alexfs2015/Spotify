package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tgf reason: default package */
public final class tgf implements wig<Flowable<OverlayDisplayMode>> {
    private final wzi<Integer> a;

    public static Flowable<OverlayDisplayMode> a(int i) {
        return (Flowable) wil.a(CC.a(i), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a(((Integer) this.a.get()).intValue());
    }
}
