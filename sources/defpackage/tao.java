package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tao reason: default package */
public final class tao implements vua<Flowable<OverlayDisplayMode>> {
    private final wlc<Flowable<PlayerTrack>> a;
    private final wlc<Flowable<Boolean>> b;
    private final wlc<kug> c;

    private tao(wlc<Flowable<PlayerTrack>> wlc, wlc<Flowable<Boolean>> wlc2, wlc<kug> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tao a(wlc<Flowable<PlayerTrack>> wlc, wlc<Flowable<Boolean>> wlc2, wlc<kug> wlc3) {
        return new tao(wlc, wlc2, wlc3);
    }

    public static Flowable<OverlayDisplayMode> a(Flowable<PlayerTrack> flowable, Flowable<Boolean> flowable2, kug kug) {
        return (Flowable) vuf.a(CC.a(flowable, flowable2, kug), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get(), (Flowable) this.b.get(), (kug) this.c.get());
    }
}
