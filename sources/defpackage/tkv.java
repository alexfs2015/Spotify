package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;

/* renamed from: tkv reason: default package */
public final class tkv implements wig<Flowable<OverlayDisplayMode>> {
    private final wzi<Flowable<PlayerTrack>> a;
    private final wzi<Flowable<Boolean>> b;
    private final wzi<kxp> c;

    private tkv(wzi<Flowable<PlayerTrack>> wzi, wzi<Flowable<Boolean>> wzi2, wzi<kxp> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static Flowable<OverlayDisplayMode> a(Flowable<PlayerTrack> flowable, Flowable<Boolean> flowable2, kxp kxp) {
        return (Flowable) wil.a(CC.a(flowable, flowable2, kxp), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static tkv a(wzi<Flowable<PlayerTrack>> wzi, wzi<Flowable<Boolean>> wzi2, wzi<kxp> wzi3) {
        return new tkv(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get(), (Flowable) this.b.get(), (kxp) this.c.get());
    }
}
