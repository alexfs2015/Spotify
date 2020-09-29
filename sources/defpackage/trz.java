package defpackage;

import com.spotify.music.nowplaying.common.view.overlay.OverlayDisplayMode;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;

/* renamed from: trz reason: default package */
public final class trz implements wig<Flowable<OverlayDisplayMode>> {
    private final wzi<Flowable<Boolean>> a;
    private final wzi<Flowable<Boolean>> b;
    private final wzi<Flowable<Long>> c;
    private final wzi<Flowable<Boolean>> d;
    private final wzi<Scheduler> e;

    public static Flowable<OverlayDisplayMode> a(Flowable<Boolean> flowable, Flowable<Boolean> flowable2, Flowable<Long> flowable3, Flowable<Boolean> flowable4, Scheduler scheduler) {
        return (Flowable) wil.a(CC.a(flowable, flowable2, flowable3, flowable4, scheduler), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Flowable) this.a.get(), (Flowable) this.b.get(), (Flowable) this.c.get(), (Flowable) this.d.get(), (Scheduler) this.e.get());
    }
}
