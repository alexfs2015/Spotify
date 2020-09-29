package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: thh reason: default package */
public final class thh implements vua<Flowable<OverlayDisplayMode>> {
    private final wlc<Flowable<Boolean>> a;
    private final wlc<Flowable<Boolean>> b;
    private final wlc<Flowable<Long>> c;
    private final wlc<Flowable<Boolean>> d;
    private final wlc<Scheduler> e;

    public static Flowable<OverlayDisplayMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2, Flowable<Long> flowable3, Flowable<Boolean> flowable4, Scheduler scheduler) {
        return (Flowable) vuf.a(CC.a(flowable, flowable2, flowable3, flowable4, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get(), (Flowable) this.b.get(), (Flowable) this.c.get(), (Flowable) this.d.get(), (Scheduler) this.e.get());
    }
}
